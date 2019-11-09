import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad17_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int a = 0;
double i = 0;
        do {
            try {
                System.out.println("podaj liczbe ");
                i = sc.nextDouble();
                double o = 1/i ;
                System.out.printf("%.5f",o);
                break;


            } catch (InputMismatchException e) {

                sc.next();
            }
        } while (a<1);{

        }

    }
}