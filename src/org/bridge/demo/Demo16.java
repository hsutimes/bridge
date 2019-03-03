package org.bridge.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 迷宫走法
 * 迷宫问题
 * 对于走迷宫，人们提出过很多计算机上的解法。深度优先搜索、广度优先搜索是使用最广的方法。
 * 生活中，人们更愿意使用“紧贴墙壁，靠右行走”的简单规则。
 * 下面的代码则采用了另一种不同的解法。
 * 它把走迷宫的过程比做“染色过程”。
 * 假设入口点被染为红色，它的颜色会“传染”给与它相邻的可走的单元。
 * 这个过程不断进行下去，如果最终出口点被染色，则迷宫有解。
 *
 * @author times
 * Time: 2017-11-12 16:47
 */
public class Demo16 {

    public Demo16() {
        show();
        resolve();
        show();
    }

    static char[][] maze = {
            {'#', '#', '#', '#', 'B', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '.', '.', '.', '.', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '.', '#', '#', '#', '#', '.', '.', '#'},
            {'#', '.', '.', '.', '.', '#', '#', '#', '#', '#', '.', '#'},
            {'#', '.', '#', '#', '#', '#', '#', '.', '#', '#', '.', '#'},
            {'#', '.', '#', '#', '#', '#', '#', '.', '#', '#', '.', '#'},
            {'#', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '.', '#', '#', '.', '#', '#', '#', '.', '#', '.', '#'},
            {'#', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '#'},
            {'#', '#', '.', '#', '.', '#', '#', '#', '.', '#', '.', 'A'},
            {'#', '#', '.', '#', '#', '#', '.', '.', '.', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    // 显示迷宫

    public static void show() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(" " + maze[i][j]);
            }
            System.out.println();
        }
    }
    // 染色

    public static Cell colorCell(Set<Cell> from, Set<Cell> desc) {
        Iterator<Cell> iter = from.iterator();
        while (iter.hasNext()) {
            Cell a = iter.next();
            Cell c[] = new Cell[4];
            c[0] = new Cell(a.row - 1, a.col, a); // 向上走
            c[1] = new Cell(a.row + 1, a.col, a); // 向下走
            c[2] = new Cell(a.row, a.col - 1, a); // 向左走
            c[3] = new Cell(a.row, a.col + 1, a); // 向右走
            for (int i = 0; i < 4; i++) {
                if (c[i].row < 0 || c[i].row >= maze.length) continue;
                if (c[i].col < 0 || c[i].col >= maze[0].length) continue;

                char x = maze[c[i].row][c[i].col];    // 取得单元格对应字符
                if (x == 'B') return a;
                if (x == '.') {
                    maze[c[i].row][c[i].col] = '?';    // 染色
                    desc.add(c[i]);
                }
            }
        }
        return null;
    }

    public static void resolve() {
        Set<Cell> set = new HashSet<Cell>();
        set.add(new Cell(9, 11, null));
        for (; ; ) {
            Set<Cell> set1 = new HashSet<Cell>();
            // 出口  a.from.from.from.....<-(set.get(0).from)==null<-入口
            Cell a = colorCell(set, set1);
            if (a != null) {    // 找到解
                System.out.println("找到解!");
                while (a != null) {    // 当前a里包含a.from 一直往前推
                    maze[a.row][a.col] = '+';    // 染色路径
                    a = a.from;
                }
                break;
            }
            if (set1.isEmpty()) {    // 遍历所以一直到没有路走,这时 set1为空
                System.out.println("无解!");
                break;
            }
            set = set1;    // 向里边
        }
    }
}

class Cell {        // 单元格
    int row;    // 哪行
    int col;    // 哪列
    Cell from;    // 开始点

    public Cell(int row, int col, Cell from) {
        this.row = row;
        this.col = col;
        this.from = from;
    }
}
