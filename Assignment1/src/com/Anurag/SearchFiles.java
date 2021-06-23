package com.Anurag;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFiles {
    public void findFiles(String path, String regExp) {
        File directory = new File(path);
        File fileNames[] = directory.listFiles();
        if (fileNames!= null && fileNames.length > 0) {
            for (File file : fileNames)
                if (file.isDirectory()) {
                    findFiles(file.getAbsolutePath(), regExp);
                } else if (file.getName().contains(regExp)){
                    System.out.println(file.getAbsolutePath() + "     " + file.getName());
                }
        }
    }
    public void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter Regular Expression:");
            String regExp = br.readLine();
            if(regExp.contentEquals(""))
                break;
            SearchFiles searchFiles = new SearchFiles();
            searchFiles.findFiles("/home/anurag/Desktop", regExp);
        }
        System.out.println("Search completed");
    }
}