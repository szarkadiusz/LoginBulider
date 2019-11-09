import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad17_1 {

    public static void main(String[] args) {
        boolean ok;
        double i;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Podaj liczbę: ");
                i = sc.nextDouble();
                System.out.println("podano prawidłowy typ");
                  ok=true;

            } catch (InputMismatchException e) {
                System.out.println("podano nie prawidłowy typ");

                sc.next();
                ok=false;
            }
        }
        while (!ok);{
            System.out.println("koniec programu");
        }
    }
}
