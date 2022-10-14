import { Item } from '../Classes/Item';
import { IPrototype } from './iPrototype';

export interface IPrototypeFactory {

    prototypes: Map<string, IPrototype>;

    getClone(type: string, qty: number): any[];
    getDeepClone(type: string, qty: number): any[];
    addPrototype(type: string, prototype: IPrototype): void;

}