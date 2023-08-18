import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner leitor = new Scanner(System.in);
        String msg;
        double num1;
        int num2;

        System.out.println("Informe um texto:");
        msg = leitor.next(); // lê input de texto
        System.out.println(msg);

        System.out.println("Informe um double:");
        num1 = leitor.nextDouble();

        System.out.println("Iforme um int:");
        num2 = leitor.nextInt();
        System.out.println(num1 + " " + num2);

        leitor.close();
    }
}
