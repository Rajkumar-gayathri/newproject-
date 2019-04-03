package selfpractise;
class Rectangle implements Shape  
	{ 
	public static void main (String[] args)  
    { 
      
        // creating the Object of Rectangle class 
        // and using shape interface reference. 
        Rectangle rect = new Rectangle(2,3); 
        System.out.println("Area of rectangle: " + rect.area()); 
  
        // creating the Objects of circle class 
       // Shape circle = new Circle(2); 
        //System.out.println("Area of circle: " + circle.area()); 
    } 
   
	int length, width; 
	      
	    // constructor 
	    Rectangle(int length, int width) 
	    { 
	        this.length = length; 
	        this.width = width; 
	    } 
	      
	    @Override
	    public void draw()  
	    { 
	        System.out.println("Rectangle has been drawn ");  
	    } 
	      
	    @Override
	    public double area()  
	    { 
	        return (double)(length*width); 
	    } 
	}  
	  
	
	 
	 
	    

