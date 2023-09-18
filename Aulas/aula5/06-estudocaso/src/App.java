import java.time.LocalDate;

import entidades.Endereco;
import entidades.pessoas.Medico;
import entidades.pessoas.Paciente;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente pc = new Paciente("João", "123", new Endereco(), LocalDate.of(2000, 8, 10));
        Medico med = new Medico("Ana", "456", new Endereco(), LocalDate.of(1980, 5, 11));

        System.out.println(pac);
        System.out.println(med);
    }
}
