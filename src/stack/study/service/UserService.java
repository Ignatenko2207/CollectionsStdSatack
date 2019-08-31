package stack.study.service;

import stack.study.model.User;

import java.util.Collection;
import java.util.Date;

public class UserService {

    public static void birthdayInform(User[] users){
        for (int i = 0; i < users.length; i++) {
            Date dateNow = new Date();
            int dayNow = dateNow.getDate();
            int monthNow = dateNow.getMonth();

            if (users[i].getDateOfBirth().getDate() == dayNow && users[i].getDateOfBirth().getMonth() == monthNow){
                System.out.println("Dear " + users[i].getFirstName() + " " + users[i].getLastName() + "!\n" +
                        "Congratulations!!! Happy Birthday!!!");
            }

        }
    }

    public static void birthdayInform(Collection<User> users){
        for (User user : users) {
            Date dateNow = new Date();
            int dayNow = dateNow.getDate();
            int monthNow = dateNow.getMonth();

            if (user.getDateOfBirth().getDate() == dayNow && user.getDateOfBirth().getMonth() == monthNow){
                System.out.println("Dear " + user.getFirstName() + " " + user.getLastName() + "!\n" +
                        "Congratulations!!! Happy Birthday!!!");
            }
        }
    }

}
