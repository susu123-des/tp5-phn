import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class connexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/magasin"; // Remplacez par votre URL de base de données
        String utilisateur = "root"; // Remplacez par votre nom d'utilisateur
        String motDePasse = ""; // Remplacez par votre mot de passe

        try {
            // Établir la connexion à la base de données
            Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("Connexion réussie !");

            // Créer les tables
            String createElectronicTable = "CREATE TABLE electronic (id INT PRIMARY KEY, name VARCHAR(255))";
            String createAlimentaireTable = "CREATE TABLE alimentaire (id INT PRIMARY KEY, name VARCHAR(255))";
            String createVestimentaireTable = "CREATE TABLE vestimentaire (id INT PRIMARY KEY, name VARCHAR(255))";
            String createMagasinTable = "CREATE TABLE magasin (id INT PRIMARY KEY, name VARCHAR(255))";
            String createProduitTable = "CREATE TABLE produit (id INT PRIMARY KEY, name VARCHAR(255))";

            connexion.createStatement().executeUpdate(createElectronicTable);
            connexion.createStatement().executeUpdate(createAlimentaireTable);
            connexion.createStatement().executeUpdate(createVestimentaireTable);
            connexion.createStatement().executeUpdate(createMagasinTable);
            connexion.createStatement().executeUpdate(createProduitTable);

            System.out.println("Tables créées avec succès !");

            // Insérer des valeurs aléatoires dans les tables
            Random random = new Random();
            for (int i = 1; i <= 10; i++) {
                String electronicName = "Electronic " + i;
                String alimentaireName = "Alimentaire " + i;
                String vestimentaireName = "Vestimentaire " + i;
                String magasinName = "Magasin " + i;
                String produitName = "Produit " + i;

                String insertElectronic = "INSERT INTO electronic (id, name) VALUES (?, ?)";
                String insertAlimentaire = "INSERT INTO alimentaire (id, name) VALUES (?, ?)";
                String insertVestimentaire = "INSERT INTO vestimentaire (id, name) VALUES (?, ?)";
                String insertMagasin = "INSERT INTO magasin (id, name) VALUES (?, ?)";
                String insertProduit = "INSERT INTO produit (id, name) VALUES (?, ?)";

                PreparedStatement preparedStatement = connexion.prepareStatement(insertElectronic);
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, electronicName);
                preparedStatement.executeUpdate();

                preparedStatement = connexion.prepareStatement(insertAlimentaire);
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, alimentaireName);
                preparedStatement.executeUpdate();

                preparedStatement = connexion.prepareStatement(insertVestimentaire);
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, vestimentaireName);
                preparedStatement.executeUpdate();

                preparedStatement = connexion.prepareStatement(insertMagasin);
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, magasinName);
                preparedStatement.executeUpdate();

                preparedStatement = connexion.prepareStatement(insertProduit);
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, produitName);
                preparedStatement.executeUpdate();
            }

            System.out.println("Valeurs insérées avec succès !");

            // Fermer la connexion
            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

