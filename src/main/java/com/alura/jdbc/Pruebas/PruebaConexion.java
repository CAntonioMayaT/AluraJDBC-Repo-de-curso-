package com.alura.jdbc.Pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.alura.jdbc.Factory.ConnectionFactory;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().recuperaConexion();

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
