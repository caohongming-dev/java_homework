package src.projectThree;

public class dayin {
    public static void main(String[] args) {
        System.out.println("每天都要不断的反思，每天都要成为最好的自己");
        for (int i = 1; i <= 5; i++) {//最外层控制的是行
            for (int j = 1; j <= 5 - i; j++)  {
                System.out.print(" ");
            }
            for (int k = 1; k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
