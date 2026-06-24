import java.util.Scanner;

public class SquareCubeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int Squares = 0;
        int Cubes = 0;

        if (n < 1) {
            System.out.println("For N < 1, sums are 0.");
        } else {
            for (int i = 1; i <= n; i++) {
                int sq = (int) i * i;
                Squares += sq;

                int cube = sq * i; // i^3 = (i^2) * i
                Cubes += cube;
            }
        }

        System.out.println("Sum of squares (1^2 + 2^2 + ... + N^2) = " + Squares);
        System.out.println("Sum of cubes   (1^3 + 2^3 + ... + N^3) = " + Cubes);

        sc.close();
    }
}

