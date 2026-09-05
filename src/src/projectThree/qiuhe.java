package src.projectThree;

import java.util.Scanner;
public class qiuhe {
    public static void main(String[] args) {
        System.out.println("曹洪铭，请你再多认真一点!");
        Scanner sc = new Scanner (System.in);
        int count =0;//这一行是用来统计个数的
        int sum =0;
        int num;
        System.out.println("请输入若干整数,输入0结束");
        num = sc.nextInt();
        while (num!=0) {//确保循环条件，只要num不等于0就一直循环,千万别带上分号，会报错的！
        if (num>0) {
            count++;
            sum += num;
        }
        num = sc.nextInt();
    }
    System.out.println("负数的个数:"+count);
    System.out.println("正数的和为:"+sum);
    sc.close();
}
}



















