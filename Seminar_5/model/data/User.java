package Seminar_5.model.data;

import java.util.Calendar;

public abstract class User {
    
    private String name;
    private String LastName;
    private Calendar Birthday;
    public User(String name, String lastName, Calendar birthday) {

        this.name = name;
        this.LastName = lastName;
        this.Birthday = birthday;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return LastName;
    }
    public Calendar getBirthday() {
        return Birthday;
    }

}