public class InsertionSortDemo {
    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 1, 2};

        // Outer loop: Unsorted elements ko ek-ek karke uthane ke liye (Index 1 se start)
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Jise sahi jagah fit karna hai (e.g. key = 3)
            int j = i - 1;    // Left side ke sorted elements ka last index

            // Inner loop: Jab tak peeche ke elements 'key' se bade hain, unhe aage SHIFT karo
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Element ko right shift karo
                j--;                 // Left ki taraf badho
            }

            // Sahi jagah milne par key ko INSERT kar do
            arr[j + 1] = key;
        }

        // Print sorted array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}