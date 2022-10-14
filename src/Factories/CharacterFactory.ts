import { Character } from "../Classes/Character";
import { Item } from "../Classes/Item";
import { IPrototypeFactory } from "../Interfaces/IPrototypeFactory";

import CharacterBlueprint from "../Json/CharacterBlueprints.json";
import { ItemFactory } from "./ItemFactory";

export class CharacterFactory implements IPrototypeFactory{

    prototypes: Map<string, Character> = new Map<string, Character>();

    constructor(
        private itemFactory: ItemFactory
    ){

        for(let i = 0; i < CharacterBlueprint.length; i++){

            const element = CharacterBlueprint[i];

            // create Map for textureMap object
            let textureMap: Map<number, string> = new Map<number, string>();
            Object.entries(element.textureMap).forEach(([key, value]) => {
                textureMap.set(Number(key), value);
            });

            let items: Item[] = [];
            element.items.forEach((item) => {
                items.push(this.itemFactory.getDeepClone(item.name, 1)[0]);
            })

            this.addPrototype(element.name, new Character(
                textureMap,
                element.currentTexture,
                items,
                items[0],
                element.name,
                element.level,
                element.experience,
                element.health,
                element.damage,
                element.defense,
                element.speed,
                element.dps,
                element.cost,
                element.spawnLevel,
                element.housingSpace,
                element.posX,
                element.posY
            ))
        }

    }

    getClone(type: string, qty: number): Character[] {
        
        let prototypes: Character[] = [];

        for (let i = 0; i < qty; i++) {
            prototypes.push(this.prototypes.get(type)!.clone());
        }

        return prototypes;

    }


    getDeepClone(type: string, qty: number): Character[] {
        
        let prototypes: Character[] = [];

        for (let i = 0; i < qty; i++) {
            prototypes.push(this.prototypes.get(type)!.deepClone());
        }
    
        return prototypes;
        
    }
    addPrototype(type: string, prototype: Character): void {
        this.prototypes.set(type, prototype);
    }


}