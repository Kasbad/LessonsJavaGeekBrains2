package ru.geekbreans.lesson1;

import java.util.Arrays;

public class main {

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        
        System.out.println(floatingPoint(a,b,c,d));
        System.out.println(comparison(a,b));
        System.out.println(positiveNumber(a));
        str("Игорь");
        System.out.println(leapYear(1992));

        int[] numeral = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(change(numeral)));

    }

    private static int[] change(int[] a){
        for(int i=0; i<a.length;i++){
            a[i] = a[i]== 0 ? 1 : 0;
        }
        return a;
    }

    private static double floatingPoint(double a,double b,double c,double d){
        return  a*(b+(c/d));
    }

    private static boolean comparison(int a, int b){
        return a + b > 9 && a + b < 21;
    }

    private static String positiveNumber(int a){
        String Str = "";
        if(a > -1) Str = "Положительное число";
        else Str = "Отрицательное число";
        return Str;
    }

    private static void  str(String a){
        System.out.println("Привет, " + a);
    }

    private static String leapYear(int a){
        String Str = "";
        if (a %100==0 && a %400 ==0 ) Str = "Высокосный год";
        else if (a % 4 == 0 && a % 100 > 0) Str = "Высокосный год";
        else if (a % 100 == 0) Str = "Обычный год";
        else Str = "Обычный год";
        return Str;
    }


}
/*
///////////////////////////////////////////////////////////////////////
Вопрос1: Написать метод вычисляющий выражение a * (b + (c / d))
и возвращающий результат с плавающей точкой,
где a, b, c, d – целочисленные входные параметры этого метода;
////////Реализация/////////////////////////////
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(floatingPoint(a,b,c,d));
    }
    private static double floatingPoint(double a,double b,double c,double d){
        return  a*(b+(c/d));
    }
/////////////////комментарий//////////////////////////
1 в задании было сказано что аргументы должны быть целочисленные
////////////////////////
моё предположение:
    private static double floatingPoint(int aa,int bb,int cc,int dd){
        double a = aa;
        double b = bb;
        double c = cc;
        double d = dd;
        return  a*(b+(c/d));
    }
    // незнаю что лучше здесь использовать double или float!?
    // с одной стороны теряется память, с другой точность.
//////////////////////////////////////////////////////////////////////////
Вопрос4: Написать метод, которому в качестве параметра передается строка,
обозначающая имя, метод должен вернуть приветственное сообщение
«Привет, переданное_имя!»; Вывести приветствие в консоль.
////////Реализация/////////////////////////////
public static void main(String[] args){
        str("Игорь");
    }
private static void  str(String a){
        System.out.println("Привет, " + a);
    }
/////////////////комментарий//////////////////////////
3 а что если нам в дальнейшем понадобится как то дополнительно работать
с этой информацией, или перевести, например,
на десяток разных языков - придётся переписывать метод?
////////////////////////////////////////////
моё предположение: нужно было строку присвоить отдельной переменной?  String Name = "Игорь"; str(Name)
//////////////////////////////////////////
Вопрос5: Написать метод, который определяет является ли год високосным.
Каждый 4-й год является високосным,
кроме каждого 100-го, при этом каждый 400-й – високосный.
Для проверки работы вывести результаты работы метода в консоль
////////Реализация/////////////////////////////
public static void main(String[] args){
        System.out.println(leapYear(1992));
    }

 private static String leapYear(int a){
        //String Str = "";
        if (a %100==0 && a %400 ==0 ) return "Высокосный год";
        else if (a % 4 == 0 && a % 100 > 0) return "Высокосный год";
        else if (a % 100 == 0) return "Обычный год";
        else return "Обычный год";
       // return Str;
    }
/////////////////комментарий//////////////////////////
5 аналогично второму - можно сократить эти условия и сразу
выводить результат из метода, аналогично третьему,
если надо будет переводить, или как то дальше использовать?
/////////////////////////////////////////////
моё предположение:
public static void main(String[] args){
        int Year = 1992;
        System.out.println(leapYear(Year));
    }

 private static String leapYear(int a){
        if (a %100==0 && a %400 ==0 ) return "Высокосный год";
        else if (a % 4 == 0 && a % 100 > 0) return "Высокосный год";
        else if (a % 100 == 0) return "Обычный год";
        else return "Обычный год";
    }
// Но это как то дико смотрится )
*/
