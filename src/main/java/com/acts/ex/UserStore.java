package com.acts.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User one = new User();
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                one = users[i];
                break;
            }
        }
        if (one.getUsername() == null) {
            throw new UserNotFoundException("User Not Found");
        }
        return one;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Wrong User");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("past18", true)
        };
        User user = null;
        try {
            user = findUser(users, "past18");
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            throw new RuntimeException(e);
        }
    }
}
