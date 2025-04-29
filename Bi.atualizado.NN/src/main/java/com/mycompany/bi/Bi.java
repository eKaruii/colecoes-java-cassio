/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bi;

/**
 *
 * @author alunolab08
 */
public class Bi {

    public static void main(String[] args) {
        Professor p1 = new Professor("cassio");
        Aluno a1 = new Aluno("maria", p1);
        Aluno a2 = new Aluno("joao", p1);
        p1.inserir(a1);
        p1.inserir(a2);
        p1.imprimir();
        
        
    }
}
