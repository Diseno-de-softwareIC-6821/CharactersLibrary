
import {IPrototypeFactory} from "../Interfaces/IPrototypeFactory";
import {IPrototype} from "../Interfaces/iPrototype";

export class ItemFactory implements IPrototypeFactory{
    
        constructor(
            public prototypes: Map<string, IPrototype> = new Map<string, IPrototype>()
        
        ) {}

    getClone(type: string): IPrototype {
        return this.prototypes.get(type).clone();
    }
    getDeepClone(type: string): IPrototype {
        return this.prototypes.get(type).deepClone();
    }
    addPrototype(type: string, prototype: IPrototype): void {
        this.prototypes.set(type, prototype);
    }

}

