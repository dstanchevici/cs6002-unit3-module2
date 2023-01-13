
public class ImageExample {

    public static void main (String[] argv)
    {
        // A 5 x 6 2D array:
	int[][] A = {
	    {50, 55, 60, 65, 70, 75},
	    {100, 105, 110, 120, 125, 130},
	    {150, 155, 160, 165, 170, 175},
	    {200, 205, 210, 215, 220, 225},
	    {250, 251, 252, 253, 254, 255},
	};
	
        // Use ImageTool to display:
	ImageTool im = new ImageTool ();
	im.showImage (A, "test");
    }

}
