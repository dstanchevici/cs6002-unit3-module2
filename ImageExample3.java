
public class ImageExample3 {

    public static void main (String[] argv)
    {
	int[][][] A = {
	    {
		{255,200,0,0}, {255,150,0,0}, {255,100,0,0}, {255,50,0,0}, 
	    },
	    {
		{255,0,200,0}, {255,0,150,0}, {255,0,100,0}, {255,50,0,0}, 
	    },
	    {
		{255,0,0,200}, {255,0,0,150}, {255,0,0,100}, {255,0,0,50}, 
	    },
	};

	// Add one pixel on each side to give it a "frame"
	int[][][] B = frameIt (A);
	
	ImageTool im = new ImageTool ();
	im.showImage (B, "test yellow frame");
    }

    public static int[][][] frameIt (int[][][] A)
    {

	int[][][] B = new int [A.length+2][A[0].length+2][A[0][0].length];

	// Insert yellow in top and bottom rows
	for (int i=0; i<B.length; i+=B.length-1) {
	    for (int j=0; j<B[i].length; j++) {
		B[i][j][0] = 255;
		B[i][j][1] = 255;
		B[i][j][2] = 255;
		B[i][j][3] = 0;
	    }
	}

	// Insert yellow in left and right columsn
	for (int i=0; i<B.length; i++) {
	    for (int j=0; j<B[i].length; j+=B[i].length-1) {
		B[i][j][0] = 255;
		B[i][j][1] = 255;
		B[i][j][2] = 255;
		B[i][j][3] = 0;
	    }
	}


	// Copy contents of A into the rest of B
	for (int i=1; i<B.length-1; i++) {
	    for (int j=1; j<B[i].length-1; j++) {
		for (int k=0; k<B[i][j].length; k++) {
		    B[i][j][k] = A[i-1][j-1][k];
		}
	    }
	}

	return B;
    }

}
