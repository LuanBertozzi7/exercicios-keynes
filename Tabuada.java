import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tabuada de: ");
        int t = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(t + " x " + i + " = " + (t * i));
        }
        sc.close();
    }
}
