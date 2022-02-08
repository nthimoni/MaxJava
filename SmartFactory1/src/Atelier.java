package src;

import java.util.ArrayList;

/**
 * @author E. TALHI/ A. LOAËC
 * 27 sept. 2021
 */

/*
 * La classe Atelier permet de représenter un atelier via un ensemble d'informations. 
 * Parmi ces informations figure une liste d'espaces. Cette liste contiendra les epsaces suivants :
 * Métrologie, Productique, Technologie des mécanismes
 */

public class Atelier {
	private ArrayList<Espace> espaces;
	private String nom;

	public Atelier(String nom)
	{
		this.nom = nom;
		espaces = new ArrayList<Espace>();
	}

	// Ajoute un espace a la liste
	public void addEspace(Espace a)
	{
		espaces.add(a);
	}

	// Methode qui renvoie une chaine correspondant a l'atelier
	public String toString()
	{
		return "Atelier : " + nom + " - Nombre d'espaces : " + espaces.size();
	}

	// Methode qui affiche les espaces et les postes
	public void printAtelier()
	{
		for (int i = 0; i < espaces.size(); i++)
		{
			System.out.println(espaces.get(i).toString());
			espaces.get(i).printPostes();
		}
	}
}
