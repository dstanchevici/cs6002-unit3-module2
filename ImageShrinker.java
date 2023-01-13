
import java.awt.*;
import java.awt.image.*;

public class ImageShrinker {

    // We'll declare this up here so that it can be shared
    // across methods.
    static ImageTool imTool = new ImageTool ();


    public static void main (String[] argv)
    {
        // Read in an image and display it.
	int[][][] pixels = imTool.imageFileToPixels ("bugs.jpg");
        imTool.showImage (pixels, "original");

        // All the work of shrinking is done in the shrink() method.
        // We'll shrink to 20% of the current size.
        int[][][] changedPixels = shrink (pixels, 0.2);

        // Now display the result.
        imTool.showImage (changedPixels, "shrunk");
	imTool.writeToFile (changedPixels, "bugsThumb.jpg");
    }


    static int[][][] shrink (int[][][] pixels, double factor)
    {
        // The array dimensions.
        int numRows = pixels.length;
        int numCols = pixels[0].length;

        // The resulting shrunk image will have fewer rows and columns.
        int numTargetRows = (int) (factor * numRows);
        int numTargetCols = (int) (factor * numCols);

        // What we'll do is skip pixels in the original. This is the 
        // skip amount:
        int multiplier = numRows / numTargetRows;

        // Make a pixel array to hold the shrunk image.
        int[][][] shrunkPixels = new int [numTargetRows][numTargetCols][4];

        // Now fill the pixel values in the new image.
        for (int i=0; i<numTargetRows; i++) {
            for (int j=0; j<numTargetCols; j++) {
                // For each pixel in the new image, we'll get
                // one of the original pixels as determined by the "skip".
                int originalRow = i * multiplier;
                int originalCol = j * multiplier;

                // Pay attention to this assignment.
                shrunkPixels[i][j] = pixels[originalRow][originalCol];

		// Un-comment this for the exercise below.
		System.out.println (shrunkPixels[i][j]);
            }
        }

        // Now convert pixels into an instance of Image and return that.
        return shrunkPixels;
    }
    
}

