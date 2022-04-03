package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.types.RoomTemperature;

public class GasHeater implements Heater {
        
        @Override
        public void engage(RoomTemperature temperature){
            temperature.incrementTemperature(1);
        }
        
        @Override
        public void disengage(RoomTemperature temperature){
            temperature.incrementTemperature(-1);
        }

    }

