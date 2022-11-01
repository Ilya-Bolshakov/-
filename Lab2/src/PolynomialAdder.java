import java.util.ArrayList;

public class PolynomialAdder {
    private ArrayList<Integer> firstPolynomial;
    private ArrayList<Integer> secondPolynomial;


    public PolynomialAdder(ArrayList<Integer> firstPolynomial, ArrayList<Integer> secondPolynomial) {
        this.firstPolynomial = firstPolynomial;
        this.secondPolynomial = secondPolynomial;
    }

    public ArrayList<Integer> addPolynomial() {
        var maxDegree = firstPolynomial.size() + firstPolynomial.size() - 1;
        var newPolynomial = new ArrayList<Integer>();
        for (int i = 0; i < maxDegree; i++) {
            newPolynomial.add(0);
        }
        int currentFirstPolynomialCoefficient = -1;
        for (var first: firstPolynomial) {
            currentFirstPolynomialCoefficient++;
            int currentSecondPolynomialCoefficient = -1;
            for (var second: secondPolynomial) {
                currentSecondPolynomialCoefficient++;
                int currentCoefficient = currentFirstPolynomialCoefficient + currentSecondPolynomialCoefficient;
                var currentValue = newPolynomial.get(currentCoefficient);
                newPolynomial.set(currentCoefficient, currentValue + (first * second));
            }
        }
        return newPolynomial;
    }
}
