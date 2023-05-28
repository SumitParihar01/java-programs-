public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10}; // Example array
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        System.out.println("Sum: " + sum);
    }
}
