import java.util.Scanner;

public class ValidarCPF {

    static boolean validar(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
        if (cpf.length() != 11) return false;
        // rejeita sequências iguais (ex: 111.111.111-11)
        if (cpf.chars().distinct().count() == 1) return false;

        int soma = 0;
        for (int i = 0; i < 9; i++) soma += (cpf.charAt(i) - '0') * (10 - i);
        int d1 = (soma * 10) % 11;
        if (d1 == 10) d1 = 0;
        if (d1 != cpf.charAt(9) - '0') return false;

        soma = 0;
        for (int i = 0; i < 10; i++) soma += (cpf.charAt(i) - '0') * (11 - i);
        int d2 = (soma * 10) % 11;
        if (d2 == 10) d2 = 0;
        return d2 == cpf.charAt(10) - '0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.println(validar(cpf) ? "CPF válido" : "CPF inválido");
        sc.close();
    }
}
