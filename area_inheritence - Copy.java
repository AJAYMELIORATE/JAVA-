//area of the rectangle 
class BaseClass 
{
    int width;
    int height;

    public BaseClass(int width, int height) 
	{
        this.width = width;
        this.height = height;
    }

    public void display() 
	{
        System.out.println(width + " " + height);
    }
}

class RectangleArea extends BaseClass 
{
    public RectangleArea(int width, int height) 
	{
        super(width, height);
    }

    public void display() 
	{
        System.out.println(width * height);
    }
    
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        
        RectangleArea rect = new RectangleArea(width, height);
        rect.display(); // prints the area of the rectangle
        rect.display(); // prints the width and height of the rectangle
    }
}
