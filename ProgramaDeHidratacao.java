import java.util.Scanner;

public class CalculodeMassa {

    public static void main(String[] args) {
        System.out.println("Aplicativo para ajudar a se hidratarem melhor");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        System.out.println("Digite seu peso atual em KG:");
        double peso = scanner.nextDouble();
        System.out.println("Digite a quantidade de água já ingerida no dia, em litros:");
        double agua = scanner.nextDouble();

        double quantidadeIdeal = Math.ceil((peso * 35) / 1000.0);

        double quantidadeIngerir;
        quantidadeIngerir = quantidadeIdeal - agua;

        System.out.println("Nome do funcionário é: " + nome);
        System.out.println("Peso do funcionário é: " + peso);
        System.out.println("Total de água ingeridade: " + agua + "ml");
        System.out.println("A quantidade ideal de água a ingerir é: " + quantidadeIdeal + "l");
        if (quantidadeIngerir <= 0) {
            System.out.println("Parabéns voc~e atingiu a média de hidratação diária");
        } else {
            System.out.println(
                    "Continue focado em se hidratar por hoje,ainda faltam: " + quantidadeIngerir + "l,Você consegue");
        }
        scanner.close();
    }
}