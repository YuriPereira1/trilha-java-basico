import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {

        String nomeDoCliente;
        String agencia;
        int numero;
        double saldo;

        Scanner inputDoUsuario = new Scanner(System.in);
        System.out.println("Por favor, digite o nome do Cliente!");
        nomeDoCliente = inputDoUsuario.nextLine();

        System.out.println("Por favor, digite o Numero!");
        numero = inputDoUsuario.nextInt();

        System.out.println("Por favor, digite a Agência!");
        agencia = inputDoUsuario.next();

        System.out.println("Por favor, digite o Saldo!");
        saldo = inputDoUsuario.nextDouble();

        System.out.println("Olá " +nomeDoCliente+
                ", obrigado por criar uma conta em nosso banco, sua Agência é " +agencia+
                ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque.");
    }
}
