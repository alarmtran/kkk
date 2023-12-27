package homework.hw1.lesson6.NguyenDangKhoa_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void usingEnterFromKeyboard () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a list of words:");
        String line = scanner.nextLine();
        line = line.replaceAll("[^a-zA-Z1-9 ]", "").toLowerCase();

        String[] listWord = line.split(" ");
        Map<String, Integer> wordAndCount = new HashMap<>();

        for (int i = 0 ; i < listWord.length;i++) {
            listWord[i] = listWord[i].toLowerCase();
            if (wordAndCount.containsKey(listWord[i])) {
                int count = wordAndCount.get(listWord[i]);
                count++;
                wordAndCount.put(listWord[i], count );
            } else {
                wordAndCount.put(listWord[i], 1);
            }
        }
        System.out.println("Number of occurrences of each word:");
        for (Map.Entry<String, Integer> entry : wordAndCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void usingReadFile () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the file you want to do: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            Map<String, Integer> wordCounts = new HashMap<>();

            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                word = word.replaceAll("[^a-zA-Z1-9]", "").toLowerCase();
                if (wordCounts.containsKey(word)) {
                    int count = wordCounts.get(word);
                    count++;
                    wordCounts.put(word, count);
                } else {
                    wordCounts.put(word, 1);
                }
            }

            System.out.println("Word Counts:");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file: " + e.getMessage());
        }
    }
}