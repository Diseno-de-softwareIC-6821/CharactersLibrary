import { IFactory } from "../Interfaces/IFactory";
import { AItem } from "./Item";

class ItemFactory implements IFactory{


    getObject(eNum: Enumerator<any>) {
        throw new Error("Method not implemented.");
    }

    getN(eNum: Enumerator<any>, n: number) {
        throw new Error("Method not implemented.");
    }

    public fabricateObject(
        name: string,
        type: EType, 
        level:number, 
        scope:number): 
        any{//SI PONGO AITEM ME LANZA ERROR (AYUDA XD)
        
        switch(type){
            case EType.HEALING:
                break;

            case EType.DAMAGE:
                break;
                
            case EType.INCREASER:
                break;

            case EType.NEUTRALIZER:
                break;

            default:
                break;
        }
    }

    // HEALING,
    // DAMAGE,
    // NEUTRALIZER,
    // INCREASER

    // protected name:string,
    // protected type:EType ,
    // protected level:number, 
    // protected scope:number
    
   

   

}