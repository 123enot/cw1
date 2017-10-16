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
        initBookData();
    }

    private void initItemData() {
        items[0][0] = new Book();
        items[0][0].setId(0);
        items[0][0].setTitle("Design Patterns: Elements of Reusable Object-Oriented Software");
        items[0][0].setUrl("https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612/");
    }

    private void initBookData() {
        books[0] = (Book) items[0][0];
        books[0].setPublicationYear(2000);
    }

    private void initOnlineCourseData() {

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
