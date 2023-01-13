// Unit 3, Module 2

public class Array3DExample {

    public static void main (String[] argv)
    {
	int[][][] A = {
	    {
		{1, 2, 3, 4},
		{5, 6, 7, 8},
		{9, 10, 11, 12}
	    },
	    {
		{13, 14, 15, 16},
		{17, 18, 19, 20},
		{21, 22, 23, 24}
	    },
	};

	System.out.println (A[1][0][2]);

	System.out.println (A.length);
	System.out.println (A[0].length);
	System.out.println (A[0][0].length);
    }

}