import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


//3* В калькулятор добавьте возможность отменить последнюю операцию.
public class Task_03 {
    public static void main(String[] args) {
        // Переменные
        Scanner sc = new Scanner(System.in);
        float x = 0, y = 0, result = 0;
        String sign = "", formula = "";

        LinkedList<String> listLk = new LinkedList<>();
        Deque<Float> rezultList = new LinkedList<>();

        
        while (!formula.equalsIgnoreCase("q")) {
            System.out.println("Введите выражение для вычеления отеля знаяения пробелом или нажмите Q для выхода: ");
            formula = sc.nextLine();
            
            //проверка ввода
            if (formula.equalsIgnoreCase("q")){
                System.exit(0);                
            }
            else if(formula.equalsIgnoreCase("l")){
                formula = rezultList.getLast() + " " + sc.nextLine();
                System.out.println(formula);
            }
            else if(formula.equalsIgnoreCase("b")){
                System.out.println(rezultList.pollLast());
                System.out.println(rezultList);
                continue;
            }

            String[] list = formula.split(" ");
            for (int i = 0; i < list.length; i++) {
                listLk.offer(list[i]);
            }

            x = Float.parseFloat(listLk.get(0));
            sign = listLk.get(1);
            y = Float.parseFloat(listLk.get(2));
            listLk.clear();

            result = calculator(x, y, sign);
            System.out.println(result);
            rezultList.offer(result);
            System.out.println(rezultList);
            
            System.out.println("Если вы хотите использовать последний результат для вычелений нажмите L, если вы хотите удалить результат последнего действия ведтие B: ");
                        
        }
        sc.close();
    }

/// функция калькулятор
    public static Float calculator(Float x, Float y, String sign) {
        float result = 0;
        switch (sign) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;            
        }
        return result;
    }

}
