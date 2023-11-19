package pl.comarch.camp.it.stos.wywolan;

public class App {
    public static void main(String[] args) {
        cos();
        cos();
        metoda();
    }

    public static void metoda(){
        metoda2();
    }

    public static void metoda2(){
        int[] tab = new int[5];
        System.out.println(tab[10]);
    }

    public static void cos(){
        System.out.println("Cos !!");
    }
}
