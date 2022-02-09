//package src;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.PlainDocument;

/**
 * @author E. TALHI/ A .LOAËC
 *         17 oct. 2021
 */
public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// Creation de l'atelier
		Atelier atelier = new Atelier("Principal");

		// Creation des espaces
		Espace metrologie = new Espace("Metrologie");
		Espace productique = new Espace("Productique");
		Espace tech = new Espace("Technologie des mecanismes");

		// Ajout des espaces
		atelier.addEspace(metrologie);
		atelier.addEspace(productique);
		atelier.addEspace(tech);

		// Creation des postes de metrologie
		Poste brasMetro = new Poste("bras metrologie", "EIGSI_P");
		Poste imp3D = new Poste("impression 3D filaire PLA", "EIGSI_P");
		Poste controleDiam = new Poste("controle diametre", "EIGSI_P");

		// Creation des postes dans technologie des mecanismes
		Poste magasinFini = new Poste("MAGASIN Produit fini", "EIGSI_P");

		// Creation des postes dans productique
		Poste magasinBrut = new Poste("MAGASIN STOCK BRUT", "EIGSI_P");
		Poste plieuse = new Poste("Plieuse", "EIGSI_P");
		Poste perceuse = new Poste("Perceuse a colonne", "EIGSI_P3");
		Poste soudage = new Poste("soudage", "EIGSI_P");
		Poste jetdeau = new Poste("jet d'eau", "EIGSI_P");
		Poste fraise = new Poste("fraise conventionelle", "EIGSI_P");
		Poste tourConvCaz = new Poste("tour conventionnel CAZENEUVE", "EIGSI_P");
		Poste tourCN = new Poste("Tour CN", "EIGSI_P");
		Poste FraiseuseCN1 = new Poste("Fraiseuse CN DMG MORI", "EIGSI_P2");
		Poste FraiseuseCN2 = new Poste("Fraiseuse CN ROBODRILL", "EIGSI_P1");
		Poste tourConvOpti = new Poste("tour conventionnel OPTIMACHINE", "EIGSI_P");

		// Ajout des postes dans l'espace metrologie
		metrologie.addPoste(brasMetro);
		metrologie.addPoste(imp3D);
		metrologie.addPoste(controleDiam);

		// Ajout des postes dans l'espace technologie des mecanismes
		tech.addPoste(magasinFini);

		// Ajout des postes dans l'espace productique
		productique.addPoste(magasinBrut);
		productique.addPoste(plieuse);
		productique.addPoste(perceuse);
		productique.addPoste(soudage);
		productique.addPoste(jetdeau);
		productique.addPoste(fraise);
		productique.addPoste(tourConvCaz);
		productique.addPoste(tourCN);
		productique.addPoste(FraiseuseCN1);
		productique.addPoste(FraiseuseCN2);
		productique.addPoste(tourConvOpti);

		int choix = 0;
		ChaineProd chaine = new ChaineProd();
		ArrayList<Integer> tempsJet = new ArrayList<>();
		tempsJet.add(10);
		ArrayList<Integer> tempsFraiseuse = new ArrayList<>();
		tempsFraiseuse.add(3);
		tempsFraiseuse.add(2);
		tempsFraiseuse.add(4);
		tempsFraiseuse.add(1);
		tempsFraiseuse.add(4);

		chaine.addPoste(jetdeau, 1, tempsJet);
		chaine.addPoste(FraiseuseCN1, 5, tempsFraiseuse);
		Brut plaque = new Brut("Plaque", "Parallelepipede", 200, 200, 20, chaine);
		do {
			// Introduction & choix d'action
			System.out.println("Bonjour, bienvenue dans l'interface de contrôle EIGSI.");
			System.out.println(" ");
			System.out.println("Que souhaitez vous faire ?");
			System.out.println(" ");
			System.out.println("1- Voir l'atelier");
			System.out.println("2- Voir l'usinage de la pièce");
			System.out.println("3- Quitter");
			System.out.println(" ");

			Scanner console = new Scanner(System.in);

			do {
				System.out.println("Veuillez entrer votre choix :");
				choix = console.nextInt();
			} while (choix < 1 || choix > 3);

			// Choix 1 ==> Affichage Atelier
			if (choix == 1) {

				// Affichage des informations
				System.out.println(atelier.toString());
				atelier.printAtelier();
			}

			/*
			 * Choix 2 ==> Afficher Usinage avec Tracabilite
			 * Test de la méthode calculerHeureFin(int) dans la classe Tracabilite
			 */
			if (choix == 2) {

				boolean usinage;

				System.out.println("Voulez vous lancer l'usinage ?");
				usinage = console.nextBoolean();
				if (usinage == true) {
					Tracabilite tra = new Tracabilite();
					for (int i = 0; i < plaque.getChaine().size(); i++) {
						Poste current = plaque.getChaine().get(i);
						for (int u = 0; u < plaque.getChaine().ite(i); u++) {
							System.out.println(current.toString());
							current.usiner(plaque, tra, plaque.getChaine().getTemps(i, u));
						}
					}
				}
			}
			console.close();
			// Choix de fin de programme ou pas.
		} while (choix != 3);
	}

}