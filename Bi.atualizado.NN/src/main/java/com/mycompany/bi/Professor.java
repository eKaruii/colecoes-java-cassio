/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab08
 */
public class Professor {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    
    public Professor(String nome){
        this.nome = nome; 
    }

    @Override
    public String toString() {
        return " Professor = " + nome;
    }
    
    
    public void inserir(Aluno aluno){
        if (!alunos.contains(aluno)){
            this.alunos.add(aluno);
            aluno.SetProf(this);
        }
    }
    
    public void imprimir(){
    if(this.alunos.isEmpty()){
        System.out.println("Nenhum aluno");
    }else{
        for(Aluno aux : this.alunos){
            System.out.println(aux.toString());
            }

        }
    }
           
}
