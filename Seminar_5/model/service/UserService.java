package Seminar_5.model.service;

import java.util.ArrayList;
import java.util.Calendar;

import Seminar_5.model.data.Student;
import Seminar_5.model.data.Teacher;
import Seminar_5.model.data.User;

public class UserService implements DataService{
    ArrayList<User> base = new ArrayList<>();

    public void createStudent( String name, String lastName, Calendar birthday, String group, String speciality,double averageMark) {
        Student student = new Student(name,lastName,birthday,group,speciality,averageMark);
        base.add(student);
    }

    public void createTeacher(String name, String lastName, Calendar birthday, ArrayList <String> disciplines, double rating, String department) {
        Teacher teacher = new Teacher(name, lastName, birthday, disciplines, rating, department);
        base.add(teacher);
    }

    public void getTeachers(){
        for (User user : base) {
            if (user instanceof Teacher) System.out.print(user);
        }
    }

    public void getStudents(){
        for (User user : base) {
            if (user instanceof Student) System.out.print(user);
        }
    }

}
