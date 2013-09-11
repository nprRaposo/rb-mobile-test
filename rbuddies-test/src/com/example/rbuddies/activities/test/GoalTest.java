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
		
		aTrack.setAverageVelocity(20);
		aTrack.setDistance(20);
		aTrack.setTime(15);
		
		RBuddiesRegister goalTrack = new RBuddiesRegister();
		
		goalTrack.setAverageVelocity(11);
		goalTrack.setDistance(2);
		goalTrack.setTime(19);
		
		Goal aGoal = new Goal(goalTrack);
		assertTrue(aGoal.IsAcomplished(aTrack));
	}
	
	@Test
	public void testGoalIsnotAcomplishedWhenTheTrackNotSatisfyHim()
	{
		RBuddiesRegister aTrack = new RBuddiesRegister();
		
		aTrack.setAverageVelocity(0);
		aTrack.setDistance(0);
		aTrack.setTime(10);
		
		RBuddiesRegister goalTrack = new RBuddiesRegister();
		
		goalTrack.setAverageVelocity(10);
		goalTrack.setDistance(10);
		goalTrack.setTime(1);
		
		Goal aGoal = new Goal(goalTrack);
		assertFalse(aGoal.IsAcomplished(aTrack));
	}

}


