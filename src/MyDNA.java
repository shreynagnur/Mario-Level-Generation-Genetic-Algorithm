package dk.itu.mario.engine.level;

import java.util.Random;
import java.util.*;

//Make any new member variables and functions you deem necessary.
//Make new constructors if necessary
//You must implement mutate() and crossover()


public class MyDNA extends DNA
{
	
	public int numGenes = 0; //number of genes

	// Return a new DNA that differs from this one in a small way.
	// Do not change this DNA by side effect; copy it, change the copy, and return the copy.
	public MyDNA mutate ()
	{
		MyDNA copy = new MyDNA();
		//YOUR CODE GOES BELOW HERE
        //replace one random char for now
        String alphabet = "tombr";
        Random rand = new Random();
        char c = alphabet.charAt(rand.nextInt(alphabet.length()));
        String chromosome = this.getChromosome();
        int mutationPoint = rand.nextInt(chromosome.length());
        chromosome = chromosome.substring(0, mutationPoint) + c + chromosome.substring(mutationPoint + 1, chromosome.length());
        copy.setChromosome(chromosome);
		//YOUR CODE GOES ABOVE HERE
		return copy;
	}
	
	// Do not change this DNA by side effect
	public ArrayList<MyDNA> crossover (MyDNA mate)
	{
		ArrayList<MyDNA> offspring = new ArrayList<MyDNA>();
		//YOUR CODE GOES BELOW HERE
        Random rand = new Random();
        MyDNA brother = new MyDNA();
        MyDNA sister = new MyDNA();
        boolean switcher = rand.nextBoolean();
        int lesser = Math.min(this.getChromosome().length(), mate.getChromosome().length()); //variable??
        int crossoverPoint = rand.nextInt(lesser);
        String chromosome1 = "";
        String chromosome2 = "";
        chromosome1 = this.getChromosome().substring(0, crossoverPoint + 1) +
                mate.getChromosome().substring(crossoverPoint + 1, lesser);
        chromosome2 = mate.getChromosome().substring(0, crossoverPoint + 1) +
                this.getChromosome().substring(crossoverPoint + 1, lesser);
        if (switcher) {
            brother.setChromosome(chromosome1);
            sister.setChromosome(chromosome2);
        } else {
            brother.setChromosome(chromosome2);
            sister.setChromosome(chromosome1);
        }
        offspring.add(brother);
        offspring.add(sister);
        //YOUR CODE GOES ABOVE HERE
		return offspring;
	}
	
	// Optional, modify this function if you use a means of calculating fitness other than using the fitness member variable.
	// Return 0 if this object has the same fitness as other.
	// Return -1 if this object has lower fitness than other.
	// Return +1 if this objet has greater fitness than other.
	public int compareTo(MyDNA other)
	{
		int result = super.compareTo(other);
		//YOUR CODE GOES BELOW HERE
		
		//YOUR CODE GOES ABOVE HERE
		return result;
	}
	
	
	// For debugging purposes (optional)
	public String toString ()
	{
		String s = super.toString();
		//YOUR CODE GOES BELOW HERE
		
		//YOUR CODE GOES ABOVE HERE
		return s;
	}
	
	public void setNumGenes (int n)
	{
		this.numGenes = n;
	}

}

