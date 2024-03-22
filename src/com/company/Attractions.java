package com.company;

import java.util.ArrayList;
import java.util.List;

public class Attractions {
    List<Attractions> att = new ArrayList<>();
    private String name;

    public Attractions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndexOf(Attractions attractionToFind){
        int counter = 0;
        for (Attractions a: this.att) {
            if(a.equals(attractionToFind)){
                return counter;
            }else{
                counter = counter+1;
            }
        }
        return -1;
    }

    public boolean equals(Attractions b){
        if(this.name == b.getName()) {
            return true;
        }else{
            return false;
        }
    }
}
