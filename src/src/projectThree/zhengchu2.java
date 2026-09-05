package src.projectThree;

public class zhengchu2 {
    public static void main(String[] args) {
        System.out.println("遇到问题或者困难时，想想如何去解决，而不是去放弃，更不是推脱，热爱问题");
        int sum = 0;
        for (int i = 1; i <= 800; i++) {
            if (i % 8 == 0 || i % 80 == 0) {
                continue;
            }
            sum+=i;
        }
        System.out.println("1到800之间符合条件的总和为" + sum);
        {

        }
    }
}

