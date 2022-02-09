//package src;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

/**
 * @author E. TALHI/ A. LOAËC
 * 15 oct. 2021
 */
public class Tracabilite {
	private String numOperation;
	private String numLot;
	/* La classe Date, qui existe dejà dans les bibliotheques Java permet de representer une date, un point precis dans le temps.
	 */
	
	private Date dateHeureDebut;
	private Date dateHeureFin;
	
	private Poste lePoste;
	private Piece laPiece;
	private ArrayList<Poste> usinages;
	
	/*
	 * La creation d'un objet de type Tracabilite "vide" n'a qu'un seul but c'est de vous permettre d'executer la methode calculerHeureFin()
	 * pour comprendre son fonctionnement.
	 */
	public Tracabilite() {
		this.dateHeureDebut = null;
		this.dateHeureFin = null;
		this.lePoste = null;
		this.laPiece = null;
		usinages = new ArrayList<Poste>();
	}
	
	
	/*
	 * La methode calculerHeureFin prend comme parametre la duree en minutes (int), recupere l'instant present via Calendar.getInstance() auquel elle ajoute
	 * la duree (exrimee en minute) apres l'avoir convertie en milisecondes et affiche l'heure de fin.
	 */

	
	public void calculerHeureFin(int duree) {
		
		Calendar varHeureTemp = Calendar.getInstance();
		this.dateHeureDebut = varHeureTemp.getTime();
		System.out.println("La date du debut de la tache " + this.dateHeureDebut.toString());
		System.out.println("L'heure du debut de la tache " + this.dateHeureDebut.getHours() +":"+this.dateHeureDebut.getMinutes());
		
		long tempsEnMiliSeconde = varHeureTemp.getTimeInMillis();
		this.dateHeureFin = new Date(tempsEnMiliSeconde + (duree * 60 * 1000));
		System.out.println("L'heure de la fin d'execution apres ajout de "+ duree +" min " + this.dateHeureFin.toString());
		
		if(this.dateHeureFin.getMinutes()<10) {
			System.out.println("L'heure de la fin d'execution apres ajout de "+ duree +" min " + this.dateHeureFin.getHours() +":0"+this.dateHeureFin.getMinutes());
		}else {
			System.out.println("L'heure de la fin d'execution apres ajout de "+ duree +" min " + this.dateHeureFin.getHours() +":"+this.dateHeureFin.getMinutes());
		}
	}
	
	public void ajouterUsinage(Poste poste)
	{
		usinages.add(poste);
	}

	// Méthode permettant de lister les postes d'usinage par lesquels est passée une pièce.
	public void listerUsinage() {
		for (int i = 0; i < usinages.size(); i++)
			System.out.println(usinages.get(i).toString());
	}

}

