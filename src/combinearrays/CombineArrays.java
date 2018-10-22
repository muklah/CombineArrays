/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinearrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class CombineArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<Integer>();

Scanner list1_input = new Scanner(System.in);
System.out.print("Enter list1 ");
System.out.println("(Write EOF to terminate list1): ");

    while(list1_input.hasNextInt()){
         list1.add(list1_input.nextInt());
    }
    
    Integer [] list1Array = list1.toArray(new Integer[0]);
    for(int i = 0; i < list1Array.length; i++){
    System.out.println(list1Array[i]);
  }   
    
    Scanner list2_input = new Scanner(System.in);
    
    System.out.print("Enter list2 ");
    System.out.println("(Write EOF to terminate list2): ");
    
    while(list2_input.hasNextInt()){
         list2.add(list2_input.nextInt());
    }
    
    Integer [] list2Array = list2.toArray(new Integer[0]);
    for(int i = 0; i < list2Array.length; i++){
       System.out.println(list2Array[i]);
    
  }  
    
System.out.println(combine(list1, list2));

}
    
    public static ArrayList combine(ArrayList list1, ArrayList list2) {
    int count1 = 0, count2 = 0;
    ArrayList<Integer> output_list = new ArrayList<Integer>();

    while(count1 < list1.size() || count2 < list2.size()) {
        if(count1 < list1.size())
            output_list.add((Integer) list1.get(count1++));
        if(count2 < list2.size())
            output_list.add((Integer) list2.get(count2++));
    }
    return output_list;
        
    }
    
}
