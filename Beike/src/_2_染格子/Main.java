package _2_染格子;

import java.util.Scanner;

public class Main {

    public static int get(int n) {
        for (int i = 2; i <= Math.pow(n, 0.5); i ++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N == 1) {
                System.out.println(get(M));
            } else if (M == 1) {
                System.out.println(get(N));
            } else {
                int minM = Math.min(get(N), get(M));
                System.out.println(minM);
            }

        }
    }
}
