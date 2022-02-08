package src;

import java.util.ArrayList;

/**
 * @author E. TALHI/ A. LOAËC
 * 29 sept. 2021
 */
/*
 * La classe produit permet de représenter le produit final. Le produit final est composé de plusieurs pièces
 */
public class Produit {
	/*La reference, précédée du mot clé final veut dire que c'est un attribut qu'on ne pourra pas modifier.
	 * On peut y accéder en lecture seulement. L'objectif ici est que le nom des produit commence toujours par : EIGSI_1 _19092021
	 * Combiné avec le numProduit, il permettra d'obtenir la référence finale d'un produit
	*/
	public final String reference = "EIGSI_1 _19092021";
	/*
	 * Le numProduit permet de compléter la référence de ce dernier en a joutant un nombre entre 1 et 10000.
	 * Par exemple : un produit avec un numProduit = 4 aura le numéro final suivant : EIGSI_1 _19092021_4
	 */
	private int numProduit;
	
	public void piecesProduit(){

		ArrayList<String> pieces = new ArrayList<String>();

		//pieces.add(); 
	}
	
	//TODO

}
