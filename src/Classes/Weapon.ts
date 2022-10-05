import { AItem } from "./itemClass";

export class Weapon extends AItem{
    private damage :number;
    private exploRange :number;
    private weaponType :eWeapon;
    private ammo :number;

    constructor(name:string, type:EType , level:number,  scope:number, damage:number, exploRange:number, weaponType:eWeapon, ammo:number){
        super(name, type, level, scope);
        this.damage = damage;
        this.exploRange = exploRange;
        this.weaponType = weaponType;
        this.ammo = ammo;
    }

    getDamage():number{
        return this.damage;
    }

    getExploRange():number{
        return this.exploRange;
    }

    getWeaponType():eWeapon{
        return this.weaponType;
    }
    
    getAmmo():number{
        return this.ammo;
    }
}