import java.util.LinkedList;
public class collectinll {
    public static void main(String[] args) {
       LinkedList<String> list =new LinkedList<>();
       list.addFirst("a");
       list.addFirst("is");
        System.out.println(list);
        System.out.println(list.size());
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
