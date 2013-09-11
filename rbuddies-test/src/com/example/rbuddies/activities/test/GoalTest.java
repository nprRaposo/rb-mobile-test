package com.example.rbuddies.activities.test;


import junit.framework.TestCase;

import org.junit.Test;

import com.example.rbuddies.model.Goal;
import com.example.rbuddies.model.RBuddiesRegister;


public class GoalTest extends TestCase {
	
	@Test
	public void testGoalIsAcomplishedWhenTheTrackSatisfyHim()
	{
		RBuddiesRegister aTrack = new RBuddiesRegister();
		
		aTrack.setAverageVelocity(10);
		aTrack.setDistance(1);
		aTrack.setTime(20);
		
		Goal aGoal = new Goal();
		assertTrue(aGoal.IsAcomplished(aTrack));
	}

}


