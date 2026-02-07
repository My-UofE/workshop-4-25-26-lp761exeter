public class CircleApp
{
    public static void main(String[] args)
    {
        // instantiation
        Circle c1 = new Circle(2214,1234,452);
        Circle c2 = new Circle(234);
        Circle c3 = new Circle();
        Circle[] circles = {c1,c2,c3};
        
        // getters/setters test
        double baseRadius = 1;
        double baseOriginX = 1;
        double baseOriginY = 1;
        for (int i = 0; i<circles.length; i++)
        {
            Circle c = circles[i];
            c.setRadius(baseRadius);
            System.out.println("c"+(i+1)+" radius: "+c.getRadius());
            c.setOriginX(baseOriginX);
            c.setOriginY(baseOriginY);
            System.out.println("c"+(i+1)+" origin: "+c.getOriginX()+", "+c.getOriginY());
            baseRadius*=3;
            baseOriginX+=2;
            baseOriginY+=2;
        }
        System.out.println();

        // area test
        for (int i = 0; i<circles.length; i++)
        {
            Circle c = circles[i];
            System.out.println("c"+(i+1)+" area: "+c.getArea());
        }
        System.out.println();

        // circumference test
        for (int i = 0; i<circles.length; i++)
        {
            Circle c = circles[i];
            System.out.println("c"+(i+1)+" circumference: "+c.getCircumference());
        }
        System.out.println();

        // move test
        for (int i = 0; i<circles.length; i++)
        {
            Circle c = circles[i];
            c.move(1,0);
            System.out.println("c"+(i+1)+" origin: "+c.getOriginX()+", "+c.getOriginY());
        }
        System.out.println();


        // toString test
        for (int i = 0; i<circles.length; i++)
        {
            Circle c = circles[i];
            System.out.println(c);
        }
        System.out.println();

        // scale test
        for (int i = 0; i<circles.length; i++)
        {
            Circle c = circles[i];
            c.scale(2);
            System.out.println("c"+(i+1)+" area: "+c.getArea());
        }
        System.out.println();

        // overlap test
        boolean[] overlaps = {
            c1.isOverlappedBy(c2),
            c2.isOverlappedBy(c1),
            c1.isOverlappedBy(c3),
            c3.isOverlappedBy(c1),
            c2.isOverlappedBy(c3),
            c3.isOverlappedBy(c2)
        };
        for (int i = 0; i<overlaps.length; i++)
        {
            System.out.println(overlaps[i]);
        }

        // enclosed test
        boolean[] enclosed = {
            c1.isEnclosedBy(c2),
            c2.isEnclosedBy(c1),
            c1.isEnclosedBy(c3),
            c3.isEnclosedBy(c1),
            c2.isEnclosedBy(c3),
            c3.isEnclosedBy(c2)
        };
        for (int i = 0; i<enclosed.length; i++)
        {
            System.out.println(enclosed[i]);
        }

    }
}