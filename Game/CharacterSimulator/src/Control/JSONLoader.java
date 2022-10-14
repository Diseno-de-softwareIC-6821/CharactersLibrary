package Control;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import Model.CharactersLibrary.Classes.Fighter;
import Model.CharactersLibrary.Classes.Item;
import Model.Enums.EType;
import Model.Enums.EWeapon;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JSONLoader {

    static private HashMap<Integer,String> textureMapLoader(JSONObject textureJSON){
        HashMap<Integer,String> textureMap = new HashMap<>();
        textureMap.put(1, (String) ((JSONObject) textureJSON.get("textureMap")).get("1"));
        textureMap.put(3, (String) ((JSONObject) textureJSON.get("textureMap")).get("3"));
        textureMap.put(6, (String) ((JSONObject) textureJSON.get("textureMap")).get("6"));
        textureMap.put(9, (String) ((JSONObject) textureJSON.get("textureMap")).get("9"));
        return textureMap;
    }

    static private EType eTypeSelecter(Integer type){
        switch (type){
            case 0: {
                return EType.HEALING;
            }
            case 1: {
                return EType.DAMAGE;
            }
            case 2: {
                return EType.NEUTRALIZER;
            }
            case 3: {
                return EType.INCREASER;
            }
            default:{
                return null;
            }
        }
    }

    static private EWeapon eWeaponSelecter(Integer type){
        switch (type){
            case 0: {
                return EWeapon.NO_WEAPON;
            }
            case 1: {
                return EWeapon.EXPLOSIVE;
            }
            case 2: {
                return EWeapon.MELEE;
            }
            case 3: {
                return EWeapon.FIRING;
            }
            default:{
                return null;
            }
        }
    }

    static private Item ItemConstructor(JSONObject itemJSON){

        return new Item((String) itemJSON.get("name"),
                eTypeSelecter(((Long) itemJSON.get("type")).intValue()),
                ((Number) itemJSON.get("level")).doubleValue(),
                ((Number) itemJSON.get("scope")).doubleValue(),
                ((Number) itemJSON.get("duration")).doubleValue(),
                ((Number) itemJSON.get("damage")).doubleValue(),
                ((Number) itemJSON.get("exploRange")).doubleValue(),
                eWeaponSelecter(((Long) itemJSON.get("weaponType")).intValue()),
                ((Number) itemJSON.get("ammo")).doubleValue(),
                textureMapLoader(itemJSON),
                (String) itemJSON.get("currentTexture"));
    }

    static public ArrayList<Item> ItemParser(JSONArray itemArrayJSON){

        ArrayList<Item> loadedCharItems= new ArrayList<>();
        //INSTANCE OF CHARACTERS IN ARRAYLIST
        for (int i = 0; i < itemArrayJSON.size(); i++){
            loadedCharItems.add(ItemConstructor((JSONObject) itemArrayJSON.get(i)));
        }
        return loadedCharItems;
    }

    static private Fighter CharacterConstructor(JSONObject characterJSON){

        ArrayList<Item> items = ItemParser((JSONArray) characterJSON.get("items"));

        return new Fighter(
            textureMapLoader(characterJSON),
            (String) characterJSON.get("currentTexture"),
            items,
            items.get(0),
            (String) characterJSON.get("name"),
            ((Long) characterJSON.get("level")).intValue(),
            ((Number) characterJSON.get("experience")).doubleValue(),
            ((Number) characterJSON.get("health")).doubleValue(),
            ((Number) characterJSON.get("defense")).doubleValue(),
            ((Number) characterJSON.get("speed")).doubleValue(),
            ((Number) characterJSON.get("dps")).doubleValue(),
            ((Long) characterJSON.get("spawnLevel")).intValue(),
            ((Long) characterJSON.get("housingSpace")).intValue(),
            ((Long) characterJSON.get("posX")).intValue(),
            ((Long) characterJSON.get("posY")).intValue());
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