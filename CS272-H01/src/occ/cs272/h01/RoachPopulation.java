/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author <Melissa Huynh>
 * @version <September 8, 2019>
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "mhuynh76";
    public static final String ASSIGNMENT = "H01-A";

    // TODO: Complete the RoachPopulation class
    
    private int population; 
    
    public RoachPopulation(int roaches)
    {
    	population = roaches; 
    }
    
   public void breed()
    {
    	population *= 2;
    }
    
    public void spray()
    {
    	population = (int)(population - (population * 10/100));
    }
    
    public int getRoaches()
    {
    	return population;
    }
}
