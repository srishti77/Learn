package DS;

import java.util.Arrays;

public class AwardBudget {
	 static double findGrantsCap(double[] grantsArray, double newBudget) {
		    // your code goes here
		    Arrays.sort(grantsArray);
		    
		    for( int i=0; i < grantsArray.length; i++) {
		    	System.out.println(grantsArray[i]);
		    }
		    int length = grantsArray.length;
		    double avg = newBudget / length;
		    double buffer = -2;
		 
		    int countOfGrantsExceedsAvg = 0;
		    int index = 0;
		    while(buffer != 0.0){
		      buffer = 0.0;
		      
		      for( int i = index; i < length; i++){
		    	  System.out.println("Array" );
			      if(avg < grantsArray[i]){
			    	  System.out.println("Here");
			         countOfGrantsExceedsAvg++;
			      }
			      
			      else{
			    	
			    	  buffer = buffer + (avg - grantsArray[i]);
			      }
		    }
		     
		      avg +=  buffer/countOfGrantsExceedsAvg;
		      index = length - countOfGrantsExceedsAvg;
		      countOfGrantsExceedsAvg = 0;
		    }
		    return avg;
		  }

		  public static void main(String[] args) {
			  double[] grantsArray = {2, 100, 50, 120, 167};
			  System.out.println(findGrantsCap(grantsArray, 400));
		  }
}
