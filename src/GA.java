import java.util.ArrayList;

public class GA {
	/* GA parameters */
    private static final double mutationRate = 0.015;
    private static final int tournamentSize = 5;
    private static final boolean elitism = true;

    // Evolves a population over one generation
    public static Population evolvePopulation(Population pop) {
        Population newPopulation = new Population(pop.populationSize(), false);
        Tour parent1 = tournamentSelection(pop);
       Tour parent2 = tournamentSelection(pop);
       for (int x=0;x<=parent1.tourSize();x++) {
           Tour offspring = crossover(parent1, parent2);
           mutate(offspring);

       }

       

        // Crossover population
        // Loop over the new population's size and create individuals from
        // Current population (select parents, crossover them, add child to population
       /*
        * 
        * Question 1-a: To Complete
        *
        *

        * 
        * 
        * 
        * 
        * 
        * 
        */




        // Mutate the new population a bit to add some new genetic material
        /*
         * 
         * 
         * 
         * Question 1-b: Mutate new generation 
         * 
         * 
         * 
         */

        return newPopulation;
    }

    public static Tour crossover(Tour parent1, Tour parent2) {
        // Create new child tour
        Tour child = new Tour();



        //---------------------------------------------------------------------------------------------------------
        // Crossover 2 parents using the Davi's Order
        /*
         * Question 2 : To Complete:
         */
        //----------------------------------------------------------------------------------------------------------
        /*initialization of the two points*/
        int point1=(int)(Math.random()* parent1.tourSize());
        int point2=(int)(Math.random()* parent1.tourSize());

        /*determination of minimum index point and maximum index */
        int c;
        if (point1>point2) {
            c=point1;
            point1=point2;
            point2=c;
        }else {
            c=0;
        }
        /*initialization of the off-spring tour*/
        for (int i=point1; i<point2; i++) {
            child.setCity(i, parent1.getCity(i));
        }

        /*completing the off-spring tour using the Davi's order crossover*/
        for (int k=0;k<point1;k++) {
            for(int j=point1;j<point2; j++) {
                if(child.getCity(j)!=parent2.getCity(k)) {
                    child.setCity(k,parent2.getCity(k));
                }
            }

        }
        for (int k=point2;k<child.tourSize();k++) {
            for(int j=point1;j<point2; j++) {
                if(child.getCity(j)!=parent2.getCity(k)) {
                    child.setCity(k,parent2.getCity(k));
                }
            }

        }

        return child;
    }

    // Mutate a tour using swap mutation
    private static void mutate(Tour tour) {

        //Question 3: To complete

        for(int i=0 ; i< tour.tourSize(); i++){
            if(Math.random()<mutationRate){
                int randomCity = (int) Math.random()*tour.tourSize();
                City Intermediaire = tour.getCity(i);
                tour.setCity(i, tour.getCity(randomCity));
                tour.setCity(randomCity, Intermediaire);
            }
        }

    }

    // Selects candidate tour for crossover using tournament method
    private static Tour tournamentSelection(Population pop) {
        // Create a tournament population
        Population tournament = new Population(tournamentSize, false);
        // For each place in the tournament get a random candidate tour and
        // add it
        for (int i = 0; i < tournamentSize; i++) {
            int randomId = (int) (Math.random() * pop.populationSize());
            tournament.saveTour(i, pop.getTour(randomId));
        }
        // Get the fittest tour
        Tour fittest = tournament.getFittest();
        return fittest;
    }
    
    //Select candidate tour for crossover using a RWS 
    private static Tour RWS(Population pop) {
    	ArrayList<Integer> fitness_share=new ArrayList<Integer>();
    	Tour candidate= new Tour();
    	//Calculate sum of fitness values of all individuals in the population
    	
    	//Calculate and Save fitness share for all individuals in population
    	
    	//Select individual based on its fitness share value and random generated value between 0 and 1 
    	
    	//
   
      /*
       * 
       * Question 5: To complete 
       * 
       * 
       */
    	return candidate;
    }

}
