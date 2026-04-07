public class Problem2 {
    public static void main(String[] args) {

        int[] risk = {30, 10, 50};

        // Bubble Sort
        for (int i = 0; i < risk.length; i++) {
            for (int j = 0; j < risk.length - i - 1; j++) {
                if (risk[j] > risk[j + 1]) {
                    int temp = risk[j];
                    risk[j] = risk[j + 1];
                    risk[j + 1] = temp;
                }
            }
        }

        // Print result
        System.out.println("Sorted Risk:");
        for (int r : risk) {
            System.out.print(r + " ");
        }
    }
}
