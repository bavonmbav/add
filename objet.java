
package arraylistes;
import java.util.ArrayList;
//la classe collection
import java.util.Collections;


public class objet {
   
      public static void main() {
        ArrayList<String> voiture = new ArrayList<String>();
        
        //pour ajouter les element dans notre arraylist on a la methode add
        voiture.add("BMW");
      
        voiture.add("forde");
        voiture.add("mercedes");
        voiture.add("cruser");
        System.out.println("arrayListe");
      //  voiture.set(3, "land cruser"); //pour modifier la valeur de arrayliste prend deux parametre
        // index et l'element modifier
        //voiture.remove(2); //remove supprime l'element du arrayListe 
        //voiture.size(); // pour connaitre la taille 
        
        /*
        utilisation de la boucle dans arrayListe ben la boucle foraech
        */
        //la collection est une classe utile qui inclut la methode sort 
        // qui permet de trier les element par ordre alphebetique
        Collections.sort(voiture);
        for(String i : voiture)
        {
            System.out.println(i);
        }
           //pour acceder a la valeur de arrayliste
    }
}
