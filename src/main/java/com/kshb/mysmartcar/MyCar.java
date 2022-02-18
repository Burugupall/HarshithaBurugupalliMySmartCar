/**
 * 
 */
package com.kshb.mysmartcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * 
 * 
 * @author harsh
 *
 */
public class MyCar implements GenericComponent {

	
	/**
	 * My Smart car Class
	 * @param args
	 */
	//Attributes
	public String CarName;
	public String Color;
	public int CarNumber;
	public int Length;
	private static MyCar mycar;
	private static ProcessingUnit myPU;
	private static Camera mycamera;
	private static Sensor mysensor;
	private static Battery myBattery;
	private static Motor myMotor;
	private static Wheel myWheel;
	
	//Methods
	public void Movement() {
		//Movements made by the car forward/backward
	}
	public void TurnRight() {
		//car turning right
	}
	public void TurnLeft() {
		//car turning left
	}
	public void Park() {
		//when car is in parking position
	}
	public void Stop() {
		//When car is not started
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My new Smart Car");
		mycar = new MyCar();
		myPU = new ProcessingUnit();
		mysensor = new Sensor();
		mycamera = new Camera();
		myBattery = new Battery();
		myMotor = new Motor();
		myWheel = new Wheel();
        
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Smart Car Model 3";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, mycar, myPU, mysensor, mycamera, myBattery, myMotor, myWheel  ); // add all your sub components
		return internalComponents;
	}

}
