package src.projectThree;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int result = 0,num,n;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入连续加法的次数");
        n = s.nextInt();
        int i =0;
        while(i<n)
        {
            System.out.println("请输入第"+(i+1)+"个加数:");//（加法是拼接符号）
                num = s.nextInt();
            result +=num;
            i++;
        }
        System.out.println(n+"个数的和为"+result );




        }




    }



