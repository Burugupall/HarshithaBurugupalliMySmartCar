/**
 * 
 */
package com.kshb.mysmartcar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * This is a Battery Class
 * @author harsh
 *
 */
public class Battery implements SelfCheckCapable {

	//Attributes
	public double Capacity;
	public int size;
	
	//Methods
	public void ChargeOn() {
		//when battery is getting charged
	}
	public void ChargeOff() {
		//When battery is not getting charged
	}
	public void TurnOn() {
		//When battery is turned On
	}
	public void TurnOff() {
		//When battery is turned off
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Battery Storage";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
