package task02;

/**
 * <p>Задание 1. Необходимо создать программу, которая продемонстрирует утечку памяти в Java.
 * При этом объекты должны не только создаваться, но и периодически частично удаляться,
 * чтобы GC имел возможность очищать часть памяти. Через некоторое время программа должна
 * завершиться с ошибкой OutOfMemoryError c пометкой Java Heap Space.</p>
 * <p>Задание 2. Доработать программу так, чтобы ошибка OutOfMemoryError возникала в Metaspace /Permanent Generation</p>
 */
public class Task02 {
    public static void main(String[] args) {
        CallOutOfMemory callOutOfMemoryPermGen = new CallOutOfMemory();
        callOutOfMemoryPermGen.generatePermGenOutOfMemory();
    }


}
