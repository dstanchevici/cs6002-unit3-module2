
public class MyImageExample {

    public static void main (String[] argv)
    {
        // A 5 x 6 2D array:
	int[][] A = {
	    {255, 255, 255, 255, 255, 255, 255},
	    {255, 255, 255, 110, 255, 255, 255},
	    {255, 255, 200, 255, 200, 255, 255},
	    {255, 110, 255, 255, 255, 110, 255},
	    {240, 255, 255, 255, 255, 255, 240}
	};
	
        // Use ImageTool to display:
	ImageTool im = new ImageTool ();
	im.showImage (A, "test");
    }

}
