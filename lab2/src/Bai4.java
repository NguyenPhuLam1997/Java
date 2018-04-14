import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bai1 b = new Bai1();
       int a = 0;
       Scanner x = new Scanner(System.in);
       System.out.println("+------------------------------------+");
       System.out.println("1. Giai phuong trinh bac nhat");
       System.out.println("2. Giai phuong trinh bac hai");
       System.out.println("3. Tinh tien dien");
       System.out.println("4. Ket thuc");
       System.out.println("+------------------------------------+");
       System.out.print("Chon chuc nang: ");       
       a = x.nextInt();
       
       switch(a){
            case 1: Bai1();
                    break;
            case 2: Bai2();
                    break;
            case 3: Bai3();
                    break;
            case 4: System.exit(0);
            default: System.out.println("Lua chon khong dung");
       }
        
        
        
    }

    private static void Bai1() {
        
        Scanner x = new Scanner(System.in);
        System.out.println("Giải Phương Trình Ax + B = 0");
        System.out.printf("Nhập Số A: ");
        double a = x.nextDouble();
        System.out.printf("Nhập Số B: ");
        double b = x.nextDouble();
        System.out.printf("Kết quả: ");
        double c=0;
        if(a==0)
        {
            if(b==0)
                System.out.println("Phương Trình Vô Số Nghiệm!");
            else
                System.out.println("Phương Trình Vô Nghiệm");
        }
        else
            c=-b/a;
            System.out.printf("%.2f",c);
    }

    private static void Bai2() {
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

    private static void Bai3() {
        Scanner x = new Scanner(System.in);
        System.out.println("Tính Tiền Điện!");
        System.out.printf("Nhập Số Cũ: ");
        double a = x.nextDouble();
        System.out.printf("Nhập Số Mới: ");
        double b = x.nextDouble();
        System.out.printf("Tiền Phải trả: ");
        double c = 0;
        double e = b-a;
        if(e<50)
        {
            c = e *1000;
            System.out.printf("%.2f", c);
            
        }
        if(e>50)
        {
            c = 50*1000 + (e-50)*1200;
            System.out.printf("%.2f", c);
        }
        
    }

}
