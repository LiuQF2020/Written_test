package _2_小团的旅行线路;
/*
小团是一个旅游爱好者，快要过春节了，他想统计一下，在过去的一年中他进行过几次旅行，于是他打开了美团app的订单记录，记录显示了他的购买车票的记录。记录是按时间顺序给出的，已知一次旅行的线路一定是一个闭环，即起点和终点是同一个地点。因此当每找到一段闭合的行程，即认为完成了一次旅行。数据保证不会出现不在闭环路径中的数据。

请你在小团的购票记录中统计出他全年共进行了多少次旅行？



输入描述
输入第一行包含一个正整数n，表示小团的购票记录数量。(1<=n<=10000)

接下来有n行，每行是两个长度不超过10的仅由小写字母组成的字符串S_a S_b，表示购买了一张从S_a到S_b的车票。

输出描述
输出仅包含一个整数，表示小团的旅行次数。


样例输入
6
beijing nanjing
nanjing guangzhou
guangzhou shanghai
shanghai beijing
fuzhou beijing
beijing fuzhou
样例输出
2
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();

        String[] s1 = new String[n];
        String[] s2 = new String[n];

        for(int i = 0; i < n; i++) {
            s1[i] = sc.next();
            s2[i] = sc.next();
            sc.nextLine();
        }

        int zuo = 0;
        int you = 0;
        while (zuo < n && you < n) {
            if (!s1[zuo].equals(s2[you])) {
                you++;
            }
            else {
                res++;
                zuo = you +1;
            }
        }

        System.out.println(res);
    }

}

