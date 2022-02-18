/**
 * 
 */
package com.kshb.mysmartcar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * This is a ProcessingUnit Class
 * @author harsh
 *
 */
public class ProcessingUnit implements SelfCheckCapable {
	
	//Attributes
	public double Memory;
	public String Model;
	public double OSVersion;
	
	//Methods
	public void SensorDataProcess() {
		//processes the sensor data
	}
	public void Communication() {
		//It is about the processing of communications that are made
	}
    public void RunDiagnostic() {
    	//It is about the RunDiagnostic
    }
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Processing Unit";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
