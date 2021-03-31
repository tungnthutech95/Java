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
public class HANGDIENMAY extends HANGHOA{

    public String getTHOIGIANBAOHANH() {
        return THOIGIANBAOHANH;
    }

    public void setTHOIGIANBAOHANH(String THOIGIANBAOHANH) {
        this.THOIGIANBAOHANH = THOIGIANBAOHANH;
    }

    public int getCONGSUAT() {
        return CONGSUAT;
    }

    public void setCONGSUAT(int CONGSUAT) {
        this.CONGSUAT = CONGSUAT;
    }

    public int getDIENAP() {
        return DIENAP;
    }

    public void setDIENAP(int DIENAP) {
        this.DIENAP = DIENAP;
    }
    public HANGDIENMAY(){
        super();
    }
//    public HANGHOA(int MAHANG, String TEN, double Gia) {
//        this.MAHANG = MAHANG;
//        this.TEN = TEN;
//        this.Gia = Gia;
//    }
//    public void Input() {
//        Scanner sc = new Scanner(System.in);
//        MAHANG = sc.nextInt();
//        sc.nextLine();
//        TEN = sc.nextLine();
//        Gia = sc.nextDouble();
//    }
    
    public HANGDIENMAY(int MAHANG, String TEN, double Gia,String THOIGIANBAOHANH, int CONGSUAT, int DIENAP){
        super(MAHANG,TEN,Gia);
        this.THOIGIANBAOHANH = THOIGIANBAOHANH;
        this.CONGSUAT= CONGSUAT;
        this.DIENAP = DIENAP;
    }
    
//    @Override
//    public void Input(){
//        Scanner sc = new Scanner(System.in);
//        super.Input();
//        THOIGIANBAOHANH = sc.nextLine();
//        CONGSUAT = sc.nextInt();
//        DIENAP = sc.nextInt();
//    }
//    public void Output(){
//        super.Output();
//        System.out.println(THOIGIANBAOHANH+"/"+CONGSUAT+"/"+DIENAP);
//        
//    }

    @Override
    public void Output() {
        super.Output(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Input() {
        super.Input(); //To change body of generated methods, choose Tools | Templates.
    }


    
    private String THOIGIANBAOHANH;
    private int CONGSUAT;
    private int DIENAP;
}
