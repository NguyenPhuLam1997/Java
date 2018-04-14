
import static java.lang.Math.sqrt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Giải Phương Trình Ax2 + Bx + C = 0");
        System.out.printf("Nhập Số A: ");
        double a = x.nextDouble();
        System.out.printf("Nhập Số B: ");
        double b = x.nextDouble();
        System.out.printf("Nhập Số C: ");
        double c = x.nextDouble();
        System.out.printf("Kết quả: ");
        double d=0;
        d=b*b-4*a*c;
        double e = -b/2*a;
        if(d<0)
            System.out.println("Phương Trình Vô Nghiệm");
        if(d==0)
            System.out.printf("%.2f",e);
        if(d>0)
            System.out.printf("Nghiệm Thứ 1: %.2f", (-b+sqrt(d)/(2*a)));
            System.out.printf("Nghiệm Thứ 1: %.2f", (b+sqrt(d)/(2*a)));
    }
    
}
