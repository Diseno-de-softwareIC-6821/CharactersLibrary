// run "npm install" to install dependencies
// run "npm run dev" to run the index.ts file = npx ts-node src/index.ts


import { CharacterFactory } from "./Factories/CharacterFactory";
import { ItemFactory } from "./Factories/ItemFactory";

import { Character } from "./Classes/Character";
import { Item } from "./Classes/Item";

function main(): void {

  const itemFactory = new ItemFactory();

  const character = new Character.CharacterBuilder().setTextureMap(new Map<number, string>([[0, "texture1"], [1, "texture2"]]))
    .setCurrentTexture(0)
    .setItems(itemFactory.getClone("item", 2))
    .setSelectedItem(undefined)
    .setName("test")
    .setLevel(1)
    .setExperience(0)
    .setHealth(100)
    .setDamage(10)
    .setDefense(10)
    .setSpeed(10)
    .setCost(10)
    .setHousingSpace(10)
    .setPosX(0)
    .setPosY(0)
    .build()

    
  // log the character as json
  console.log(character.toJson());

}


main();