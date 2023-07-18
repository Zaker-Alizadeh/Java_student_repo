package khodro;

public class Mashin extends Khodro implements SandoqDar,Girbox{
    //implements   از چندین کلاس ارث بری کردیم بخاطر و انترفیس درست کردیم

    // extends یعنی از کلاس خودرو ارث بری کرده است
    // حالا برای کلاس ماشین خود یک  constructor ایجاد می کنیم
    public Mashin(String mark){
        this.mark = mark;

    }


    //یک کلاس می تواند یک سری داده داشته باشد و می توانیم از تایپ های مختلف در آن استفاده کنیم
    // Data
    boolean ayaDarBazAst;
    int gonjayeshSandoq;
    String noeDande;
    String mark;
    Ranandeh ranandeh;

    public Mashin(String mark, int gonjayeshSandoq, String noeDande) {
        this.mark = mark;
        this.gonjayeshSandoq = gonjayeshSandoq;
        this.noeDande = noeDande;


    }


    // و میتواند یک سری رفتار داشته
    //Behavior
    public void bazbodandar(){
        ayaDarBazAst = true;
    }
    public void bastebodandar(){
        ayaDarBazAst = false;
    }
    public boolean ayaDarHaleHarekatAst(){
        // ماشین وقتی حرکت می کند که ماشین روشن و در بسته باشد
        if (!ayaDarBazAst && ayaRoshanAst){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getMark() {
        return getMark();
    }

    @Override
    // این override  امپلیمنت انترفیس ماهستش
    public String typeDande() {
        return "Automatic";
    }

    @Override
    // این override  امپلیمنت انترفیس ماهستش

    public int gonjayeshsandoq() {
        return 100;
    }
}

