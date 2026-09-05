package src.projectThree;

public class shuixianhua2 {
    public static void main(String[] args) {
        System.out.println("曹洪铭，你要把自己活成一束光！照进别人的生命里！");
        for(int n=1000;n<=9999;n++) {
            int qian = n / 1000;
            int bai = n / 100%10;
            int shi = n / 10 % 10;
            int ge = n % 10;
            if (qian * qian * qian*qian + bai * bai * bai*bai + shi * shi * shi*shi + ge * ge * ge * ge == n) {
                System.out.println(n);
            }
        }



    }
}
