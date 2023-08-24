/*Write a program which will illustrate NullPointerException. 
Create student class along with name, marks and city and 
add setter methods and getter methods.
Create a method which can take student class as a 
parameter and print name, marks and city in method business logic. */

import java.util.Scanner;

class Student{
    private String name;
    private int mark;
    private String city;

    public String getname(){
        return name;
    }
    void setname(String name){
        this.name=name;
    }
     public int getmarks(){
        return mark;
    }
    void setmarks(int mark){
        this.mark=mark;
    }
     public String getcity(){
        return city;
    }
    void setcity(String city){
        this.city=city;
    }

    void print(){
          System.out.println("Student Name: " + getname());
        System.out.println("Student Marks: " + getmarks());
        System.out.println("Student City: " + getcity());
        

    }



}
public class NullPoint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student t=null;
        try{
        System.out.println("Enter the Name");
          t.setname(s.next()); // exception 
         System.out.println("Enter the City");
           t.setcity(s.next());
          System.out.println("Enter the marks");
            t.setmarks(s.nextInt());
            t.print();
        }
        catch(NullPointerException e){
            System.out.println("NOT POSSIBLE AS THE REASON IS");
            System.out.println(e);
        }
        s.close();
      
      
      
        
    }
}
