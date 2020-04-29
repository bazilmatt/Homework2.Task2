import java.math.*;
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

    public static void main(String[] args) {
        double[] randomArray = new double[10];
        for (int i=0; i <randomArray.length ; i++) {
            randomArray[i]=(Math.random()*100)-50;
            System.out.println(randomArray[i]);
        }
        for (int i=0; i<=randomArray.length; i++){
            try{
                System.out.println(getSqrt(randomArray[i]));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Получено отрицательное число");
            }
        }

    }
    /** Возвращает квадратный корень числа.
     * В случае передачи отрицательного значения - вернут IndexOutOfBoundsException */
    static double getSqrt(double x) throws IndexOutOfBoundsException{
        if (x<0){
            throw new IndexOutOfBoundsException();
        }
        return Math.sqrt(x);
    }
}
