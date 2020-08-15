package _3_小团的配送团队;

/*
小团是美团外卖的区域配送负责人，众所周知，外卖小哥一般都会同时配送若干单，小团在接单时希望把同一个小区的单子放在一起，然后由一名骑手统一配送。但是由于订单是叠在一起的，所以，他归类订单时只能知道新订单和已有的某个订单的小区是相同的，他觉得这样太麻烦了，所以希望你帮他写一个程序解决这个问题。

即给出若干个形如a b的关系，表示a号订单和b号订单是同一个小区的 ，请你把同一个小区的订单按照编号顺序排序，并分行输出，优先输出最小的订单编号较小的小区订单集合。订单的编号是1到n。(可能存在同时出现a b和b a这样的关系,也有可能出现a a这样的关系)





输入描述
输入第一行是两个正整数n，m，表示接受的订单数量和已知的关系数量。(1<=n，m<=10000)

接下来有m行，每行两个正整数a和b，表示a号订单和b号订单属于同一个小区(1<=a,b<=n);

输出描述
输出第一行包含一个整数x，表示这些订单共来自x个不同的小区。

接下来的输出包含x行，每行表示输出若干个订单编号，表示这些订单属于同一个小区，按照订单编号升序输出。优先输出最小的订单编号较小的小区。


样例输入
5 5
1 2
2 2
3 1
4 2
5 4
样例输出
1
1 2 3 4 5
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> lists =new ArrayList<>();
        List<List<Integer>> result =new ArrayList<>();
        result.add(lists);
        lists.add(sc.nextInt());
        lists.add(sc.nextInt());

        for (int i = 0; i < m-1; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            for(List<Integer> l: result){
                if (l.contains(p)&&l.contains(q)){
                    continue;
                }
                if (l.contains(p)){
                    lists.add(q);
                    continue;
                }
                if (l.contains(q)){
                    lists.add(p);
                    continue;
                }
                List<Integer>list1=new ArrayList<>();
                list1.add(q);
                list1.add(p);
                result.add(list1);
            }

        }
        System.out.println(result.size());
        for(List<Integer> i: result){
            Collections.sort(i);
        }
        findmin(result);
    }
    public static void findmin(List<List<Integer>>res){
        List<Integer>ans=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for (int j=0;j<res.size();j++){
            map.put(res.get(j).get(0),j);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer v = entry.getValue();
            List<Integer> integers = res.get(v);
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }
}



