import Attributs.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


 public class ListeDeContactDynamique {
 public static void main(String[] args) {

     boolean ok = false;
     int decision = 0;
     boolean quitter = false;
     HashMap<String, Contact> map = new HashMap<>();
     List<Telephone> listeTel = new ArrayList<>();
     int nbeNum = 0;
     String choix = "l";
     char autreNuméro = 'k';
     boolean autreNum = true;
     boolean listePasFini = false;
     Scanner sc = new Scanner(System.in);
     while (!listePasFini) {
         quitter=false;
         while (!quitter) {
             System.out.println("1-Ajouter un contact.");
             System.out.println("2-Modifier un contact.");
             System.out.println("3-Afficher un contact.");
             System.out.println("4-Quitter.");
             decision = sc.nextInt();
             if (decision <= 7 && decision >= 1) {
                 quitter = true;
             } else {
                 System.out.println("Entrez une réponse valide.");
             }
         }
         switch (decision) {
             case 1:
                 Contact contact = Contact.creerContact();
                 map.put(contact.getNom(), contact);
                 break;
             case 2:
                 System.out.println("Quel contact voulez-vous modifier?");
                 choix=sc.next();
                 map.get(choix);
                 System.out.println();
         }
     }
    }
 }