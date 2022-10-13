import { IFactory } from "../Interfaces/IFactory";
import { AItem } from "./Item";

class CharacterFactory implements IFactory{


    getObject(eNum: Enumerator<any>) {
        throw new Error("Method not implemented.");
    }
    getN(eNum: Enumerator<any>, n: number) {
        throw new Error("Method not implemented.");
    }

    public fabricateCharacter(
        name: string, 
        speed: number, 
        housingSpace: number, 
        cost:number, 
        spawnLevel:number, 
        dps:number, 
        appearance:Map<string, string>, 
        health: number, 
        items: AItem[],
        type: ECharacter):
        any{
        switch(type){
            case ECharacter.Archer:
                //RETURN ARCHER
                break;

            case ECharacter.Barbarian:
                //RETURN BARBARIAN
                break;
                
            case ECharacter.HogRider:
                //RETURN HOGRIDER
                break;

            case ECharacter.Minion:
                //RETRUN MINION
                break;

            case ECharacter.Pekka:
                //RETURN PEKKA
                break;

            default:
                break;
        }
    }

    // speed: number;
    // housingSpace: number;
    // cost: number;
    // spawnLevel: number;
    // dps: number;
    // appearance: Map<string, string>;
    // health: number;
    // items: AItem[];
    // name: string;


}