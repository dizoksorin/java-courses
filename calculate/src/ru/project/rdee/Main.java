package ru.project.rdee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int sum = first + second;
        System.out.println(sum);

        Calculator calculator = new Calculator();
        calculator.add(1,3,4);
        System.out.println(calculator.getResult());
    }

}
