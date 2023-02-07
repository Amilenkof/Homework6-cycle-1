public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача 1.");
        /*Задача 1
С помощью цикла for выведите в консоль все числа от 1 до 10.*/
        for (int i=1;i<=10;i++) {
            System.out.println("Значение переменной i равно "+i);
        }
    }
    public static void task2() {
        System.out.println("Задача 2.");
         /*Задача 2
С помощью цикла for выведите в консоль все числа от 10 до 1.*/
        for (int i=10;i>=1;i--) {
            System.out.println("Значение переменной i равно "+i);
        }
    }
    public static void task3() {
        System.out.println("Задача 3.");
/*Задача 3
Выведите в консоль все четные числа от 0 до 17.*/
        for (int i=0;i<=17;i+=2) {
                System.out.println("Четное число "+i);
            }
        }

    public static void task4 () {
        System.out.println("Задача 4.");
/*Задача 4
Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.*/
        for (int i=10;i>=-10;i--) {
            System.out.println(i);
        }
    }
    public static void task5() {
        System.out.println("Задача 5.");
    /*Задача 5
Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат
должен выводиться в формате: «… год является високосным».    */
        for (int year = 1904; year <=2096 ; year+=4) {
            if (year%4==0 && year%100!=0 || year%400==0)
                System.out.println( year+ " год является високосным");
            }
        }
    public static void task6 () {
        System.out.println("Задача 6.");
    /*Напишите программу, которая выводит в консоль последовательность чисел:

7 14 21 28 35 42 49 56 63 70 77 84 91 98*/
        for (int i=7;i<=98;i+=7) {
            System.out.println(i);
        }
    }
    public static void task7() {
        System.out.println("Задача 7.");
    /*Задача 7
Напишите программу, которая выводит в консоль последовательность чисел:1 2 4 8 16 32 64 128 256 512*/
        for (int i =1;i<=512;i=i*2) {
            System.out.println(i);
        }
    }
    public static void task8(){
        System.out.println("Задача 8.");
    /*Задача 8
Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».*/
        int savings=0; //In Month
        for (int month=1;month<=12;month++){
            savings+=29_000;
            System.out.println("Месяц "+ month+",сумма накоплений равна "+savings+" рублей");
        }
    }
    public static void task9 () {
        System.out.println("Задача 9.");
    /*Задача 9
Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12%
 годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей». */
        double addSaves=29_000;
        double savings=0;
        for (int month=1;month<=12;month++) {
            //double onePecent=addSaves/100;
            savings=savings+addSaves+(savings*0.01);
            System.out.println("Месяц "+ month+",сумма накоплений равна "+savings+" рублей");
        }
    }
    public static void task10 () {
        System.out.println("Задача 10.");
/*    Задача 10
Напишите программу, которая выводит в консоль таблицу умножения на 2:
2*1=2 2*2=4  2*3=6  2*4=8 2*5=10 2*6=12 2*7=14 2*8=16 2*9=18 2*10=20     */
        for (int i=1; i<=10;i++) {
            System.out.println("2*"+i+"="+2*i);
        }
    }
}
