package Seminar_5.model.service;

import java.util.ArrayList;
import java.util.Calendar;

public interface DataService {
    void createStudent ( String name, String lastName, Calendar birthday, String group, String speciality, double averageMark);
    void createTeacher (String name, String lastName, Calendar birthday, ArrayList <String> disciplines, double rating, String department);

    void getTeachers();
    void getStudents();
}