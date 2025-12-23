package TreeSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIterationExample {
   public static void main(String[] args){
    TreeSet<String> names = new TreeSet<>();
    names.add("Johnny");
    names.add("Ivy");
    names.add("Ricky");
    names.add("David");

    System.out.println("Iterator");
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
        String name = iterator.next();
        System.out.println(name);
    }

    System.out.println("For");
    for (String name : names) {
        System.out.println(name);
    }
    
   } 
}