//package src;

import java.util.ArrayList;
import javax.swing.plaf.basic.BasicListUI.ListSelectionHandler;

/**
 * @author E. TALHI/ A. LOAËC
 * 27 sept. 2021
 */

/*
 * La classe espace permet la création d'objets espaces. Ces objets serviront à remplir 
 * la liste "espaces" dans la classe Atelier
 */

public class Espace {

    private String nom;
    // La listePostes permet de lister les postes qui se trouvent dans un espace.
    private ArrayList<Poste> listePostes;
    // L'attribut atelier permet de lier l'espace courant à un atelier
    //private Atelier atelier;
    
    public Espace(String nom)
    {
       this.nom = nom;
       this.listePostes = new ArrayList<Poste>();
    }

    // Ajoute un poste a la liste de l'espace
    public void addPoste(Poste poste)
    {
        this.listePostes.add(poste);
    }

    // Methode qui affiche en chaine tous les postes
    public void printPostes()
    {
        for (int i = 0; i < this.listePostes.size(); i++)
            System.out.println("    -> " + listePostes.get(i).toString());
    }
    
    // Methode qui renvoie une chaine correspondant a l'espace
    public String toString()
    {
        return "Espace : " + nom;
    }
}