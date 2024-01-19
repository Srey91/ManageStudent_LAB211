/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author 84898
 */
public class Validation {
    public String inputString (String string)
   {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter " + string  + ": ");
       
       while (true)
       {
            String result = sc. nextLine();
           
           if (result.isEmpty())
           {
               System.out.println(string + " can't empty!!!");
               System.out.println("Enter " + string + " again: ");
           }else 
               return result;
       }
   }
    
    public String input_StudentId(ArrayList<Student> studentList)
   {
        boolean isExist;
        
        while (true) 
        {
            isExist = false;
            String id = inputString("candidate id");//scannerNextLine
            
            for (Student student: studentList) 
            {
                if (student.getId().equals(id)) 
                {
                    System.out.println("Id is existed!!!");
                    System.out.println("Enter again: ");
                    isExist = true;
                }
            }
            if(isExist == false) return id;
        }
    }
    
    public String input_CourseName (String string)
   {
       while (true)
       {
            System.out.println("Please choose 1 of these 3 options: Java, .Net, C/C++");
            String rank  = inputString(string);

            if (!"Java".equals(rank) || !".Net".equals(rank) || !"C/C++".equals(rank))
            {
                System.out.println("Course name invalid!!!");
            }else
                return rank;
       }
   }
    
    public char input_ConfirmOption ()
   {
       Scanner sc = new Scanner(System.in);
       
       while (true)
       {
            System.out.println("Do you want to continue (Y/N)?");
            char confirmOption  = sc.next().charAt(0);

            if (confirmOption != 'Y' || confirmOption != 'N')
            {
                System.out.println("Confirm option invalid!!!");
            }else
                return confirmOption;
       }
   }
    
    public char input_UpdateOrDelete ()
   {
       Scanner sc = new Scanner(System.in);
       
       while (true)
       {
            System.out.println("Do you want to update (U) or delete (D) student?: ");
            char confirmOption  = sc.next().charAt(0);

            if (confirmOption != 'U' || confirmOption != 'D')
            {
                System.out.println("Confirm option invalid!!!");
            }else
                return confirmOption;
       }
   }
    
    public int intputAnyInteger (String string)
   {
       while (true)
       {
           try 
           {
                int number  = Integer.parseInt(inputString(string)); 
                return number;
                
           }catch (NumberFormatException e)
           {
               System.out.println("Number invalid!!!");
           }
       }
   }
}
