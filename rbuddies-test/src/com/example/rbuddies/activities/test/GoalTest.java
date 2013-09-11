package com.example.rbuddies.activities.test;


import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import com.example.rbuddies.model.Goal;
import com.example.rbuddies.model.RBuddiesRegister;


public class GoalTest extends RBuddiesTest {
	
	@Test
	public void testGoalIsAcomplishedWhenTheTrackSatisfyHim()
	{
		RBuddiesRegister aTrack = this.getRegister(20, 15, 25);
		RBuddiesRegister goalTrack = this.getRegister(11, 20, 20);
		
		Goal aGoal = new Goal(goalTrack);
		assertTrue(aGoal.isAcomplished(aTrack));
	}
	
	@Test
	public void testGoalIsnotAcomplishedWhenTheTrackNotSatisfyHim()
	{
		RBuddiesRegister aTrack = this.getRegister(0, 0, 10);
		RBuddiesRegister goalTrack = this.getRegister(10, 10, 1);
		
		Goal aGoal = new Goal(goalTrack);
		assertFalse(aGoal.isAcomplished(aTrack));
	}
}


