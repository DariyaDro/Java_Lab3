import java.util.List;

/**Класс для подсчета времени
 * для методов классов ArrayList и LinkedList
 */
class Timer_for_methods {
    private long start;
    private long stop;

    /**Подсчет времени для метода add(Element)*/
    public long timer_add(List<Integer> list, int cnt){
        start=System.currentTimeMillis();
        for(int i=0; i<cnt; i++){
            list.add(1);
        }
        stop=System.currentTimeMillis();
        return stop-start;
    }
    /**Подсчет времени для метода add(Index, Element)*/
    public long timer_add_with_index(List<Integer> list, int cnt){
        start=System.currentTimeMillis();
        for(int i=0; i<cnt; i++){
            list.add(i, 1);
        }
        stop=System.currentTimeMillis();
        return stop-start;
    }
    /**Подсчет времени для метода remove(Index)*/
    public long timer_remove(List<Integer> list){
        start=System.currentTimeMillis();
        for(int i=list.size()-1; i>=0; i--){
            list.remove(0);
        }
        stop=System.currentTimeMillis();
        return stop-start;
    }
    /**Подсчет времени для метода get(Index)*/
    public long timer_get(List<Integer> list){
        start=System.currentTimeMillis();
        for(int i=0; i<list.size(); i++){
            list.get(i);
        }
        stop=System.currentTimeMillis();
        return stop-start;
    }

}
