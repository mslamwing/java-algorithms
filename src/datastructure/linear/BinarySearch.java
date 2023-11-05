package datastructure.linear;

public class BinarySearch {

    // Binary Search in Java
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            System.out.println("New middle: " + middle);

            // Check if target is present at mid
            if (array[middle] == target) {
                return middle;
            }

            // If target greater, ignore left half
            if (array[middle] < target) {
                left = middle + 1;
                System.out.println("New left: " + left);
            }

            // If target is smaller, ignore right half
            else {
                right = middle - 1;
                System.out.println("New right: " + right);
            }
        }

        // Target was not found in the array
        return -1;
    }

    public static void main(String[] args) {

        // O (n log n)
        // sort algorithm here

        int[] nums = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(nums, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

