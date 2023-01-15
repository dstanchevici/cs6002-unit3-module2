
public class ArrayCopy {

    public static void main (String[] argv)
    {
        int[][] A = {
            {1},
            {2, 1},
            {3, 2, 1},
            {4, 3, 2, 1},
            {5, 4, 3, 2, 1}
        };
        print (A);

        int[][] B = copy (A);
        print (B);
    }

    static void print (int[][] X)
    {
        for (int i=0; i<X.length; i++) {
            for (int j=0; j < X[i].length; j++) {
                System.out.print (" " + X[i][j]);
            }
            System.out.println ();
        }
    }
    
    static int[][] copy (int[][] X)
    {
	int[][] Y = new int[X.length][];

	// Add individual 1D arrays
	for (int i=0; i < X.length; i++) {
	    Y[i] = new int [X[i].length];
	    for (int j=0; j < X[i].length; j++) {
		Y[i][j] = X[i][j];
	    }
	}
	return Y;
    }
    
}
