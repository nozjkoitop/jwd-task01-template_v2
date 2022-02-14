package com.epam.jwd.task2;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        Output output = new Output();


        // 2 task

        double firstDoubleValue = input.inputDoubleByScanner("Enter first Double Value value...");
        double secondDoubleValue = input.inputDoubleByScanner("Enter second Double Value value...");
        double thirdDoubleValue = input.inputDoubleByScanner("Enter third Double Value value...");
        double secondTaskResult = logic.task2(firstDoubleValue, secondDoubleValue, thirdDoubleValue);
        output.showDoubleValue("Second task result -> ", secondTaskResult);

        // 5 task

        double[] fifthTaskResult = logic.task5(firstDoubleValue, secondDoubleValue, thirdDoubleValue);
        output.showArrayOfDoubleValues("Fifth task result -> ", fifthTaskResult);

        // 6 task

        int firstIntValue = input.readIntValue(1);
        int secondIntValue = input.readIntValue(2);
        int thirdIntValue = input.readIntValue(3);
        int sixthTaskResult = logic.task6(firstIntValue, secondIntValue, thirdIntValue);
        output.showIntValue("Sixth task result -> ", sixthTaskResult);

    }
}
