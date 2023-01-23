/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentlist2;

/**
 *
 * @author Fuwad Oladega
 */
public class PrintStudentList2 {

    
    public static void main(String[] args) {
     student[] list= new student[3];
     student s1=new  student("Fuwad",20);
     student s2=new  student("Kosta",9);
     student s3=new  student("Fawas",21); 
     list[0]=s1;
     list[1]=s2;
     list[2]=s3;
     for(int i=0; i<list.length; i++)
     {
         System.out.println(list[i].getName() + " " +list[i].getAge());
     }


     //asd
    }
    
}
