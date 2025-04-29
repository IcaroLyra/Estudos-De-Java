package com.icaro.cursojava.aula36.Exercicio;

public class Agenda {
    private String nome;
    private Contato[] contatos;


    public Agenda(String nome, Contato[] contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String obterInfoAgenda() {
        String info = "Nome da Agenda: " + this.nome + "\n----\n";

        if (this.contatos != null) {
            for (Contato c : this.contatos) {
                if (c != null) {
                    info += c.obterInfo() + "----\n";
                }
            }
        } else {
            info += "Nenhum contato na agenda.\n";
        }
        return info;
    }
}