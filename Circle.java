public class Circle
{
    private double radius;
    private double originX;
    private double originY;

    // constructors
    public Circle(double r, double ox, double oy)
    {
        radius = r;
        originX = ox;
        originY = oy;
    }

    public Circle(double r)
    {
        this(r,0,0);
    }

    public Circle()
    {
        this(1,0,0);
    }

    //methods
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public double getCircumference()
    {
        return 2*Math.PI*radius;
    }

    public void move(double x, double y)
    {
        originX+=x;
        originY+=y;
    }

    public String toString()
    {
        return "Circle[x="+originX+",y="+originY+",r="+radius+"]";
    }

    public void scale(double s)
    {
        radius*=s;
    }

    public boolean isOverlappedBy(Circle c)
    {
        double dx = originX - c.originX;
        double dy = originY - c.originY;
        double r  = radius + c.radius;
        return (dx*dx + dy*dy) < (r*r);
    }

    public boolean isEnclosedBy(Circle c)
    {
        if (radius > c.radius)
        {
            return false;
        }
        

        double dx = originX - c.originX;
        double dy = originY - c.originY;
        double dr = c.radius - radius;

        return (dx*dx + dy*dy) <= (dr*dr);
    }

    
    //getters
    public double getRadius()
    {
        return radius;
    }

    public double getOriginX()
    {
        return originX;
    }

    public double getOriginY()
    {
        return originY;
    }

    //setters
    public void setRadius(double r)
    {   
        if (r>=0)
        {
            radius = r;
        }
    }

    public void setOriginX(double ox)
    {
        originX = ox;
    }

    public void setOriginY(double oy)
    {
        originY = oy;
    }

}