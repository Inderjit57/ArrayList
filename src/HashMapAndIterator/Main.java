package HashMapAndIterator;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name name = new Name("tree");
        Name name1 = new Name("Jupiter");
        Name name2 = new Name("Venus");
        Name name3 = new Name("earth");
        Name name4 = new Name("Mars");
        ArrayList<Name> nameList = new ArrayList<Name>();
        nameList.add(name);
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        for (int i=0; i<nameList.size();i++) {
        	System.out.println(nameList.get(i).getName());
        }
        
       // name.start();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(32);
        list.add(43);
        System.out.println(list);
        
        HashMap<String,Integer> hash = new HashMap<String,Integer>();
        HashMap<String,String> hashString = new HashMap<String,String>();
        hash.put("Inder", 23);
        hash.put("Inder", 243);
        hashString.put("Inder", "Singh");
        hashString.put("Last Name", "Singh");
        System.out.println(hash);
        System.out.println(hashString);

	}

}
