package ru.javalearning;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Инициализация переменных
    
        {

            //Выводим сообщение в консоль
            System.out.println("Давайте посчитаем сумму двух чисел? Введите два числа:");

            // Визуальный разделитель
            System.out.println("-------------------------------------------------------");

            //Объявление двух переменных, где doule позволяет вводить не только целые числа
            double a = 0;
            double b = 0;

            //Создание сканера
            Scanner in = new Scanner(System.in);

            //Ввод чисел через точку, а не запятую
            in.useLocale(Locale.ENGLISH);

            // Ввод первого числа
            System.out.println("Введите сюда первое число и нажмите ENTER: ");
            a = in.nextDouble();

            //Ввод второго числа
            System.out.println("Введите сюда второе число и нажмите ENTER: ");
            b = in.nextDouble();

            //Вывод суммы введённых чисел
            System.out.println("Сумма введённых чисел равна:  " + (a + b));
        }
	}
}