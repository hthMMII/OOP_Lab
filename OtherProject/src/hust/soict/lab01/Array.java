package hust.soict.lab01;
import java.util.Scanner;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int n, sum = 0;
        float average;
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Nhap n");
            n = s.nextInt();
            int a[] = new int[n];
            System.out.println("Nhap phan tu:");
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                sum = sum + a[i];
            }
            System.out.println("\nMang ban dau la: ");
            for (int num : a) {
                System.out.print(num + " ");
            }
            Arrays.sort(a);
            System.out.println("\nMang sap xep la: ");
            for (int num : a) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nSum:" + sum);
        average = (float) sum / n;
        System.out.println("\nAverage:" + average);
    }

}
