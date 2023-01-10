import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số n:");
        int n = input.nextInt();

        if (n > 1) {
            System.out.println("Hiển thị các số nguyên tố nhỏ hơn " + n + ".");
            System.out.print(2);
        }
        System.out.println("\nCó tất cả " + checkPrime(n) + " số nguyên tố.");
    }

    public static int checkPrime(int n) {
        int count = 1;
        for (int i = 3; i <= n; i++) {
            int check = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    check = check + 1;
                }
            }
            if (check == 2) {
                System.out.print(" " + i);
                count++;
            }
        }
        return count;
    }
}
