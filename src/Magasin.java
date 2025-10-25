import java.util.Arrays;

public class Magasin {

    int identifiant;
    String adresse;
    int capasiter;
    Produits[] produits;
    int nbProduit;
    public Magasin(){

    }

    public Magasin(int identifiant,String adresse,int capasiter) {
        System.out.println("=== infos sur le magasin===");
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capasiter = 10;
        this.produits = new Produits[capasiter];
        this.nbProduit=0;
    }


    @Override
    public String toString() {
        return "Magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", capasiter=" + capasiter +
                ", produits=" + Arrays.toString(produits) +
                ", nbProduit=" + nbProduit +
                '}';
    }

    public void afficherMagasin() {
        System.out.println("{ identifiant du magasin : " + identifiant);
        System.out.println(" adresse :  " + adresse);
        System.out.println(" ensemble de produits : " +nbProduit);
        for (int i=0;i<nbProduit;i++){
            System.out.println("produit "+(i+1) +" { "+produits[i]);
        }

    }

    public void ajouterProduit(Produits produit) {
        if (nbProduit<capasiter ) {
            this.produits[nbProduit]= produit;
            System.out.println("ALERTE! : produit ajouter au magasin avec succes !");
            nbProduit++;

        } else {
            System.out.println("ERREURE! : vous ne pouver plu ajouter de produits !");


        }
    }

}


