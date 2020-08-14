package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoons = 3;
		int raccoonsLeftHome = 2;
		int raccoonsLeftOnWoods = raccoons - raccoonsLeftHome;
		System.out.println("Q3- " + raccoonsLeftOnWoods);
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int lessBeesThanFlowers = flowers - bees ;
		System.out.println("Q4- " + lessBeesThanFlowers);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeonEatingBreadcrumbs = 1;
		int newPigeonEatingBreadcrumbs = 1;
		int totalPigeonEatingBreadcrumbs = pigeonEatingBreadcrumbs + newPigeonEatingBreadcrumbs;
		System.out.println("Q5- " + totalPigeonEatingBreadcrumbs);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int initialOwlsSittingOnFence = 3;
		int newOwlsSittingOnFence = 2;
		int totalOwlsOnFence = initialOwlsSittingOnFence + newOwlsSittingOnFence;
		System.out.println("Q6- " + totalOwlsOnFence);
		
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingOnTheirHome = 2;
		int beavesWentSwiming = 1;
		int currentBeaversWorkingOnTheirHome = beaversWorkingOnTheirHome - beavesWentSwiming;
		System.out.println("Q7- " + currentBeaversWorkingOnTheirHome);
		
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSittingOnTreeLimp = 2;
		int newToucansSittingOnTreeLimp = 1;
		int totalToucansSittingOnTreeLimp = toucansSittingOnTreeLimp + newToucansSittingOnTreeLimp;
		System.out.println("Q8- " + totalToucansSittingOnTreeLimp);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int numberOfLessNutsThanSquirrels = squirrels - nuts;
		System.out.println("Q9- " + numberOfLessNutsThanSquirrels);
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
	
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int muffinsBakedInMrsBrierClass = 18;
		int muffinsBakedInMrsMacAdamsClass = 20;
		int muffinsBakedInMrsFlanneryClass = 17;
		int totalMuffinsBakedInFirstGradeClasses = muffinsBakedInMrsBrierClass + muffinsBakedInMrsMacAdamsClass + muffinsBakedInMrsFlanneryClass;
		System.out.println("Q11- " + totalMuffinsBakedInFirstGradeClasses);
				
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyoPriceInCents = 24;
		int whistlePriceInCents = 14;
		int totalCentsMrsHiltSpentOnToys = yoyoPriceInCents + whistlePriceInCents;
		System.out.println("Q12- " + totalCentsMrsHiltSpentOnToys);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		 int numOfLargeMarshmallowsMrsHiltUsed = 8;
		 int numOfMiniMarshmallowsMrsHiltUsed = 10;
		 int totalNumOfMarshmallowsMrsHiltUsed = numOfLargeMarshmallowsMrsHiltUsed + numOfMiniMarshmallowsMrsHiltUsed;
		 System.out.println("Q13- " + totalNumOfMarshmallowsMrsHiltUsed);
		 
		 
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		 int inchesOfSnowAtMrsHiltsHouse = 29;
		 int inchesOfSnowBrecknockSchoolReceived = 17;
		 int inchesOfSnowMrsHiltsHouseHadMoreThanBrecknockSchoole = inchesOfSnowAtMrsHiltsHouse - inchesOfSnowBrecknockSchoolReceived;
		 System.out.println("Q14- " + inchesOfSnowMrsHiltsHouseHadMoreThanBrecknockSchoole);
		 
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		 int toyTruckPriceInDollars = 3;
		 int pencilCasePriceIDollars = 2;
		 int TotalPriceOfThingMrsHiltBought = toyTruckPriceInDollars + pencilCasePriceIDollars;
		 int amountOfDollarsMrsHiltHad = 10;
		 int amountOfDollarsMrsHiltHaveLeft = amountOfDollarsMrsHiltHad - TotalPriceOfThingMrsHiltBought;
		 System.out.println("Q15- " + amountOfDollarsMrsHiltHaveLeft + "$");
		 
				 
       /*16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		 int amountOfMarbelsJoshHad = 16;
		 int amountOfMarbelsJoshLost = 7;
		 int amountOfMarbelsHaveLeftWithJosh = amountOfMarbelsJoshHad - amountOfMarbelsJoshLost;
		 System.out.println("Q16- " + amountOfMarbelsHaveLeftWithJosh);
		 
		 
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		 int numOfShellsMeganHas = 19;
		 int totalNumOfShellsMeganWantToHave = 25;
		 int numOfShellsMeganNeedsToAddToCurrentCollection = totalNumOfShellsMeganWantToHave - numOfShellsMeganHas;
		 System.out.println("Q17- " + numOfShellsMeganNeedsToAddToCurrentCollection);
		 
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		 int totalBalloonsBradHas = 17;
		 int numOfRedBalloonsBradHas = 8;
		 int numOfGreenalloonsBradHas = totalBalloonsBradHas - numOfRedBalloonsBradHas;
		 System.out.println("Q18- " + numOfGreenalloonsBradHas);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		 int initialNumOfBooksOnShelf = 38;
		 int numOfBooksMartaAddedOnShelf = 10;
		 int totalNumOfBooksOnShelf = initialNumOfBooksOnShelf + numOfBooksMartaAddedOnShelf;
		 System.out.println("Q19- " + totalNumOfBooksOnShelf);
		 
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		 int numOfLegsForOneBee = 6;
		 int numOfLegsFor8Bees = numOfLegsForOneBee * 8;
		 System.out.println("Q20- " + numOfLegsFor8Bees); 
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		 double iceCreamPriceInDollars = 0.99;
		 double priceFor_2_IceCreamConesInDollars = iceCreamPriceInDollars * 2;
		 System.out.println("Q21- " + priceFor_2_IceCreamConesInDollars);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int numOfRocksMrsHiltHas = 64;
		int totalNumOfRocksNeededToCompeleteBorder = 125;
		int numOfRocksMrsHiltNeedsMore = totalNumOfRocksNeededToCompeleteBorder - numOfRocksMrsHiltHas;
		System.out.println("Q22- " + numOfRocksMrsHiltNeedsMore);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int totalNumOfMarbelsMrsHiltHad = 38;
		int numOfMarbelsMrsHiltLost = 15;
		int numOfMarbelsMrsHilthasNow = totalNumOfMarbelsMrsHiltHad - numOfMarbelsMrsHiltLost;
		System.out.println("Q23- " + numOfMarbelsMrsHilthasNow);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMilesTheyDrove = 78;
		int milesTheyHadDrivenWhenStoppedForGas = 32;
		int milesHadLeft = totalMilesTheyDrove - milesTheyHadDrivenWhenStoppedForGas;
		System.out.println("Q24- " + milesHadLeft);
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		float hoursMrsHiltSpentOnSaterdayMorning = 1.50F;
		float hoursMrsHiltSpentOnSaterdayAfternoon = 0.75F;
		double totalhoursMrsHiltSpentOnShovelingSnow = hoursMrsHiltSpentOnSaterdayMorning + hoursMrsHiltSpentOnSaterdayAfternoon;
		System.out.println("Q25- " + totalhoursMrsHiltSpentOnShovelingSnow);
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int numOFHotDogsMrsHiltBought = 6;
		float priceForEachHotDog = 0.5F;
		double totalMoneyMrsHiltSpentOnHotDogs = (int)numOFHotDogsMrsHiltBought * priceForEachHotDog;
		System.out.println("Q26- " + totalMoneyMrsHiltSpentOnHotDogs);
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int mrsHiltHasInCents = 50;
		int priceOfOnePencilInCents = 7;
		int numOfPencilsMrsHiltCanBuy = 50 / 7;
		System.out.println("Q27- " + numOfPencilsMrsHiltCanBuy);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalNumOfButterfliesMrsHiltSaw = 33;
		int numOfOrangeButterFlies = 20;
		int numOfRedButterFlies = totalNumOfButterfliesMrsHiltSaw - numOfOrangeButterFlies;
		System.out.println("Q28- " + numOfRedButterFlies);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		float amountOfMoneyKeteGaveToClerck = 1.00F;
		float costOfCandy = 0.54F;
		float amountOfChangeKateGetBack = amountOfMoneyKeteGaveToClerck - costOfCandy;
		System.out.println("Q29- " + amountOfChangeKateGetBack);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int numOfTreesMarkHas = 13;
		int numOfTreesMarkWantToPlant = 12;
		int totalTreesMarkWillHave = numOfTreesMarkHas + numOfTreesMarkWantToPlant;
		System.out.println("Q30- " + totalTreesMarkWillHave);
				
        /* 31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int numOfDaysJoyWillSeeHerGrandma = 2;
		int numOfHoursPerDay = 24;
		int totalHoursLeftForJoyToSeeHerGrandma = numOfDaysJoyWillSeeHerGrandma * numOfHoursPerDay;
		System.out.println("Q31- " + totalHoursLeftForJoyToSeeHerGrandma);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numOfCousinsKimHas = 4;
		int numOfGumsForEachCousin = 5;
		int totalNumOfGumsKimNeedsToHave = numOfCousinsKimHas * numOfGumsForEachCousin;
		System.out.println("Q32- " + totalNumOfGumsKimNeedsToHave);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int amountOfMoneyDanHadInDollars = 3;
		int candyPriceInDollars = 1;
		int moneyLeftWithDan = amountOfMoneyDanHadInDollars - candyPriceInDollars;
		System.out.println("Q33- " + moneyLeftWithDan);
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int totalNumOfBoatsInLake = 5;
		int nuOfPeopleOnEachBoat = 3;
		int totalNumOfPeopleInLake = totalNumOfBoatsInLake * nuOfPeopleOnEachBoat;
		System.out.println("Q34- " + totalNumOfPeopleInLake);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int numOfLegosEllenHad = 380;
		int numOFLegosEllenLost = 57;
		int numOFLEgogsEllenHaveLeft = numOfLegosEllenHad - numOFLegosEllenLost;
		System.out.println("Q35- " + numOFLEgogsEllenHaveLeft);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int numOfMuffinsArtherBaked = 35;
		int totalNumOfMuffinsArtherWantToBake = 83;
		int numOfMuffinsArtherNeedToBakeMore = totalNumOfMuffinsArtherWantToBake - numOfMuffinsArtherBaked;
		System.out.println("Q36- " + numOfMuffinsArtherNeedToBakeMore);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int numOfCryayonsWillyHas = 1400;
		int numOfCryayonsLucyHas = 290;
		int numOfCryayonsWillyHasOverLucy = numOfCryayonsWillyHas - numOfCryayonsLucyHas;
		System.out.println("Q37- " + numOfCryayonsWillyHasOverLucy);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numOfStickersOnOnePage = 10;
		int totalNumOFPages = 22;
		int totalNumOfStickersFor22Pages = numOfStickersOnOnePage * totalNumOFPages;
		System.out.println("Q38- " + totalNumOfStickersFor22Pages);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalNumOfCupcakes = 96;
		int numOfChildren = 8;
		int numOfCupcakesForEachChild = totalNumOfCupcakes / numOfChildren;
		System.out.println("Q39- " + numOfCupcakesForEachChild);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalNumOfCookies = 47;
		int numOfCookiesInEachJar = 6;
		int numOfLeftCookies = totalNumOfCookies % numOfCookiesInEachJar;
		System.out.println("Q40- " + numOfLeftCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalNumOfCroissantsMarianMade = 59;
		int numOfNeighbors = 8;
		int numOfCroissantsWillRemainWithMarian = totalNumOfCroissantsMarianMade % numOfNeighbors;
		System.out.println("Q41- " + numOfCroissantsWillRemainWithMarian);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int numOFCookiesOnEachTray = 12;
		int totalNumOfCookiesSheWantToBake = 276;
		int totalNumOfTraysToMake276Cookies = totalNumOfCookiesSheWantToBake / numOFCookiesOnEachTray;
		System.out.println("Q42- " + totalNumOfTraysToMake276Cookies);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalPretzelsMarianMade = 480;
		int PretzelsPerServing = 12;
		int totalServings = totalPretzelsMarianMade / PretzelsPerServing;
		System.out.println("Q43- " + totalServings);
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalCupcakes = 53;
		int cupcakesLeftHome = 2;
		int cupcakesWillBeGiven = totalCupcakes - cupcakesLeftHome;
		int cupcakesInEachBox = 3;
		int totalcupcakeBoxesWillBeGiven = cupcakesWillBeGiven / cupcakesInEachBox;
		System.out.println("Q44- " + totalcupcakeBoxesWillBeGiven);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int totalCarrotSticks = 74;
		int numOfPeople = 12;
		int remainCarrotSticks = totalCarrotSticks % numOfPeople;
		System.out.println("Q45- " + remainCarrotSticks);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBears = 98;
		int teddyBearsOnEachShelf = 7;
		int totalShelfs = totalTeddyBears / teddyBearsOnEachShelf;
		System.out.println("Q46- " + totalShelfs);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalPictures = 480;
		int picturesEachAlbumCanContain = 20;
		int albumsToCarry480Picture = totalPictures / picturesEachAlbumCanContain;
		System.out.println("Q47- " + albumsToCarry480Picture);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalCards = 94;
		int numOfCardsInEachFilledBoxes = 8; 
		int boxesWereFilled = totalCards / numOfCardsInEachFilledBoxes;
		int cardsLeftInUnfilledBox = totalCards % numOfCardsInEachFilledBoxes;
		System.out.println("Q48- " + "boxes that is filled: " + boxesWereFilled + "   number of cards in the unfilled box: " + cardsLeftInUnfilledBox);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalBooks = 210;
		int totalShelves = 10;
		int booksOnEachShelf = totalBooks / totalShelves;
		System.out.println("Q49- " + booksOnEachShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int totalCroissantsCristinaBaked = 17;
		int numOfGuests = 7;
		int croissantsForEachGuest = totalCroissantsCristinaBaked / numOfGuests;
		System.out.println("Q50- " + croissantsForEachGuest);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
