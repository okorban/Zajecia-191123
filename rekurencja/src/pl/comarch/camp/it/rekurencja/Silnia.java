package pl.comarch.camp.it.rekurencja;

import java.util.HashMap;
import java.util.Random;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(silnia(7));
        System.out.println(arithmeticNElement(5, 15, 7));
        System.out.println(fibonacci(10));
        System.out.println(powerN(10, 2));

        HashMap<Integer, Integer> map = new HashMap<>();

        dicesRoll(map, 5600);
        System.out.println(map);



    }

    public static int silnia(int x) {
        if (x <= 0) {
            return 1;
        } else return x * silnia(x - 1);
    }

    public static int arithmeticNElement(int n, int step, int first) {
        if (n == 0) {
            return first;
        } else return step + arithmeticNElement(n - 1, step, first);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int powerN(int power, int base){
        if(power == 0){
            return 1;
        }
        return base * powerN(power -1, base);
    }

    public static void dicesRoll(HashMap<Integer, Integer> map, int n ){
        if( n == 0){
            return;
        }
        Random random = new Random();
        int twoDiceSUm = random.nextInt(1,7) + random.nextInt(1,7);
        if(map.get(twoDiceSUm) == null){
            map.put(twoDiceSUm, 1);
        } else{
            map.put(twoDiceSUm, map.get(twoDiceSUm) + 1);
        }

        dicesRoll(map, n -1 );

    }



}
