package Practice.IVP_JAVA_HW001;

/*
 * 
    Задание №7 (доп)
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
возвращающий новый массив, каждый элемент которого равен сумме элементов двух
входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class IVP_JAVA_Pr_Les1_Exemple7 {

    public static int [] sumArray(int [] array1, int [] array2) {

        if (array1.length != array2.length){ 
            
            throw new RuntimeException("Массивы не равны друг другу");
            
        }

        int[] sumArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {

            sumArray [i]=array1[i]+array2[i];
            
        }

        return sumArray;
        
    }


    
}
