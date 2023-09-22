import java.util.*;

public class Main {

    static Random rand = new Random();

    public static void main(String[] args) {
        arrayList(2000000);
        linkedList(2000000);
        hashTable(2000000);
    }
    public static void arrayList(int num){
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<num; i++){
            arr.add(rand.nextInt(num + 1));
        }
        System.out.println("ArrayList Size: " + arr.size());

        Iterator itr = arr.iterator();

        while (itr.hasNext()) {
            if(arr.contains(itr.next())) {
                System.out.println("Size: " + arr.size());
                itr.remove();
            }
        }
        System.out.println("ArrayList Cleared");
    }
    public static void linkedList(int num){
        LinkedList<Integer> arr = new LinkedList<>();

        for(int i=0; i<num; i++){
            arr.add(rand.nextInt(num + 1));
        }
        System.out.println("LinkedList Size: " + arr.size());

        Iterator itr = arr.iterator();

        while (itr.hasNext()) {
            if(arr.contains(itr.next())){
                itr.remove();
            }
        }
        System.out.println("LinkedList Cleared");
    }
    public static void hashTable(int num){
        Hashtable<Integer, Integer> arr = new Hashtable<>();

        for(int i=0; i<num; i++){
            arr.put(i,rand.nextInt(num + 1));
        }
        System.out.println("HashTable Size: " + arr.size());

        Iterator itr = arr.keys().asIterator();

        while (itr.hasNext()) {
            arr.remove(itr.next());
        }
        System.out.println("HashTable Cleared" + arr);
    }
}