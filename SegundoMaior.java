import java.util.Scanner;

public class SegundoMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Digite 10 números:");
        for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
        int maior = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > maior) { segundo = maior; maior = n; }
            else if (n > segundo && n != maior) segundo = n;
        }
        if (segundo == Integer.MIN_VALUE) System.out.println("Não há segundo maior");
        else System.out.println("Segundo maior: " + segundo);
        sc.close();
    }
}
