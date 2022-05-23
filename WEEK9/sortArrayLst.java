import java.util.*;
public class sortArrayLst {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<String>();
        name.add("Al-Fareed");
        name.add("Ashuthosh");
        name.add("Nidhi");
        name.add("Alwyn");
        name.add("Toiiba");
        name.add("Olwin");
        name.add("Saurav");
        System.out.println("Before sorting:");
        System.out.println("----------------------------------------------");
        for(int i=0;i<name.size();i++)
        {
            System.out.println(name.get(i));
        }
        Collections.sort(name);
        System.out.println("----------------------------------------------");
        System.out.println("After sorting:");
        Iterator itr=name.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("------------List Iterator-----------------------");
        ListIterator list=name.listIterator(name.size());
        while(list.hasPrevious())
        {
            System.out.println(list.previous());
        }
    }
}
