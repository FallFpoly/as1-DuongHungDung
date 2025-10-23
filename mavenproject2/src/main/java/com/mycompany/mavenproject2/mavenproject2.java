/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;


import java.util.Scanner;

public class mavenproject2 {
    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n=== MENU QUAN LY NHAN SU ===");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Tim nhan vien theo ma");
            System.out.println("4. Xoa nhan vien theo ma");
            System.out.println("5. Cap nhat thong tin nhan vien");
            System.out.println("6. Tim nhan vien theo khoang luong");
            System.out.println("7. Sap xep theo ho ten");
            System.out.println("8. Sap xep theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> ql.nhap();
                case 2 -> ql.xuat();
                case 3 -> ql.timTheoMa();
                case 4 -> ql.xoaTheoMa();
                case 5 -> ql.capNhatTheoMa();
                case 6 -> ql.timTheoLuong();
                case 7 -> ql.sapXepTheoTen();
                case 8 -> ql.sapXepTheoThuNhap();
                case 9 -> ql.top5ThuNhap();
                case 0 -> System.out.println("Tam biet!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}