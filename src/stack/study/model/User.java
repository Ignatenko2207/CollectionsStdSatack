package stack.study.model;

import java.util.Date;

public class User implements Comparable<User>{

    private String login;
    private String email;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User() {
    }

    public User(String login, String email, String firstName, String lastName, Date dateOfBirth) {
        this.login = login;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(User user) {
        if (dateOfBirth.getYear() > user.getDateOfBirth().getYear()){
            return 1;
        } else if (dateOfBirth.getYear() < user.getDateOfBirth().getYear()){
            return -1;
        } else {
            if (dateOfBirth.getMonth() > user.getDateOfBirth().getMonth()){
                return 1;
            } else if (dateOfBirth.getMonth() < user.getDateOfBirth().getMonth()){
                return -1;
            } else {
                if (dateOfBirth.getDate() > user.getDateOfBirth().getDate()) {
                    return 1;
                } else if (dateOfBirth.getDate() < user.getDateOfBirth().getDate()) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
