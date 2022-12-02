import java.util.*;
/**Класс для сравнения времени выполнения методов
 * классов ArrayList и LinkedList
 * @author Дроздова Дария
 * */
public class Main {
    /**Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Timer_for_methods timer=new Timer_for_methods();
        System.out.printf("%25s %15s %15s\n", " ", "ArrayList", "LinkedList");
        System.out.printf("%25s %15s %15s\n", "add(Element)", timer.timer_add(arrayList, 10000), timer.timer_add(linkedList, 10000));
        System.out.printf("%25s %15s %15s\n", "remove(Index) ", timer.timer_remove(arrayList), timer.timer_remove(linkedList));
        System.out.printf("%25s %15s %15s\n", "add(Index, Element)", timer.timer_add_with_index(arrayList, 10000), timer.timer_add_with_index(linkedList, 10000));
        System.out.printf("%25s %15s %15s\n", "get(Index) ", timer.timer_get(arrayList), timer.timer_get(linkedList));
    }
}
