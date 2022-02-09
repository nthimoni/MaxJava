 //package src;

import java.util.ArrayList;

/**
 * @author E. TALHI/ A. LOAËC
 * 29 sept. 2021
 */

/*
 * La classe pièce représente soit une pièce élementaire (un composant) soit un sous ensemble de 
 * pièces appelé assemblage (une nomenclature)
 */
public class Piece {
	/*
	 * La reference d'une pièce n'est pas complétement figée comme pour le produit, mais dépend de la pièce elle même, 
	 * càd : le support goodies a pour référence : EIGSI_101 _19092021, l'axe goodies : EIGSI_103_19092021, etc
	 * Elle sera combinée à numPiece pour constituer la référence finale de la pièce. Par exemple : un exempalire de l'axe
	 * goodies aura numéro final : EIGSI_103_19092021_3
	 */
	private String reference;
	private String designation;
	private String numPlan;
	private int numPiece;
	private float poids;
	private int indice;
	private Brut brutPiece;
	private boolean assemblage;
	private ArrayList<Piece> listeAssemblage;
	private Piece pieceMere;
	
	//TODO

}
