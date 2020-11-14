package org.example;

import javax.swing.text.html.CSS;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Crow crow = new Crow();
        System.out.println("crow");
        crow.fly();
        crow.layEgg();
        crow.NestBuilder();

        Cuckoo cuckoo = new Cuckoo();
        System.out.println("cuckoo");
        cuckoo.fly();
        cuckoo.layEgg();

        Ostrich ostrich = new Ostrich();
        System.out.println("ostrich");
        ostrich.layEgg();
    }
}
