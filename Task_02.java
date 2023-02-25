import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/*2 Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.*/
public class Task_02 {

    public static void main(String[] args) {
        Queue <String> linkedList = new LinkedList<>();
        linkedList.offer("Первый");
        linkedList.offer("Второй");
        linkedList.offer("Третий");
        System.out.println(linkedList);
        
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите слово для добавления:");
        String element = sc.nextLine();
        
        enqueue(linkedList, element);

        dequeue(linkedList, element);

        first(linkedList, element);

        sc.close();
    }
    
    /////////помещает элемент в конец очереди
    public static void enqueue (Queue <String> list, String element) {
        list.add(element);
        System.out.printf("Добавили элемент в конец очереди: %s\n", list);        
    }
    ////////////////возвращает первый элемент из очереди и удаляет его
    public static void dequeue(Queue <String> list, String element){
        System.out.printf("Вернули первый элемент из очереди удалили его: %s\n", list.poll());
        System.out.println(list);
    }
    ///////////////возвращает первый элемент из очереди, не удаляя.
    public static void first(Queue <String> list, String element){
        System.out.printf("Вернули первый элемент из очереди: %s\n", list.peek());
    }
            
            
 
}
