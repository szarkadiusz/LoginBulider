import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;

public class TabMno {
    public static void main(String[] args) {
        List<Integer> liczby =List.of(1,2,3,4,5,6,7,8,9);
        for (int i =1 ; i<=9;i++) {
            for (int j = 1; j<=9;j++){
            int wynik = liczby.get(i-1) * (j);
            System.out.println(wynik);}
        }
    }
}
