class Electronic extends Produit {


    public Electronic(int id, String nom, double prix) {
        super(id, nom, prix);
    }

    @Override
    public String getNom() {
        return super.getNom();
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
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setPrix(double nouveauPrix) {
        super.setPrix(nouveauPrix);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}