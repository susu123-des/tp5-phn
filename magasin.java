public class magasin {

        private int id;
        private String nom;
        private double prix;

        public magasin(int id, String nom, double prix) {
            this.id = id;
            this.nom = nom;
            this.prix = prix;
        }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

}
