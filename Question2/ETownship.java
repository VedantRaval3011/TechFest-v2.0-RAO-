import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = input.nextInt();
            double accent_qty = 0, regular_qty = 0, hours = 0;
            for (int j = 1; j <= N; j++) {
                int total_bedrooms = input.nextInt();
                char comma = input.next().charAt(0);
                int R = input.nextInt();
                comma = input.next().charAt(0);
                comma = input.next().charAt(0);
                int S = input.nextInt();
                comma = input.next().charAt(0);
                int H = input.nextInt();
                int walls = 6 * H + 4 * S + 3 * R;
                accent_qty += (walls / 3.0) * 1.5;
                regular_qty += (walls / 3.0) * 2.25 * 2;
                hours += (walls / 3.0) * 2.5 + (walls / 3.0) * 2 * 3.25;
            }
            System.out.print("Case #" + i + ": ");
            System.out.printf("%.2f, ", hours);
            System.out.printf("%.2f, ", accent_qty);
            System.out.printf("%.2f\n", regular_qty);
        }
    }
}
