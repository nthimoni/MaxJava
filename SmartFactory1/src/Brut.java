//package src;
import java.util.ArrayList;

/**
 * @author E. TALHI/ A. LOAËC
 * 29 sept. 2021
 */
public class Brut {

    private String forme;   //Cylindre ou paralépipède
    private int Longueur;
    private int largeur;    //Diamètre si cylindre
    private int hauteur;
    private String nomBrut;    //Nom de ce que va devenir le Brut
    private ChaineProd chaine;

    public Brut(String nomBrut, String forme, int Longueur, int largeur, int hauteur, ChaineProd chaine){
        this.nomBrut = nomBrut;
        this.forme=forme;
        this.Longueur=Longueur;
        this.largeur=largeur;
        this.hauteur=hauteur;
        this.chaine = chaine;
    }
    public void subLongueur(int size)
    {
        Longueur -= size;
    }
    public void sublargeur(int size)
    {
        largeur -= size;
    }
    public void subhauteur(int size)
    {
        hauteur -= size;
    }
    public ChaineProd getChaine()
    {
        return chaine;
    }

	// TODO
}
