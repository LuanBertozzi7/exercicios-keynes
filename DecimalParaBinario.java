import java.util.Scanner;

public class DecimalParaBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal: ");
        int n = sc.nextInt();
        if (n == 0) { System.out.println("0"); sc.close(); return; }
        String bin = "";
        while (n > 0) { bin = (n % 2) + bin; n /= 2; }
        System.out.println("Binário: " + bin);
        sc.close();
    }
}
