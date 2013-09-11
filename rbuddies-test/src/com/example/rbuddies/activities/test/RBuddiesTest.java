package com.example.rbuddies.activities.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.rbuddies.model.RBuddiesRegister;

public class RBuddiesTest {

	protected RBuddiesRegister getRegister(double distance, long time, double averageVelocity){
		
		RBuddiesRegister aRegister = new RBuddiesRegister();
		aRegister.setAverageVelocity(averageVelocity);
		aRegister.setDistance(distance);
		aRegister.setTime(time);
		return aRegister;
	}

}
