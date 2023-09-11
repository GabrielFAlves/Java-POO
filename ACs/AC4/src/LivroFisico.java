public class LivroFisico extends Livro{
    int reservado = 0;
    int emprestado = 0;

    public LivroFisico(String nome, String autor) {
        super(nome, autor);
        this.reservado = reservado;
        this.emprestado = emprestado;
    }

    public void reservar() {
        if(reservado==0) {
            reservado = 1;
            System.out.println("O livro foi reservado com sucesso!");
        } else {
            System.out.println("O livro está indisponivel!");
        }
    }

    public void cancelarReserva() {
        if(reservado!=0) {
            System.out.println("Reserva cancelada!");
        } else {
            System.out.println("Esse livro não foi reservado!");
        }
    }

    public void emprestar() {
        if(emprestado==0 && reservado==1) {
            System.out.println("O livro foi emprestado com sucesso!");
        } else if(emprestado==0 && reservado==0) {
            System.out.println("O livro precisa ser reservado antes!");
        } else if(emprestado==1 && reservado==1) {
            System.out.println("O livro ja foi emprestado!");
        }
    }

    public void devolver() {
        if(emprestado==1) {
            emprestado = 0;
            System.out.println("O livro foi devolvido com sucesso!");
        } else {
            System.out.println("O livro está disponivel!");  
        }
    }
}