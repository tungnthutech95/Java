/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAi2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HANGHOA {

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public DateTimeRD getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(DateTimeRD NgaySX) {
        this.NgaySX = NgaySX;
    }

    public HANGHOA() {
    }

    public HANGHOA(int MaHang, String TenHang, double Gia, DateTimeRD NgaySX) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.Gia = Gia;
        this.NgaySX = NgaySX;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        NgaySX = new DateTimeRD(2020, 12, 1);
        
    }
    public void Output(){
        System.out.println("NgaySX : "+NgaySX.toString());
    }
    protected int MaHang;
    protected String TenHang;
    protected double Gia;
    // ngay  san xuat
    protected DateTimeRD NgaySX;
    
}
