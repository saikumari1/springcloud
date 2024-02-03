package copllections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("null");
          System.out.println("LinkedHashSet elements:"+set);
          System.out.println(set.contains("Banana"));
          set.remove("Orange");
          System.out.println("LinkedHashSet elements:"+set);
          Iterator<String>it = set.iterator();
          while(it.hasNext()) {
        	  System.out.println(it.next());
          }
          System.out.println("updated LinkedHashSet elements:"+set);
}
}

