package TYSS_JAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionConcept {

	public static void main(String[] args) {
//	ArrayList<Object> list =new ArrayList<Object>();
//	list.add(20);
//	list.add(null);
//	list.add("hi");
//	list.add("hello");
//	list.add('d');
//	list.add(20);
//	System.out.println(list);
//	ArrayList<Integer> list1 = new ArrayList<Integer>();
//	list1.add(30);
//	list1.add(20);
//	list1.add(50);
//	list1.add(60);
//	list1.add(20);
//	list1.add(0);
//	Collections.sort(list1);
//list.addAll(list1);
//	System.out.println(list);
//	if(list.contains("hello"))
//	{
//		System.out.println("is present");
//	}
//	else
//	{
//		System.out.println("is not present");
//	}
//	System.out.println(list.get(2));//fetch the element present in index 2
//	System.out.println(list.size());
//	System.out.println("*****************************************************************");
//	System.out.println(list.remove(3));//removes the element present in index 3
//	System.out.println(list.indexOf("hello"));//print the index of hello
//	
//	for (Object value: list1) //fetch the elements 1 by 1
//	{
//		System.out.println(value);
//	}
//	Iterator<Object> it = list.iterator();//fetch elements by using iterator method
//	
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//	}
//		Stack<Object> stack = new Stack<Object>();
//		stack.push(30);
//		stack.push(20);
//		stack.push("hawa");
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		
		
PriorityQueue<Object> q = new PriorityQueue<Object>();

q.add(10);
q.add(20);
q.add(30);
//q.add("abhishek");
//q.add('b');
//q.add(10);
//q.add("abhishek singh");
//q.add("abhishek kumar");

//System.out.println(q.peek());
//System.out.println(q);
//System.out.println(q.poll());
//System.out.println(q);
//
//HashSet<Object> hs = new HashSet<Object>();
//
//hs.add(10);
//hs.add("hi");
//hs.add("hello");
//hs.add(null);
//hs.add(10);
//hs.add(null);
//System.out.println(hs);
//
//ArrayList<Object> al = new ArrayList<Object>(hs);
//
//al.add(20);
//al.add("beruwaar");
//System.out.println(al);
//
//System.out.println(hs.size());
//System.out.println(al.size());

//TreeSet<Object> ts = new TreeSet<Object>();
//ts.add(30);
//ts.add(20);
//ts.add(10);
//ts.add(40);
////ts.add("hi");//not allowed (classCastException)
////ts.add(null);//not allowed (NullPointerException)
//System.out.println(ts);//autosorted in ascending border
//System.out.println(ts.descendingSet());//autosorted in descending border

//Hashtable<Integer, String> map = new Hashtable<Integer, String>();
//map.put(20, "abhi");
//map.put(40, "rajput");
////map.put(null, "rana");//not allowed
////map.put(60, null);//not allowed
//map.put(70, "bye");
//map.put(70, "hibye");//duplicate keys not allowed
//map.put(50, "abhi");
////map.put(null, null);
//System.out.println(map);
//
//for (Entry<Integer , String> m : map.entrySet()) 
//{
//	
//	System.out.println(m.getKey()+" "+m.getValue());
//}
//System.out.println(map.contains("hello"));
//System.out.println(map.containsKey(50));
//map.remove(70);
//map.remove(70, "hihello");
//System.out.println(map.get(50));
//System.out.println(map);

HashMap<Integer, Object> maps = new HashMap<Integer,Object>();
maps.put(20, "hi");

maps.put(40, "hello");
maps.put(null, "hi");
maps.put(null, null);
maps.put(60, null);//not allowed
maps.put(80, null);//not allowed
maps.put(70, "bye");
maps.put(70, "hihello");
maps.put(70, "hi");

System.out.println(maps);

for (Entry<Integer, Object> m : maps.entrySet()) 
	{
		
		System.out.println(m.getKey()+" "+m.getValue());
	}
	//System.out.println(maps.contains("hello"));
	System.out.println(maps.containsKey(50));
	maps.remove(70);
	maps.remove(70, "hihello");
	System.out.println(maps.get(50));
	System.out.println(maps);










	}

}
