package com.spduniversity.spdulib;

import com.spduniversity.spdulib.entity.*;
import java.util.Arrays;

public class App {
    private static DataStore dataStore;

    public static void main(String[] args) {
        dataStore = new DataStore();

        if(args.length < 2 || !args[0].equals("-p")) {
            System.out.println("There should be at least 2 parameters and Search should start with \"-p\"");
            return;
        }

        selectSource(args);
    }

    private static void selectSource(String[] queries) {
        System.out.println("selected params: " + Arrays.deepToString(queries));
        switch (queries[1]) {
            case "Items":
                selectAction(queries);
                break;
            case "Users":
                searchByLogin(queries);
                break;
            default:
                System.out.println("Unknown 2nd search parameter!");
        }
    }

    private static void printLibrary() {
        Item[][] library = dataStore.getItems();

        System.out.println("Library:");
        for(Item[] items: library) {
            for(Item item: items) {
                System.out.println(item != null ? item : "-");
            }
        }
    }

    private static void selectAction(String[] queries) {
        if(queries.length < 3) {
            printLibrary();
            return;
        }

        switch(queries[2]) {
            case "-fgenre":
                if(queries.length < 4) {
                    System.out.println("Parameter \"genre\" is not defined");;
                } else {
                    searchByGenre(queries[3]);
                }
                break;
            case "--sortByItem":
                printSortedItems();
                break;
            default:
                System.out.println("Unknown 3rd search parameter!");
        }
    }

    private static void searchByGenre(String genre) {
        Book[] books = dataStore.getBooks();
        OnlineCourse[] onlineCourses = dataStore.getOnlineCourses();
        int found = 0;

        for(Book book: books) {
            if(book != null && book.getGenre().equals(genre)) {
                found++;
                System.out.println(book.getTitle() + " " + Arrays.deepToString(book.getAuthors()) + " " + book.getPublicationYear() + " " + book.getAmazonRating());
            }
        }
        for(OnlineCourse onlineCourse: onlineCourses) {
            if(onlineCourse != null && onlineCourse.getGenre().equals(genre)) {
                found++;
                System.out.println(onlineCourse.getTitle() + " " + onlineCourse.getSource() + " " + Arrays.deepToString(onlineCourse.getAuthors()) + " " + onlineCourse.getLevel() + " " + onlineCourse.getRating());
            }
        }
        if(found == 0) {
            System.out.println("Unfortunately, nothing is found..");
        }
    }

    private static void printSortedItems() {
        Book[] books = dataStore.getBooks();
        OnlineCourse[] onlineCourses = dataStore.getOnlineCourses();

        for(OnlineCourse onlineCourse: onlineCourses) {
            if(onlineCourse != null) {
                System.out.println(onlineCourse.getTitle() + " " + onlineCourse.getSource() + " " + Arrays.deepToString(onlineCourse.getAuthors()) + " " + onlineCourse.getLevel() + " " + onlineCourse.getRating());
            }
        }
        for(Book book: books) {
            if(book != null) {
                System.out.println(book.getTitle() + " " + Arrays.deepToString(book.getAuthors()) + " " + book.getPublicationYear() + " " + book.getAmazonRating());
            }
        }
    }

    private static void searchByLogin(String[] queries) {
        if(queries.length < 4 || !queries[2].equals("-f")) {
            System.out.println("There should be at least 4 parameters and 3rd parameter should be \"-f\"");;
            return;
        }

        UserItem[] userItems = dataStore.getUserItems();
        int found = 0;

        for(UserItem userItem: userItems) {
            if(userItem != null && userItem.getUser().getLogin().equals(queries[3])) {
                found++;
                if(userItem.getItem() instanceof Book) {
                    Book book = (Book) userItem.getItem();
                    System.out.println(book.getTitle() + " " + Arrays.deepToString(book.getAuthors()) + " " + book.getPublicationYear() + " " + book.getAmazonRating());
                }
                if(userItem.getItem() instanceof OnlineCourse) {
                    OnlineCourse onlineCourse = (OnlineCourse) userItem.getItem();
                    System.out.println(onlineCourse.getTitle() + " " + onlineCourse.getSource() + " " + Arrays.deepToString(onlineCourse.getAuthors()) + " " + onlineCourse.getLevel() + " " + onlineCourse.getRating());
                }
            }
        }

        if(found == 0) {
            System.out.println("Unfortunately, nothing is found..");
        }
    }
}