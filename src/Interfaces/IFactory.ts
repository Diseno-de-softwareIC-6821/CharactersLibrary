import { Character } from "../Classes/Character";
import { AItem } from "../Classes/itemClass";

export interface IFactory {

    getObject(eNum: Enumerator): any;
    getN(eNum: Enumerator, n: number): any;

   }
 