class Produit {
    private int id;
    private String nom;
    private double prix;

    public Produit(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrix(double nouveauPrix) {
    }

    public void setNom(String nouveauNom) {
    }

    public String getNom() {
        return null;
    }

    public void add(Produit produit) {
    }
}