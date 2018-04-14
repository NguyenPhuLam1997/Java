
import java.util.Scanner;


public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
    
}
