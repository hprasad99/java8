interface Calculator{
    /*void switchOn();
    void sum(int input);*/
    int subtract(int i1, int i2);
}
public class CalculatorImpl{
    public static void main(String[] args) {
        /*Calculator calculator = () ->
            System.out.println("Switch On");
        calculator.switchOn();
        Calculator calculator = (input) -> {
            System.out.println("Sum : "+input);
        };
        calculator.sum(10);*/
        Calculator calculator = (i1,i2) -> i1-i2;
        System.out.println(calculator.subtract(10,20));
    }
}

