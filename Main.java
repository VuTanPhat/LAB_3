package Point2D;
import Point2D.Point2D;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	 {
		Scanner sc= new Scanner(Sytem.in);
		Piont2D X= new Point2D();
		System.out.println("Nhap x: ");
		X.setX(sc.nextFloat());
		System.out.println("Nhap y: ");
		X.setY(sc.nextFloat());
		System.out.println("Thuoc tinh cua mat phang 0xy la: X " + X.toString());
		sc.close();
	 }
}
