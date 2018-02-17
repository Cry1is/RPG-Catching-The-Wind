# RPG-Catching-The-Wind
"Catching The Wind"

Creating a Game Using Skills Learned in Computer Science

Zachary Suzuki (2017-Now)

To start this program, open the class and select "void main(String[] args)
in the "CatchingTheWind" class and click "ok" in the following menu. 

CHANGES IN PROGRESS: 
- adding the tips option so that the user can toggle whether or not tips will occur throughout the game(this will replace the info method).

- adding names to the items in the sell method. 

- adding code to the fight method to facilitate stats, a health bar, and damage points rather than a simple comparison method. 
	- adding a calculator to calculate increasing levels indefinitely. 
	- adding code that allows lvl to affect stats in the fight code. 
	- adding more options to the buy method. 

- adding a graphics component to allow the user to physically move to the different places.  

VERSION HISTORY: 

v0.2.7

code changes: 
- replaced "but nothing happens" in the Chance code with storyline
- changed lookChance from 2 seconds to 5 seconds
- changed chance to do fight from 30% to 25%
- changed buy so that each item you purchase increases the cost of that item
- added the ability to use numbers above the number of items you have in sell, and instead sell all of that item
- added the ability to choose whether or not to continue playing after save

bug fixes: 
- sell sometimes didn't subtract items from the inventory
- Graphics was being cleared after it finished occuring
- actions sometimes didn't run
- account method sometimes didn't run 
- "What would you like to do?: " sometimes printed twice
 
v0.2.6

code changes: 
- moved some action methods to the Gamingcode class
- added a random method to the Act class
	More intuitive random coding. 
- added a delay method to the Act class
	More intuitive delay coding. 
- added lineIn and numIn methods to the Act class
	More intuitive input coding. 
- added an Account class
	Allows users to save their progress. 

bug fixes: 
- some variables weren't initialized
- account application didn't update the stats page
- graphics.move still occured when you remained in the same place

v0.2.5

code changes: 
- moved all variables to a Var class
	All variables in all other classes will now be accessed through the Var class. 
- revamped shop
	Added spaces in between the options. 
	Sell All now shows how many coins you will get. 
- revamped work
	The inn now gives you a range of 10 from your inn level (ex. inn level 21 will give
	between 11 and 21 coins). 

bug fixes: 
- How much would you like to buy? print statement still occured when Sell All was selected
	Added if statement. 
- Name wasn't allowed to be set until game had started
	Added setName option after the tutorial. 
	
v0.2.4

code changes: 
- added in a graphics component when you move from one place to another
	You can now see yourself moving from one place to another. 
- names of places now appear on top of the two buildings
	You can now see where you left and where you're going. 

bug fixes: 
- look code didn't allow you to use it once coins went to 2 or below
	Changed so that it stops you from using look once you get to 0 coins. 
- when coins were at or below 1 and you ran, coins went into the negatives
	Changed code so that if coins went into negative, it changed to 0 instead. 

v0.2.3

code changes: 
- added the ability to mass-sell items
	You can now sell all of your items at once. 
- added the ability to list your items
	You can now type listItems to see how many of each item you have. 
- changed chance to allow fight to occur more often. 
	Fight now has a 20% chance of occuring every time you use the look command. 

bug fixes: 
- code sometimes didn't stay on screen after it was finished running
	Added input.nextLine() statements to allow the user to see information, then click enter to clear the screen. 

v0.2.2

code changes: 
- added inn level
	You now have to level up your inn by buying upgrades in the Artificery to earn more coins when you work. 
- added code to buy and sell
	You now see when you don't have enough money to buy something or enough items to sell. 
- changed chance to allow items to be found more often

bug fixes: 
- if enter was pressed before fight began, code froze
	Inserted question code into the loop to allow users to make typing mistakes. 

v0.2.1

code changes: 
- revamped fight code
	Removed fight code and replaced it with a better RnG. You can now earn both coins and exp from fighting. 
