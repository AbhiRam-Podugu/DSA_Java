import java.util.ArrayList;
import java.util.ListIterator;

class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        a.add(70);
        a.add(10);

        b.add(7);
        b.add(8);
        b.add(77);
        b.add(88);
        b.addAll(2,a);

        a.add(0,0);

        c.add(22);
        c.add(33);
        c.add(44);

        System.err.println("Before Clear List : " + c );

        c.clear();
        System.err.println(b);
        b.removeAll(a);
        System.err.println("b.removeAll(a) : " + b);
        System.err.println("c.clear() : " + c);
        a.remove(2);
        a.set(0,7);

        System.err.println(a);
        System.err.println(" a.contains() : " + a.contains(10));
        System.err.println("a.get(1//index) : " + a.get(1));
        System.err.println("a.indexOf(data) : " + a.indexOf(10));
        System.err.println("c.isEmpty() : " + c.isEmpty());
        System.err.println("a.lastIndexOf(data) : " + a.lastIndexOf(10));
        System.err.println("a.size() : " + a.size());
        System.err.println("a.sublist(0,4) : "+a.subList(0, 4));
        System.err.println(b);
        System.err.println(a); // a have all elements
        System.err.println(a.retainAll(b));
        System.err.println(a); // a have intersection elements


        ListIterator<Integer> it = b.listIterator();
        while(it.hasNext()) {
            System.err.println(it.next());
        }
        
    }
}