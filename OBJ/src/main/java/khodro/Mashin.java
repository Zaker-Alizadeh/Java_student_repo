package khodro;

public class Mashin extends Khodro {

    // extends یعنی از کلاس خودرو ارث بری کرده است
    // حالا برای کلاس ماشین خود یک  constructor ایجاد می کنیم
    public Mashin(String mark){
        this.mark = mark;

    }


    //یک کلاس می تواند یک سری داده داشته باشد و می توانیم از تایپ های مختلف در آن استفاده کنیم
    // Data
    boolean ayaDarBazAst;
    String mark;
    Ranandeh ranandeh;


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
}

