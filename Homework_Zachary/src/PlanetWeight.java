/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zachary
 */
public class PlanetWeight 
{
    public static void main(String [] arguments)
    {
        float number = Float.valueOf( arguments[0] );
        System.out.println();
        System.out.println("Your weight on Earth is " + number );
        System.out.println();
        System.out.println("Your weight on Mercury is " + number * 0.378 );
        System.out.println();
        System.out.println("Your weight on Moon is " + number  * 0.166 );
        System.out.println();
        System.out.println("Your weight on Jupiter is " + number  *2.364 );
        System.out.println();
        System.out.println("Your weight on Venus is " + number  * 0.907 );
        System.out.println();
        System.out.println("Your weight on Uranus is " + number  * 0.889);

} 
}
