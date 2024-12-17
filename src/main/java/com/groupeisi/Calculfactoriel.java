package com.groupeisi;

public class Calculfactoriel {

        // Méthode statique pour calculer le factoriel d'un nombre
        public static long calculateFactorial(int number) {

            long result = 1; // Initialisation du résultat à 1

            for (int i = 1; i <= number; i++) { // Boucle de 1 à number inclus

                result *= i; // Multiplie result par i à chaque itération
            }
            return result; // Retourne le résultat final
        }
}

