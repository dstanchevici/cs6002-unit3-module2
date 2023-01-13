// Unit 3, Module 2

public class PointerCopyProblem {

    public static void main (String[] argv)
    {
	int[][] A = {
	    {1, 2},
	    {3, 4},
	    {5, 6}
	};

	int[][] B = new int [A.length][A[0].length];
	for (int i=0; i < A.length; i++) {
	    for (int j=0; j < A[i].length; j++) {
		B[i][j] = A[i][j];
	    }
	}

	print (A, B);

	B[0][0] = 9;

	print (A, B);
    }
    
    static void print (int[][] A, int[][] B)
    {
	System.out.println ("\nArray A: ");
	for (int i=0; i < A.length; i++) {
	    for (int j=0; j < A[i].length; j++) {
		System.out.print (" " + A[i][j]);
	    }
	    System.out.println ();
	}

	System.out.println ("Array B: ");
	for (int i=0; i < B.length; i++) {
	    for (int j=0; j < B[i].length; j++) {
		System.out.print (" " + B[i][j]);
	    }
	    System.out.println ();
	}
    }
}