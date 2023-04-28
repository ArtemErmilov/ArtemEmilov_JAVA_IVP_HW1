package Practice.IVP_JAVA_HW001;

/*
 Задание 0.
 Реализуйте метод, принимающий в качестве аргумента
целочисленный массив.
Если длина массива меньше некоторого заданного минимума,
метод возвращает -1, в качестве кода ошибки, иначе - длину
массива.
 */

public class IVP_JAVA_Pr_Les1_Exemple0 {

    public static int ShowArray(int [] array, int minArrayLight){
        if (array == null || array.length< minArrayLight || array.length< 1) {

            return -1;
            
        } else {
            return array.length;
        }

    }
    
}