- added run as an option
	When fighting, you can now run away. You drop coins when you run however. 
- finished chance RnG
	Look is now operational. 
- added the ability to mass-purchase items
	You can now purchase items in bulk. 

bug fixes: 
- fight code didn't decrease your energy
	Added code. 
- read and jump didn't give you exp
	Added code. 
- read and jump took no time to occur
	Set read to 5 secs and jump to 2 secs. 
- buying items didn't subtract from your coins
	Added code. 
- selling items didn't subtract from the number of items in your inventory
	Added code. 
- coins were able to go below 0
	Added if statements to stop you from spending more coins than you had. 

v0.2.0

code changes: 
- removed places
	Removed the option to go to specific places. Replaced it with several in-game options that have the same effect. 
- added look command
	Created an RnG in which you have a chance to find items, fight arcanists, or see part of the storyline. 
- added sell command
	You can now sell items for coins. 
- added items
	You can now collect items to sell at the Artificery. 
- added read command
	You can now read for 5 seconds to get exp. 
- added info command
	Using the info command gives you information on each of the other actions, what they do, and where they occur. 
- removed Ambrose from the game
- removed post-game

bug fixes: 
- tips weren't occuring
	Changed default from "false" to "true". 

v0.1.8

code changes: 
- tips changed to occur at certain points in the game
	Fight tips will appear during fight code, buy tips will appear during buy code, etc. 
- added options
	You can now change your name while in-game, toggle the storyline, and toggle tips. 

bug fixes: 
- post-game wasn't showing up
	Changed post-game loop variable to make it different from the in-game loop variable. 

v0.1.7

code changes: 
- levels added
	Exp is now converted into levels. Level 5 is the new requirement to get to post-game. 
- post-game finished
	Everything in post-game is the same, except for Ambrose appears in a different place, and exp costs 1 coin per 1 exp instead of 5. 

bug fixes: 
- lines were squashed together
	Changed spacing to every other line. 

v0.1.6

code changes: 
- buy code changed
	You can now buy max energy 5 at a time. 
- post-game skeleton code started
	Ambrose can only be defeated in post-game now. Getting to post-game requires 50 exp. 

bug fixes: 
- tips didn't show up when learn was chosen
	RnG wasn't working correctly, so changed the code so that a different piece of information each time learn is called. 
- buy code didn't subtract coins from inventory when something was bought
	Added code. 

v0.1.5

code changes: 
- buy code finished
	You can now buy things such as a max energy upgrade, exp, and extra lives. 
- learn code added
	You can now go to the University to learn more about the game. 

bug fixes: 
- storyline in-game wasn't printing
	Variable that decided whether or not the storyline was printed defaulted as no, changed to yes. 

v0.1.4

code changes: 
- more storyline added to the main game
	You can now meet Ambrose in-game. 

bug fixes: 
- fight code didn't subtract energy when it was used
	Added code. 
- fight code didn't add exp after win state
	Added code. 
- lives weren't subtracted when energy went below 0
	Added code. 

v0.1.3

code changes: 
- fight code finished
	RnG on energy used by enemy, you choose how much energy you use. Higher energy wins. 

bug fixes: 
- work and rest were taking too long
	Work and rest now take 10 seconds instead of 15. 
- title didn't reappear after screen was cleared
	Added title to the loop code.

v0.1.2

code changes: 
- jump, work, and rest code finished
	Jumping grants exp, working grants coins, and rest regenerates energy (working and resting last 15 secs). 

v0.1.1

code changes: 
- fight, jump, work, rest, and buy skeleton code created
	If statements and variables are all initialized. 

bug fixes: 
- too many words filling up screen
	Added an erase command to clear the screen after each section. 

v0.1.0

code changes: 
- storyline created
- title created
- variables coins, exp, energy, and maxenergy initialized

bug fixes: 
- exp wasn't being granted when jumping off the bridge
	RnG added to give you between 1 and 2 exp points when jumping off the bridge. 
