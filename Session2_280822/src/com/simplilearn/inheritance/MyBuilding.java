package com.simplilearn.inheritance;

/**
 * @author vishal
 *
 */
public class MyBuilding implements BuildingInterface
{

	@Override
	public void RK() {
		// TODO Auto-generated method stub
		System.out.println("room kitchen");
	}

	@Override
	public void OneBHK() {
		System.out.println("One Bedroom, hall and kitchen");
		
	}

	@Override
	public void TwoBHK() {
		System.out.println("Two Bedroom, hall and kitchen");
		
	}

	@Override
	public void ThreeBHK() {
		System.out.println("Three Bedroom, hall and kitchen");
		
	}
	

}
