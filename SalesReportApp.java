/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iproduct;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class SalesReportApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1D array
        String[] products = {"Cosy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        // 2D array [3 products][3 months]
        int[][] sales = new int[3][3];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        Product product = new Product(products, sales);
        PrintProduct printer = new PrintProduct(product);
        printer.printReport();

        sc.close();
    }
}
