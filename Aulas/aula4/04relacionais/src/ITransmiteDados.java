public interface ITransmiteDados {
    
    // Métodos em interface são abstratos por padrão
    void enviaJson();
    String recebeMensagem(String protocolo);
}