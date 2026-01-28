/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.model;

/**
 *
 * @author LUIZVINICIUSCASSABON
 */





// REesponsabilidade: representas os dados da tabela alunos
public class Aluno {
    //colunas da tebala
    private int id;
    private String nome;
    
    // Construtor vazio (útil em, vários casos)
  public Aluno(){
  
  }  
  // Construtor para criar um aluno novo (sem id ainda)
  public Aluno(String nome){
  this.nome = nome;
  }
  // Construtor para quando vem do banco (Já tem o id)
  public Aluno(int id, String nome){
  this.id = id;
  this.nome = nome;
  }
  
  //getter e Setter do id
  public int getId(){
  return id;
  }
  public void setId(int id){
  this.id = id;
  }
  // Getter e Setter do nome
  public String getNome(){
  return nome;
  }
  public void setNome(String nome){
  this.nome = nome;
  }
}
