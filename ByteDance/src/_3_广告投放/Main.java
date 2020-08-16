package _3_广告投放;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        int Lmin;

        Arrays.sort(L);
        Lmin = L[0];
        int Min = 3 * Lmin / (M -  N);

        System.out.println(Min);
    }
}
