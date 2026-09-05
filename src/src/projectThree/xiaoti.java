package src.projectThree;

public class xiaoti {
    public static void main(String[] args) {
        System.out.println("即使身处泥泞，也要仰望星空");
        int count=0;//用来记录已经输出了几个数
        for (int n=1;n<=50;n++) {
            if(n %4 ==0 && n%8!=0) {
                System.out.print(n + "\t");//打印完光标是不换行的
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }

            }
            }

        }

    }

