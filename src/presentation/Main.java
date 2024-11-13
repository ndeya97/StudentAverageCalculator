package presentation;

import java.util.Scanner;

import sn.isi.controller.Fonction;

public class Main {

	public static void main(String[] args) {
			
		//Message de présentation
		System.out.println("**********************************");
		System.out.println("*********** Bienvenenue  *********");
		System.out.println("*Dans Student Average Calculator**");
		System.out.println("**********************************");
		
		//Creation d'une instance de la classe Fonction
		Fonction Fonction = new Fonction();
		
		// Création d'un Scanner partagé
	    Scanner scanner = new Scanner(System.in);
	    
        String continuer;
        
        do {
            // Saisie des informations de l'étudiant
            Fonction.saisirEtudiant(scanner);
            
	        // Demander à l'utilisateur s'il souhaite continuer
	        System.out.print("Voulez-vous saisir un autre étudiant ? (oui/non) : ");
	        continuer = scanner.nextLine();
           
        } while (continuer.equalsIgnoreCase("oui"));

	    // Fermeture du scanner
        scanner.close();
        System.out.println("Fin du programme.");
	}
	

}
