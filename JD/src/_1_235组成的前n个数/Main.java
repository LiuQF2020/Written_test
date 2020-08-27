package _1_235组成的前n个数;

import java.util.Scanner;
import java.util.Stack;
/*
自从学了素数以后，小明喜欢上了数字2、3和5。
当然，如果一个数字里面只出现2、3和5这三个数字，他也一样喜欢;
例如222、2355、223355。
现在他希望你能够帮他编写一个程序，快速计算出由2、3、5这三个数字组成的由小到大的第n个数;
当然也包括2、3和5。
 */


public class Main {
    public static int height=0;
    public static final int[] f={5,2,3};
    public static int getHeight(int n){
        int end=0;
        int start=0;

        while(n>end){
            start=end+1;
            end=start+(int)Math.pow(3,++height)-1;
        }
        return n-start+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        int x=getHeight(n);
        while(height-->0){
            stack.push(x%3);
            x=(x+2)/3;
        }
        while(!stack.isEmpty()){
            System.out.print(f[stack.pop()]);
        }

    }
}
