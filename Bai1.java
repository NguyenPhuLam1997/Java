/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
        Scanner a = new Scanner(System.in);
        System.out.print("Họ và Tên: ");
        String HoTen = a.nextLine();
        System.out.print("Điểm TB: ");
        double DiemTB = a.nextDouble();
        System.out.printf("%s %.1f Điểm",HoTen,DiemTB);
    }
}
