package com.groupeisi;

public class Calculfactoriel {

    public static long calculateFactorial(int number) {

        // Vérifie si le nombre est négatif, ce qui est invalide pour le calcul du factoriel
        if (number < 0) {
            // Lève une exception pour signaler que le paramètre est incorrect
            throw new IllegalArgumentException("Le nombre ne peut pas être négatif");
        }

        // Initialisation du résultat à 1 (valeur neutre pour la multiplication)
        long result = 1;

        // Boucle pour calculer le factoriel.
        // On multiplie successivement les nombres de 1 jusqu'à "number".
        for (int i = 1; i <= number; i++) {
            result *= i; // Multiplie le résultat courant par i
        }

        // Retourne le résultat final, qui est le factoriel de "number"
        return result;
    }

}

