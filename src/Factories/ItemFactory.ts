
import { IPrototypeFactory } from "../Interfaces/IPrototypeFactory";
import { Item } from "../Classes/Item";

import ItemBlueprint from "../Json/ItemBlueprint.json";

export class ItemFactory implements IPrototypeFactory{
    
    prototypes: Map<string, Item> = new Map<string, Item>();

    constructor(){

        for (let i = 0; i < ItemBlueprint.length; i++) {
            const element = ItemBlueprint[i];

            // create Map for textureMap object
            let textureMap: Map<number, string> = new Map<number, string>();
            Object.entries(element.textureMap).forEach(([key, value]) => {
                textureMap.set(Number(key), value);
            });

            this.addPrototype(element.name, new Item(
                element.name,
                element.type,
                element.level,
                element.scope,
                element.duration,
                element.damage,
                element.exploRange,
                element.weaponType,
                element.ammo,
                textureMap,
                element.currentTexture,
            ));
        }
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

