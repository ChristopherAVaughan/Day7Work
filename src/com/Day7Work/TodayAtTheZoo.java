package com.Day7Work;

import java.util.ArrayList;

public class TodayAtTheZoo {

	public static void main(String[] args) {

		ArrayList<AnimalsZoo> ourZoo = new ArrayList<>(3);

		Anaconda animalA = new Anaconda("anaconda", "reptile", "green", 12, 1, 500, 20, 0, 0, "slithers", "jungle",
				true, "deattachable jaw");
		Chupacabra animalB = new Chupacabra("chupacabra", "likely mammal", "Brown", 150, 12, 300, 7, 2, 2, "walks",
				"Puerto Rico", true, true);
		DartFrog animalC = new DartFrog("dart frog", "amphibian", "multiple bright colors", 17, 1, 1, 1, 4, 0, "jumps",
				"humid", false, true);
		Elephant animalD = new Elephant("elephant", "mammal", "grey", 50, 11, 12000, 16, 4, 0, "walks",
				"Asia and Africa", false, true);
		Lion animalE = new Lion("lion", "mammal", "brown", 20, 3, 450, 7, 4, 0, "walks", "Africa", true, true);
		Ostrich animalF = new Ostrich("ostrich", "mammal", "grey", 10, 8, 140, 4, 2, 2, "walks", "arid", false, true);
		Panda animalG = new Panda("panda", "mammal", "black and white", 28, 5, 250, 4, 2, 2, "walks on 4 legs", "Asia",
				false, false);
		SeaLion animalH = new SeaLion("sea lion", "mammal", "grey", 12, 3, 300, 5, 0, 2, "swims", "water", true, true);
		VampireBats animalI = new VampireBats("vampire bat", "mammal", "black", 3, 1, 1, 1, 2, 2, "flies", "desert",
				true, true);
		Zebra animalJ = new Zebra("zebra", "mammal", "black and white", 20, 6, 500, 7, 4, 0, "all fours", "Africa",
				false, true);

		ourZoo.add(animalA);
		ourZoo.add(animalB);
		ourZoo.add(animalC);
		ourZoo.add(animalD);
		ourZoo.add(animalE);
		ourZoo.add(animalF);
		ourZoo.add(animalG);
		ourZoo.add(animalH);
		ourZoo.add(animalI);
		ourZoo.add(animalJ);

		for (int i = 0; i < 10; i++) {
			System.out.println("Today at the zoo I saw a " + ourZoo.get(i).toString());

		}
	}
}
