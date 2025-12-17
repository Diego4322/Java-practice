public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

    }
}

// Challenge 2
        // Print out a multiplication table from 1 -12
        // HINT: use nested for-loops to create rows/columns
        // 1 2 3 ..
        // 2 4 6..
        // 3 6 9...