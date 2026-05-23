/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.set_collections;
import java.util.*;
/**
 *
 * @author RSS - Siphelele
 */


/*
1.
Hashset and duplicate rejections
1. Use a HashSet to remove all the duplicate courses
2. Student register to about 6 courses
3. When working with java set collection to remove duplicates do not use
Iterator or List iterator to remove duplicates.
-----------------------------------------------------------------------
2. Set vs List
The same enrollment events (with 3 duplicate CS101 entries) are fed into 
both a List and a Set, showing that the list ends up with 6 items while 
the set correctly holds only 3 unique ones.

*/


public class Set_Collections {

    public static void main(String[] args) {
        System.out.println("HashSet:");
        //solution 1: HashSet remove duplicates automatically
        HashSet<String> set = new HashSet<>(Arrays.asList("Law", "IT", "CS", "Nusing", "Law", "Teaching"));
        
        //for each loop
        for(String object : set){
            System.out.println(object);
        }
        System.out.println("\n");
        //----------------------------------------------------------------------
        /*
        solution 2
        -Using a list and set to store string object
        -Observe which collection that allows duplicates and rejects them
        */
        
        List<String> list = new ArrayList<>();
        //add
        System.out.println("List: ");
        list.add("Law_09LU");
        list.add("IT_08IS");
        list.add("CS_92UL");
        list.add("Law_09LU");
        list.add("CS_92UL");
        list.add("IT_08IS");
        
        for(String object : list){
            System.out.println(object);
        }
        
        /*
        Set using the course to register using a set
        */
        System.out.println("\n");
        Set<String> set2 = new HashSet<>();
        System.out.println("set:");
        //add string objects
        set2.add("Law_09LU");
        set2.add("Law_09LU");
        set2.add("IT_08IS");
        set2.add("IT_08IS");
        set2.add("CS_92UL");
        set2.add("CS_92UL");
        
        
        for(String object : set2){
            System.out.println(object);
        }
        
        
        System.out.println("\n");
        //iterator is for safer removal of string object
        
        Iterator<String> it = set2.iterator();
        //check for next element
        while(it.hasNext()){
            String element = it.next();
            if(element.contains("IT_08IS")){
                it.remove();
                System.out.println("elements removed: "+ element);
            }
            
        }
        System.out.println("New set after removal:");
        for(String object : set2){
            System.out.println(object);
        }
    }
    
}
