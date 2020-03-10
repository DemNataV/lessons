package homeWork;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork0 {


    public static void main(String[] args) {


        //1
        System.out.println("Задание 1");
        int n = 333;
        int z = n % 10 + ((n % 100 - n % 10) / 10) + n / 100;
        System.out.println(z);

        //2
        System.out.println("Задание 2");
        if (n % 2 == 0) System.out.println("четное");
        else System.out.println("нечетное");

        //3
        System.out.println("Задание 3");
        int m = 123;
        if (n < m) {
            int res = n;
            System.out.println(res);
        } else if (n > m) {
            int res = m;
            System.out.println(res);
        } else System.out.println("значения равны");

        //4
        System.out.println("Задание 4");
        int programNum1 = (int) (Math.random() * 114) + 6;
        if (programNum1 > 24 && programNum1 < 101) System.out.printf("Число " + programNum1 + " содержится в интервале (25;100)");
        else System.out.println("Число " + programNum1 + " не содержится в интервале (25;100)");

        //5
        System.out.println("Задание 5");
        int programNum2 = (int) (Math.random() * 899) + 101;
        //int programNum2 = 555;
        int z1 = programNum2 % 10;
        int z2 = (programNum2 % 100 - programNum2 % 10) / 10;
        int z3 = programNum2  / 100;

        if (z1 >= z2 && z1 >= z3) System.out.println("В числе " + programNum2 + " наибольшая цифра " + z1);
        else if (z2 >= z1 && z2 >= z3) System.out.println("В числе " + programNum2 + " наибольшая цифра " + z2);
        else  System.out.println("В числе " + programNum2 + " наибольшая цифра " + z3);

        //6
        System.out.println("Задание 6");
        for (int i = 1000; i < 10000; i = i + 3) System.out.println(i);

        //7
        System.out.println("Задание 7");
        for (int i = 1; i < 56; i++) System.out.println(1+i*2);

        //8
        System.out.println("Задание 8");
        for (int i = 95; i > 0; i = i - 5) System.out.println(i);

        //9
        System.out.println("Задание 9");
        for (int i = 1; i < 21; i++) System.out.println((int) Math.pow(2, i));

        //10
        System.out.println("Задание 10");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        BigInteger num = BigInteger.valueOf(in.nextInt());
        BigInteger factorialnum = BigInteger.valueOf(1);

        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(num) <= 0; i = i.add(BigInteger.valueOf(1)))  {
            factorialnum =  i.multiply(factorialnum);

        }
        System.out.println(factorialnum);




        //11
        System.out.println("Задание 11");
        int res1 = 0;
        int res2 = 1;
        System.out.println(res1);
        System.out.println(res2);
        for (int i = 1; i < 10; i++) {
          int  res3 = res1 + res2;
            System.out.println(res3);
            res1 = res2;
            res2= res3;
        }

        //12
        System.out.println("Задание 12");
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int count = 0;

        while (n1 < 3){
            while (n2 < 10 && n1 * 10 + n2 < 24) {
                while (n3 < 6 ) {
                    while (n4 < 10) {
                        if (n1 == n4 && n2 == n3) {
                            System.out.println(n1 + "" + n2 + ":" + n3 + "" + n4);
                            count++;
                        }
                        n4++;
                    }
                    n3++;
                    n4 = 0;
                }
                n2++;
                n3 = 0;
            }
            n1++;
            n2 = 0;
        }
        System.out.println(count);

    }
}
