package com.epam.jwd.task2;

public class Main {
    public static void main(String[] args) {

        Input input = new Input();
        Logic logic = new Logic();
        Output output = new Output();


        // 2 task

        double firstDoubleValue = input.inputDoubleByScanner("Enter first double value...");
        double secondDoubleValue = input.inputDoubleByScanner("Enter second double value...");
        double thirdDoubleValue = input.inputDoubleByScanner("Enter third double value...");
        double secondTaskResult = logic.formulaCalculation(firstDoubleValue, secondDoubleValue, thirdDoubleValue);
        output.showDoubleValue("Second task result -> ", secondTaskResult);

        // 5 task

        double[] fifthTaskResult = logic.nonNegativeSquaredNegativeToFourthDegree(firstDoubleValue, secondDoubleValue, thirdDoubleValue);
        output.showArrayOfDoubleValues("Fifth task result -> ", fifthTaskResult);

        // 6 task

        int firstIntValue = input.inputIntByScanner("Enter first int value...");
        int secondIntValue = input.inputIntByScanner("Enter second int value...");
        int thirdIntValue = input.inputIntByScanner("Enter third int value...");
        int sixthTaskResult = logic.maxAndMinSum(firstIntValue, secondIntValue, thirdIntValue);
        output.showIntValue("Sixth task result -> ", sixthTaskResult);

    }
}
