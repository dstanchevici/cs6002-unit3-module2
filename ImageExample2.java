
public class ImageExample2 {

    public static void main (String[] argv)
    {
        // A 5 x 6 2D array:
	int[][] A = {
	    {50, 55, 60, 65, 70, 75},
	    {80, 85,90, 95, 100, 105},
	    {110, 120, 125, 130, 135, 140},
	    {145, 150, 155, 160, 165, 170},
	    {175, 180, 185, 190, 195, 200},
	};

	// Add one pixel on each side to give it a "frame"
	int[][] B = frameIt (A);

	ImageTool im = new ImageTool ();
	im.showImage (B, "test");
    }

    public static int[][] frameIt (int[][] A)
    {
	int[][] B = new int [A.length + 2][A[0].length+2];
	
	// Fill the first and last row with white space
	for (int i=0; i<B.length; i+=B.length-1) {
	    for (int j=0; j<B[i].length; j++) {
		B[i][j] = 255;
	    }
	}

	// Fill the first and last column with white space
	for (int i=0; i<B.length; i++) {
	    for (int j=0; j<B[i].length; j+=B[i].length-1) {
		B[i][j] = 255;
	    }
	}

	// Fill in the rest
	for (int i=1; i<B.length-1; i++) {
	    for (int j=1; j<B[i].length-1; j++) {
		B[i][j] = A[i-1][j-1];
	    }
	}

	return B;
    }

}
