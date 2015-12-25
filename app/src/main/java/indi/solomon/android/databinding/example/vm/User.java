/*
 * This file is copyrighted Solomon.liu all
 * Solomon , 2015
 */
package indi.solomon.android.databinding.example.vm;

/**
 * Created by Solomon.liu on 2015/12/25.
 */
public class User {
    private final String firstName;
    private final String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
