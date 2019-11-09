package ShoppingList;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();
        boolean shoppingContinue=true;
        String shoppingWill;
        int qty = 0;


        System.out.println("Witaj w programie lista zakupów !\n Podaj 1 pozycję listy: ");
        String shoppingItem = sc.nextLine();
        System.out.println("Podaj ilość: ");
        qty = sc.nextInt();
        shoppingList.add(String.format(shoppingItem.toUpperCase() + " x %d", qty));

        while (shoppingContinue=true) {
            System.out.println("Czy to już koniec Twojej listy ?\n Wpisz [T]ak lub [N]ie:");
            shoppingWill = sc.next();
            if (shoppingWill.equalsIgnoreCase("t")) {
                shoppingContinue = true;
                break;
                 }else {
                shoppingWill = sc.nextLine();
                System.out.println("Podaj kolejną pozycję listy");
                shoppingItem = sc.nextLine();
                System.out.println("Podaj ilość: ");
                qty = sc.nextInt();
                shoppingList.add(String.format(shoppingItem.toUpperCase() + " x %d", qty));
            }

            }

        File list = new File ("ListaZakupów.txt");

        PrintWriter listUpdate = new PrintWriter("ListaZakupów.txt");
                listUpdate.println("-- LISTA ZAKUPÓW --");
                for (int i =0;i <shoppingList.size();i++) {
                    listUpdate.println(shoppingList.get(i));

                }
                    listUpdate.close();
                    System.out.println("Twoja lista znajduje się w : "+list.getAbsolutePath());
                    System.out.println("Dziękuję i zapraszam ponownie");



        }


    }
