package com.spduniversity.spdulib;

import com.spduniversity.spdulib.entity.*;

public class DataStore {
    private static final int TOTAL_USER_COUNT = 10;
    private static final int ITEM_TYPES_COUNT = 2;

    private User[] users = new User[TOTAL_USER_COUNT];
    private Item[][] items = new Item[ITEM_TYPES_COUNT][TOTAL_USER_COUNT];  // Our library
    private UserItem[] userItems = new UserItem[ITEM_TYPES_COUNT*TOTAL_USER_COUNT]; // User has some items
    private Book[] books = new Book[TOTAL_USER_COUNT];
    private OnlineCourse[] onlineCourses = new OnlineCourse[TOTAL_USER_COUNT];

    public DataStore() {
        initItemData();
        initUsers();
        initUserItems();
    }

    private void initItemData() {
        initBookData();
        initOnlineCourseData();
        for(int i = 0; i < items[0].length; i++) {
            items[0][i] = books[i];
            items[1][i] = onlineCourses[i];
        }
    }

    private void initBookData() {
        books[0] = new Book(
                2000,
                "Design Patterns: Elements of Reusable Object-Oriented Software",
                "https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612/",
                1994,
                "Addison-Wesley Professional",
                new String[]{"Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides"},
                "Design patterns",
                "English",
                4.5
        );
        books[1] = new Book(
                2001,
                "Refactoring: Improving the Design of Existing Code",
                "https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672/",
                1999,
                "Addison-Wesley Professional",
                new String[]{"Martin Fowler", "Kent Beck"},
                "Object-Oriented Design",
                "English",
                4.5
        );
    }

    private void initOnlineCourseData() {
        onlineCourses[0] = new OnlineCourse(
                1000,
                "Algorithms, Part I",
                null,
                "Coursera",
                "Intermediate",
                new String[]{"Kevin Wayne", "Robert Sedgewick"},
                6,
                "English",
                "Computer Science",
                4.9
        );
        onlineCourses[1] = new OnlineCourse(
                1001,
                "Functional programming principles on Scala",
                null,
                "Coursera",
                "Intermediate",
                new String[]{"Martin Odersky"},
                6,
                "English",
                "Software Development",
                4.8
        );
    }

    private void initUsers() {
        users[0] = new User(
                1,
                "alex",
                "alexpassw",
                "Alex",
                "Boiko",
                "m",
                "Moderator"
        );
        users[1] = new User(
                2,
                "tim",
                "timpassw",
                "Tim",
                "Lee",
                "m",
                "User"
        );
        users[2] = new User(
                3,
                "jacky",
                "jackypassw",
                "Jacky",
                "Tompson",
                "m",
                "Editor"
        );
    }

    private void initUserItems() {
        userItems[0] = new UserItem(users[0], books[1]);
        userItems[1] = new UserItem(users[2], onlineCourses[1]);
        userItems[2] = new UserItem(users[1], books[1]);
    }

    public User[] getUsers() {
        return users;
    }

    public Item[][] getItems() {
        return items;
    }

    public UserItem[] getUserItems() {
        return userItems;
    }

    public Book[] getBooks() {
        return books;
    }

    public OnlineCourse[] getOnlineCourses() {
        return onlineCourses;
    }
}
