package com.example.coffeShop.testingConnection;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class testConnection {
    //spring.datasource.url=jdbc:sqlserver://;serverName=uat.ifca.co.id;port=1436;databaseName=test;
    //jdbc:sqlserver://;servername=server_name;encrypt=true;integratedSecurity=true;authenticationScheme=JavaKerberos
    //"jdbc:sqlserver://<server>:<port>;encrypt=true;databaseName=AdventureWorks;user=<user>;password=<password>";
    //    static final String dburl = "jdbc:sqlserver://;serverName=uat.ifca.co.id;port=1436;databaseName=test";
    static final String dburl = "jdbc:sqlserver://;serverName=uat.ifca.co.id;port=1436;databaseName=test;trustServerCertificate=true;";
    static final String USER = "mgr";
    static final String PASS = "mgr";
    static final String query = "SELECT * FROM mgr.mahasiswa";

    public static void main(String[] args)  {
        // Open a connection
        try {

            Connection connection = DriverManager.getConnection(dburl,USER,PASS);
            Statement statement = connection.createStatement();
            ResultSet ResultSet = statement.executeQuery(query);

            while (ResultSet.next()) {
                // Retrieve by column name
                System.out.println("nama" + ResultSet.getString("nama") );

            }

        } catch (SQLException exception) {
            //  throw new RuntimeException(e);
            exception.printStackTrace();
        }
    }
}
