package main;

import customexception.InvalidStudentException;
import student.Student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        /*
        Student obj = new Student();
        obj.setName("vaibhav");
        obj.setRollNo(81);
        obj.setCpi(10.0);
        System.out.println(obj);

         */

        //creating list of student
        Student[] list = new Student[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = new Student();
            System.out.println("enter name");
            list[i].setName(sc.nextLine());
            System.out.println("enter rollno");
            list[i].setRollNo(sc.nextInt());
            System.out.println("enter cpi");
            list[i].setCpi(sc.nextDouble());
            sc.nextLine();
            StudentMain obj = new StudentMain();
            try {
                Student found = obj.search(list, 99);
            }
            catch (InvalidStudentException e){
                System.out.println(e.getMessage());
            }

        }


    }
    public Student search(Student[] list, int rollNo) throws InvalidStudentException {
        return null;
    }
}
