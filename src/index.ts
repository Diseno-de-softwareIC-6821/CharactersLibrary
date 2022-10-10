// run "npm install" to install dependencies
// run "npm run dev" to run the index.ts file = npx ts-node src/index.ts

import { Character } from "./Classes/Character";

function main(): void {
  console.log("Hello, World!");

  const character = new Character.CharacterBuilder()
    .setSpeed(10)
    .setHousingSpace(10)
    .setCost(10)
    .setSpawnLevel(10)
    .setDps(10)
    .setAppearance(new Map([["head", "head"]]))
    .setHealth(10)
    .setItems([])
    .setName("name")
    .build();

  const character2 = character.clone();
  character.appearance.set('head', 'head2');
  console.log(character2.appearance.get('head'));

}


main();