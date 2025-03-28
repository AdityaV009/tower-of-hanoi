
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        // Call the missing solve method (not this one)
        this.model = model;
        solve(model.height(), 0, 2, 1);  // Start with solving the puzzle with 3 towers (0, 1, 2)
    }

    // Recursive function to solve Tower of Hanoi
    private void solve(int n, int source, int destination, int auxiliary) {
        // Base case: If there's only one disk, just move it directly from source to destination
        if (n == 1) {
            model.move(source, destination);
            return;
        }

        // Move the top n-1 disks from source to auxiliary, using destination as auxiliary
        solve(n - 1, source, auxiliary, destination);

        // Move the nth (largest) disk from source to destination
        model.move(source, destination);

        // Move the n-1 disks from auxiliary to destination, using source as auxiliary
        solve(n - 1, auxiliary, destination, source);
    }
    }


    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //