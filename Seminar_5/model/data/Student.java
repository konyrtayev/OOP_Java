package Seminar_5.model.data;

import java.util.Calendar;

public class Student extends User{
    private static int id = 1;
    private String group;
    private String speciality;
    private double averageMark;
    public Student( String name, String lastName, Calendar birthday, String group, String speciality,
            double averageMark) {
        super(name, lastName, birthday);
        Student.id = id++;
        this.group = group;
        this.speciality = speciality;
        this.averageMark = averageMark;
    }
    public static int getId() {
        return id;
    }
    public String getGroup() {
        return group;
    }
    public String getSpeciality() {
        return speciality;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString(){
            return "Студент:  Имя: " + getName() + "  Фамилия: " + getLastName() + "  Группа: " + group + "  Оценка: " + averageMark+"\n";
    }

}
