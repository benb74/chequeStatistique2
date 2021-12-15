package fr.benoit;

import java.util.Scanner;

public class chequeStatistique {

    public static void main(String[] args) {
        // Variables
        int numCheque = 0;
        double montantCheque = 0;

        int nbTotalCheques = 0;
        double montantTotal = 0;
        double moyenneMontant = 0;

        int nbChequesMoins200 = 0;
        double montantChequesMoins200 = 0;

        int nbChequesPlus200 = 0;
        double montantChequesPlus200 = 0;

        int numChequeMin = 0;
        double montantChequeMin = 0;

        int numChequeMax = 0;
        double montantChequeMax = 0;

        Scanner sc = new Scanner(System.in);

        // Message d'accueil
        System.out.println("********************************************");
        System.out.println("**********    TP STATS CHEQUES    **********");
        System.out.println("********************************************");

        // Demande de numéro du prochain chèque
        System.out.println("Quel le numéro du chèque ? (0 pour sortir)");
        numCheque = sc.nextInt();

        // Le système boucle tant que le numéro du chèque est différent de 0
        while (numCheque != 0) {
            // On récupère le montant du chèque
            System.out.println("Quel est le montant du chèque ?");
            montantCheque = sc.nextDouble();

            // On incrémente le compteur de chèques
            nbTotalCheques++;

            // On ajoute le montant du chèque au montant total
            montantTotal += montantCheque;

            // On calcule la moyenne des montants
            moyenneMontant = montantTotal / nbTotalCheques;

            // On vérifie si le chèque vaut moins de 200 euros
            if (montantCheque < 200) {
                nbChequesMoins200++;
                montantChequesMoins200 += montantCheque;
            }

            // On vérifie si le chèque vaut plus de 200 euros
            if (montantCheque >= 200) {
                nbChequesPlus200++;
                montantChequesPlus200 += montantCheque;
            }

            // Chèque MIN
            if (montantChequeMin == 0 || montantCheque < montantChequeMin) {
                numChequeMin = numCheque;
                montantChequeMin = montantCheque;
            }

            // Chèque MAX
            if (montantChequeMax == 0 || montantCheque > montantChequeMax) {
                numChequeMax = numCheque;
                montantChequeMax = montantCheque;
            }

            // Demande de numéro du prochain chèque
            System.out.println("Quel le numéro du chèque ? (0 pour sortir)");
            numCheque = sc.nextInt();

        }

        // Affichage
        System.out.println();
        System.out
                .println("************************************************************");
        System.out
                .println("******************  Statistiques chèques  ******************");
        System.out
                .println("************************************************************");
        System.out.println();

        // Affichage complet seulement si au moins 1 chèque présent
        if (nbTotalCheques > 0) {
            System.out.println("Nombre total de chèque(s)              : "
                    + nbTotalCheques);
            System.out.println("Montant total des chèques              : "
                    + montantTotal);
            System.out.println("Moyenne des montants                   : "
                    + moyenneMontant);
            System.out.println("Chèque(s) de moins de 200e             : "
                    + nbChequesMoins200);
            System.out.println("Montant total chèques de moins de 200e : "
                    + montantChequesMoins200);
            System.out.println("Chèque(s) de plus de 200e              : "
                    + nbChequesPlus200);
            System.out.println("Montant total chèques de plus de 200e  : "
                    + montantChequesPlus200);
            System.out.println("Numéro du plus petit chèque            : "
                    + numChequeMin);
            System.out.println("Montant du plus petit chèque           : "
                    + montantChequeMin);
            System.out.println("Numéro du plus grand chèque            : "
                    + numChequeMax);
            System.out.println("Montant du plus grand chèque           : "
                    + montantChequeMax);
        } else {
            System.out.println("AUCUN CHEQUE ENREGISTRE");
        }

        // Fermeture du Scanner
        sc.close();

    }
}
