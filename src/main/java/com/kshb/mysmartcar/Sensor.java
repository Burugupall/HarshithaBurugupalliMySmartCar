/**
 * 
 */
package com.kshb.mysmartcar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * This is a Sensor Class that acts as Super class for both GPSLocation and Camera classes
 * @author harsh
 *
 */
public class Sensor implements SelfCheckCapable {
	
	//Attributes
	public int Size;
	
	//Methods
	public void DetectSound() {
		// detects Sound
	}
	public void DetectSpeed() {
		//Detects the speed 
	}
	public void SensorAction() {
		//Actions performed by sensor that is placed
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Sensors";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

}
