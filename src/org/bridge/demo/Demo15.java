package org.bridge.demo;

import java.util.Scanner;
import java.util.Vector;

/**
 * Playfair密码
 * 一种Playfair密码变种加密方法如下：首先选择一个密钥单词（称为pair）（字母不重复，且都为小写字母），
 * 然后与字母表中其他字母一起填入至一个5x5的方阵中，填入方法如下：
 * 1.首先按行填入密钥串。
 * 2.紧接其后，按字母序按行填入不在密钥串中的字母。
 * 3.由于方阵中只有25个位置，最后剩下的那个字母则不需变换。
 * 如果密钥为youandme，则该方阵如下：
 * y o u a n
 * d m e b c
 * f g h i j
 * k l p q r
 * s t v w x
 * 在加密一对字母时，如am，在方阵中找到以这两个字母为顶点的矩形（红色字体）：
 * y o u a n
 * d m e b c
 * f g h i j
 * k l p q r
 * s t v w x
 * 这对字母的加密字母为该矩形的另一对顶点，如本例中为ob。
 * 请设计程序，使用上述方法对输入串进行加密，并输出加密后的串。
 * 另外有如下规定：
 * 1、一对一对取字母，如果最后只剩下一个字母，则不变换，直接放入加密串中；
 * 2、如果一对字母中的两个字母相同，则不变换，直接放入加密串中；
 * 3、如果一对字母中有一个字母不在正方形中"如z"，则不变换，直接放入加密串中；
 * 4、如果字母对出现在方阵中的同一行或同一列，如df或hi，则只需简单对调这两个字母，即变换为fd或ih；
 * 5、如果在正方形中能够找到以字母对为顶点的矩形，假如字母对为am，则该矩形的另一对顶点字母中，
 * 与a同行的字母应在前面，在上例中应是ob；同样若待变换的字母对为ta，则变换后的字母对应为wo；
 * 6、本程序中输入串均为小写字母，并不含标点、空格或其它字符。
 * 解密方法与加密相同，即对加密后的字符串再加密，将得到原始串。
 * 要求输入形式如下：
 * 从控制台输入两行字符串，第一行为密钥单词（长度小于等于25），第二行为待加密字符串（长度小于等于50），
 * 两行字符串末尾都有一个回车换行符，并且两行字符串均为小写字母，不含其它字符。
 * 在标准输出上输出加密后的字符串。
 * 例如，若输入：
 * youandme
 * welcometohangzhou
 * 则表示输入的密钥单词为youandme，形成的正方形如上所示；待加密字符串为welcometohangzhou。
 * 在正方形中可以找到以第一对字母we为顶点的矩形，对应另一对顶点字母为vb，因此加密后为vb，
 * 同理可找到与字母对lc,et,oh,ho对应的顶点字母对。而字母对om位于上述正方形中的同一列，
 * 所以直接以颠倒这两个字母来加密，即为mo，字母对an同理。字母对gz中的z不在上述正方形中，
 * 因此原样放到加密串中。最后剩一个字母u也原样输出。
 * 因此输出的结果为：
 * vbrmmomvugnagzguu
 *
 * @author times
 * Time: 2017-11-12 16:39
 */
public class Demo15 {

    public Demo15() {
        char array[][] = new char[5][5];
        Scanner scanner = new Scanner(System.in);
        String pair = scanner.nextLine();
        String password = scanner.nextLine();
        char unUsedch = initArray(array, pair);
        System.out.println(passwordAfterChange(array, password, unUsedch));
    }

    public static char initArray(char[][] array, String pair) {
        Vector<Character> vector = new Vector<Character>();
        for (char i = 'a'; i <= 'z'; i++) {
            vector.add(i);
        }
        for (int i = 0; i < pair.length(); i++) {
            vector.remove((Character) pair.charAt(i));
            array[i / 5][i % 5] = pair.charAt(i);
        }
        for (int i = 0, j = pair.length(); i < vector.size() - 1; i++, j++) {
            array[j / 5][j % 5] = vector.elementAt(i);
        }
        return vector.elementAt(vector.size() - 1);
    }

    public static String passwordAfterChange(char[][] array, String password, char unUsedch) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < password.length(); i += 2) {
            if (i + 1 < password.length()) {
                if (password.charAt(i) == unUsedch || password.charAt(i + 1) == unUsedch) {//如果一对字母中有一个字母不在正方形中"如z"，则不变换，直接放入加密串中
                    sb.append(password.charAt(i));
                    sb.append(password.charAt(i + 1));
                } else if (password.charAt(i) == password.charAt(i + 1)) {//如果一对字母中的两个字母相同，则不变换，直接放入加密串中
                    sb.append(password.charAt(i));
                    sb.append(password.charAt(i + 1));
                } else {
                    int ch1i = 0, ch1j = 0, ch2i = 0, ch2j = 0;
                    for (int j = 0; j < array.length; j++) {
                        for (int j2 = 0; j2 < array.length; j2++) {
                            if (array[j][j2] == password.charAt(i)) {
                                ch1i = j;
                                ch1j = j2;
                            } else if (array[j][j2] == password.charAt(i + 1)) {
                                ch2i = j;
                                ch2j = j2;
                            }
                        }
                    }
                    if (ch1i == ch2i || ch1j == ch2j) {//如果字母对出现在方阵中的同一行或同一列，如df或hi，则只需简单对调这两个字母，即变换为fd或ih
                        sb.append(password.charAt(i + 1));
                        sb.append(password.charAt(i));
                    } else {
                        sb.append(array[ch1i][ch2j]);
                        sb.append(array[ch2i][ch1j]);
                    }

                }
            } else {//一对一对取字母，如果最后只剩下一个字母，则不变换，直接放入加密串中
                sb.append(password.charAt(i));
            }
        }
        return sb.toString();
    }
}
