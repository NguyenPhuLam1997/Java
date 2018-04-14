
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
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
