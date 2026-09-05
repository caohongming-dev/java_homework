package src.projectThree;

import java.util.Scanner;
public class leiyi {
    public static void main(String[] args) {
        System.out.println("从小事情做起");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num;
        int sum = 0;
        System.out.println("请输入几个负数，输入0时候结束");
        num = sc.nextInt();
        while (num != 0) {
            if (num < 0) {
                count++;
                sum += num;
            }
            num = sc.nextInt();
        }//这里千万不要少写这个结束符号！
            System.out.println("负数的个数为：" + count);
            System.out.println("负数的总和为：" + sum);
            sc.close();


        }
    }





