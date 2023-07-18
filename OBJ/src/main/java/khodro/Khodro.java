package khodro;

public abstract class Khodro {
    boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }
    void khamosh(){
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();

    public abstract String getMark();
    // میتوانیم میتودی داشته باشیم که هیچ نوع جزئیاتی داخلش نباشه مثل همین کلاس از کلمه abstract استفاده می نمایم
}
