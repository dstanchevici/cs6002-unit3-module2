import java.awt.*;
import java.awt.image.*;

public class GreyScale {

    static ImageTool imTool = new ImageTool ();

    public static void main (String[] argv)
    {
        // Read in an image and display.
        int[][][] pixels = imTool.imageFileToPixels ("statue.jpg");
        imTool.showImage (pixels, "original");

        // Convert to grey scale and display.
        int[][] greyPixels = toGreyScale (pixels);
        imTool.showImage (greyPixels, "grey-scale");
    }
    
    static int[][] toGreyScale (int[][][] pixels)
    {
        // Extract pixels and size.
        int numRows = pixels.length;
        int numCols = pixels[0].length;

        // Make array of exactly the same size.
        int[][] greyPixels = new int [numRows][numCols];

	// IMPORTANT: notice that greyPixels is 2D.

	for (int i=0; i<pixels.length; i++) {
	    for (int j=0; j<pixels[i].length; j++) {
		int greyValue = 0;
		for (int k=1; k<pixels[i][j].length; k++) {
		    greyValue += pixels[i][j][k];
		}
		greyValue /= (pixels[i][j].length-1);
		greyPixels[i][j] = greyValue;
	    }
	}

        return greyPixels;
    }

}
