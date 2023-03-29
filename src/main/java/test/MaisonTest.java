package test;

import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Cuisine;
import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Piece;
import fr.diginamic.immobilier.entites.Salon;

public class MaisonTest {

    public static void main(String[] args) {

        Maison maison = new Maison();

        // Ajout de plusieurs pièces à la maison
        Piece chambre1 = new Chambre(1, 15.0, 1);
        maison.ajouterPiece(chambre1);

        Piece chambre2 = new Chambre(2, 12.0, 2);
        maison.ajouterPiece(chambre2);

        Piece salon = new Salon(1, 20.0, true);
        maison.ajouterPiece(salon);

        Piece cuisine = new Cuisine(1, 10.0, 4);
        maison.ajouterPiece(cuisine);

        // Affichage du nombre de pièces de la maison
        System.out.println("Nombre de pièces : " + maison.nbPieces());

        // Affichage de la superficie totale de la maison
        System.out.println("Superficie totale : " + maison.calculerSurface() + " m2");

        // Affichage de la superficie du 1er étage
        System.out.println("Superficie de l'étage 1 : " + maison.superficieEtage(1) + " m2");

        // Affichage de la superficie totale des chambres
        System.out.println("Superficie totale des chambres : " + maison.superficieTypePiece(Piece.TYPE_CHAMBRE) + " m2");

        // Affichage de la superficie totale des salons
        System.out.println("Superficie totale des salons : " + maison.superficieTypePiece(Piece.TYPE_SALON) + " m2");

        // Affichage de la superficie totale des cuisines
        System.out.println("Superficie totale des cuisines : " + maison.superficieTypePiece(Piece.TYPE_CUISINE) + " m2");

        // Affichage de la superficie totale des salles de bains
        System.out.println("Superficie totale des salles de bains : " + maison.superficieTypePiece(Piece.TYPE_SDB) + " m2");

        // Affichage de la superficie totale des WC
        System.out.println("Superficie totale des WC : " + maison.superficieTypePiece(Piece.TYPE_WC) + " m2");
    }

}
