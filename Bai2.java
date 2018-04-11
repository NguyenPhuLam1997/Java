/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
public class Bai2 
{
    //public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Nhập Chiều Dài: ");
        double ChieuDai = a.nextDouble();
        System.out.print("Nhập Chiều Rộng: ");
        double ChieuRong = a.nextDouble();
        System.out.printf("Chu Vi Hình Chữ Nhật Là: %.2f",(ChieuDai+ChieuRong)*2);
        System.out.println();
        System.out.printf("Diện tích hình chữ nhật là: %.2f",ChieuDai*ChieuRong);
        double b = Math.min(ChieuDai, ChieuDai);
        System.out.println();
        System.out.printf("Canh Nhỏ Nhất là: %.2f",b);
    }
    
}
