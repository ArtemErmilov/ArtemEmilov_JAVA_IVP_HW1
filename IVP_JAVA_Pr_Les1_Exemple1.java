package Practice.IVP_JAVA_HW001;

import java.util.Scanner;

/*
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:

1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.

Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
значение и покажет читаемый результат пользователю. Например, если вернулся -2,
пользователю выведется сообщение: “Искомый элемент не найден”.
 */

public class IVP_JAVA_Pr_Les1_Exemple1 {

    public static int inDataInt(String textPrint) { // Ввод данных в формате int
        String data;
        
        while (true) {
            
            try {
                System.out.print(textPrint);
                Scanner scanner = new Scanner(System.in, "cp866");
                data = scanner.nextLine();
                return Integer.parseInt(data);
               

            } catch (Exception e) {
                System.out.println("Данные введены не правильно");
                continue;
            }
        }
        
        //scanner.close();
       

    }

    public static int searchArray(int[] array, int searchNumber) {

        if (array.length < 1) {

            return -1;
        } else if (array == null) {
            return -3;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {

                return i;
            } else if (array[i]<0 || searchNumber<0) {
                return -4;
            }

        }

        return -2;

    }

    public static void main(String[] args) {

        int [] array = new int [] { 5, 8, 10, 20, 13, 45, 6}; 
        
        int searchNumber = inDataInt("Введите число для поиска : ");

        int searchIndexArray = searchArray(array, searchNumber);

        if (searchIndexArray >= 0){System.out.printf("Искомое число %d находится в массиве на позиции %d\n",searchNumber, searchIndexArray);}

        else if (searchIndexArray == -1){System.out.println("Маленькая длина массива.");}
        else if (searchIndexArray == -2){System.out.println("Искомый элемент не найден.");}
        else if (searchIndexArray == -3){System.out.println("Массива не существует.");}
        else if (searchIndexArray == -4){System.out.println("В запросе или в массиве есть отрицательные числа");}
    }

}
