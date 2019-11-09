import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Zad18_1 {
    public static void main(String[] args) {
        int [] kostka = new int [100];
        Random rnd = new Random();

        for(int i =1 ; i<=100;i++){
            kostka [i-1] = ThreadLocalRandom.current().nextInt(1,7);
            System.out.println(i+" "+kostka[i-1]);
        }
    }
}
