import java.util.*;

class collection {
    private Map<Integer, Produit> produits;

    public collection() {
        produits = new HashMap<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.put(produit.getId(), produit);
    }

    public void supprimerProduit(int id) {
        produits.remove(id);
    }

    public Produit rechercherProduitParNom(String nom) {

       return null;
    }

    public int getNombreProduitsEnStock() {
        return produits.size();
    }

    public Produit saisirproduit() {
        return null;
    }

    public void modifierProduit(int idModification, String nouveauNom, double nouveauPrix) {
    }


    class CollectionProduits {
    private Map<Integer, Produit> produits;
    private int dernierId;

    public CollectionProduits() {
        produits = new HashMap<>();
        dernierId = 0;
    }

    public void ajouterProduit(Produit produit) {
        dernierId++;
        produit.setId(dernierId);
        produits.put(produit.getId(), produit);
    }


    public void supprimerProduit(int id) {
        produits.remove(id);
    }

    public void modifierProduit(int id, String nouveauNom, double nouveauPrix) {
        if (produits.containsKey(id)) {
            Produit produit = produits.get(id);
            produit.setNom(nouveauNom);
            produit.setPrix(nouveauPrix);
        } else {
            System.out.println("Produit introuvable.");
        }
    }

    public Produit rechercherProduitParNom(String nom) {
        for (Produit produit : produits.values()) {
            if (produit.getNom().equalsIgnoreCase(nom)) {
                return produit;
            }
        }
        return null;
    }

    public List<Produit> listerProduitsParLettre(char lettre) {
        List<Produit> produiLettre = new ArrayList<>();
        for (Produit produit : produits.values()) {
            if (produit.getNom().toLowerCase().charAt(0) == lettre) {
                produiLettre.add(produit);
            }
        }
        return produiLettre;
    }

    public int getNombreProduitsEnStock() {
        return produits.size();
    }

    public Produit saisirProduit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du produit : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prix du produit : ");
        double prix = scanner.nextDouble();

        return new Produit(0, nom, prix);
    }
}
}