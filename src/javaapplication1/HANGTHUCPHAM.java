/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class HANGTHUCPHAM extends HANGHOA{

    public String getNGAYSX() {
        return NGAYSX;
    }

    public void setNGAYSX(String NGAYSX) {
        this.NGAYSX = NGAYSX;
    }

    public String getNGAYHETHAN() {
        return NGAYHETHAN;
    }

    public void setNGAYHETHAN(String NGAYHETHAN) {
        this.NGAYHETHAN = NGAYHETHAN;
    }

    public HANGTHUCPHAM() {
    }

    public HANGTHUCPHAM(String NGAYSX, String NGAYHETHAN, int MAHANG, String TEN, double Gia) {
        super(MAHANG, TEN, Gia);
        this.NGAYSX = NGAYSX;
        this.NGAYHETHAN = NGAYHETHAN;
    }

    @Override
    public void Output() {
        super.Output();
        // viet them cac thuoc tinh khac
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Input() {
        super.Input(); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String NGAYSX;
    private String NGAYHETHAN;
}
