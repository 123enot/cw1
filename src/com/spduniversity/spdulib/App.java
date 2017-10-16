package com.spduniversity.spdulib;

import com.spduniversity.spdulib.entity.Book;

public class App {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        Book[] books = dataStore.getBooks();
        System.out.println(books[0].getUrl());
    }
}