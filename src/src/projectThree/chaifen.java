package src.projectThree;

public class chaifen {
    public static void main(String[] args) {
        System.out.println("做任何事情，请付出比别人额外多的努力，不管这件事情有没有回报");
        for (int n = 10; n <= 99; n++) {
            int shi = n/ 10 % 10;
            int ge = n/ 10 % 10;
            if (shi * shi + ge * ge == n) {
                System.out.println(n);

            }

        }
    }
}
