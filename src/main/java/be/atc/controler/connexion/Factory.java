package be.atc.controler.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe qui permet de faire la connexion a la DB
 */

public class Factory {
    private String url;
    private String username;
    private String password;

    Factory( String url, String username, String password ) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    /**
     * Méthode qui charge le driver JDBC
     * se connecte a la base de données
     *
     * @return
     */
    public static Factory getInstance() {
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }
        Factory instance = new Factory(
                "jdbc:mysql://localhost:3306/stockmanagement", "Administrateur", "Admin"
        );
        return instance;
    }

    /**
     * Méthode qui permet a tout moment de recupere la connexion a la base de données
     * quand on l'utilisera dans l'implementation
     *
     * @return
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection( url, username, password );
        connection.setAutoCommit( false );
        return connection;

    }
}
