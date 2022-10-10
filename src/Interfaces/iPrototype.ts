export interface IPrototype {
    clone(): IPrototype;
    deepClone(): IPrototype;
}