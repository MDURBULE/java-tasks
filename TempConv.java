package cognifyz_level_1;
import java.util.Scanner;

public class TempConv {
	
	private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
	}
	
	private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
	}
	
	private void tempDisplay(char unit,double temp) {
		if(unit=='C' || unit=='c') {
			double convTemp = celsiusToFahrenheit(temp);
			System.out.println(temp + "Celsius is euqal to the "+convTemp+" Fahrenheit");
		}
		else if(unit=='F'||unit=='f') {
			double convTemp = fahrenheitToCelsius(temp);
			System.out.println(temp + "Fahrenheit is euqal to the "+convTemp+" Celsius");		}
		else {
			System.out.println("invalid unit of measurement , please check the  unit ");
		}
	}
	
	
	public static void main(String [] args) {
		TempConv tc = new TempConv();
		System.out.println("Temperature Converter ");
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter a temperature :- ");
			double temp =  scan.nextDouble();
			System.out.println("Enter a unit of temprature :- ");
			char unit = scan.next().charAt(0);
			tc.tempDisplay(unit, temp);
			scan.close();

		}
		
	}

}
