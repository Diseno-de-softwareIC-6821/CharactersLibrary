import { IJson } from "../Interfaces/iJson";
import { ILeveled } from "../Interfaces/ILeveled";
import { IPrototype } from "../Interfaces/iPrototype";
import { Item } from "./Item";

export class Character implements ILeveled, IPrototype, IJson {
    
    textureMap: Map<number, string>;
    currentTexture: string;

    items: Item[];
    selectedItem: Item | undefined;

    name: string;
    level: number;
    experience: number;

    health: number;
    damage: number;
    defense: number;
    speed: number;
    dps: number;

    cost: number;

    spawnLevel: number;
    housingSpace: number;
    posX: number;
    posY: number;
    

    constructor(
        textureMap: Map<number, string>, 
        currentTexture: string,
        items: Item[], 
        selectedItem: Item | undefined,
        name: string,
        level: number, 
        experience: number,
        health: number,
        damage: number,
        defense: number, 
        speed: number, 
        dps: number, 
        cost: number, 
        spawnLevel: number, 
        housingSpace: number, 
        posX: number,
        posY: number
        ) 
        {
        this.textureMap = textureMap;
        this.currentTexture = currentTexture;
        this.items = items;
        this.selectedItem = selectedItem;
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.dps = dps;
        this.cost = cost;
        this.spawnLevel = spawnLevel;
        this.housingSpace = housingSpace;
        this.posX = posX;
        this.posY = posY;
    }

    levelUp(): void {
        if(this.level < 100 && this.experience >= 100) {
            this.level += 1
        }
    }

    levelDown(): void {
        if (this.level > 0 && this.experience < 0) {
            this.level -= 1;
        }
    }

    getItems(): Item[] {
        return this.items;
    }

    getItemNames(): string[] {
        return this.items.map((item) => item.getName());
    }

    setSelectedItem(itemName: string): void {
        this.selectedItem = this.items.filter((item: Item) => item.getName() === itemName)[0];
    }

    move(posX: number, posY: number): void{
        this.posX += posX;
        this.posY += posY;
    }

    attack(): number{
        let totalDamage = this.damage;
        if(this.selectedItem){
            totalDamage += this.selectedItem.getDamage();
        }
        return totalDamage;
    }

    gainExperience(experience: number): void {
        this.experience += experience;
    }

    clone(): Character {
        return new Character(
            this.textureMap,
            this.currentTexture,
            this.items,
            this.selectedItem,
            this.name,
            this.level,
            this.experience,
            this.health,
            this.damage,
            this.defense,
            this.speed,
            this.dps,
            this.cost ,
            this.spawnLevel,
            this.housingSpace,
            this.posX ,
            this.posY,
        );
    }

    deepClone(): Character {
        //deep clone of appearance
        const textureMap = new Map<number, string>();
        this.textureMap.forEach((value, key) => {
            textureMap.set(key, value);
        });

        //deep clone of items
        const items = this.items.map(item => item.deepClone());

        //deep clone of selectedItem
        const selectedItem = this.selectedItem?.deepClone();

        return new Character(
            textureMap,
            this.currentTexture,
            items,
            selectedItem,
            this.name,
            this.level,
            this.experience,
            this.health,
            this.damage,
            this.defense,
            this.speed,
            this.dps,
            this.cost ,
            this.spawnLevel,
            this.housingSpace,
            this.posX ,
            this.posY,
        );

    }

    toJson(): string {
        return JSON.stringify(this);
    }



    // Character builder inner class
    static CharacterBuilder = class CharacterBuilder{
        textureMap: Map<number, string>;
        currentTexture: string;

        items: Item[];
        selectedItem: Item | undefined;
    
        name: string;
        level: number;
        experience: number;
    
        health: number;
        damage: number;
        defense: number;
        speed: number;
        dps: number;
    
        cost: number;
    
        spawnLevel: number;
        housingSpace: number;
        posX: number;
        posY: number;

        constructor() {
            
            this.textureMap = new Map<number, string>();
            this.currentTexture = "";

            this.items = [];
            this.selectedItem = undefined;

            this.name = "";
            this.level = 0;
            this.experience = 0;

            this.health = 0;
            this.damage = 0;
            this.defense = 0;
            this.speed = 0;
            this.dps = 0;
            this.cost = 0;

            this.spawnLevel = 0;
            this.housingSpace = 0;
            this.posX = 0;
            this.posY = 0;

        }

        
        setTextureMap(textureMap: Map<number, string>): CharacterBuilder {
            this.textureMap = textureMap;
            return this;
        }

        setCurrentTexture(currentTexture: string): CharacterBuilder {
            this.currentTexture = currentTexture;
            return this;
        }

        setItems(items: Item[]): CharacterBuilder {
            this.items = items;
            return this;
        }

        setSelectedItem(selectedItem: Item): CharacterBuilder {
            this.selectedItem = selectedItem;
            return this;
        }

        setName(name: string): CharacterBuilder {
            this.name = name;
            return this;
        }

        setLevel(level: number): CharacterBuilder {
            this.level = level;
            return this;
        }

        setExperience(experience: number): CharacterBuilder {
            this.experience = experience;
            return this;
        }

        setHealth(health: number): CharacterBuilder {
            this.health = health;
            return this;
        }

        
        setDamage(damage: number): CharacterBuilder {
            this.damage = damage;
            return this;
        }

        setDefense(defense: number): CharacterBuilder {
            this.defense = defense;
            return this;
        }

        setSpeed(speed: number): CharacterBuilder{
            this.speed = speed;
            return this;
        }
        
        setDps(dps: number): CharacterBuilder {
            this.dps = dps;
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

        setHousingSpace(housingSpace: number): CharacterBuilder {
            this.housingSpace = housingSpace;
            return this;
        }

        setPosX(posX: number): CharacterBuilder {
            this.posX = posX;
            return this;
        }

        setPosY(posY: number): CharacterBuilder {
            this.posY = posY;
            return this;
        }

        addImage(level: number, image: string): CharacterBuilder {
            this.textureMap.set(level, image);
            return this;
        }

        addItem(item: Item): CharacterBuilder {
            this.items.push(item);
            return this;
        }

        build(): Character {
            return new Character(
                this.textureMap,
                this.currentTexture,
                this.items,
                this.selectedItem,
                this.name,
                this.level,
                this.experience,
                this.health,
                this.damage,
                this.defense,
                this.speed,
                this.dps,
                this.cost,
                this.spawnLevel,
                this.housingSpace,
                this.posX,
                this.posY
            );
        }

    }
}