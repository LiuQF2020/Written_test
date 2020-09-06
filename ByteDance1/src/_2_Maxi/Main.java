package _2_Maxi;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        int [] right = findMaxRightWithStack(array);
        int [] left = findMaxLeftWithStack(array);
        long result = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            int temp = right[i] * left[i];
            result = Math.max(result,temp);
        }
        System.out.print(result);


    }
    public static int[] findMaxLeftWithStack(int[] array) {
        if(array == null) {
            return array;
        }
        int size = array.length;
        int[] result = new int[size];
        Stack<Integer> stack = new Stack<>();
        stack.push(size - 1);
        int index = size - 2;
        while(index >= 0) {
            if(!stack.isEmpty() && array[index] > array[stack.peek()]) {
                result[stack.pop()] = index + 1;
            } else {
                stack.push(index);
                index--;
            }
        }
        if(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        return result;
    }
    public static int[] findMaxRightWithStack(int[] array) {
        if(array == null) {
            return array;
        }
        int size = array.length;
        int[] result = new int[size];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int index = 1;
        while(index < size) {
            if(!stack.isEmpty() && array[index] > array[stack.peek()]) {
                result[stack.pop()] = index + 1;
            } else {
                stack.push(index);
                index++;
            }
        }
        if(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        return result;
    }
}
