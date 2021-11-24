package com.example.restservice;

public class Greeting {
    
    private final long id;
    private final String content;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public double getAverageLength(String content)
    {
        double sum = 0;
        double count = 0;

        String[] words = content.split("\\s+"); // split by whitespace

    // iterate over each word and update the stats
        for (String word : words) {
        double wordLength = word.length();
        sum += wordLength;
        count++;
        }

    // calculate the average at the end
        double average = 0;
        if (count > 0) {
        average = sum / count;
        }
        return average;
    }



}
