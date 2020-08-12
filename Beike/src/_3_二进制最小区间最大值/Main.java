package _3_二进制最小区间最大值;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }


        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = Integer.toBinaryString(arr[i]);
            arr1[i] = str[i].length();
        }

        int max_l = 0;
        Arrays.sort(arr1);
        max_l = arr1[n];

        int[] arr_stor_1 = new int[n];
        


        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(arr1));

    }
}
