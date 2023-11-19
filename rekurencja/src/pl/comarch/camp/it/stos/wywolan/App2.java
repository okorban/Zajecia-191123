package pl.comarch.camp.it.stos.wywolan;

public class App2 {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        d();
    }
    public static void d(){
        a();
    }
}
