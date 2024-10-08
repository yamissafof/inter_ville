package Projet;

import java.util.Scanner;

public class Inter_Ville {

	public static void main(String[] args) {
		String[] villes = {"Brest", "Grenoble", "Lille", "Lyon", "Marseille", "Nantes", "Paris", "Rennes", "Strasbourg", "Toulouse"};
		String villeDepart, villeArrivee;
		int[][] distances = {
				{0, 996, 723, 890, 1286, 305, 564, 245, 1026, 884},
				{0, 0, 750, 104, 286, 711, 576, 747, 505, 543},
				{0, 0, 0, 668, 979, 593, 224, 515, 524, 905},
				{0, 0, 0, 0, 316, 607, 472, 645, 434, 467},
				{0, 0, 0, 0, 0, 890, 769, 938, 750, 400},
				{0, 0, 0, 0, 0, 0, 386, 106, 832, 559},
				{0, 0, 0, 0, 0, 0, 0, 348, 447, 681},
				{0, 0, 0, 0, 0, 0, 0, 0, 799, 665},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 901},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int indiceDepart, indiceArrivee, distance, distanceInverse, i;
		Scanner sc = new Scanner(System.in);
		
		do {
			villeDepart = Saisie.lire_String("Ville de départ : ");
			villeArrivee = Saisie.lire_String("Ville d'arrivée : ");
			
			indiceDepart = -1;
			indiceArrivee = -1;
			
			for (i = 0; i < villes.length; i++) {
				if (villes[i].equals(villeDepart)) {
					indiceDepart = i;
				}
				if (villes[i].equals(villeArrivee)) {
					indiceArrivee = i;
				}
			}
			
			if (indiceDepart == -1 || indiceArrivee == -1) {
				System.out.println("Ville introuvable !");
			} 
			else {
				distance = distances[indiceDepart][indiceArrivee];
				System.out.println("Distance entre " + villeDepart + " et " + villeArrivee + " : " + distance + "km");
				
				if (distance == 0) {
					distanceInverse = distances[indiceArrivee][indiceDepart];
					System.out.println("Distance entre " + villeDepart + " et " + villeArrivee + " : " + distanceInverse + "km");
				}
			}
			
			System.out.println("Voulez-vous calculer une autre distance ? (O/N)");
		} while (sc.nextLine().equalsIgnoreCase("O"));
		
		System.out.println("Fin du programme.");
		sc.close();
	}
}
