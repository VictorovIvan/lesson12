package task02;

import java.util.ArrayList;
import java.util.List;

/**
 * Class CallOutOfMemory
 */
class CallOutOfMemory {
    private StringBuilder someString = new StringBuilder("Some string");
    private StringBuilder someNewString = new StringBuilder();
    private Integer counter_sum = 0;
    private Integer counter_sub = 0;
    private final static Integer SUM_COUNTER = 1000;
    private final static Integer SUB_COUNTER = 80;

    /**
     *  Generator Error : OutOfMemory(Java Heap Space) in PermGenOutOfMemory
     */
    void generatePermGenOutOfMemory() {
        List<String> list = new ArrayList<>();
        int increment = 0;
        while (true) {
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
            list.add(((someNewString.toString()) + (increment++)).intern());
            System.out.println("Свободная память: " + Runtime.getRuntime().freeMemory());
        }
    }
}
