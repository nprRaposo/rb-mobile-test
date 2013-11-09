package com.example.rbuddies.activities.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.rbuddies.util.UnitConversor;

public class UnitConversorTest {

	@Test
	public void GetKMFromMetersCanConvert(){
		UnitConversor conversor = new UnitConversor();
		double meters = 1500;
		
		assertEquals("1.50", conversor.getKmFromMeters(meters));
	}
	
	@Test
	public void GetKMFromMetersCanConvertARareNumber(){
		UnitConversor conversor = new UnitConversor();
		double meters = 1785;
		
		assertEquals("1.79", conversor.getKmFromMeters(meters));
	}
	
	@Test
	public void UnitConversorCanConvertMilisecondsToMinutes(){
		UnitConversor conversor = new UnitConversor();
		long miliSeconds = 60000;
		
		assertEquals("01.0", conversor.getMinutesFromMiliSeconds(miliSeconds));
	}
	
	@Test
	public void UnitConversorCanConvertMilisecondsToMinutesWithRareNumber(){
		UnitConversor conversor = new UnitConversor();
		long miliSeconds = 600000;
		
		assertEquals("10.0", conversor.getMinutesFromMiliSeconds(miliSeconds));
	}
	
	@Test
	public void UnitConversorCanConvertMilisecondsToSeconds(){
		UnitConversor conversor = new UnitConversor();
		long miliSeconds = 1000;
		
		assertEquals("01", conversor.getSecondsFromMiliseconds(miliSeconds));
	}
	
	@Test
	public void UnitConversorCanConvertMilisecondsToSecondsWithANumberThatIsOverOfOneMinute(){
		UnitConversor conversor = new UnitConversor();
		long miliSeconds = 65000;
		
		assertEquals("05", conversor.getSecondsFromMiliseconds(miliSeconds));
	}
	
	@Test
	public void UnitConversorCanConvertMtSecondsToKmPerHour(){
		UnitConversor conversor = new UnitConversor();
		double velocity = 10.0;
		
		assertEquals("36.00", conversor.getKmPerHourFromMtSecond(velocity));
	}
	
	
	
}
