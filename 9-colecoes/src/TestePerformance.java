
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class TestePerformance {

    public static void main(String args[]) {

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();

        // ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration);

        // LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration);

        
        // HashSet add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("HashSet add: " + duration);
        
        
        // ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get:  " + duration);

        // LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get: " + duration);
        
        // HashSet "get"
        startTime = System.nanoTime();

        for (Iterator iterator = hashSet.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("HashSet 'get': " + duration);

        // ArrayList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove:  " + duration);

        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration);
        
        // HashSet remove
        startTime = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("HashSet remove: " + duration);
    }
}
