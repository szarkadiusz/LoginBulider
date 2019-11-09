import java.util.ArrayList;
import java.util.List;

public class Zad14_7 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        lista.add(1);
        lista.add(1);


        for (int i = 2;i<=45;i++){
           lista.add((lista.get(i-2)+lista.get(i-1)));
            }
        System.out.println(lista);


        }
    }

