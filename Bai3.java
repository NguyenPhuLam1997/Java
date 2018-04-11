package javaapplication5;
import java.util.Scanner;
public class Bai3 
{
    //public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cạnh của khối lập phương: ");
        double Canh = scanner.nextDouble();
        System.out.printf("Thể tích khối lập phương là: %.2f",Canh*3);
    }
}
