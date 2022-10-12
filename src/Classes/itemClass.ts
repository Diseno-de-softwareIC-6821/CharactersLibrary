import { ILeveled } from "../Interfaces/ILeveled";


export abstract class AItem implements ILeveled {
   // private _name: string;

    constructor(
        protected name:string,
        protected type:EType ,
        protected level:number, 
        protected scope:number
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

    levelUp(): void {
        this.level += 1;
        //CODIGO PARA SUBIR DE NIVEL
    }
    levelDown(): void {
        this.level -= 1;
        //CODIGO PARA BAJAR DE NIVEL
    }

  }

// class HealingItem extends AItem{
//     // public HealingItem(): any{

//     // }
// }

// class DamageItem extends AItem{

// }

// class NeutralizerItem extends AItem{

// }

// class IncreaserItem extends AItem{

// }