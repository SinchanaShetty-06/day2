public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: If there is only one disk, move it directly from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move top n-1 disks from source to auxiliary, using destination as a temporary rod
        solveTowerOfHanoi(n - 1, source, auxiliary, destination);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move the n-1 disks from auxiliary to destination, using source as a temporary rod
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int numberOfDisks = 4; // Number of disks
        solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B'); // A is source, C is destination, B is auxiliary
    }
}
