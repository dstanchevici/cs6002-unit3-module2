
public class MagicSquare {

    public static void main (String[] argv)
    {
        // Some test cases.
        int[][] square = generateSquare (3);
        print (square);

        square = generateSquare (5);
        print (square);
    }
    

    // Current row/column and next row/column.
    static int row, col;
    static int nextRow, nextCol;

    static int[][] generateSquare (int N)
    {
        int[][] A = new int [N][N];

        // Start with middle in top row.
        row = 0;
        col = N/2;
        A[row][col] = 1;

	// The remaining numbers.
        for (int n=2; n<=N*N; n++) {

            // Go up diagonally to the right.
            computeNext (N);

            if (A[nextRow][nextCol] == 0) {
                // Place next number here if unoccupied.
                A[nextRow][nextCol] = n;
            }
            else {
                // Else, place directly below current number.
                nextRow = row + 1;
                nextCol = col;
                A[nextRow][nextCol] = n;
            }

            // Update.
            row = nextRow;
            col = nextCol;

        } //end-for

        return A;
    }


    static void computeNext (int N)
    {
        if (row == 0) {
            // If we're at the top, next row wraps around.
            nextRow = N - 1;
        }
        else {
            // Otherwise, go to previous row.
            nextRow = row - 1;
        }
        
        if (col == N-1) {
            // If we're at the rightmost col, wrap around to leftmost.
            nextCol = 0;
        }
        else {
            // Otherwise, next column is the one to the right.
            nextCol = col + 1;
        }
    }
    

    static void print (int[][] A)
    {
	int sum = 0;
	for (int i=0; i<A[0].length; i++) {
	    sum += A[0][i];
	}

	System.out.println ();
        System.out.println ("Square of size " + A.length + ":");
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[i].length; j++) {
                System.out.printf ("%3d", A[i][j]);
            }
	    System.out.print (" | " + sum);
            System.out.println ();
        }

	for (int k=0; k<A[0].length; k++) {
	    System.out.print ("---");
	}
	System.out.println ();
	for (int k=0; k<A[0].length; k++) {
            System.out.printf ("%3d", sum);
	}
	System.out.println ();
	System.out.println ();

    }
    
}
