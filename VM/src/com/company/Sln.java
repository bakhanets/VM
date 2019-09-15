package com.company;

import java.util.Scanner;

public class Sln {

    public Sln(int a){

        switch ( a ){
            case 1: Dichotomy();
                break;
            case 2:Chord();
                break;
            case 3:Newton();
                break;

            default:System.out.print("Указано неверное число");
        }
    }

    public void  Dichotomy(){
        System.out.print("Вы используете метод Дихотомии");
        Scanner in=new Scanner(System.in);

        System.out.print("Введите функцию в аналитическом виде");
        String fnk=in.nextLine();

        System.out.print("Введите границы отрезка [A,B]");
        double a=in.nextDouble();
        double b=in.nextDouble();

        System.out.print("Введите погрешность функции");
        double e=in.nextDouble();


    }

    public void Chord(){
        System.out.print("Вы используете метод Хорд");
    }

    public void Newton(){
        System.out.print("Вы используете метод Ньютона");
    }

}
