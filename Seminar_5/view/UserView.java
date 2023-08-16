package Seminar_5.view;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Seminar_5.base_controller.BaseСontroller;

public class UserView {
    BaseСontroller contr = new BaseСontroller();
    Scanner scan = new Scanner(System.in);
    int inCommand;

    public void start(){
        while (true){
        System.out.println("[1] Записать нового учителя");
        System.out.println("[2] Записать нового студента");
        System.out.println("[3] Показать всех учителей");
        System.out.println("[4] Показать всех студентов");
        System.out.println("[0] Выход");
        inCommand = scan.nextInt();
        scan.nextLine();
        
            if (inCommand == 1) addTeacher();
            if (inCommand == 2) addStudent();
            if (inCommand == 3) new BaseСontroller().showTeacher();
            if (inCommand == 4) new BaseСontroller().showStuden();
            if (inCommand == 0) break;
              
        }
    }

    public void addTeacher(){
        System.out.print("Имя:");
        String name = scan.nextLine();
        System.out.print("Фамилия:");
        String LastName = scan.nextLine();
        System.out.print("День рождения В формате: YEAR;MONTH;DATE: ");
        String temp = scan.nextLine();
        String[] tempDate = temp.split(";");
        int year = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int date = Integer.parseInt(tempDate[2]);
        GregorianCalendar birthday = new GregorianCalendar(year,month,date);
        System.out.print("Кол-во дисциплин у учителя: ");
        int count = scan.nextInt();
        scan.nextLine();
        System.out.print("Введите первую дисциплину: ");
        ArrayList <String> disciplines = new ArrayList<>();
        String discip;
        for (int i=0; i<count; i++){
            discip = scan.nextLine();
            disciplines.add(discip); 
        }
        System.out.print("Введите рейтинг учителя: ");
        double rating = Double.parseDouble(scan.nextLine());
        System.out.print("Факультет: ");
        String faculty = scan.nextLine();
        new BaseСontroller().newTeacher(name, LastName, null, null, rating, faculty);
    }
    
    public void addStudent(){
        System.out.print("Имя:");
        String name = scan.nextLine();
        System.out.print("Фамилия:");
        String LastName = scan.nextLine();
        System.out.print("День рождения В формате: YEAR;MONTH;DATE: ");
        String temp = scan.nextLine();
        String[] tempDate = temp.split(";");
        int year = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int date = Integer.parseInt(tempDate[2]);
        GregorianCalendar birthday = new GregorianCalendar(year,month,date);
        System.out.print("Группа:");
        String group = scan.nextLine();
        System.out.print("Специализация:");
        String speciality = scan.nextLine();
        System.out.print("Cредний балл: ");
        double averageMark = Double.parseDouble(scan.nextLine());
        new BaseСontroller().NewStudent(name, LastName, null, group, speciality, averageMark);
    }    
}
