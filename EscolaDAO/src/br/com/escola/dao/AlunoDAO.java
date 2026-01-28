/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.dao;

import br.com.escola.config.ConnectionFactory;
import br.com.escola.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author LUIZVINICIUSCASSABON
 */

// Responsabilidade: SQL + CRUD

public class AlunoDAO {
    //CREATE: inserir o aluno no banco
    public void cadastrar(Aluno aluno){
    // SQL com ? (parâmetro) para evitar SQL injection
    String sql = "INSERT INTO alunos (nome) VALUES (?)";
    // tratamento de possíveis erros | no caso fecha automaticamehnte a conexão e o Statement 
    try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
        // Troca o ? pelo nome do aluno
        stmt.setString(1, aluno.getNome());
        // Executa o INSERT (podemos utilizar op executeUpdate para INSERT/UPDATE/DELETE)
        stmt.executeUpdate();
        
    }catch(Exception e){
        // se der erro, mostramos uma mensagem clara
        throw new RuntimeException ("Erro ao cadastrar aluno", e);
    
    }
    }
    // READ: listar todos
    public List<Aluno> listar(){
    // SQL para buscar todos
    String sql = "SELECT id, nome FROM alunos";
    
    // Lista que vamos devolver preenchida
    List<Aluno> alunos = new ArrayList<>();
    try(Connection conn= ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()){
    // Enquanto tiver linha no resultado
    while(rs.next()){
    // Pega os dados da linha atual
    int id = rs.getInt("id");
    String nome =rs.getString("nome");
    
    // Monta um objeto Aluno com os dados
    Aluno aluno = new Aluno(id, nome);
    
    // Adiciona na lista
    alunos.add(aluno);
    }
    } catch (Exception e){
    throw new RuntimeException("Erro ao listar alunos", e);
    
    }
    // Devolve a lista pronta
    return alunos;             
    }

    
}
