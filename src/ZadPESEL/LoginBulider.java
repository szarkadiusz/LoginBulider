package ZadPESEL;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class LoginBulider {
    public static void main(String[] args) throws IOException {
        //pobieram dane z pliku
        File f = new File("C:\\Users\\Ju_Za\\IdeaProjects\\untitled\\src\\ZadPESEL\\Dane.txt");
        //aktywuję skaner
        Scanner sc = new Scanner(f);
        //aktywuję tymczasową listę do usunięcia znaków interpunkcyjnych
        List<String>logins = new ArrayList<>();
       // aktywuję listę finalnych "loginów"
        List<String[]> loginsReady = new ArrayList<>();
        //pętla, kótra wykrywa kiedy w pliku kończą się linie z danymi
        while (sc.hasNextLine()) {
            //cykilczne dodawanie kolejnego elementu do listy bez znakó interpunkycjnych
            logins.add( sc.nextLine().replaceAll("[.,;\"'?():-_`/]", " "));


        //aktywacja pętli FOR celem zbudowania elementów loginu
        for (int i=0;i>=logins.size();i++){
            //1 element loginu (tylko numer)
            loginsReady.add(logins.get(i).split("^[0-9]"));
           // 2 element loginu (tylko dzień z daty)
            loginsReady.add(logins.get(i+1).split("[0-9]{2}"));
           // 3 element loginu(tylko numer id)
            loginsReady.add(logins.get(i+2).split("[0-9]{5}"));


        }
            System.out.println(loginsReady);
        //login miałby zostać wpisany w konfiguracji np. 2 - 1 - 0
        }
    }

}
