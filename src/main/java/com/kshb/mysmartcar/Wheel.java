/**
 * 
 */
package com.kshb.mysmartcar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * This is a Wheel Class
 * @author harsh
 *
 */
public class Wheel implements SelfCheckCapable {
  
	//Attributes
	public double Diameter;
	public String TypeOfWheel;
	
	//Methods
	public void Motion() {
		//Indicates the motion of the wheel that is undergoing
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wheel functioning";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
