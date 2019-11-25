/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic01;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class lession03bt1 {

    public static void main(String[] args) {
        int row, column, a, b;

        Scanner sc = new Scanner(System.in);

        //ma tran thu 1
        System.out.print("Nhap row cho ma tran 1 :  ");
        row = sc.nextInt();
        System.out.print("Nhap column cho ma tran 1 :  ");
        column = sc.nextInt();

        int matran1[][] = new int[row][column];

        System.out.println("nhap so cho ma tran 1");
        for (a = 0; a < row; a++) {
            for (b = 0; b < column; b++) {
                matran1[a][b] = sc.nextInt();
            }

        }

        int row2, column2, c, d;

        //ma tran thu 1
        System.out.print(
                "Nhap row cho ma tran 2 :  ");
        row2 = sc.nextInt();

        System.out.print(
                "Nhap column cho ma tran 2 :  ");
        column2 = sc.nextInt();

        int matran2[][] = new int[row2][column2];

        System.out.println(
                "nhap so cho ma tran 2");
        for (c = 0; c < row2; c++) {
            for (d = 0; d < column2; d++) {
                matran2[c][d] = sc.nextInt();
            }
        }

        if (row != row2 || column != column2) {
            System.out.println("khong cong duoc");

        } else {
            int matran3[][] = new int[row][column];
        
            System.out.println("Tong ma tran3 la:  ");
            for (a = 0; a < row; a++) {
                for (b = 0; b < column; b++) {
                    matran3[a][b] = matran1[a][b] + matran2[a][b];
                    System.out.print(matran3[a][b]+"\t");
                }
                System.out.println();
            }

        }

    }
}
