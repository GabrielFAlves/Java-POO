import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String opc;
        double num1;
        double num2;

        System.out.println("Informe um Número: ");
        num1 = leitor.nextDouble();

        while (true) {
            System.out.println("Qual operação você quer realizar? ");
            System.out.println("Digie adi para Adição / sub para Subtração / mult para Multiplicação / div para divisão / sair / limpar");
            opc = leitor.next();

            if (opc.equals("sair")) {
                break;
            }

            switch (opc) {
                case "adi":
                    System.out.println("Adição");
                    System.out.println("Informe o segndo número: ");
                    num2 = leitor.nextDouble();
                    System.out.println(soma(num1, num2));
                    num1 = soma(num1, num2);
                    break;

                case "sub":
                    System.out.println("Subtração");
                    System.out.println("Informe o segndo número: ");
                    num2 = leitor.nextDouble();
                    System.out.println(subtra(num1, num2));
                    num1 = subtra(num1, num2);
                    break;

                case "mult":
                    System.out.println("Multiplicação");
                    System.out.println("Informe o segndo número: ");
                    num2 = leitor.nextDouble();
                    System.out.println(multi(num1, num2));
                    num1 = multi(num1, num2);
                    break;

                case "div":
                    System.out.println("Divisão");
                    System.out.println("Informe o segndo número: ");
                    num2 = leitor.nextDouble();
                    System.out.println(divis(num1, num2));
                    num1 = divis(num1, num2);
                    break;

                case "limpar":
                    System.out.println("Informe um Número: ");
                    num1 = 0;
                    num1 = leitor.nextDouble();
                    break;
                
                default:
                    System.out.println("Opção não existe!");
            }
        }
        leitor.close();
    };

    public static double soma(double num1, double num2){
        return num1 + num2;
    }

    public static double subtra(double num1, double num2){
        return num1 - num2;
    }

    public static double multi(double num1, double num2){
        return num1 * num2;
    }

    public static double divis(double num1, double num2){
        return num1 / num2;
    }
}
