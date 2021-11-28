package com.example.restservice;


public class Greeting {
    
    //private final long id;
   
    private final String X;
    private final double answer;

    public Greeting(String X, double answer) {
        this.X = X;
        this.answer = answer;
    }

    public String getX() {
        return X;
    }

    public double getAnswer() {
        return answer;
    }

    //public long getId() {
    //    return id;
    //}


    public double getAverageLength(String X)
    {
        double sum = 0;
        double count = 0;

        String[] words = X.split("\\s+"); // split by whitespace

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
