/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.app;

import br.com.escola.model.Aluno;
import br.com.escola.dao.AlunoDAO;

import java.util.Scanner;


/**
 *
 * @author LUIZVINICIUSCASSABON
 */

// Responsabiulidade:  usar o DAO e receber dados do usuário
public class Main {
    public static void main(String[]args){
    //  Scanner = entrada de dados (Nosso prompt por java)
    Scanner entrada = new Scanner(System.in);
    
    // DAO = quem conversa com o banco
    AlunoDAO dao = new AlunoDAO();
    
    System.out.println("Quantos alunos deseja cadastrar? ");
    int quantidade = entrada.nextInt();
    entrada.nextLine();
    
    // Loop para cadastrar alunos
    for(int i = 1; i <= quantidade; i++){
        System.out.println("Digite o nome do aluno"+ i + ": ");
        String nome = entrada.nextLine();
        // Cria o alunon (Model)
        Aluno aluno = new Aluno(nome);
        
        // Envia para o DAO salvar no banco
        dao.cadastrar(aluno);
      }
    
    // Litsa os alunos cadastrados
    System.out.println("\n=== Alunos Cadastrados ===");
    dao.listar().forEach(aluno -> {
        System.out.println(aluno.getId()+ " - "+ aluno.getNome());
    });
    entrada.close();
    
    }
}
