public class Zad12_3 {
    public static void main(String[] args) {
        String s = "#1 #2 #3";
        System.out.println(s);
        System.out.println(s.indexOf("#3"));

        String imie = "szczepan";
        int dl = imie.length();
        System.out.println(dl);
        char lit = imie.charAt(dl-1);

        if (lit == 'a') {
            System.out.println("Imię żeńskie");
        }else{
            System.out.println("imie meskie");
        }
    }
}
