import java.util.Date;

public class Produits {
    private int idProduits;
    private String nom;
    private double prix;
    Date dateExpiration ;

    //getters

    public int getIdProduits() {
        return idProduits;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }
     //setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setIdProduits(int idProduits) {
        this.idProduits = idProduits;
    }

    public void setPrix(double prix) {
        if (prix<0){
            System.out.println("ERREURE : vous ne pouvez pas entrez de prix negatif.");
        }else {
            this.prix = prix;
        }
    }
    public Produits(){

    }
    public Produits(int idProduits, String nom, double prix){
        this.idProduits=idProduits;
        this.nom=nom;
        this.prix=prix;
    }

    @Override
    public String toString() {
        return "Produits{" +
                "id = " + idProduits +
                ", nom = '" + nom + '\'' +
                ", prix = " + prix +" fcfa "
        +", date d'Expiration = " + dateExpiration.toString() +
                '}';
    }

    public void afficerProduits(){
        System.out.println("{ id :"+this.idProduits +"; nom : "+this.nom + "; prix : "+this.prix +" fcfa "+"date d'expiration = " +dateExpiration+"}");

    }

}
