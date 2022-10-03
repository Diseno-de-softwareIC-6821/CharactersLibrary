
abstract class AItem implements ILeveled {
   // private _name: string;

    constructor(name:string,type:EType ,level:number, scope:number){
    }

    set name(newName: string){
        this.name = newName;
    }
    set type(newType: EType){
        this.type = newType;
    }   
    set level(newLevel: number){
        this.level = newLevel;
    }
    set scope(newScope: number){
        this.scope = newScope
    }

    get name():string{
        return this.name;
    }
    get type():EType{
        return this.type;
    }
    get level():number{
        return this.level;
    }
    get scope():number{
        return this.scope;
    }

    levelUp(): void {
        this.level += 1;
        //CODIGO PARA SUBIR DE NIVEL
    }
    levelDown(): void {
        this.level -= 1;
        
    }

  }
  