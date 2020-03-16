package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkString {
    public static void main(String[] args) {

        {
            /* Даны 2 слова, состоящие из четного числа букв.
            Получить слово состоящее из первой половины первого слова и второй половины второго слова.*/
            System.out.println("задание 1");
            String str1 = "прикол";
            String str2 = "фермер";
            System.out.println(str1.substring(0,str1.length()/2) + str2.substring(str2.length()/2, str2.length()));
        }

        {
            /* Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.*/
            System.out.println("задание 2");
            String str = "У нас дома очень холодно";
            String[] strings = str.split("\\s");
            int n = 0;
            int m = 0;
            for (int i = 0; i < strings.length ; i++) {
                if (strings[i].length() > n) {
                    n = strings[i].length();
                    m = i;
                }
            }
            System.out.println(strings[m]);
        }

        {
            /* Имеются две строки. Найти количество вхождений одной строки в другую.*/
            System.out.println("задание 3");
            String str1 = "ток";
            String str2 = "Ток, идущий по проводам - поток электронов, все равно, что поток воды в трубе";
            int n = 0;
            for (int i = 0; i < str2.length() - str1.length(); i++) {
                if (str2.substring(i,i+str1.length()).equals(str1)) n++;
            }
            System.out.println(n)
            ;
        }

        {
            /* Написать функцию, которая проверяет, является ли строка палиндромом.
            Палиндром — это слово или фраза, которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.*/
            System.out.println("задание 4");
            Scanner in = new Scanner(System.in);

            System.out.println("Введите слово, фразу или текст и я определю палиндром ли это");
            String str1 = in.nextLine();
            str1 = str1.replaceAll("\\,|\\.|\\!|\\?|\\;|\\:|\\-|\\…", "");
            str1 = str1.toLowerCase();
            String str = str1.replaceAll(" ", "");

            int n = 0;
            for (int i = 0; i < (int) str.length()/2 ; i++) {
                if (str.charAt(i) == str.charAt(str.length()-i-1)) {
                    n++;
                }

            }
            if (n == (int) str.length()/2 && str1.indexOf(" ") < 0) {
                System.out.println("Слово является палиндромом");
            }
            else if (n == (int) str.length()/2 && str1.indexOf(" ") > 0) {
                System.out.println("Фраза является палиндромом");
            }
            else {
                String[] strings = str1.split("\\s");
                int n1 = 0;
                for (int i = 0; i < (int) strings.length/2 ; i++) {
                    if (strings[i].equals(strings[strings.length-i-1])) n1++;
                }
                if (n1 == (int) strings.length/2 && str1.indexOf(" ") > 0) System.out.println("Текст является палиндромом");
                else System.out.println("Это не палиндромом");
            }
//Пример слова: шабаш
//Пример фразы: Я иду съ мечемъ судия
//Пример текста: Жестоко раздумье. Ночное молчанье Качает виденья былого, Мерцанье встречает улыбки сурово, Страданье Глубоко-глубоко! Страданье сурово улыбки встречает… Мерцанье былого виденья качает… Молчанье. Ночное раздумье жестоко
        }

        {
            /* Даны два слова и словарь (массив слов).
            Необходимо найти алгоритм превращения в другое, меняя за один шаг одну букву, причем каждое новое слово должно быть в словаре (массиве слов).
            Например,даны слова "hit" и "cog" и словарь(массив слов) ["hot", "dot", "dog", "log", "lot"].
            Один из вариантов цепочки: "hit"->"hot"->"dot"->"dog"->"cog".*/
            System.out.println("задание 5");
        }

        {
            /*Пользователь вводит названия городов через пробел. Вы их присваиваете переменной.
            Переставьте названия так, чтобы они были упорядочены по алфавиту. */
            System.out.println("задание 6");
        }


    }
}
