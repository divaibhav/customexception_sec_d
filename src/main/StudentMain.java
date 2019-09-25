package main;

import customexception.InvalidStudentException;
import student.Student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        /*
        Student obj = new Student();
        obj.setName("Vaibhav");
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
        }
            StudentMain obj = new StudentMain();
            try {


                Student found = obj.search(list, 12);
                if(found != null){
                    System.out.println(found);

                }
            }
            catch (InvalidStudentException e){
                System.out.println(e.getMessage());
            }

        }




    /***
     * @apiNote this method search for the given rollNo in the list
     * @param list
     * @param rollNo
     * @return Student object
     * @throws InvalidStudentException
     */
    public Student search(Student[] list, int rollNo) throws InvalidStudentException {
        Student response = null;

        // define search function if found assign that obj to response
        for (Student student : list) {
            if(student.getRollNo() == rollNo){
                response = student;
                break;
            }
        }


        // checking if response is null,
        // if null that means no student found and an exception will be
        // thrown
        if(response ==null){
            InvalidStudentException e = new InvalidStudentException("Student not found");
            throw e;
        }
        return response;
    }
}
