import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "!");
        sc.close();
    }
}
