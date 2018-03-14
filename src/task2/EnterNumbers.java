package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class EnterNumbers {

    public static void main(String[] args) {
        System.out.println("Enter a series of integers. To stop - enter a letter.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        while (true) {
            try {
                listOfNumbers.add(Integer.parseInt(reader.readLine()));
            } catch (NumberFormatException nfe) {
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Collections.sort(listOfNumbers);// как вариант, можно обойтись без цикла с поиском минимума и максимума;

        int max = listOfNumbers.get(0);
        int min = listOfNumbers.get(0);
        double averSum = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) > max) {
                max = listOfNumbers.get(i);
            }
            if (listOfNumbers.get(i) < min) {
                min = listOfNumbers.get(i);
            }
            averSum += listOfNumbers.get(i);
        }
        averSum = averSum / listOfNumbers.size();

        System.out.println("All numbers count: " + listOfNumbers.size());
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.println("Average sum: " + averSum);
    }
}
