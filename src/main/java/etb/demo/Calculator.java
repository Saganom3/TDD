package etb.demo;

public class Calculator {
    public int sumPositiveValues(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            if(number>0){
                sum += number;
            }
        }
        return sum;
    }

    public int sumNegativeValues(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            if(number<0){
                sum += number;
            }
        }
        return sum;
    }

    public int multValues(int... numbers) {
        int sum = 1;
        for (int number : numbers) {
                sum *= number;
        }
        return sum;
    }

    public int restValues(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }

    public int divValues(int... numbers) {
        int sum = 1;
        for (int number : numbers) {
            sum /= number;
        }
        return sum;
    }
}
