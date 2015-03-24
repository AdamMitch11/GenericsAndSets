/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.*;

/**
 *
 * @author amitchell8
 */
public class LabSolutions {
    public static void main(String[] args) {
        /*Collection hobbies = new ArrayList();
        hobbies.add("World of Tanks");
        hobbies.add("Mage Knight");
        hobbies.add("Skyrim");
        //Add two items to verify they are working
        hobbies.add("Small World");
        hobbies.add("Walking");
        //remove two items to see they are removed
        hobbies.remove("World of Tanks");
        hobbies.remove("Walking");
        
        for(Object obj: hobbies) {
            String s = (String)obj;
            System.out.println(s);
        }
        
        //End of Lab Part 1
                */
        
        //Lab Part 2
        /*Collection<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("Doe","Jane","333-22-4444"));
        emps.add(new Employee("Doyle","Kevin","777-88-6666"));
        emps.add(new Employee("Bucher","Jamie","729-19-1995"));
        
        //Output information using for-each format
        for(Employee e : emps) {
            System.out.println(e.getFirstName() + " " + e.getLastName() + "\t" + e.getSsn());
        }
        //toString() was not required
        //End of Lab Part 2
                */
        
        //Lab Part 3
        /*List list = new ArrayList();
        list.add(new Employee("Bucher","Jamie","333-22-4444"));
        list.add(new Dog("Benedict",120005));
        
        for (int i=0; i<list.size() ; i++) {
            System.out.println(list.get(i).toString());
            //Override the toString methods!
            //OR
            
            if(list.get(i)instanceof Employee) {
                Employee temp = (Employee)list.get(i);
                System.out.println(temp.getFirstName() + " " + temp.getLastName());
            } else {
                Dog temp = (Dog)list.get(i);
                System.out.println(temp.getName());
            }
        }
        //End of Lab Part 3
                */
        
        //Lab Part 4
        Collection<Employee> set = new HashSet<Employee>();
        set.add(new Employee("Doe","Jane","333-22-4444"));
        set.add(new Employee("Doyle","Kevin","777-88-6666"));
        set.add(new Employee("Bucher","Jamie","729-19-1995"));
        set.add(new Employee("Bucher","Jamie","729-19-1995"));
        
        for (Employee e : set) {
            System.out.println(e.getFirstName());
        }
        
        //Removes extra name
        //Lab Complete
    }
    
    
}
