public class Practice {
    public static int countOccurrences(int[] arr, int n) {
        int count = 0; // Initialize a counter to 0
        for (int num : arr) { // Loop through each element in the array
            if (num == n) { // Check if the current element equals n
                count++; // Increment the counter if it matches
            }
        }
        return count; // Return the total count
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int n = 2;
        System.out.println("The number " + n + " appears " + countOccurrences(arr, n) + " times.");
    }
}

public class Main {
    public static int[] reverseArray(int[] arr) {
        // Create a new array to store the reversed elements
        int[] reversed = new int[arr.length];
        
        // Loop through the input array from the end to the beginning
        for (int i = 0; i < arr.length; i++) {
            // Copy elements from the input array to the new array in reverse order
            reversed[i] = arr[arr.length - 1 - i];
        }
        
        // Return the reversed array
        return reversed;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseArray(arr);

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
}

public class Main {
    public static double sumGrid(double[][] grid) {
        // Step 1: Initialize a variable to store the sum of all elements
        double sum = 0;

        // Step 2: Loop through each row in the grid
        for (int i = 0; i < grid.length; i++) {
            // Step 3: Loop through each element in the current row
            for (int j = 0; j < grid[i].length; j++) {
                // Step 4: Add the current element to the sum
                sum += grid[i][j];
            }
        }

        // Step 5: Return the total sum after all elements are processed
        return sum;
    }
}





