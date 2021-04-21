package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    private static String name;
    private static String School;
    private static int Grade;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList createAllFriends(String filename) throws IOException{
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while((line = br.readLine()) != null);
        if(!line.equals(";")){
            friendString += line;
        }else{
            parseFriend(friendString);
            friendString = "";
        }
        return friends;
    }


    private static void parseFriend(String string){
        int pos = 0;
        String name = " ";
        String school = " ";
        int grade = 1;
        for (int i = 0; i < string.length(); i++) {
            if(string.substring(i, i+1).equals(",")){
                pos =1;
                name = string.substring(0, pos);
                school = string.substring(pos +1);
                grade = Integer.parseInt(string.substring(pos+2));
            }

        }
        friends.add(new Friend(name, school, grade));

    }

}

