
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print("arrays.elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum all of elements: " + sum);
        System.out.println("Average: " + (double) sum / 10);
    }
        
   }

