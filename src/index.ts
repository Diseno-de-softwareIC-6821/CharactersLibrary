// run "npm install" to install dependencies
// run "npm run dev" to run the index.ts file = npx ts-node src/index.ts


import { CharacterFactory } from "./Factories/CharacterFactory";
import { ItemFactory } from "./Factories/ItemFactory";

import { Character } from "./Classes/Character";
import { Item } from "./Classes/Item";

function main(): void {

  const itemFactory = new ItemFactory();
  const characterFactory = new CharacterFactory(itemFactory);

  const esbirro = new Character.CharacterBuilder()
    .setName("Pekka")
    .setLevel(10)
    .setExperience(0)
    .setHealth(1000)
    .setDamage(15)
    .setDefense(20)
    .setSpeed(1)
    .setDps(5)
    .setCost(0)
    .setSpawnLevel(5000)
    .setHousingSpace(5)
    .setPosX(0)
    .setPosY(0)
    .setTextureMap(new Map<number, string>([[0, "Pekka.png"]]))
    .setCurrentTexture(0)
    .setItems([itemFactory.getDeepClone("Espada", 1)[0]])
    .setSelectedItem(itemFactory.getDeepClone("Espada", 1)[0])
    .build();

  console.log(esbirro.toJson());

}


main();