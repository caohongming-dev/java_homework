package src.projectThree;

public class dayin2 {
    public static void main(String[] args) {
        System.out.println("请不要假装学习，后果很严重，从现在起，认认真真做好每一件事情！");
        for(int i =1;i<=6;i++) {
            for(int j=1;j<=6-i;j++){
                System.out.print("");
            }
            for (int k =1;k<=i;k++){
            System.out.print("*");
            }
            System.out.println();

        }
    }

}
