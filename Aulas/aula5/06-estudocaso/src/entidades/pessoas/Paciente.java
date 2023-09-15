package entidades.pessoas;

import java.time.LocalDate;

import entidades.Endereco;
import entidades.PlanoDeSaude;

public class Paciente extends Pessoa {
    private PlanoDeSaude plano;

    public Paciente(String nome, String cpf, Endereco endereco, LocalDate dataNascimento) {
        super(nome, cpf, endereco, dataNascimento);
        this.plano = new PlanoDeSaude();
    }

    @Override
    public String toString() {
        return "Paciente" + super.toString() + "\n" + "Plano de Saude: " + this.plano;
    }
}

