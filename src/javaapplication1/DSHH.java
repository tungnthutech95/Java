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
public class DSHH {

    private int SL;
    private HANGHOA DANHSACH[];

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public HANGHOA[] getDANHSACH() {
        return DANHSACH;
    }

    public void setDANHSACH(HANGHOA[] DANHSACH) {
        this.DANHSACH = DANHSACH;
    }

    public DSHH() {
    }

    public DSHH(int SL, HANGHOA[] DANHSACH) {
        this.SL = SL;
        this.DANHSACH = DANHSACH;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        SL = sc.nextInt();
        DANHSACH = new HANGHOA[SL];
        for (int i = 0; i < SL; i++) {
            System.out.println("1 : HTP ,2 : HDM");
            int Chon = sc.nextInt();
            switch (Chon) {
                case 1:
                    DANHSACH[i] = new HANGTHUCPHAM();
                    DANHSACH[i].Input();
                    break;
                case 2:
                    DANHSACH[i] = new HANGDIENMAY();
                    DANHSACH[i].Input();
                    break;
            }
        }
    }

    public void Output() {
        for (int i = 0; i < SL; i++) {
            DANHSACH[i].Output();
        }
    }
    
    public void Output(int i){
        if (i==1) {
            for (int j = 0; j < SL; j++) {
                if (DANHSACH[i] instanceof HANGTHUCPHAM ){
                    // invoke =summon 
                }
            }
        } else {
            for (int j = 0; j < SL; j++) {
                if (DANHSACH[i].getClass().getName().contains("HANGDIENMAY")){
                    DANHSACH[i].Output();
                }
            }
        }
    }

}
