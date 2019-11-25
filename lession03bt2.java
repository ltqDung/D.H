/*
 * Yêu cầu người dùng nhập vào 1 mảng số nguyên dương 1 chiều độ dài tùy ý


Chuyển mọi phần tử có giá trị lẻ trong mảng thành -1
In ra phần tử lớn nhất của mảng
Chuyển phần tử nhỏ nhất trong mảng thành -1
Nhập vào 1 số tự nhiên x, In ra mọi phần tử nhỏ hơn x ở trong mảng
Nhập vào 1 số tự nhiên x , in ra phần tử có giá trị gần với giá trị của x nhất ở trong mảng
Kiểm tra sự đối xứng của mảng , vd: 1 2 3 2 1 là 1 mảng đối xứng

 */
package basic01;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class lession03bt2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
        int[] arr = new int[100];
        System.out.println("Do dai cua mang :");
        l = sc.nextInt();

        for (int i = 0; i < l; i++) {
            System.out.println("Nhap phan tu mang 1 chieu :");
            arr[i] = sc.nextInt();
//1
        }

        for (int i = 0; i < l; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = -1;

            }
            System.out.print(arr[i]);

        }
        //2       
        System.out.println();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("So lon nhat trong mang la:" + max);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("So nho nhat trong mang la:" + min);
        //3  
        for (int i = 0; i < l; i++) {
            if (arr[i] < min) {
                min = arr[i] = -1;

            }
        }
        System.out.println("So nho nhat moi la" + min);

        //4
        System.out.println("nhap vao 1 so tu nhien x");
        int x = sc.nextInt();
        for (int i = 0; i < l; i++) {
            if (x > arr[i]) {

                System.out.println(arr[i]);
            }
        }
        //5
        for (int i = 0; i < l; i++) {
            int a = Math.abs(arr[i] - x);
            int b = Integer.MAX_VALUE;
            if (b < a) {
                b = arr[i];

            }
            System.out.print("So gan nhat voi x la:");
            System.out.println(a);
        }
      //6 
     
        for (int i = 0; i < l; i++) {
            
            if (arr[i] == arr[l - i - 1]) {
               
                System.out.println("mang doi xung");
                
                
             
        }else{
                System.out.println("mang ko doi xung");
              
            }
        }
    }
}
