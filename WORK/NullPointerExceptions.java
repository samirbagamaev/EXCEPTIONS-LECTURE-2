/*
Исключения в программировании и их обработка (лекции)
Урок 2. Исключения и их обработка
*/

package WORK;

//NullPointerException - Обращение к несуществующему объекту

public class NullPointerExceptions {

    public static void main(String[] args) {
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);
    }
}