package treesetexamples;

import java.util.Comparator;
import java.util.TreeSet;

// https://codegym.cc/groups/posts/treeset-in-java
public class TreeSetRangeSearchExample {

    public static void main(String[] args) {
        java.util.TreeSet<Integer> numbers = new java.util.TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        // Range search: find all elements between 20 and 40
        TreeSet<Integer> subset = new TreeSet<>(numbers.subSet(3, 8));
        System.out.println("Subset of numbers between 3 and 8: " + subset);

        TreeSet<Integer> headset = new TreeSet<>(numbers.headSet(6));
        System.out.println("Returns a subset of elements less than toElement.: " + headset);

        TreeSet<Integer> tailset = new TreeSet<>(numbers.tailSet(5));
        System.out.println("Returns a subset of elements greater than or equal to fromElement: " + tailset);

        TreeSet numbers2 = new TreeSet<>();
        numbers2.add(10);
        numbers2.add(40);
        numbers2.add(20);
        numbers2.add(30);

        System.out.println("TreeSet: " + numbers2);
        System.out.println("First element: " + numbers2.first());
        System.out.println("Last element: " + numbers2.last());

        TreeSet numbers3 = new TreeSet<>();
        numbers3.add(15);
        numbers3.add(10);
        numbers3.add(25);
        numbers3.add(20);

        System.out.println("TreeSet: " + numbers3);
        System.out.println("ceiling(18): " + numbers3.ceiling(18));
        System.out.println("floor(18): " + numbers3.floor(18));
        System.out.println("higher(20): " + numbers3.higher(20));
        System.out.println("lower(25): " + numbers3.lower(15));

        TreeSet numbers4 = new TreeSet<>();
        numbers4.add(5);
        numbers4.add(15);
        numbers4.add(25);

        System.out.println("TreeSet: " + numbers4);
        System.out.println("pollFirst(): " + numbers4.pollFirst());
        System.out.println("pollLast(): " + numbers4.pollLast());
        System.out.println("TreeSet after pollFirst and pollLast: " + numbers4);

        TreeSet<String> names = new TreeSet<>(new LengthComparator());
        names.add("Johnny");
        names.add("Ivy");
        names.add("Ricky");
        names.add("David");
        System.out.println("TreeSet with custom comparator: " + names);

        TreeSet<String> names1 = new TreeSet<>();
        names1.add("Johnny");
        names1.add("Ivy");
        names1.add("Ricky");
        names1.add("David");
        TreeSet<String> shortedNames = new TreeSet<>(Comparator.reverseOrder());
        shortedNames.addAll(names1);
        System.out.println("TreeSet with reverse order: " + shortedNames);
        System.out.println(names1);


    }
}