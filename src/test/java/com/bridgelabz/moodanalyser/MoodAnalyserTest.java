package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void givenMood_IsHappy_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser analyser = new MoodAnalyser("I am in Sad mood");
        assertEquals("SAD",analyser.analyseMood());
    }
    @Test
    public void givenMood_IsAny_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser analyser = new MoodAnalyser("I am in Happy mood");
        assertEquals("HAPPY",analyser.analyseMood());
    }
    @Test
    public void givenMood_IsNull_ShouldReturnMoodAnalysisNullException() throws MoodAnalysisException {
        MoodAnalyser analyser = new MoodAnalyser(null);
        try {
            analyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {

        MoodAnalyser moodAnalyzer = new MoodAnalyser("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
