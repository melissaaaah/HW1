/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

/**
 * @author <mhuynh76>
 * @version <September 9, 2019>
 * 
 */
public class IceCreamCone
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "mhuynh76";
    public static final String ASSIGNMENT = "H01-B";

    // TODO: Complete this class
    
    double height;
    double radius;
    double length; 
    public IceCreamCone(double height, double radius)
    {
    	 this.height = height; 
    	 this.radius = radius;
    }
    
    public double getSurfaceArea()
    {
    	length = Math.sqrt(Math.pow(radius,2.0) 
    			+ Math.pow(height, 2.0));
    	
    	return Math.PI * this.radius 
    			* (this.radius + length);
    }
    
    public double getVolume()
    {
    	return (1.0/3.0) * Math.PI 
    			* Math.pow(radius, 2.0) 
    			* this.height;
    }
}
