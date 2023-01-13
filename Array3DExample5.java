
public class Array3DExample5 {

    public static void main (String[] argv)
    {
	// r,g,b values must be between 0 and 255.
	// int r=255, g=100, b=0;
	int r=255, g=255, b=0;

	int[][][] A = {
	    {
		{255,r,g,b}, {255,r,g,b}, {255,r,g,b}, {255,r,g,b}, 
	    },
	    {
		{255,0,200,0}, {255,0,150,0}, {255,0,100,0}, {255,50,0,0}, 
	    },
	    {
		{255,0,0,200}, {255,0,0,150}, {255,0,0,100}, {255,0,0,50}, 
	    }
	};
	
	ImageTool im = new ImageTool ();
	im.showImage (A, "test");
    }

}
