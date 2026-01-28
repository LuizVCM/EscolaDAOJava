package br.com.escola.config;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LUIZVINICIUSCASSABON
 */
public class ConnectionFactory {
    // endereço de conexão do banco
    private static final String URL = "jdbc:mysql://localhost:3306/escoladao";
   // Usuário do MySQL
    private static final String USER = "root";
    // Senha do MySql
    private static final String PASSWORD = "root";
    // Método que devolver uma conexão pronta
    public static Connection getConnection() throws SQLException{
    // Abre a conexão e retorna para quem chamou
    return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
