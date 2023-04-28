package Practice.IVP_JAVA_HW001;

/*
 * Задание №2
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.

При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.

Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
ошибке.

 */

public class IVP_JAVA_Pr_Les1_Exemple2 {

    public static int randomInt() { // Выводит 0 или 1
        Double numberRand = Math.random();

        if (numberRand >= 0.5) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int sumDoubleArray(int[][] doubleArray) {

        int sumNumber = 0;

        if (doubleArray.length != doubleArray[0].length) {
            throw new RuntimeException("Массив не является квадратны!");
        }

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {

                if (doubleArray[i][j]>1){
                    throw new RuntimeException("Значения в массиве больше 1.");
                }
                sumNumber = sumNumber + doubleArray[i][j];
            }

        }

        return sumNumber;
    }

    public static void main(String[] args) {

        int[][] doubleArray = new int[5][5];

        for (int i = 0; i < doubleArray.length; i++) { // Заполнение 2-х мерного массива
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = randomInt();
            }

        }

        int number = sumDoubleArray(doubleArray);
        
        System.out.printf("Сумма значений 2-у мерного массива = %d\n", number);

    }

}
