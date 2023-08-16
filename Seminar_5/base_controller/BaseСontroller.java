package Seminar_5.base_controller;

import java.util.ArrayList;
import java.util.Calendar;

import Seminar_5.model.service.DataService;
import Seminar_5.model.service.UserService;

public class BaseСontroller {
    private DataService service = new UserService();
    
    public void NewStudent( String name, String lastName, Calendar birthday, String group, String speciality, double averageMark){
       service.createStudent(name,lastName,birthday,group,speciality,averageMark);
    }
     
    public void newTeacher(String name, String lastName, Calendar birthday, ArrayList <String> disciplines, double rating, String department){
         service.createTeacher(name,lastName,birthday,disciplines,rating,department);
    }

    public void showTeacher(){
        service.getTeachers();
    }

    public void showStuden(){
        service.getStudents();
    }
}