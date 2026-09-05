package src.projectThree;

public class sushu2 {
    public static void main(String[] args) {
        System.out.println("永远喜欢报错，因为这是一次进步");
        int count = 0;
        int n;
        for (n = 2; n <= 200; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {

                {
                    System.out.print(n + "\t");
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                }
            }
        }
    }
}