public class LargestElement {

    public static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 0};

        int ans = findLargest(arr);

        System.out.println("Largest Element = " + ans);
    }
}