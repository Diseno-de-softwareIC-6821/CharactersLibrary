import { IPrototype } from './iPrototype';

export interface IPrototypeFactory {

    prototypes: Map<string, IPrototype>;

    getClone(type: string, qty: number): IPrototype[];
    getDeepClone(type: string, qty: number): IPrototype[];
    addPrototype(type: string, prototype: IPrototype): void;

}