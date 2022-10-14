// run "npm install" to install dependencies
// run "npm run dev" to run the index.ts file = npx ts-node src/index.ts


import { CharacterFactory } from "./Factories/CharacterFactory";
import { ItemFactory } from "./Factories/ItemFactory";

import { Character } from "./Classes/Character";
import { Item } from "./Classes/Item";

function main(): void {

  const itemFactory = new ItemFactory();
  const characterFactory = new CharacterFactory(itemFactory);

    
  // log the character as json
  console.log(characterFactory.getClone("Barbaro", 1)[0].toJson());

}


main();