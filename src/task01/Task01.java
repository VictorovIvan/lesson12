package task01;

/**
 * Задание 1. Необходимо создать программу, которая продемонстрирует утечку памяти в Java.
 * При этом объекты должны не только создаваться, но и периодически частично удаляться,
 * чтобы GC имел возможность очищать часть памяти. Через некоторое время программа должна
 * завершиться с ошибкой OutOfMemoryError c пометкой Java Heap Space.
 */

public class Task01 {
    public static void main(String[] args) {
        CallOutOfMemory callOutOfMemory = new CallOutOfMemory();
        callOutOfMemory.generateOutOfMemory();
    }
}
