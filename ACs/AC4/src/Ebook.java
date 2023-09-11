public class Ebook extends Livro {
    String formato;
    int reservado = 0;

    public Ebook(String nome, String autor, String formato) {
        super(nome, autor);
        this.formato = formato;
    }

    public void reservar() {
        if(reservado==0) {
            reservado = 1;
            System.out.println("O ebook foi reservado com sucesso!");
        } else {
            System.out.println("O ebook está indisponivel!");
        }
    }

    public void cancelarReserva() {
        if(reservado!=0) {
            System.out.println("Reserva cancelada!");
        } else {
            System.out.println("Esse livro não foi reservado!");
        }
    }
}