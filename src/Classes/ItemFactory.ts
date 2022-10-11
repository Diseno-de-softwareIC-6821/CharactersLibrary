import { IFactory } from "../Interfaces/IFactory";

class ItemFactory implements IFactory{
    
    operation(): string {
        throw new Error("Method not implemented.");
    }
   

   

}