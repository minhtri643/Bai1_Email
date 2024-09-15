package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String birthday;
    private String hearabout;
    private String announcements;
    private String method;

    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        birthday = "";
        hearabout = "";
        announcements = "";
        method = "";
    }
    
public User(String firstName, String lastName, String email, String birthday,
        String hearabout,String announcements, String method ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.birthday = birthday;
    this.hearabout = hearabout;
    this.announcements = announcements;
    this.method = method;
    
    
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getbirthday() {
        return birthday;
    }

    public void setbirthday(String birthday) {
        this.email = birthday;
    }
    
    public String gethearabout () {
        return hearabout;
    }
    
    public void sethearabout (String hearabout) {
        this.hearabout = hearabout;
    }
    
    public String getannouncements() {
        return announcements;
    }

    public void setannouncements(String announcements) {
        this.announcements = announcements;
    }
    
    public String getmethod() {
        return method;
    }

    public void setmethod(String method) {
        this.method = method;
    }
    
}
