import java.util.Scanner;

public class Zad13_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbe");
         Integer i = sc.nextInt();
        if (i>=1000){
            System.out.println(i);
        }
            switch (i/100){
                case (1):System.out.println("sto ");break;
                case (2):System.out.println("dwiescie ");break;
                case (3):System.out.println("trzysta ");break;
                case (4):System.out.println("czterysta ");break;
                case (5):System.out.println("piecset ");break;
                case (6):System.out.println("szescset ");break;
                case (7):System.out.println("siedemset ");break;
                case (8):System.out.println("osiemset ");break;
                case (9):System.out.println("dziewiecset ");break;

            }

            switch (i/10){
                case (10):System.out.println("dziesięc ");break;
                case (20):System.out.println("dwadziesia ");break;
                case (30):System.out.println("trzydziesci ");break;
                case (40):System.out.println("czterdziesci ");break;
                case (50):System.out.println("piecdziesiat ");break;
                case (60):System.out.println("szescdziesiat ");break;
                case (70):System.out.println("siedemdiesiat ");break;
                case (80):System.out.println("osiemdziesiat ");break;
                case (90):System.out.println("dziewiecdziesiat ");break;
            }
            switch (i/100-i/10){
                case (1):System.out.println("jeden ");break;
                case (2):System.out.println("dwa ");break;
                case (3):System.out.println("trzy ");break;
                case (4):System.out.println("cztery ");break;
                case (5):System.out.println("piec ");break;
                case (6):System.out.println("szesc ");break;
                case (7):System.out.println("siedem ");break;
                case (8):System.out.println("osiem ");break;
                case (9):System.out.println("dziewiec ");break;
            }
            }
        }


