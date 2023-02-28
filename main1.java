package ru.javalearning;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
     //Проверка чётности числа
        Scanner in = new Scanner(System.in);

        System.out.println("Ввеедите число и нажмите ENTER:");
        double value = in.nextDouble();

        if(value%2 == 0){

            System.out.println("Вы ввели чётное число");
        } else {
            System.out.println("Вы ввели нечётное число");
        }  
	}
}