package com.example.rbuddies.activities.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.rbuddies.model.Goal;
import com.example.rbuddies.model.Level;
import com.example.rbuddies.model.RBuddiesRegister;

public class LevelTest extends RBuddiesTest {

	@Test
	public void testLevelIsAcomplishedIfTheirGoalsAreAcomplished() {
		Level aLevel = new Level();
		
		RBuddiesRegister goalTrack = this.getRegister(0, 100, 1);
		RBuddiesRegister aTrack = this.getRegister(1, 1, 2);
		
		Goal aGoal = new Goal(goalTrack);
		
		aLevel.addGoal(aGoal);
		
		aLevel.isAcomplished(aTrack);
	}

}
