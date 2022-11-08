package OOP.object;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.sumCalculator();

        calc.num1 = 12;
        calc.num2 = 12;
        calc.sumCalculator();
        // int r1 = calc.sumCalculator(); since the return type of the sumCalculator
        // method is void, you cannot assign the result into another variable

        int r2 = calc.sumCalculator1();

        System.out.println(r2);

        calc.total(5, 3);

        calc.total(25,35);

    }
}
