package ZadPESEL;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginBulider {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\Ju_Za\\IdeaProjects\\untitled\\src\\ZadPESEL\\Dane.txt");
        Scanner sc = new Scanner(f);
        Pattern pattern = Pattern.compile("(\\d) (\\d{2}) \\d{2} \\d{4} id (\\d{5})");

        List<String>logins = new ArrayList<>();

        while (sc.hasNextLine()) {
            int i = 0;

            String ll = (sc.nextLine().replaceAll("[.,;\"'?():-_`/]", " "));
            Matcher matcher = pattern.matcher(ll);
            if (matcher.matches()) {
                matcher.group(3);
                matcher.group(2);
                matcher.group(2);
                logins.add(i, matcher.group(3) + matcher.group(2) + matcher.group(1));

            }
            i++;
            System.out.println(logins);
        }
    }

}
