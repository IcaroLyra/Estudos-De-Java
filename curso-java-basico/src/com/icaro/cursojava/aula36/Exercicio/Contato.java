package com.icaro.cursojava.aula36.Exercicio;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    // Getters e Setters (como já existem) ...

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String obterInfo(){

        return "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email: " + email + "\n";
    }
}