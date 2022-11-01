package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> firstList = new ArrayList<>();

        firstList.add(3);
        firstList.add(6);
        firstList.add(3);


        ArrayList<Integer> secondList = new ArrayList<>();

        secondList.add(4);
        secondList.add(2);
        secondList.add(4);



        var polynomialAdder = new PolynomialAdder(firstList, secondList); // 12 30 36 30 12
        var result = polynomialAdder.addPolynomial();
        for (var item : result) {
            System.out.println(item);
        }
    }
}