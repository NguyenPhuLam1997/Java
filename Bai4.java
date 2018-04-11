package javaapplication5;
import java.util.Scanner;
import java.util.*;
import java.math.*;
public class Bai4 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập A: ");
        int a = scanner.nextInt();
        System.out.print("Nhập B: ");
        int b = scanner.nextInt();
        System.out.print("Nhập C: ");
        int c = scanner.nextInt();
        if (a==0)
        {
            if (b==0)
		{
			if (c==0) 
                            System.out.print("Phương Trình Vô Số Nghiệm");
			else 
                            System.out.print("Phương Trình Vô Nghiệm");
		}
		else
		{
			int x1 = -b/c;
			System.out.printf("Phương Trình Có 1 Nghiệm:%f",x1);
		}
        }
        else
	{
		int d = b*b-4*a*c ;
		if (d<0)
                    System.out.print("Phương Trình Vô Nghiệm");
		if (d==0)
		{
			int x1=-b/(2*a);
			System.out.printf("Phương Trình Đa Nghiệm Kép:%f",x1);
		}
		if (d>0)
		{
			double x1=(-b+Math.sqrt(d))/(2*a);
			double x2=(-b-Math.sqrt(d))/(2*a);
			System.out.printf("Phương Trình Có 2 Nghiệm Phân Biệt: x1 = %.2f, x2 = %.2f",x1,x2);
		}
	}
        
    
    }
    
}