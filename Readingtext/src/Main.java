import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            lines.add(line);
        }
        br.close();
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
        System.out.println("\n");
        System.out.println(wordFind("in", lines));

    }

    public static ArrayList<Integer> wordFind(String word, ArrayList<String> lines) {
        ArrayList<Integer> words = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).contains(word)){
                words.add(i);
            }
        }
        return words;

    }
}



