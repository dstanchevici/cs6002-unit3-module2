// Unit 3, Module 2

import java.util.*;

public class Parameters2 {

    public static void main (String[] argv)
    {
	int[] A = {1, 2};
	int[] B = {3, 4};

	System.out.println ("BEFORE: A=" + Arrays.toString(A) + " BEFORE: B=" + Arrays.toString(B));	

	swap (A, B);
	System.out.println ("AFTER: A=" + Arrays.toString(A) + " AFTER: B=" + Arrays.toString(B));
    }

    static void swap (int[] X, int[] Y)
    {
	System.out.println ("BEFORE: X=" + Arrays.toString(X) + " BEFORE: Y=" + Arrays.toString(Y));	
	int[] temp = X;
	X = Y;
	Y = temp;
	System.out.println ("AFTER: X=" + Arrays.toString(X) + " AFTER: Y=" + Arrays.toString(Y));
	
    }


}