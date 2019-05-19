package task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Class CallOutOfMemory
 */
class CallOutOfMemory {
    private StringBuilder someString = new StringBuilder("Some string");
    private Integer counter_sum = 0;
    private Integer counter_sub = 0;
    private final static Integer SUM_COUNTER = 5000;
    private final static Integer SUB_COUNTER = 90;

    /**
     * Generator Error : OutOfMemory(Java Heap Space)
     */
    void generateOutOfMemory() {
        List<String> list = new ArrayList<>();
        while (true) {
            StringBuilder someNewString = someString;
            counter_sum++;
            if (counter_sum.equals(SUM_COUNTER)) {
                counter_sum = 0;
                someString.append(someString);
                someString.append(someNewString);
            }
            counter_sub++;
            if (counter_sub.equals(SUB_COUNTER)) {
                counter_sub = 0;
                list.remove(list.size() - 1);
            }
            list.add(someNewString.toString());
            System.out.println("Свободная память:: " + Runtime.getRuntime().freeMemory());
        }
    }
}
