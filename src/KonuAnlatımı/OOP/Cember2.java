package OOP;

import java.util.Date;

public class Cember2 {
    private String renk;
    private boolean dolu;
    private Date olusturulmaTarihi;

    private double yaricap;
    private double yükseklik;



    public  String getRenk(){

        return renk;
    }

    public boolean getDolu() {
        return dolu;
    }

    public void setDolu(boolean dolu) {
        this.dolu = dolu;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
