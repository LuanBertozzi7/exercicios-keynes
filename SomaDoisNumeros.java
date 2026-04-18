import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dois números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Soma: " + (a + b));
        sc.close();
    }
}
