import java.util.*;

class Transaction {
    String id;
    double fee;

    Transaction(String id, double fee) {
        this.id = id;
        this.fee = fee;
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Transaction[] arr = {
                new Transaction("T1", 20),
                new Transaction("T2", 5),
                new Transaction("T3", 15)
        };

        // Bubble Sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].fee > arr[j + 1].fee) {
                    Transaction temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (Transaction t : arr)
            System.out.println(t.id + " " + t.fee);
    }
}
