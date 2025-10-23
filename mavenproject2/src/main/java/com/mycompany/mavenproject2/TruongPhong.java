package com.mycompany.mavenproject2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong() {}

    public TruongPhong(String manv, String hoten, double luong, double trachNhiem) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return luong + trachNhiem;
    }

    @Override
    public void xuatThongTin() {
        System.out.printf("Truong Phong - MaNV: %s | Ho ten: %s | Luong: %.1f | Trach nhiem: %.1f | Thu nhap: %.1f\n",
                manv, hoten, luong, trachNhiem, getThuNhap());
    }
}
