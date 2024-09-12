import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Set<Object> union(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static Set<Object> intersect(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static Set<Object> diff(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public static boolean isSubset(Set<Object> a, Set<Object> b) {
        return a.containsAll(b);
    }

    public static Set<String> cartesiano(Set<Object> a, Set<Object> b) {
        Set<String> result = new HashSet<>();
        for (Object elemA : a) {
            for (Object elemB : b) {
                result.add("(" + elemA + ", " + elemB + ")");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        Set<Object> setA = new HashSet<>();
        setA.add(1);
        setA.add(8);
        setA.add(9);

        Set<Object> setB = new HashSet<>();
        setB.add(1);
        setB.add(0);
        setB.add(5);

        System.out.println("Unión: " + union(setA, setB));
        System.out.println("Intersección: " + intersect(setA, setB));
        System.out.println("Diferencia (A - B): " + diff(setA, setB));
        System.out.println("¿B es subconjunto de A?: " + isSubset(setA, setB));
        System.out.println("Producto cartesiano: " + cartesiano(setA, setB));
    }
}
