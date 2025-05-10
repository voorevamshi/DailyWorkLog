package com.logicalprogramming.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CombinationToFile {
    public static void main(String[] args) {
        String[] numbers = {"819","820","821","822","823","824","825","826","827","828","829","830"};
        String outputFile = "combinations.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Generate combinations from 2 elements to 12 elements
            for (int i = 2; i <= numbers.length; i++) {
                generateCombinations(numbers, i, 0, new ArrayList<>(), writer);
            }
            System.out.println("Combinations successfully written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void generateCombinations(String[] numbers, int length, int start, List<String> current, BufferedWriter writer) throws IOException {
        if (current.size() == length) {
            writer.write("insert into [ATF].[FormSurveyQuestionAnswerOptionCombo] (assgnFormSurveyQuestion,assgnFormSurveyAnswerCombo,comboOutcomeValue,comboNextQuestionCode,activeInd) "
            		+ " values (@assgnFormSurveyQuestion,'"+String.join(",", current)+"','MET','STOP','Y');");
            writer.newLine();
            return;
        }
       

        for (int i = start; i < numbers.length; i++) {
            current.add(numbers[i]);
            generateCombinations(numbers, length, i + 1, current, writer);
            current.remove(current.size() - 1);
        }
    }
}