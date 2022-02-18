/**
 * 
 */
package com.kshb.mysmartcar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * This is a Motor Class
 * @author harsh
 *
 */
public class Motor implements SelfCheckCapable {

	//Attributes
	public double Voltage;
	public double Power;
	public double HorsePower;
	
	//Methods
	public void Action() {
		//Indicates the actions that are made by this motor
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Motor Actions";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
