/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HANGHOA {

    public int getMAHANG() {
        return MAHANG;
    }

    public void setMAHANG(int MAHANG) {
        this.MAHANG = MAHANG;
    }

    public String getTEN() {
        return TEN;
    }

    public void setTEN(String TEN) {
        this.TEN = TEN;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public HANGHOA() {
    }

    public HANGHOA(int MAHANG, String TEN, double Gia) {
        this.MAHANG = MAHANG;
        this.TEN = TEN;
        this.Gia = Gia;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        MAHANG = sc.nextInt();
        sc.nextLine();
        TEN = sc.nextLine();
        Gia = sc.nextDouble();
    }

    public void Output() {
        System.out.println(MAHANG+"/"+TEN+"/"+Gia);
    }
    protected int MAHANG;
    protected String TEN;
    protected double Gia;
}
