package case_study.jame;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryManager {
    static final String File_PATH="src\\case_study\\jame\\Dictionary.txt";
    static List<Dictionary> list=new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    public static void readFile(){
        boolean bool=true;
        ObjectInputStream objectInputStream=null;
        try {
            objectInputStream=new ObjectInputStream(new FileInputStream(File_PATH));
            while (bool){
                Dictionary dictionary=(Dictionary) objectInputStream.readObject();
                if (dictionary!=null){
                    list.add(dictionary);
                }else
                    bool=false;
            }
            objectInputStream.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public static void writeFile(String filePath){
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream(filePath));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
            oos.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void lookup(String word){
        readFile();
        if (list.size()==0){
            System.out.println("Dictionary is empty,please enter new word");
            addNewWord();
        }else {
            for (int i = 0; i < list.size(); i++) {
                if (word.equals(list.get(i).getAction())) {
                    System.out.println(list.get(i).toString());
                    break;
                } else if (i == list.size() - 1) {
                    System.out.println("Not word found");
                    System.out.println("Do you want add the word" +
                            "\n1.Yes" + "\t2.No");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            addNewWord();
                            break;
                        case 2:
                            break;
                    }
                }
            }
        }

    }

    public static void addNewWord() {
        String str;
        System.out.println("Enter word:");
        String word=scanner.nextLine();
        System.out.println("Enter pronoun:");
        String pronoun=scanner.nextLine();
        System.out.println("Enter adjective:");
        String adjective="";
        str=scanner.nextLine();
        while (!str.equals("exit")){
            adjective+=str+"\n";
            str=scanner.nextLine();
        }
        System.out.println("Enter noun:");
        String noun="";
        str=scanner.nextLine();
        while (!str.equals("exit")){
            adjective+=str+"\n";
            str=scanner.nextLine();
        }
        System.out.println("Enter verb:");
        String verb="";
        str=scanner.nextLine();
        while (!str.equals("exit")){
            adjective+=str+"\n";
            str=scanner.nextLine();
        }
        System.out.println("Enter synonymous:");
        String synonymous="";
        str=scanner.nextLine();
        while (!str.equals("exit")){
            adjective+=str+"\n";
            str=scanner.nextLine();
        }
        Dictionary dictionary=new Dictionary(word,pronoun,adjective,noun,verb,synonymous);
        list.add(dictionary);
        writeFile(File_PATH);
        list.clear();
    }
    public static void define(String keyword,String key){
       readFile();
       List<String> listString=new ArrayList<>();
       String string="";
        String definition="";
        String noun="";
        String verb="";
        String synonymous="";
        Dictionary word = null;
        for (int i = 0; i < list.size() ; i++) {
            if (keyword.equals(list.get(i).getAction())) {
                word = list.get(i);
                list.remove(i);
            }
            }
                switch (key){
                    case "adjective":
                        System.out.println("Enter more definitions (end by the word: exit):");
                        string=scanner.nextLine();
                        while (!string.equals("exit")){
                            listString.add(string);
                            string=scanner.nextLine();
                        }
                        for (int j = 0; j < listString.size() ; j++) {
                            definition+=listString.get(j)+"\n";
                        }
                        word.setAdjective(definition);
                        list.add(word);
                        break;
                    case "noun":
                        System.out.println("Enter more noun (end by the word: exit):");
                        string=scanner.nextLine();
                        while (!string.equals("exit")){
                            listString.add(string);
                            string=scanner.nextLine();
                        }
                        for (int j = 0; j < listString.size() ; j++) {
                            noun+=listString.get(j)+"\n";
                        }
                        word.setNoun(noun);
                        list.add(word);
                        break;
                    case "verb":
                        System.out.println("Enter more verb (end by the word: exit):");
                        while (!string.equals("exit")){
                            listString.add(string);
                            string=scanner.nextLine();
                        }
                        for (int j = 0; j < listString.size() ; j++) {
                            verb+=listString.get(j)+"\n";
                        }
                        word.setVerb(verb);
                        list.add(word);
                        break;
                    case "synonymous":
                        System.out.println("Enter more synonymous:");
                        while (!string.equals("exit")){
                            listString.add(string);
                            string=scanner.nextLine();
                        }
                        for (int j = 0; j < listString.size() ; j++) {
                            synonymous+=listString.get(j)+"\n";
                        }
                        word.setSynonymous(synonymous);
                        list.add(word);
                        break;
                }

        writeFile(File_PATH);
        list.clear();
    }

    public static void drop(String word){
        readFile();
        for (int i = 0; i < list.size(); i++) {
            if (word.equals(list.get(i).getAction())) {
                list.remove(i);
                System.out.println("@"+word+" dropped");
            } else if (i == list.size() - 1) {
                System.out.println("Not word found");
            }
        }
        writeFile(File_PATH);
        list.clear();
    }
    public static void export(String filePath){
        readFile();
        File file = new File(filePath);
        try {
            if (file.createNewFile()){
                System.out.println("Exporting 10%..20%..30%..40%..50%..60%..70%..80%..90%..Done!");
            }else
                System.out.println("\"File already exists..\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeFile(filePath);
    }
    public static void displayMainDictionary(){
        System.out.println("---DICTIONARY---");
        System.out.println("Enter a word according to the format: (lookup/define/drop/export) word");
        System.out.print("Action: ");
        String word=scanner.nextLine();
        String[] str=word.split(" ");
        switch (str[0]){
            case "lookup":
                lookup(str[1]);
                displayMainDictionary();
                break;
            case "define":
                define(str[2],str[1]);
                displayMainDictionary();
                break;
            case "drop":
                drop(str[1]);
                displayMainDictionary();
                break;
            case "export":
                export(str[1]);
                break;
        }
    }


    public static void main(String[] args) {
       displayMainDictionary();
    }
}
