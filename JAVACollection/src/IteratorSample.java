import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class IteratorSample {

	public static void main(String[] args) {
		 // 集合物件HashSet宣告
	      HashSet<String> hset = new HashSet<>();
	      hset.add("陳會安");  hset.add("江小魚");
	      hset.add("陳允傑");
	      System.out.println("HashSet內容: " + hset);
	      HashMap<String,String> hmap= // 集合物件HashMap宣告
	                             new HashMap<>();
	      hmap.put("Joe", "陳會安");
	      hmap.put("Jane", "江小魚");
	      hmap.put("Jason", "陳允傑");
	      System.out.println("HashMap內容: " + hmap);
	      // 使用Iterator介面顯示HashSet元素
	      Iterator<String> iterator = hset.iterator();
	      System.out.print("HashSet集合(iterator):");
	      while (iterator.hasNext())
	         System.out.print(" "+iterator.next());
	      System.out.println();
	      // 使用Iterator介面顯示Keys元素
	      Set<String> keys = hmap.keySet();
	      Iterator<String> iterator1 = keys.iterator();
	      System.out.print("HashMap的Keys集合(iterator):");
	      while (iterator1.hasNext())
	         System.out.print(" "+iterator1.next());
	      System.out.println();
	}
}
