package java8.Section6.Lambda.LambdaUsers;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestUser {

    boolean male = true;
    boolean female = false;

    @Test
    public void checkUser() {
        User user1 = new User(20, "Petro", 55, true, "lawyer");
        User user2 = new User(16, "Andrii", 40, true, "student");
        User user3 = new User(18, "Anna", 43, false, "doctor");
        User user4 = new User(22, "Serhii", 70, true, "sportsmen");
        User user5 = new User(44, "Nick", 75, true, "teacher");
        User user6 = new User(17, "Sandra", 45, false, "student");
        User user7 = new User(28, "Viktoria", 50, false, "clerk");
        User user8 = new User(29, "Oksana", 50, false, "accountant");
        User user9 = new User(11, "Vlad", 30, true, "schoolboy");
        User user10 = new User(33, "Jack", 85, true, "clerk");
        User user11 = new User(20, "Jefry", 68, false, "office manager");
        User user12 = new User(18, "Lissa", 60, false, "waiter");
        User user13 = new User(40, "Rubby", 90, false, "hotel manager");
        User user14 = new User(21, "Viktoria", 61, false, "tour guide");
        User user15 = new User(21, "Lil", 40, false, "government officer ");

        List<User> listOfUser = Arrays.asList(user1, user2, user3, user4, user5, user6, user7,
                user8, user9, user10, user11, user12, user13, user14, user15);

        Predicate<User> predicateAge40 =  user -> user.age >= 40;
        Predicate<User> predicateFemales = user -> user.sex != male;
//        userFilter(listOfUser, user -> user.sex != female);
//        userFilter(listOfUser, user -> user.name.contains("J"));
//        userFilter(listOfUser, user -> user.weight <= 40 && user.sex != male );
//        userFilter(listOfUser, user -> user.speciality.contains("sport"));
//        userFilter(listOfUser, user -> user.weight == 30);
//        userFilter(listOfUser, user -> user.weight >= 90);
//        userFilter(listOfUser, user -> user.speciality.contains("guide"));
//        userFilter(listOfUser,user -> user.age > 100);
        userFilter(listOfUser, predicateAge40.and(predicateFemales));
    }

//        userFilter(listOfUser, new UserCheck() {
//            @Override
//            public boolean checkCondition(User user) {
//                return user.name == "Rubby";
//            }
//        });
//    }

    public void userFilter(List<User> listOfUser, Predicate<User> predicate) {
        for (User user : listOfUser) {
            if (predicate.test(user)) {
                System.out.println(user);
            }
        }
    }
}