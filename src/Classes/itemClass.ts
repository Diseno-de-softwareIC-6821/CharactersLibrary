import { ILeveled } from "../Interfaces/iLeveled";


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
  