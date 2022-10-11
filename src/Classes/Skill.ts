import { AItem } from "./itemClass";
import { IPrototype } from '../Interfaces/iPrototype';
import { ILeveled } from '../Interfaces/ILeveled';
export class Skill extends AItem implements ILeveled,IPrototype{ //here need to extends from AItem
    private duration :number;

    constructor(name:string, type:EType , level:number,  scope:number, duration:number){
        super(name, type, level, scope);
        this.duration = duration;
    }

    getDuration():number{
        return this.duration;
    }
    levelUp(): void {
        this.level += 1; //set levelUp
        
    }
    levelDown(): void {
        this.level -=1;
    }
    clone(): IPrototype {
        return new Skill(this.name, this.type, this.level, this.scope, this.duration);
    }
    deepClone(): IPrototype {
        //is the same method because the class is not have any object
        return this.clone();
    }

    


}