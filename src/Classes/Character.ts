import { ILeveled } from "../Interfaces/ILeveled";
import { AItem } from "./Item";

export class Character implements ILeveled {
    
    speed: number;
    housingSpace: number;
    cost: number;
    spawnLevel: number;
    dps: number;
    appearance: Map<string, string>;
    health: number;
    items: AItem[];
    name: string;

    constructor(speed: number, housingSpace: number, cost: number, spawnLevel: number, dps: number, appearance: Map<string, string>, health: number, items: AItem[], name: string) {
        this.speed = speed;
        this.housingSpace = housingSpace;
        this.cost = cost;
        this.spawnLevel = spawnLevel;
        this.dps = dps;
        this.appearance = appearance;
        this.health = health;
        this.items = items;
        this.name = name;
    }

    levelUp(): void {
        throw new Error("Method not implemented.");
    }

    levelDown(): void {
        throw new Error("Method not implemented.");
    }

    // Character builder inner class
    static CharacterBuilder = class CharacterBuilder{
        private speed: number;
        private housingSpace: number;
        private cost: number;
        private spawnLevel: number;
        private dps: number;
        private appearance: Map<string, string>;
        private health: number;
        private items: AItem[];
        private name: string;

        constructor() {
            this.speed = 0;
            this.housingSpace = 0;
            this.cost = 0;
            this.spawnLevel = 0;
            this.dps = 0;
            this.appearance = new Map<string, string>();
            this.health = 0;
            this.items = [];
            this.name = "";
        }

        setSpeed(speed: number): CharacterBuilder{
            this.speed = speed;
            return this;
        }

        setHousingSpace(housingSpace: number): CharacterBuilder {
            this.housingSpace = housingSpace;
            return this;
        }

        setCost(cost: number): CharacterBuilder {
            this.cost = cost;
            return this;
        }

        setSpawnLevel(spawnLevel: number): CharacterBuilder {
            this.spawnLevel = spawnLevel;
            return this;
        }

        setDps(dps: number): CharacterBuilder {
            this.dps = dps;
            return this;
        }

        setAppearance(appearance: Map<string, string>): CharacterBuilder {
            this.appearance = appearance;
            return this;
        }

        addImage(image: string, name: string): CharacterBuilder {
            this.appearance.set(name, image);
            return this;
        }

        setHealth(health: number): CharacterBuilder {
            this.health = health;
            return this;
        }

        setItems(items: AItem[]): CharacterBuilder {
            this.items = items;
            return this;
        }

        addItem(item: AItem): CharacterBuilder {
                
            this.items.push(item);
            return this;
        }
        

        setName(name: string): CharacterBuilder {
            this.name = name;
            return this;
        }

        build(): Character {
            return new Character(this.speed, this.housingSpace, this.cost, this.spawnLevel, this.dps, this.appearance, this.health, this.items, this.name);
        }

    }
}

