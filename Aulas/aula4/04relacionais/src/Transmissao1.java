public class Transmissao1 implements ITransmiteDados {
    @Override
    public void enviaJson() {
        System.out.println("Enviando Json");
    }

    @Override
    public String recebeMensagem(String protocolo) {
        return "RRecebida mensagemusando protocolo " + protocolo;
    }
}
