package entidades.pessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Endereco;

public class Pessoa {
    private String nome, cpf;
    private Endereco endereco;
    private LocalDate dataNascimento;
    
    // ctrl + shift + p: constructor
    public Pessoa(String nome, String cpf, Endereco endereco, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        return this.dataNascimento.format(formato);
    }

    // ctrl + shift + p: tostring
    @Override
    public String toString() {
        return "{" +
            " nome='" + this.nome + "'" +
            ", cpf='" + this.cpf + "'" +
            ", endereco='" + this.endereco + "'" +
            ", dataNascimento='" + this.dataNascimento + "'" +
            "}";
    }

}
