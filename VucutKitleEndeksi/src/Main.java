import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz: ");
	double boy = input.nextDouble();
	
	System.out.println("L�tfen kilonuzu giriniz: ");
	int kilo = input.nextInt();	
	
	double vucutKitleIndex=(kilo/(boy*boy));
	System.out.println("V�cut Kitle �ndeksiniz: "+vucutKitleIndex);
	}
}
