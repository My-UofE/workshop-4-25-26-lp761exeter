// An application to create and manipulate rectangles
public class RectangleApp {
	//To be excutable, need a main method
	public static void main( String[] args ) {
		System.out.println("Creating myRect1");
		
		Rectangle myRect1; //myRect is not instantiated
		myRect1 = new Rectangle(20.0, 8.0,30,30); //instantiated
		
		//static field
		System.out.println("Rectangle has " + Rectangle.NUMBER_OF_SIDES + " sides");
		//instance fields
		System.out.println("Width: "+myRect1.getWidth()+", Height: "+myRect1.getHeight());
		System.out.println("Origin is: "+myRect1.getOriginX()+","+myRect1.getOriginY());
		//calling methods
		System.out.println("Area: "+myRect1.getArea());
		
		System.out.println("\nMoving myRect1");
		myRect1.move(0,10);//the object's state is changed
		System.out.println("Origin is: "+myRect1.getOriginX()+","+myRect1.getOriginY());

		System.out.println("Changing width of myRect1");
		myRect1.setWidth(16);//the object's state is changed
		System.out.println("Width: "+myRect1.getWidth()+", Height: "+myRect1.getHeight());
		
		System.out.println("\nCreating myRect2");
		Rectangle myRect2 = new Rectangle(20.0, 8.0);
		System.out.println("Width: "+myRect2.getWidth()+", Height: "+myRect2.getHeight());
		System.out.println("Origin: "+myRect2.getOriginX()+","+myRect2.getOriginY());
		
		System.out.println("\nCreating myRect3");
		Rectangle myRect3 = new Rectangle(); 
		System.out.println("Width: "+myRect3.getWidth()+", Height: "+myRect3.getHeight());
		System.out.println("Origin: "+myRect3.getOriginX()+","+myRect3.getOriginY());
		
		myRect1.scale(0.5); // applies 0.5 scale to both x and y, changing width to 8, height to 4
		System.out.println("Scaling Rect1 - x: "+myRect1.getWidth()+" y: "+myRect1.getHeight());

		myRect2.scale(1,3); // should change height to 24 with width unchanged
		System.out.println("Scaling Rect2 - x: "+myRect2.getWidth()+" y: "+myRect2.getHeight());

		myRect3.scale(15,10); // should scale to width 15, height 10
		System.out.println("Scaling Rect3 - x: "+myRect3.getWidth()+" y: "+myRect3.getHeight());

		Rectangle myRect4 = new Rectangle(30.0, 5.0, 10, 10); 
		Rectangle myRect5 = new Rectangle(50.0, 20.0, 0, 0); 
		Rectangle myRect6 = new Rectangle(20.0, 40.0, 500, 500); 

		// myRect4 overlaps myRect5 so these should show as true
		System.out.println( "myRect4 overlaps myRect5: " + overlapped(myRect4,myRect5)); 
		System.out.println( "myRect5 overlaps myRect4: " + overlapped(myRect5,myRect4)) ;

		// myRect4 does not overlap myRect6 so these should show as false
		System.out.println( "myRect4 overlaps myRect6: " + overlapped(myRect4,myRect6)) ;
		System.out.println( "myRect6 overlaps myRect4: " + overlapped(myRect4,myRect6)) ;

		System.out.println("Check class prevents negative widths");

		// initialise rectangle for test
		Rectangle myRect7 = new Rectangle(30.0, 5.0, 10, 10); 
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );

		// change to positive width should be allowed
		myRect7.setWidth(40);
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );

		// change to negative width should be ignored
		myRect7.setWidth(-10);
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );
	}

	public static boolean overlapped(Rectangle r1, Rectangle r2)
	{
		double r1_left = r1.getOriginX();
		double r1_right = r1.getOriginX()+r1.getWidth();
		double r1_top = r1.getOriginY()+r1.getHeight();
		double r1_bottom = r1.getOriginY();
		double r2_left = r2.getOriginX();
		double r2_right = r2.getOriginX()+r2.getWidth();
		double r2_top = r2.getOriginY()+r2.getHeight();
		double r2_bottom = r2.getOriginY();
		return r1_left<r2_right && r1_right>r2_left && r1_bottom<r2_top && r1_top>r2_bottom;
	}
}
