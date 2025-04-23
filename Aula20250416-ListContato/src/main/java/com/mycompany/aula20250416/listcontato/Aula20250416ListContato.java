package com.mycompany.aula20250416.listcontato;

public class Aula20250416ListContato {

    public static void main(String[] args) {
         System.out.println("Agenda");
        
        AgendaTelefonica ag = new AgendaTelefonica();
        
        ag.inserir("Cassio", "12316514651");
        ag.inserir("Pedro", "23523524352");
        ag.inserir("Joao", "567567567567");
        ag.inserir("Maria", "0980980890");
        
        ag.imprimir();
    }
}
