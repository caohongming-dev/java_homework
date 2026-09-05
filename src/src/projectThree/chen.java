package src.projectThree;

import java.util.Scanner;
public class chen {
    public static void main(String[] args) {
        System.out.println("像军人一样的学习和生活");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("请输入一个整数");
            num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + "是偶数");//num是变量名，不用加引号，+号是拼接的含义
            } else {
                System.out.println(num + "是奇数");
            }
        }while (num % 3 != 0) ;{//注意：do while 的循环结构里面，while的结尾是一定要加分号的
                System.out.println("该数不可以被3整除，程序结束");
            }
        }
    }
