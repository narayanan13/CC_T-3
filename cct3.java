import java.util.*;

class cct3 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        size = sc.nextInt();
        int[] arr = new int[size];

        // Fetching array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // finding sum of array elements
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // printing resultant sum
        System.out.println("\n Sum of array elements is : " + sum);

        System.out.println("Thank You..!");
    }
}