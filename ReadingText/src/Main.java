import java.io.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<String> lines = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            lines.add(line);
        }
        br.close();
        for (String i : lines) {
            System.out.println(i);
        }

    }
    public String wordSearch(String word) {
        word = "for";
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).contains(word)) ;
            {

            }
        }

        return word;
    }

    }









