package _1_不一样的逆序数;

/*
小团最近对逆序数（将一个数字逐位逆序，例如1234的逆序数为4321）特别感兴趣，但是又觉得普通的逆序数问题有点太乏味了。

于是他想出了一个新的定义：如果一个数的4倍恰好是它的逆序数，那么称这两个数是新定义下的逆序对。

接下来给定一正整数n，问：不超过n的正整数中有多少对新定义下的逆序对？



输入描述
单组输入。

输入一个正整数n，n<1e7。

输出描述
第一行输出在不超过n的前提下有多少对逆序数，接下来每一行输出一对逆序数，以空格分隔。如果有多组逆序数，按照第一个数升序输出。

如果没有一对逆序数则直接输出0即可。


样例输入
10000
样例输出
1
2178 8712

提示
在本题目的情景中我们认为：1234的逆序数为4321，1100的逆序数为11
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cou = 0;
        for(int i = 1; i <= n / 4; i++) {
            if (getVer(i) == i * 4) {
                cou++;
                List<Integer> tm = new ArrayList<>();
                tm.add(i);
                tm.add(i * 4);
                lists.add(tm);
            }
        }
        System.out.println(cou);
        for (List<Integer> a : lists) {
            System.out.println(a.get(0) + " " + a.get(1));

        }
    }

    public static int getVer(int i) {
        StringBuffer s = new StringBuffer(String.valueOf(i));
        s.reverse();
        int point = 0;
        while (point < s.length() && s.charAt(point) == '0') {
            point++;
        }
        if (point == 0) {
            return Integer.parseInt(s.substring(point));
        }

        if (point == s.length()) {
            return 0;
        }

        return Integer.parseInt(s.substring(point - 1));
    }

}
