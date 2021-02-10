/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author vuhanh
 */
public class StudentList {
   
    public static void main (String[] args){
    
        Student[] studList = new Student[5];
        Scanner s = new Scanner(System.in);
        
        for (int i=0;i<5;i++){
            
            while(true){
            try{
            studList[i]= new Student();
            System.out.print("prog: ");
            studList[i].setProgName(s.nextLine());
            System.out.print("name: ");
            studList[i].setStudName(s.nextLine());
            System.out.print("id: ");           
            studList[i].setStudId(s.nextInt());
            }
            catch(Exception e){
            System.out.println("invalid input!!! Please enter again!!!\n");}
            }
             
        }
        
    }
    
}
