package src.projectThree;

import java.util.Scanner;
public class zhengshu {
    public static void main(String[] args) {
        System.out.println("永远保持学习的姿态！");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("请输入一个数");
            num = sc.nextInt();
            if (num >= 0) {
                System.out.println("该数是正数");
            } else {
                System.out.println("该数不是正数");
            }
        }//这个括号代表do的循环体到这里就写完了
        while (num % 5 != 0);
        System.out.println("该数可以被5整除，程序结束");
        sc.close();
    }
}