import Attributs.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PagNi1731620 on 2018-02-26.
 */
public class ListeDeContactDynamique {
    public static void main(String[] args) {

        int decision=0;
        boolean quitter=false;
        HashMap<String, Contact> map=new HashMap<>();
        int nbeNum=0;
        char autreNuméro='k';
        boolean autreNum=true;
        boolean rep=false;
        Scanner sc= new Scanner(System.in);
        while (quitter==false) {
            System.out.println("1-Ajouter un contact.");
            System.out.println("2-Modifier un contact.");
            System.out.println("3-Afficher un contact.");
            System.out.println("4-Quitter.");
            decision = sc.nextInt();
        }
        switch (decision){
            case 1:
                Contact.creerContact();
                Contact contact= Contact.creerContact();
                map.put(contact.getNom(),contact);


                break;
        }
    }
}
