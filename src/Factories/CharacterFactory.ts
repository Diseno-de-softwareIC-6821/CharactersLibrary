import { IPrototype } from "../Interfaces/iPrototype";
import { IPrototypeFactory } from "../Interfaces/IPrototypeFactory";

export class CharacterFactory implements IPrototypeFactory{

    prototypes: Map<string, IPrototype> = new Map<string, IPrototype>();

    constructor(){}

    getClone(type: string, qty: number): IPrototype[] {
        
        let prototypes: IPrototype[] = [];

        for (let i = 0; i < qty; i++) {
            prototypes.push(this.prototypes.get(type)!.clone());
        }

        return prototypes;

    }


    getDeepClone(type: string, qty: number): IPrototype[] {
        
        let prototypes: IPrototype[] = [];

        for (let i = 0; i < qty; i++) {
            prototypes.push(this.prototypes.get(type)!.deepClone());
        }
    
        return prototypes;
        
    }
    addPrototype(type: string, prototype: IPrototype): void {
        this.prototypes.set(type, prototype);
    }


}