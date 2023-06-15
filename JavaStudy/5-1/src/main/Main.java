package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<String>array= new ArrayList<String>();
		array.add("hoge");
		array.add("pos");
		array.add("foo");
		
		array.set(1, "bar");
		System.out.println("fooのインデックス:"+ array.indexOf("foo"));
		
		Map<String, Object> map = new HashMap<>();
		map.put("address","///// ");
		map.put("name","Kosuke");
		map.put("age", 29);
		
		for(String key: map.keySet()) {
			System.out.println("key:" + key);
		}	
		for(Object value: map.values()) {
			System.out.println("value :" + value);
		}
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int date = cal.get(Calendar.DATE);
        
        int[]arrayDate= new int[3];
        arrayDate[0] = year;
        arrayDate[1] = month;
        arrayDate[2] = date;   
        
        ArrayList<Integer>list= new ArrayList<Integer>(Arrays.asList(year,month,date));
        
        for(int element: list){
        	System.out.println(element);
        }   
		}
}

	

