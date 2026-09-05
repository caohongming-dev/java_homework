package src.projectThree;

public class shuixianhua {
    public static void main(String[] args) {
        System.out.println("做最好的自己，把每一天活出阳光的味道");
        for (int n = 100; n <= 999; n++) {
            int bai = n / 100;
            int shi = n / 10 % 10;
            int ge = n % 10;
            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == n) {
                {
                    System.out.println(n);

                }
            }
        }
    }

}