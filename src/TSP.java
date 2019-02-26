import java.util.ArrayList;

public class TSP {
	public static  ArrayList<City> destinationCities = new ArrayList<City>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		
		

	  

	        // Create and add our cities
	      /*
	       * 
	       * 
	       * Question 4-a: To complete
	       */
			destinationCities.add(
					new City(3,4,"Lille")
			);
		destinationCities.add(
				new City(6,7,"Paris")
		);
		destinationCities.add(
				new City(3,9,"Dunkerque")
		);
		destinationCities.add(
				new City(24,56,"Monaco")
		);
		destinationCities.add(
				new City(30,14,"Lyon")
		);
		destinationCities.add(
				new City(90,1,"Bretagne")
		);
		destinationCities.add(
				new City(12,5,"Troyes")
		);
		destinationCities.add(
				new City(6,70,"Strasbourg")
		);
		destinationCities.add(
				new City(13,43,"Bordeaux")
		);
		destinationCities.add(
				new City(31,49,"Corse")
		);

	        // Initialize population
	      /*
	       * 
	       * Question 4-b: To complete
	       * 
	       */
	     Population pop= new Population(50,true);
	     Tour fittest=pop.getFittest();
	     System.out.println(fittest);
	     for (int x=0;x<=100;x++){
	     	GA.evolvePopulation(pop);
		 }
		System.out.println(pop.getFittest());


		// Evolve population for 100 generations
	      /*
	       * 
	       * Question 4-c: To complete
	       * 
	       * 
	       */

	        // Print final results
		/*
		 * 
		 * Questions 4-d and 4-e: To Complete
		 * 
		 */
	        
	    }
		
		
	

}
