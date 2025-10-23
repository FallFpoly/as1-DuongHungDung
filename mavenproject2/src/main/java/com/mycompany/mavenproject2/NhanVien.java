package com.mycompany.mavenproject2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

public class NhanVien {
    protected String manv;
    protected String hoten;
    protected double luong;

    public NhanVien() {}

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public double getThuNhap() {
        return luong;
    }

    public double getThueTN() {
        double tn = getThuNhap();
        if (tn < 9000000) return 0;
        else if (tn <= 15000000) return tn * 0.1;
        else return tn * 0.12;
    }

    public void xuatThongTin() {
        System.out.printf("MaNV: %s | Ho ten: %s | Luong: %.1f | Thu nhap: %.1f | Thue: %.1f\n",
                manv, hoten, luong, getThuNhap(), getThueTN());
    }
}