/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mymac
 */

import java.util.Scanner;

public class ShapeMain {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Perhitungan Luas Lingkaran");
         System.out.println("=========================");
         System.out.println("Masukkan warna Lingkaran");
         String colorCircle = scanner.nextLine();
         System.out.println("Masukkan radius Lingkaran");
         double radius = scanner.nextDouble();
         Circle circle = new Circle(colorCircle, radius);
         System.out.println("Luas Lingkaran " + circle.getArea());
         System.out.println("  ");
         
         
         System.out.println("Perhitungan Luas Persegi Panjang");
         System.out.println("=========================");
         System.out.println("Masukkan warna Persegi Panjang");
         String colorRectangle = scanner.nextLine();
         System.out.println("Masukkan Panjang Persegi Panjang ");
         double length = scanner.nextDouble();
         System.out.println("Masukkan Lebar Persegi Panjang ");
         double width = scanner.nextDouble();
         Rectangle rectangle = new Rectangle(colorRectangle, length, width);
         System.out.println("Luas persegi Panjang : " + rectangle.getArea());
         
         scanner.close();
     }
}
