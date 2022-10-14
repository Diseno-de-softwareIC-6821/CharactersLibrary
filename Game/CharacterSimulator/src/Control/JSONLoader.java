package Control;

import java.io.FileReader;
import java.util.ArrayList;

import Model.CharactersLibrary.Classes.Fighter;
import Model.CharactersLibrary.Classes.Item;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JSONLoader {

    static private Fighter CharacterConstructor(JSONObject characterJSON){
        return new Fighter(
            null, //characterJSON.get("currentTexture"),
            null, //characterJSON.get("items"),
            null, //characterJSON.get("selectedItem"),
            (String) characterJSON.get("name"),
            0, //(int) characterJSON.get("level"),
            0, //(double) characterJSON.get("experience"),
            ((Number) characterJSON.get("health")).doubleValue(),
            0, //(double) characterJSON.get("defense"),
            ((Number) characterJSON.get("speed")).doubleValue(),
            ((Number) characterJSON.get("dps")).doubleValue(),
            ((Long) characterJSON.get("spawnLevel")).intValue(),
            ((Long) characterJSON.get("housingSpace")).intValue(),
            0,
            0);
    }

    static private Item ItemLoader(JSONObject itemJSON){
        return new Item();
    }

    static public ArrayList<Fighter> CharacterParser() throws Exception{

        //READS JSON
        Object jsonFileRead = new JSONParser().parse(new FileReader("CharacterBlueprints.json"));
        // TYPECASTING TO JSONARRAY
        JSONArray jsonCharArray = (JSONArray) jsonFileRead;

        ArrayList<Fighter> loadedCharacters = new ArrayList<>();
        //INSTANCE OF CHARACTERS IN ARRAYLIST
        for (int i = 0; i < jsonCharArray.size(); i++){
            loadedCharacters.add(CharacterConstructor((JSONObject) jsonCharArray.get(i)));
        }
        return loadedCharacters;
    }

}
