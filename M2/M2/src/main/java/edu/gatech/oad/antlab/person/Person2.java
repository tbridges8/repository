package edu.gatech.oad.antlab.person;
 import java.util.*;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
            int index = 0;
            int count = 0;
            int size = input.length();
            int[] used = new int[size];
            StringBuilder builder = new StringBuilder();
            boolean contains = true;
            while (count != size) {
                //boolean contains;
                int random = (int)(Math.random() * (size-1));

                if(count == 0){
                    builder.append(input.charAt(random));
                    count++; 
                }
                for(int i=0; i < count; i++) { 
                    if(random!=used[i]){
                        contains=false;
                        index = i;
                    }
                }  
                if(!contains) {
                   builder.append(input.charAt(index));
                   count++;
                }
            }
                
        
        
	  //Person 2 put your implementation here
	  return builder.toString();
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
