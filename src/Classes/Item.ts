import { ILeveled } from "../Interfaces/ILeveled";
import { IPrototype } from "../Interfaces/iPrototype";

import { EType } from "../Enums/EType";
import { EWeapon } from "../Enums/EWeapon";

export class Item implements ILeveled, IPrototype {

    name:string
    type:EType 
    level:number 
    scope:number
    duration:number 
    damage :number
    exploRange :number
    weaponType :EWeapon
    ammo :number
    textureMap: Map<number, string>
    currentTexture: string

    constructor(
        name:string,
        type:EType ,
        level:number, 
        scope:number,
        duration:number, 
        damage :number,
        exploRange :number,
        weaponType :EWeapon,
        ammo :number,
        textureMap: Map<number, string>, 
        currentTexture: string,
        ){
        this.name = name;
        this.type = type;
        this.level = level;
        this.scope = scope;
        this.duration = duration;
        this.damage = damage;
        this.exploRange = exploRange;
        this.weaponType = weaponType;
        this.ammo = ammo;
        this.textureMap = textureMap;
        this.currentTexture = currentTexture;
    }

    getName():string{
        return this.name;
    }
    getType():EType{
        return this.type;
    }
    getLevel():number{
        return this.level;
    }
    getScope():number{
        return this.scope;
    }
    getDamage():number{
        return this.damage;
    }
    getTextureMap(): Map<number, string>{
        return this.textureMap;
    }
    //
   
    
    getDuration():number{
        return this.duration;
    }
    levelUp(): void {
        this.level += 1; //set levelUp
        
    }
    levelDown(): void {
        this.level -=1;
    }
 

    toJson(): string {

        const textureMapObject: any = {};
        this.textureMap.forEach((value, key) => {
            textureMapObject[key] = value;
        });

        let objectJson: any =  {
            name: this.name,
            type: this.type,
            level: this.level,
            scope: this.scope,
            duration: this.duration,
            damage: this.damage,
            exploRange: this.exploRange,
            weaponType: this.weaponType,
            ammo: this.ammo,
            textureMap: textureMapObject,
            currentTexture: this.currentTexture
        }

        return JSON.stringify(objectJson);

    }


    // Declarations in order to be able to use the methods in Character class before they are implemented
    clone(): Item{
        return new Item(this.name, 
            this.type, this.level,
            this.scope,
            this.duration, 
            this.damage, 
            this.exploRange, 
            this.weaponType, 
            this.ammo, 
            this.textureMap, 
            this.currentTexture);
    }
    deepClone(): Item{
        const textureMap = new Map<number, string>();
        this.textureMap.forEach((value, key) => {
            textureMap.set(key, value);
        });

        return  new Item(this.name, 
            this.type, this.level,
            this.scope,
            this.duration, 
            this.damage, 
            this.exploRange, 
            this.weaponType, 
            this.ammo, 
            textureMap, 
            this.currentTexture);
    }

  }
  