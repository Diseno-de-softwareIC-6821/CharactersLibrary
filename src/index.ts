// run "npm install" to install dependencies
// run "npm run dev" to run the index.ts file = npx ts-node src/index.ts

import { Character } from "./Classes/Character";

function main(): void {
  console.log("Hello, World!");

  const list = [1, 2, 3, 4, 5];

  const four = list.filter((i) => i === 4)[0];

  console.log(four);

}


main();