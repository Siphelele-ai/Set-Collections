/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sets;
import java.util.*;
/**
 *
 * @author RSS - Siphelele
 */

/*
Demo 1 — HashSet Basics & Duplicate Rejection
Alice tries to register for 6 courses, but 2
are duplicates. The program attempts each add()
, prints whether it succeeded or was
rejected, and shows the final unique course list.



LinkedHashSet
The same 5 courses are inserted into both set types
side by side, showing that LinkedHashSet preserves 
the order you added them while
TreeSet automatically sorts them alphabetically.


Set vs List
The same enrollment events (with 3 duplicate CS101 
entries) are fed
into both a List and a Set, showing that the list 
ends up with 6 items while the set
correctly holds only 3 unique ones.

*/

public class Sets {

    public static void main(String[] args) {
      
      
        /*
        Understanding java set collections
        Hash set they automatically remove duplicates
        */
        HashSet<String> set = new HashSet<>();
        
        //register courses
        set.add("Law_0TL3");
        set.add("IT_98LS");
        set.add("CS_010LE");
        set.add("Law_0TL3");
        set.add("Agric_SS09");
        set.add("IT_98LS");
        System.out.println("------ HashSet -----");
        //for each loop 
        for(String obj : set){
            System.out.println(obj);
        }
        
        /*
        Set collection does not allow duplicates
        */
        Set<String> s = new HashSet<>();
        
        s.add("CS101");
        s.add("CS101");
        s.add("CS101");
        s.add("Law066");
        s.add("IT0103");
        s.add("Agric10T");
        System.out.println("\n");
        //for each loop
        System.out.println("------ Set -----");
        for(String obj : s){
            System.out.println(obj);
        }
        
        System.out.println("\n");
        
        /*
        List collection
        
        */
        List<String> list = new ArrayList<>();
        
        list.add("CS101");
        list.add("CS101");
        list.add("CS101");
        list.add("Law401K");
        list.add("CS308");
        list.add("Agric101");
        
        System.out.println("------- List ------");
        
        /*
        loop through each string object inside a list
        */
        for(String obj : list){
            System.out.println(obj);
        }
        System.out.println("------Iterator -----");
        /*
        Iterator for safer and consisent removal and adding 
        string object inside a list
        */
        Iterator<String> t = list.iterator();
        
        /*
        check for string object before removing it
        */
        while(t.hasNext()){
            //string each objects will assigned to variable k
            String k = t.next();
            /*
            if the list already contains string object
            */
            if(k.contains("CS101")){
                //then remove the string object avoid duplicated objects
                t.remove();
            }
        }
        /*
        loop through a list after removing all the 
        duplicate string objects
        */
        for(String obj : list){
            System.out.println(obj);
        }
        
    }
}
