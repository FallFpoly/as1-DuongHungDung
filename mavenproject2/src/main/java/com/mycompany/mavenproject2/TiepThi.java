package com.mycompany.mavenproject2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hueHong;

    public TiepThi() {}

    public TiepThi(String manv, String hoten, double luong, double doanhSo, double hueHong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * hueHong;
    }

    @Override
    public void xuatThongTin() {
        System.out.printf("Tiep Thi - MaNV: %s | Ho ten: %s | Luong: %.1f | Doanh so: %.1f | Hue hong: %.2f | Thu nhap: %.1f\n",
                manv, hoten, luong, doanhSo, hueHong, getThuNhap());
    }
}
