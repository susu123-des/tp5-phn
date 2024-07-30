class Alimentaire extends Produit {
    // Attributs spécifiques aux produits alimentaires
    // ...

    public Alimentaire(int id, String nom, double prix) {
        super(id, nom, prix);
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public void setNom(String nouveauNom) {
        super.setNom(nouveauNom);
    }

    @Override
    public void setPrix(double nouveauPrix) {
        super.setPrix(nouveauPrix);
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}