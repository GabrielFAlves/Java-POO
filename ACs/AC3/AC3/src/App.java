import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Evento evento1;

        java.util.Scanner leitor = new Scanner(System.in);
        String appNome, appData, appLocal;
        int appNumMaximo;

        System.out.println("Digite o nome do evento: ");
        appNome = leitor.next();
        System.out.println("Digite a data do evento: ");
        appData = leitor.next();
        System.out.println("Digite o local do evento");
        appLocal = leitor.next();
        System.out.println("Digite o número maximo de pessoas: ");
        appNumMaximo = leitor.nextInt();

        evento1 = new Evento();

    }
}
