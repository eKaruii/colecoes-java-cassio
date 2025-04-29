/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bi;

/**
 *
 * @author alunolab08
 */
public class Aluno {
    private String nome;
    private Professor prof = null;
    
    public Aluno(String nome, Professor prof){
        this.nome = nome;
        this.prof = prof;
    }
    
    public void SetProf (Professor prof){
        if(this.prof != prof){
            this.prof = prof;
        }
    } 
    
    @Override
    public String toString(){
        return "Aluno = " + nome + prof;
    }
    
    
}
