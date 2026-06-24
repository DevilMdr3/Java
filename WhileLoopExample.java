public class WhileLoopExample {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            System.err.println("Current value of i: " + i);
            i = i + 1; // Increment i by 1
        }
        System.out.println("Sum: " + sum);
    }
}