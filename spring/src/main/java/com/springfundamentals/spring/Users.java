package com.springfundamentals.spring;

public class Users {
    private int id;
    private String name;

    public Users(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Users{id=" + id + ", name='" + name + "'}";
    }// without this function code works but not proper output not need for working but def needed for viewing
}

