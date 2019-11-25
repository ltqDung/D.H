
package basic01;

import java.util.Scanner;


/*
 * Nhập vào 1 mảng 10 phần tử, những phần tử đều tự nhập từ bàn phím:
in ra những phần tử ở vị trí chẵn trong mảng đó
in ra những phần tử lở vị trí lẻ trong mảng
in ra những phần tử chia hết cho 2
in ra những phần tử chia cho 5 dư 1
in ra tổng những phần tử chẵn của mảng


/**
 *
 * @author Dell
 */
public class lesion03bt3 {
    public static void main(String[] args) {
         int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" nhap vao 10 nhap tu cua mang ");
            arr[i] = sc.nextInt();

        }
        
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("nha tu chan la" + arr[i]);

            }
        }
    
        for (int i=0;i<10;i++){
            if (arr[i]%2==1){
                System.out.println("nha tu le la" + arr[i]);
            }
        }
       
        for (int i=0;i<10;i++){
            if (arr[i]%2==0){
                System.out.println("phan tu chia het cho 2" + arr[i]);
            }
        }
       
        for (int i=0;i<10;i++){
            if (arr[i]%5==1){
                System.out.println("phan tu chia het cho 5 du 1 la" + arr[i]);
            }
        }
        
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                count = count + arr[i];

            }
        }
        System.out.println("tong cac phan tu chan cua mang la" + count);

    }

}
 


