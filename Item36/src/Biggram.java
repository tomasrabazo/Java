import java.util.HashSet;
import java.util.Set;

public class Biggram {
    private final char first;
    private final char second;

    public Biggram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Biggram))
            return false;
        Biggram b = (Biggram) o;
        return b.first == first && b.second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args){

        Set<Biggram> s = new HashSet<Biggram>();
        for (int i=0;i<10;i++)
            for (char ch='a';ch<='z';ch++)
                s.add(new Biggram(ch,ch));
        System.out.println(s.size());
    }
}
