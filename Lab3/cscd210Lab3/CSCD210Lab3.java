package cscd210Lab3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CSCD210Lab3 {
	
	public static final double KILOMETERS = 2.5;
	public static void main(String[] args) {
		
		String name = " ";
		DecimalFormat fmt = new DecimalFormat ("0.00"); //reference/object variable
		double finishTime = 0.00;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the finish time for the skier in seconds: ");
		
		finishTime = Double.parseDouble(kb.nextLine());
		
		System.out.println("Enter the name of the skier: ");
		
		name = kb.nextLine();
		
//Variables		
		double meter = 2.5 * 1000;
		double mile = 2.5 * 0.621371;
		double feet = mile * 5280;
		double hourps = 3600; //hours per second
		double seconds = finishTime % 60;
		
//conversions		
		double mps = meter/finishTime; //meters per second
		double fps = feet/finishTime; //feet per second
		double kph = mps*3.6; //kilometers per hour
		double mph = hourps* mile / finishTime; //miles per hour
		double mileTime = (1/mph);
		double yards = (300/fps)/ 3600;
		DecimalFormat new1 = new DecimalFormat("0.00");
		System.out.println(name + " was traveling at a rate of:\n" + new1.format(mps) + " meters per second\n" + new1.format(fps) + " feet per second\n" + new1.format(kph) + " kilometers per hour\n" + new1.format(mph) + " miles per hour\n");
		System.out.println("It would take " + new1.format(mileTime) + " to ski a mile\n" + "It would take " + new1.format(yards) + " minutes and " + new1.format(seconds) + " seconds " + " to ski 100 yards" );	
	}

}
