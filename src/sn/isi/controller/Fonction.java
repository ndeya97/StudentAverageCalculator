package sn.isi.controller;

import java.util.Scanner;

public class Fonction {
	
    // Méthode pour saisir les informations de l'étudiant
	public String[] saisirEtudiant(Scanner scanner){		
		//Saisie du nom
		System.out.print("Nom de l'étudiant : ");
		String nom = scanner.nextLine();
		//Saisie du prenom
		System.out.print("Prenom de l'étudiant : ");
		String prenom = scanner.nextLine();
		//Saisie de la date de naissance
		System.out.print("Date de naissance (jj/mm/aaaa) : ");
		String dateDeNaissance = scanner.nextLine();	
		
		// Stocker les informations dans un tableau de String
        return new String[] { nom, prenom, dateDeNaissance };
	}

}
