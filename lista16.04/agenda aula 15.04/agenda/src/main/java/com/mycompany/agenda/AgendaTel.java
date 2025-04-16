/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaTel {
    private List<Contato> contatos;

    public AgendaTel() 
    {
        this.contatos = new ArrayList<>();
    }

    public void inserir(String nome, String numero) {
        // valida se a chave primaria não se repete
        Contato contato = new Contato(nome, numero);
        contatos.add(contato);
    }

    public Contato buscarNumero(String nome) {
        for(Contato aux : this.contatos){
            if(aux.getNome().equalsIgnoreCase(nome)){
                return aux;
            }
        }
        return null;

    }

    public void remover(String nome) {
        Contato apagar = null;
        for(Contato aux : this.contatos){
            if (aux.getNome().equalsIgnoreCase(nome)){
                apagar = aux;
            }
        }
        // pode se usar: Contato apagar = buscarNumero(nome);
        if(apagar != null){
            this.contatos.remove(apagar);
            System.out.println("deletado");
        }
        else{
            System.out.println("nao encontrado");
        }
    }

    public int tamanho() {
        return contatos.size();
    }
    
    public void imprimir() {
        if (contatos.isEmpty()){
            System.out.println("vazio");
        }
        else{
                for (Contato aux : this.contatos) {
                    System.out.println("Nome: " + aux.getNome() + ", Número: " + aux.getNumero());
                }
        }
            
    }



}