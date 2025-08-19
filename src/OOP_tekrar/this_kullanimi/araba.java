package OOP_tekrar.this_kullanimi;

public class araba {

    public int renk;
    public int model;

    public araba(int renk, int model) {
        this.renk = renk;                    // değişken ismi ile girilen değerin ismi karışmaması için
        this.model = model;
    }
}
