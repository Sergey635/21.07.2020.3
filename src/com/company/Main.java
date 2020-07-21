package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

	String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Java01\\Desktop\\Harry.txt")));
	String first200 = text.substring(0,200);

        /*System.out.println(first200);*/

        String textTrashEree = text.replaceAll("[^A-Za-z`\\- ]","");
       /* first200 = textTrashEree.substring(0,2000);*/
       /* System.out.println(first200);*/

        String [] wordsArrey = textTrashEree.split(" ");
        System.out.println(wordsArrey.length);

        for (int i = 0; i <wordsArrey.length ; i++) {

            // всі слова, довжина яких >= 3   і   всі слова,які починаються на "b" або  всі слова,які починаються на "a"
            if ( (wordsArrey[i].length() >= 3) && ((wordsArrey[i].charAt(0)=='b') || (wordsArrey[i].charAt(0)=='a') )) {           // "||" означає "або"
                                                //перша буква ( charAt(0) ) слова "а"
                                                // символ charAt береться у одинокі скобки ('')


                System.out.print(i + ". " );        //виводить номер і точку
                System.out.println(wordsArrey[i]);      //виводить слово на якому номері
            }

        }


    }
}
