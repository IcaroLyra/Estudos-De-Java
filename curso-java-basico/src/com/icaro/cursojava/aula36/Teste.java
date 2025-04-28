package com.icaro.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {

        Endereco end = new Endereco();
        Contato contato = new Contato();
        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();
        contato.setNome("Tyrion");


        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("9999999");

        contato.setEndereco(end);

        telefone.setTipo("celular");
        telefone.setDdd("11");
        telefone.setNumero("999999-999999");

        telefone2.setTipo("casa");
        telefone2.setDdd("11");
        telefone2.setNumero("888888-888888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefones());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }




    }
}
