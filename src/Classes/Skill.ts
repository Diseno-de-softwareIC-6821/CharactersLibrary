import { AItem } from "./itemClass";

export class Skill extends AItem{ //here need to extends from AItem
    private duration :number;

    constructor(name:string, type:EType , level:number,  scope:number, duration:number){
        super(name, type, level, scope);
        this.duration = duration;
    }

    getDuration():number{
        return this.duration;
    }
    


}