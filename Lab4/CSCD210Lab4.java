package cscd210Lab4;
import java.util.Scanner;

public class CSCD210Lab4 {
	public final String DEGREE = "";

	public static void main(String[] args) {
//variables
		double length;
		double side;
		double area;
		
		Scanner kb = new Scanner(System.in);
		String input = null;
		
		System.out.printf("What is the length of the side to the vertex of the pentagon?");
		input = kb.nextLine();

//calculations
		length = Double.parseDouble(input);//length of the side
		side = (2 * length * Math.sin(Math.PI/5)); //degrees of angle from sin
		area = ((Math.pow(side, 2)* 5)/(Math.tan(Math.PI/5) * 4)); //area of the circle

//outputs		
		System.out.printf("You entered a length of:  %.1f" , Double.parseDouble(input)); //convert from string to double
		System.out.printf("\nPI / 5 is: %.2f " , Math.PI/5 , "\n");
		System.out.printf("\nThe sin of the radian value of PI/5 is: %.2f " , Math.sin(Math.PI/5));
		System.out.printf("\n" , "The angle, in degrees, from the sin calculation is: %.2f " , Math.toDegrees(Math.sin(Math.PI/5)));
		System.out.printf("The length of the side is: %.1f " , side);
		System.out.printf("\nThe area of the pentagon is: %.3f " , area);
		
		
	}
}
