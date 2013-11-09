package com.example.rbuddies.activities.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.rbuddies.model.Goal;
import com.example.rbuddies.model.Level;
import com.example.rbuddies.model.RBuddiesRegister;

public class LevelTest extends RBuddiesTest {

	@Test
	public void testLevelIsAcomplishedIfHisGoalIsAcomplished() {
		Level aLevel = new Level();
		
		RBuddiesRegister goalTrack = this.getRegister(0, 100, 1);
		RBuddiesRegister aTrack = this.getRegister(1, 1, 2);
		
		Goal aGoal = new Goal(goalTrack);
		
		aLevel.addGoal(aGoal);
		
		//assertTrue(aLevel.isAcomplished());
	}
	
	@Test
	public void testLevelIsAcomplishedIfTheirGoalAreAcomplished() {
		Level aLevel = new Level();
		
		RBuddiesRegister goalTrack = this.getRegister(0, 100, 1);
		RBuddiesRegister goalTrack2 = this.getRegister(0, 101, 1);
		RBuddiesRegister goalTrack3 = this.getRegister(0, 102, 1);
		RBuddiesRegister aTrack = this.getRegister(1, 1, 2);
		
		Goal aGoal = new Goal(goalTrack);
		Goal aGoal2 = new Goal(goalTrack2);
		Goal aGoal3 = new Goal(goalTrack3);
		
		aLevel.addGoal(aGoal);
		aLevel.addGoal(aGoal2);
		aLevel.addGoal(aGoal3);
		
		//aLevel.isAcomplished(aTrack);
	}
	
	@Test
	public void testLevelIsnotAcomplishedIfOneGoalAreNotAcomplished() {
		Level aLevel = new Level();
		
		RBuddiesRegister goalTrack = this.getRegister(0, 100, 1);
		RBuddiesRegister goalTrack2 = this.getRegister(5, 101, 1);
		RBuddiesRegister goalTrack3 = this.getRegister(0, 102, 1);
		RBuddiesRegister aTrack = this.getRegister(1, 1, 2);
		
		Goal aGoal = new Goal(goalTrack);
		Goal aGoal2 = new Goal(goalTrack2);
		Goal aGoal3 = new Goal(goalTrack3);
		
		aLevel.addGoal(aGoal);
		aLevel.addGoal(aGoal2);
		aLevel.addGoal(aGoal3);
		
		//aLevel.isAcomplished(aTrack);
	}

}
