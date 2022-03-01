import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int yil,x;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz :");
        yil = input.nextInt();

        x = yil % 4;
        if (x == 0){
            System.out.println( yil + " artık bir yıldır !");
        }else{
            x = yil % 100;
            if (yil%400 == 0 ){
                System.out.println(yil + " artık bir yıldır !");
            }else{
                System.out.println(yil+ " artık bir yıl değildir");
            }
        }
    }
}