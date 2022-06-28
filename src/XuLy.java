import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
	   System.out.println("Nhập vào một số thực thứ nhất");
	   String value1 = scan.nextLine();
	   System.out.println("Nhập vào một số thực thứ hai");
	   String value2 = scan.nextLine();
       
	   double num1 = Double.parseDouble(value1);
	   double num2 = Double.parseDouble(value1);
	   double tong = num1 + num2;	   
	   System.out.println("Tổng là: " + tong);
	
	}
}
