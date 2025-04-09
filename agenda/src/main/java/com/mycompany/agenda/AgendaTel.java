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
        contatos.remove(nome);
    }

    public int tamanho() {
        return contatos.size();
    }
    
    public void imprimir() {
    for (Contato contato : contatos.values()) {
        System.out.println("Nome: " + contato.getNome() + ", Número: " + contato.getNumero());
    }
    }

}