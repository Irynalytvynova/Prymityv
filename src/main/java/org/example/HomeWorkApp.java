package org.example;
import org.example.fruits.Fruits;

public class HomeWorkApp {
    public static void main(String[] args) {
        Fruits fruits = new Fruits();
        //надрукувати в стовпець у три слова: Orange, Banana, Apple.
        fruits.printThreeWords();

        //підсумувати змінні
        checkSumSign();

        //вивести повідомлення кольору
        printColor();

        //порівняти числа
        compareNumbers();

        //порівняти суму чисел
        System.out.println(compareSum(55, 34));

        //перевірити чи додатнє число, чи від’ємне
        checkNumber(7);

        //перевірити чи додатнє число, чи від’ємне
        System.out.println(checkNumberSign(-7));

        //надрукувати в консоль зазначений рядок, вказану кількість разів
        repeatStrinf("Hello ! ", 5);

    }

    public static void checkSumSign(){
        int a = 6;
        int b = -73;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сума позитивна");
        }
        System.out.println("Сума негативна");
    }

    public static void printColor(){
        int value;
        value = 5;
        if(value <= 0){
            System.out.println("Червоний");
        } else if(value >= 0 && value <= 100){
            System.out.println( "Жовтий");
        }else if (value > 100){
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers(){
        int a, b;
        a = 56;
        b = 32;
        if (a >= b){
            System.out.println("a >= b");
        }
        System.out.println("a < b");
    }

    public static boolean compareSum(int one, int two){
        int sum = one + two;
        if (sum >=10 && sum <= 20){
            return true;
        }return false;

    }

    public static void checkNumber(int number){
        if (number < 0){
            System.out.println("Число від’ємне");
        }
        System.out.println("Число додатнє");

    }

    public static boolean checkNumberSign(int number){
        if (number < 0){
            return true;
        } return false;
    }

    public static  void repeatStrinf(String string, int number){
        String result = "";
        for (int i = 0; i < (number); i++){
            result = result + string;

        }System.out.println(result);
    }
}