
import { IPrototypeFactory } from "../Interfaces/IPrototypeFactory";
import { IPrototype } from "../Interfaces/iPrototype";
import { Item } from "../Classes/Item";


export class ItemFactory implements IPrototypeFactory{
    
    prototypes: Map<string, Item> = new Map<string, Item>();

    constructor(){
        this.addPrototype("item", new Item(
            "Sword",
            0,
            10,
            10,
            10,
            10,
            10,
            0,
            10,
            new Map<number, string>([[0, "texture1"], [1, "texture2"]]),
            "texture1"
          ));
    }

    getClone(type: string, qty: number): Item[] {

        let prototypes: Item[] = [];

        for (let i = 0; i < qty; i++) {
            prototypes.push(this.prototypes.get(type)!.clone());
        }

        return prototypes;
    }
    getDeepClone(type: string, qty: number): Item[] {

        let prototypes: Item[] = [];

        for (let i = 0; i < qty; i++) {
            prototypes.push(this.prototypes.get(type)!.deepClone());
        }
    
        return prototypes;
    }

    addPrototype(type: string, prototype: Item): void {
        this.prototypes.set(type, prototype);
    }


}

