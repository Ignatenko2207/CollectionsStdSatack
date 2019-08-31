package stack.study;

import stack.study.model.User;
import stack.study.service.UserService;

import java.util.*;

public class ApplicationRunner {

    public static void main(String[] args) {
        User user1 = new User("ignatenko2207", "ignatenko2207@gmail.com", "Alex", "Ignatenko", new Date(82, 6, 22));
        User user2 = new User("pupkin", "pupkin@gmail.com", "Vasiliy", "Pupkin", new Date(90, 7, 31));

//        User[] userArray = new User[2];
//        userArray[0] = user1;
//        userArray[1] = user2;
//
//        UserService.birthdayInform(userArray);

        Queue<User> userQueue = new PriorityQueue<>();
        userQueue.add(user1);
        userQueue.add(user2);
        userQueue.add(user1);
//        System.out.println("Queue has size " + userQueue.size());

        User firsUser = userQueue.peek();
//        System.out.println("Queue has size " + userQueue.size());

        firsUser = userQueue.poll();
//        System.out.println("Queue has size " + userQueue.size());

        List<User> userList = new ArrayList<>(userQueue);
//        System.out.println("List has size " + userList.size());

        userList.add(user1);
        userList.add(user2);
//        System.out.println("List has size " + userList.size());

        Set<User> userSet = new HashSet<>(userList);
//        System.out.println("Set has size " + userSet.size());

//        UserService.birthdayInform(userQueue);
//        UserService.birthdayInform(userList);
//        UserService.birthdayInform(userSet);

        Map<Integer, User> userMap = new HashMap<>();

        for (int i = 0; i < userList.size(); i++) {
            userMap.put(i, userList.get(i));
        }
        userMap.put(null, user1);

        userMap.put(null, user2);


        for (Integer key : userMap.keySet()) {
            System.out.println(key + " " + userMap.get(key).getLogin());
        }


    }
}
