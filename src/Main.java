import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produits p1 = new Produits();
        p1.dateExpiration = new Date(2025,02,26);
        Produits p2 = new Produits(1020, "lait" ,700);
        p2.dateExpiration = new Date(2025,05,25);
        Produits p3 = new Produits();
        p3.dateExpiration = new Date(2026,04,20);
        p3.setIdProduits(2510);
        p3.setNom("yaourt");
        p3.setPrix(2500);
        Produits p4 = new Produits();
        p4.dateExpiration = new Date(2026,03,26);
        p4.setIdProduits(3250);
        p4.setNom("tomate");
        p4.setPrix(0);

         System.out.println(p3);
         p1.afficerProduits();
         p2.afficerProduits();
         p4.afficerProduits();
         p1.setIdProduits(6070);
         p1.setNom("pomme");
         p1.setPrix(500);
         p1.afficerProduits();
        System.out.println(p1);
        p4.setPrix(700);
        System.out.println(p4);





    }
}