class Weapon extends AItem{
    private damage :number;
    private exploRange :number;
    private weaponType :eWeapon;

    constructor(name:string, type:EType , level:number,  scope:number, damage:number, exploRange:number, weaponType:eWeapon){
        super(name, type, level, scope);
        this.damage = damage;
        this.exploRange = exploRange;
        this.weaponType = weaponType;
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
}