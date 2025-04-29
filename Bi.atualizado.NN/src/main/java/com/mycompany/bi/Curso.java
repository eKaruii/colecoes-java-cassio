/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab11
 */
public class Curso {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    
    public Curso(String nome){
        this.nome = nome;
    }
    
    public void inserirAluno(Aluno aluno){
        if (!alunos.contains(aluno)){
            this.alunos.add(aluno);
            aluno.inserirCurso(this);
        }
        
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + '}';
    }
       
    
    
    
    
}
