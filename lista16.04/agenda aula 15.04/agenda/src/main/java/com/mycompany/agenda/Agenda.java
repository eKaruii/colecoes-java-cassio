/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenda;

/**
 *
 * @author alunolab08
 */
public class Agenda {

    public static void main(String[] args) {
        
        
    AgendaTel agenda = new AgendaTel();

    
    agenda.inserir("Alice", "1234-5678");
    agenda.inserir("Bruno", "2345-6789");
    agenda.inserir("Carlos", "3456-7890");
    agenda.inserir("Diana", "4567-8901");
    agenda.inserir("Eduardo", "5678-9012");

  
    
    System.out.println("Número de Alice: " + agenda.buscarNumero("Alice"));
    System.out.println("Número de Bruno: " + agenda.buscarNumero("Bruno"));

    System.out.println("Tamanho da agenda: " + agenda.tamanho());
    agenda.remover("Carlos");
    System.out.println("Tamanho da agenda após remover Carlos: " + agenda.tamanho());

    System.out.println("Lista de contatos:");
    agenda.imprimir();
}
}
