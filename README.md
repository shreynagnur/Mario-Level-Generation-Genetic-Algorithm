# Mario-Level-Generation-Genetic-Algorithm
# Overview
This project was done for an AI class and features a genetic algorithm tasked with creating novel, interesting, and challenging Mario levels. The DNA is a simple string of 5 characters that the AI agent uses as a random element to avoid making the same level over and over again.
# Player profiles
There are 4 types of player profiles: Scrooge, Jumper, Killer, and KillerCollector. Each of these player profiles has a respective preference in their Mario levels: lots of coins, numerous obstacles to jump over, abundant enemies, and a liberal mix of coins to collect and enemies to attack. In addition, levels are also evaluated by more complex players that have different combinations of these preferences. One such player may like coins and obstacles to jump over.
# Level evaluation
A level's fitness score is determined by how much the player likes the level based on its main preference. DNA crossover is performed with random mutations until the player is satisfied with the level. This crossover simply involves taking parts of two parent strings and combining them to form a new child string. 

Random mutations are required because the player will not be satisified if the level does not have enough variety. For instance, if too many platforms or obstacles are at the exact same height, Jumper will get bored and evaluate the level unfavorably. 

# Additional restrictions
Items and enemies cannot be stuck in midair or in inaccessible locations. Levels must also be beatable, so care must be taken to avoid creating pipes that cannot be jumped over, hordes of enemies that cannot be bypassed or attacked, and large chasms that cannot be jumped over or otherwise crossed.
