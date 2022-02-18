/**
 * 
 */
package com.kshb.mysmartcar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * This is Camera Class which acts as sub class to Sensor
 * @author harsh
 *
 */
public class Camera extends Sensor implements SelfCheckCapable {
	
	//Attributes
	public double CamVersion;
	
	//Methods
	public void RecognizeObj() {
		//Recognizing Objects
	}
	public void ReverseCarObjDetector() {
		//while reversing the car we can find the objects that are behind it
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
