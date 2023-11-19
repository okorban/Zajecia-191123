package pl.comarch.camp.it.rekurencja;

public class ListMain {
    public static void main(String[] args) {


        LinkedList lista = new LinkedList();
        System.out.println(lista.size());
        System.out.println(lista.get(0));

        lista.add("Janusz");

        System.out.println(lista.size());

        System.out.println(lista.get(0));

        lista.add("Wiesiek");
        lista.add("Karol");
        lista.add("Zbyszek");
        System.out.println(lista.size());

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));


    }
}
