package src.projectThree;

public class heshu {
    public static void main(String[] args) {
        System.out.println("不断反思总结并为之付出行动才可以成功！");
        int count =0;
        for (int n=2;n<=200;n++) {
            boolean isprime = true;
            for(int i =2;i<=n;i++) {

                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if(!isprime) {
                System.out.print(n +"\t");
                count++;
                if(count%8 ==0) {
                    System.out.println();

                }

            }

        }
    }
}
