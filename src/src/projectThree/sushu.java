package src.projectThree;

public class sushu {
    public static void main(String[] args) {
        System.out.println("永远对所作的事情心怀热爱与感激，永远保持对知识最崇高的敬意");
        int count = 0;
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;//不符合素数的定义
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + "\t");//这一行结束不要换行，只有打印了一个素数，count才会加1
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}












