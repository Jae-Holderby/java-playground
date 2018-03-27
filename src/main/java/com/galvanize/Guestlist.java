package com.galvanize;

import java.util.ArrayList;

public class Guestlist {

    private ArrayList<String> guests = new ArrayList<>();

    public void addGuest(String guest) {
        guests.add(guest);
    }

    public ArrayList<String> guests() {
        return new ArrayList<>(guests);
    }

}