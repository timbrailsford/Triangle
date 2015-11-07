package org.unmc.g53sqm.Triangle;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Triangle Demo" );
        
        Triangle t = new Triangle(4,4,4);
        System.out.println("Triangle type: "+t.getType());
       
    }
}