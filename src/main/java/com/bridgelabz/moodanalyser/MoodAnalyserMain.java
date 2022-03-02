package com.bridgelabz.moodanalyser;

public class MoodAnalyserMain {
    public static void main(String[] args) throws MoodAnalysisException {
        MoodAnalyser mood = new MoodAnalyser();
        System.out.println(mood.analyseMood());
        MoodAnalyser mood1 = new MoodAnalyser("I am in Sad Mood");
        System.out.println(mood1.analyseMood());
        MoodAnalyser mood2 = new MoodAnalyser("I am in Happy Mood");
        System.out.println(mood2.analyseMood());
    }

}

