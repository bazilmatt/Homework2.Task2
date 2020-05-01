import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.WrongMethodTypeException;
import java.math.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 *Составить программу, генерирующую N случайных чисел.
 * Для каждого числа k вычислить квадратный корень q.
 * Если квадрат целой части q числа равен k, то вывести это число на экран.
 * Предусмотреть что первоначальные числа могут быть отрицательные,
 * в этом случае генерировать исключение.
 *
 @version 0.0.1
 @author Vasiliy Matveev */

public class Homework2Task2 {

    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            double[] randomArray = new double[index];
            for (int i = 0; i < index; i++) {
                randomArray[i] = (Math.random() * 100-40);
                //System.out.println(randomArray[i]);
            }
            for (double d:randomArray) {
                try {
                   // System.out.println("_____________________");
                    if (Math.pow(getSqrt(d),2)==(int)d){
                        System.out.println("Квадрат целой части квадратного корня равен числу = "+ (int)d);

                    }


                } catch (WrongMethodTypeException e) {
                    System.out.println("Получено отрицательное число: "+d);
                }
            }

    }
    /** Возвращает квадратный корень числа.
     * В случае передачи отрицательного значения - вернут WrongMethodTypeException */
    static int getSqrt(double x) throws WrongMethodTypeException {
        if (x<0){
            throw new WrongMethodTypeException();
        } else {
            int sqrtx = (int) Math.sqrt(x);
          //  if (Math.pow(sqrtx,2)==(int)x){
          //     return (int)x;
            return sqrtx;
            }

        }
    }

