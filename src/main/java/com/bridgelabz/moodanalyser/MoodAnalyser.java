package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    String message;
    public MoodAnalyser(){

    }
    public MoodAnalyser(String message) {
        super();
        this.message = message;
    }
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
            }
            if (this.message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
        }
    }
}

