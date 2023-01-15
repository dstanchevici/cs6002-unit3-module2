
import java.awt.*;
import java.awt.image.*;

public class LinearMap {

    static ImageTool imTool = new ImageTool ();

    public static void main (String[] argv)
    {
        // Read in an image and display.
        int[][][] pixels = imTool.imageFileToPixels ("prof.jpg");
        imTool.showImage (pixels, "original");

        // Adjust brightness and contrast. Convert to a negative.
        int[][][] mappedPixels = linearMap (pixels, -1.0, 255.0);
        imTool.showImage (mappedPixels, "mapped image");
    }

    static int[][][] linearMap (int[][][] pixels, double a, double b)
    {
        // Extract size.
        int numRows = pixels.length;
        int numCols = pixels[0].length;
        
        // Make the array for the new pixels
        int[][][] mappedPixels = new int [numRows][numCols][4];

        // Almost like a copy.
        for (int i=0; i<numRows; i++) {
            for (int j=0; j<numCols; j++) {
                mappedPixels[i][j][0] = pixels[i][j][0];

		// Because the new value may fall outside the range 0,255
		// we'll fix that when it happens.
                mappedPixels[i][j][1] = enforcePixelBounds (a * pixels[i][j][1] + b);
                mappedPixels[i][j][2] = enforcePixelBounds (a * pixels[i][j][2] + b);
                mappedPixels[i][j][3] = enforcePixelBounds (a * pixels[i][j][3] + b);
            }
        }

        // Returned transformed image.
        return mappedPixels;
    }
    

    // Each pixel value needs to be between 0 and 255.

    static int enforcePixelBounds (double pixelValue)
    {
        int value = (int) pixelValue;
        if (value < 0) {
            return 0;
        }
        if (value > 255) {
            return 255;
        }
        return value;
    }

}

