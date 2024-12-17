package com.groupeisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre pour calculer son factoriel : ");
        int number = scanner.nextInt();

        // Appel de la méthode calculateFactorial depuis la classe Calculfactorial
        long factorial = Calculfactoriel.calculateFactorial(number);

        // Affichage du résultat
        System.out.println("Le factoriel de " + number + " est : " + factorial);

        // Fermeture du scanner
        scanner.close();
    }
}
