
package girepo;

public class orange5 {

	String color;
	orange5(String color)
	{
	this.color=color;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	orange5 greenApple = new orange5("green");
	String color = greenApple.getcolor();
	System.out.println("color of apple is " + color);

  }
	private String getcolor() {
		// TODO Auto-generated method stub
		return color;
		
	      }



	}



