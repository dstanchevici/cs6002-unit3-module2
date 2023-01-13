
public class Array3DExample3 {

    public static void main (String[] argv)
    {
	int[][][] A = {
	    {
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12}
	    },
	    {
		{13,14,15,16},            
		{17,18,19,20},
		{21,22,23,24}
	    },
	};

	System.out.println ("Array A");
	print (A);
	int[][][] B = copy (A);
	System.out.println ("Array B");
	print (B);
    }

    static int[][][] copy (int[][][] A)
    {
	int[][][] B = new int [A.length][A[0].length][A[0][0].length];
	for (int i=0; i<B.length; i++) {
	    for (int j=0; j<B[0].length; j++) {
		for (int k=0; k<B[0][0].length; k++) {
		    B[i][j][k] = A[i][j][k]; 
		}
	    }
	}
	return B;
    }

    static void print (int[][][] A)
    {
	for (int i=0; i<A.length; i++) {
	    for (int j=0; j<A[i].length; j++) {
		for (int k=0; k<A[i][j].length; k++) {
		    System.out.print (" " + A[i][j][k]);
		}
		System.out.println ();
	    }
	    System.out.println ();
	}
    }

}
