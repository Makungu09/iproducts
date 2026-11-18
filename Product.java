/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iproduct;

/**
 *
 * @author LENOVO
 */public class Product implements IProduct {
    // Single-dimensional array - product names
    private String[] productNames;
    // Two-dimensional array - sales [product][month]
    private int[][] sales;

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = sales.length * sales[0].length; // 3 products x 3 months = 9
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxTotal = -1;
        String mostPopular = "";
        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                mostPopular = productNames[i];
            }
        }
        // Matches sample format: Cosy Nights Monarch(63)
        return mostPopular + "(" + maxTotal + ")";
    }

    // Getters for PrintProduct
    public String[] getProductNames() {
        return productNames;
    }

    public int[][] getSales() {
        return sales;
    }
}
