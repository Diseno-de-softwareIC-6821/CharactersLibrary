package Control;

import Model.CharactersLibrary.Classes.CharacterGame;

import java.util.ArrayList;

public class CLTest {

    public static void main(String args[]) throws Exception {

        //System.out.println(System.getProperty("user.dir"));
        ArrayList<CharacterGame> loadedCharacters = JSONLoader.CharacterParser();
        for (int i = 0; i < loadedCharacters.size();i++)
            System.out.println(loadedCharacters.get(i).toString());
    }
}
