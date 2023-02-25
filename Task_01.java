import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список.*/

public class Task_01 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        random_list(linkedList, 10, 1, 99);
        
        invertedList(linkedList); // решение через метод вручную.

        Collections.reverse(linkedList); // решение через встроенный метод
        System.out.println(linkedList);
    }

    /////////////////////функции////////////////////////////////////
    /////////функция создает радомный массив
    public static void random_list(LinkedList<Integer> list, int sise, int start, int and) {
        var rndel = new Random();
        for (int i = 0; i < sise; i++) {
            list.add(rndel.nextInt(start, and));
        }
        System.out.println(list);
    }    
    ///////////////////////метод переворачивает список/////////////
    public static void invertedList(LinkedList<Integer> list)
    {   LinkedList<Integer> invertedList = new LinkedList<>();
        int k=0;        
        for (int i = list.size()-1; i >= 0; i--) {
            invertedList.add(k++, list.get(i));    
        } 
        System.out.println(invertedList);
    }   

}