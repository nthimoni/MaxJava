//package src;
import java.util.Date;


/**
 * @author E. TALHI/ A. LOAËC
 * 27 sept. 2021
 */

/*
 * La classe poste permet de créer tous les postes de la smart factory : aussi bien les machines que les postes manuels.
 */

public class Poste {


    private String nom;
    private String ref;

    private Piece piece;

    // Permet de créer ensuite tous les postes au début du main.
    public Poste (String nom, String ref){

        this.nom=nom;
        this.ref=ref;
    }

    public Brut usiner(Brut brut, Tracabilite tra, int time)
    {
        tra.ajouterUsinage(this);
        System.out.println();
        tra.calculerHeureFin(time);
        System.out.println();
        return brut;
    }
    // Renvoie une chaine detaillant le poste en question
    public String toString()
    {
        return "Poste : " + nom + " (ref: " + ref + ")";
    }
}