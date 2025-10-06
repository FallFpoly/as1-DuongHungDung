/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author ASUS
 */
  import java.util.Scanner;

public class Mavenproject1 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        int choice = -1;
        while (choice != 0) {
            printMenu();
            try {
                System.out.print("Chon chuc nang : ");
                choice = Integer.parseInt(sc.nextLine().trim());
                switch (choice) {
                    case 1 -> System.out.println("Dang cap nhat");
                    case 2 -> System.out.println("Dang cap nhat");
                    case 3 -> System.out.println("Dang cap nhat");
                    case 4 -> System.out.println("Dang cap nhat");
                    case 5 -> System.out.println("Dang cap nhat");
                    case 6 -> System.out.println("Dang cap nhat");
                    case 7 -> System.out.println("Dang cap nhat");
                    case 8 -> System.out.println("Dang cap nhat");
                    case 9 -> System.out.println("Dang cap nhat");
                    case 0 -> System.out.println("Thoat chuong trinh. Tam biet!");
                    default -> System.out.println("Lua chon khong hop le. Vui long chon lai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so hop le.");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("========== QUAN LY NHAN SU - CONG TY RONG VIET ==========");
        System.out.println("1. Nhap danh sach nhan vien");
        System.out.println("2. Xuat danh sach nhan vien");
        System.out.println("3. Tim va hien thi nhan vien theo ma");
        System.out.println("4. Xoa nhan vien theo ma");
        System.out.println("5. Cap nhat thong tin nhan vien theo ma");
        System.out.println("6. Tim cac nhan vien theo khoang luong");
        System.out.println("7. Sap xep nhan vien theo ho va ten");
        System.out.println("8. Sap xep nhan vien theo thu nhap");
        System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
        System.out.println("0. Thoat");
        System.out.println("========================================================");
    }
}