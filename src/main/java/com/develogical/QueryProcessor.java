package com.develogical;

import java.util.ArrayList;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("name")) {
            return "dark-forest-666";
        }

        String[] splitted = query.toLowerCase().split(" ");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(splitted);

        if (words.contains("plus")) {
            return Integer.parseInt(words.get(words.size()-3)) + Integer.parseInt(words.get(words.size()-1));
        }

        if (words.contains("largest")) {
            String listOfNumbers = query.toLowerCase().split(":")[1];

            ArrayList<String> numbers = new ArrayList<>();
            numbers.addAll(query.toLowerCase().split(","));
            //return Integer.parseInt(words.get(words.size()-3)) + Integer.parseInt(words.get(words.size()-1));
        }


        return "";
    }
}
