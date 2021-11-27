package Class9HwPT1;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);

        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getAreas());


    }
}

class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getAreas()
    {
        return length * breadth;
    }



}
