package edu.poniperro;

import edu.poniperro.hardware.GasHeater;
import edu.poniperro.hardware.Regulator;
import edu.poniperro.hardware.RemoteCommandSensor;
import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;
// import edu.poniperro.singleton.Singleton;
import edu.poniperro.types.RoomTemperature;

public class App {
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = new RoomTemperature(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        // Jedi yoda = new Jedi();
        // System.out.println( "\nArrancando a Yoda: " );
        // regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        // yoda.speak();

        
        // System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
        //         "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
        //         "RESULT:" + "\n");
        // Singleton singleton = Singleton.getInstance("FOO");
        // Singleton anotherSingleton = Singleton.getInstance("BAR");
        // System.out.println(singleton.value);
        // System.out.println(anotherSingleton.value);
    }
    
}
