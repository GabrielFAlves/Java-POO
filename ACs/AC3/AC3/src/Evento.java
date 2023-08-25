public class Evento {
    String nome, data, local;
    int numMaximo;

    Evento(String nome, String data, String local, int numMaximo) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.numMaximo = numMaximo;
    }
    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }
}
