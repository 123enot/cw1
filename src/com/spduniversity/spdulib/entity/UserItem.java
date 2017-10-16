package com.spduniversity.spdulib.entity;

/**
 * User -> Library items
 */
public class UserItem {
    private User user;
    private Item item;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}