package com.icaro.cursojava.aula36.Exercicio;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nomeAgenda = scan.nextLine();

        Agenda agenda = new Agenda(nomeAgenda);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++){

            System.out.println("\nEntre com as informações do contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            String nomeContato = scan.nextLine();
            c.setNome(nomeContato);

            System.out.println("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);


            System.out.println("Entre com o email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;

        }
        agenda.setContatos(contatos);


        if (agenda != null) {
            System.out.println("\n--- Informações da Agenda ---");
            System.out.println(agenda.obterInfoAgenda());
        }

        scan.close();
    }
}