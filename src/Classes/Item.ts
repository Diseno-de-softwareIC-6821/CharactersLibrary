import { ILeveled } from "../Interfaces/ILeveled";
import { IPrototype } from "../Interfaces/iPrototype";


export class Item implements ILeveled, IPrototype {

    constructor(
        private name:string,
        private type:EType ,
        private level:number, 
        private scope:number,
        private duration:number, 
        private damage :number,
        private exploRange :number,
        private weaponType :eWeapon,
        private ammo :number,
        private textureMap: Map<number, string>, 
        private currentTexture: string,
        ){
        this.name = name;
        this.type = type;
        this.level = level;
        this.scope = scope;
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
  