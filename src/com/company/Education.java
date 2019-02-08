package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Education {
    private List<String> school;

    Education(){
        school = new ArrayList<>();
        Collections.addAll(school, "Montgomery College","SUNY Maritime College","Star Center","Maritime  Profetional Training","College of Nautical Studies","Preston Institute","K University","DJ Science","Green Field","Happy Home");
    }

    @Override
    public String toString() {
        return "Education{" +
                "school=" + school +
                '}';
    }
}
