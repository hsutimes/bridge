package org.bridge.demo;

/**
 * "二分法"-"折半法"-查找算法
 *
 * @author times
 * Time: 2017-11-10 22:43
 */
public class Demo3 {

    public static void main(String[] args) {

    }

    public Demo3() {
        int[] num = {1, 3, 5, 7, 9, 11, 14, 15};
        binarySearch(num, 3);
        binarySearch(num, 14);
        binarySearch(num, 6);
    }

    /**
     * 如果找不到,那么求应该插入的位置
     */
    private static void binarySearch(int[] num, int i) {
        // int index = Arrays.binarySearch(num, i);
        // System.out.println(index);//找不到返回负数
        int start = 0;
        int end = num.length - 1;
        while (true) {
            // 注意中间是两者之和的一半
            int mid = (start + end) / 2;
            if (i == num[mid]) {
                // 正好找到打印角标,停止;
                System.out.println("index = " + mid);
                break;
            } else {
                // 小于中间值,那么end变成中间往中间往左一位,大于则相反
                if (i < num[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // 交叉了-即找不到情况,说明start在0或者尾部或者在交叉时的前一位,那么得到应该插入位置;
            if (start > end) {
                // 找到了前面一个start,并确定在此即可;
                System.out.println("no find, will insert in :" + start);
                break;
            }
        }
    }
}
