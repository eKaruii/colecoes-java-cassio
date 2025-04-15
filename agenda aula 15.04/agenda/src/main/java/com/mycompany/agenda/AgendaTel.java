/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;
import java.util.HashMap;
import java.util.Map;

public class AgendaTel {
    private Map<String, Contato> contatos;

    public AgendaTel() 
    {
        this.contatos = new HashMap<>();
    }

    public void inserir(String nome, String numero) {
        // valida se a chave primaria não se repete
        Contato contato = new Contato(nome, numero);
        contatos.put(nome, contato);
    }

    public String buscarNumero(String nome) {
        Contato contato = contatos.get(nome);
        if (contato != null) {
            return contato.getNumero();
        }
        return null;
    }

    public void remover(String nome) {
        if (contatos.remove(nome) != null ){
            System.out.println("contato removido");
        }
        else{
            System.out.println("contato não encontrado");
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
                for (Contato contato : contatos.values()) {
                    System.out.println("Nome: " + contato.getNome() + ", Número: " + contato.getNumero());
                }
        }
            
    }



}