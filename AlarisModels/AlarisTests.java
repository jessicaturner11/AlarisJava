package AlarisDummyMVN.jdt11;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.HashMap;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JButtonFixture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class AlarisTests {
	
	private FrameFixture window;
	private Alaris frame;
	
	@BeforeClass
	public static void setUpOnce(){
		FailOnThreadViolationRepaintManager.install();
	}

	@Before
	public void setUp(){
		frame = GuiActionRunner.execute(() -> new Alaris("Off"));
		window = new FrameFixture(frame);
		
		window.show();
		window.resizeHeightTo(521);
		window.resizeWidthTo(700);
		
	}
	
	/**
	 * --------------------------
	 * Available Tests
	 * --------------------------
	 */
	@Test
	public void availableTest1(){
		//onStep((Initialise,Press,OnOff)) & isNextActionActive(Press,OnOff)
		window.button("OnOff").requireEnabled();
		window.button("OnOff").requireVisible();
		//Perform next interaction
		window.button("OnOff").click();
		//onStep((OnOff,Observe,Alarm)) & isNextActionActive(Observe,Alarm)
		window.radioButton("Alarm").requireVisible();
		//onStep((Alarm,Observe,AlarmLight)) & isNextActionActive(Observe,AlarmLight)
		window.radioButton("AlarmLight").requireVisible();
		//onStep((AlarmLight,Observe,AlarmLight)) & isNextActionActive(Observe,AlarmLight)
		window.radioButton("AlarmLight").requireVisible();
		//onStep((AlarmLight,Observe,Display)) & isNextActionActive(Observe,Display)
		window.label("Display").requireVisible();
		//onStep((Display,Press,Button1)) & isNextActionActive(Press,Button1)
		window.button("ButtonOne").requireEnabled();
		window.button("ButtonOne").requireVisible();
		//Perform next interaction
		window.button("ButtonOne").click();
		//onStep((Button1,Press,Button3)) & isNextActionActive(Press,Button3)
		window.button("Button3").requireEnabled();
		window.button("Button3").requireVisible();
		//Perform next interaction
		window.button("Button3").click();
		//onStep((Button3,Press,Down)) & isNextActionActive(Press,Down)
		window.button("Down").requireEnabled();
		window.button("Down").requireVisible();
		//Perform next interaction
		window.button("Down").click();
		//onStep((Down,Press,Down)) & isNextActionActive(Press,Down)
		window.button("Down").requireEnabled();
		window.button("Down").requireVisible();
		//Perform next interaction
		window.button("Down").click();
		//onStep((Down,Press,Button1)) & isNextActionActive(Press,Button1)
		window.button("ButtonOne").requireEnabled();
		window.button("ButtonOne").requireVisible();
		//Perform next interaction
		window.button("ButtonOne").click();
		//onStep((Button1,Press,Button1)) & isNextActionActive(Press,Button1)
		window.button("ButtonOne").requireEnabled();
		window.button("ButtonOne").requireVisible();
		//Perform next interaction
		window.button("ButtonOne").click();
		//onStep((Button1,Press,Down)) & isNextActionActive(Press,Down)
		window.button("Down").requireEnabled();
		window.button("Down").requireVisible();
		//Perform next interaction
		window.button("Down").click();
		//onStep((Down,Press,Button1)) & isNextActionActive(Press,Button1)
		window.button("ButtonOne").requireEnabled();
		window.button("ButtonOne").requireVisible();
		//Perform next interaction
		window.button("ButtonOne").click();
		//onStep((Button1,Press,Down)) & isNextActionActive(Press,Down)
		window.button("Down").requireEnabled();
		window.button("Down").requireVisible();
		//Perform next interaction
		window.button("Down").click();
		//onStep((Down,Press,Down)) & isNextActionActive(Press,Down)
		window.button("Down").requireEnabled();
		window.button("Down").requireVisible();
		//Perform next interaction
		window.button("Down").click();
		//onStep((Down,Press,Down)) & isNextActionActive(Press,Down)
		window.button("Down").requireEnabled();
		window.button("Down").requireVisible();
		//Perform next interaction
		window.button("Down").click();
		//onStep((Down,Press,Button1)) & isNextActionActive(Press,Button1)
		window.button("ButtonOne").requireEnabled();
		window.button("ButtonOne").requireVisible();
		//Perform next interaction
		window.button("ButtonOne").click();
		//onStep((Button1,Press,Button2)) & isNextActionActive(Press,Button2)
		window.button("Button2").requireEnabled();
		window.button("Button2").requireVisible();
		//Perform next interaction
		window.button("Button2").click();
		//onStep((Button2,Press,Button2)) & isNextActionActive(Press,Button2)
		window.button("Button2").requireEnabled();
		window.button("Button2").requireVisible();
		//Perform next interaction
		window.button("Button2").click();
		//onStep((Button2,Press,Button2)) & isNextActionActive(Press,Button2)
		window.button("Button2").requireEnabled();
		window.button("Button2").requireVisible();
		//Perform next interaction
		window.button("Button2").click();
		//onStep((Button2,Press,Up)) & isNextActionActive(Press,Up)
		window.button("Up").requireEnabled();
		window.button("Up").requireVisible();
		//Perform next interaction
		window.button("Up").click();
		//onStep((Up,Press,Button1)) & isNextActionActive(Press,Button1)
		window.button("ButtonOne").requireEnabled();
		window.button("ButtonOne").requireVisible();
		//Perform next interaction
		window.button("ButtonOne").click();
		//onStep((Button1,Press,Button1)) & isNextActionActive(Press,Button1)
		window.button("ButtonOne").requireEnabled();
		window.button("ButtonOne").requireVisible();
		//Perform next interaction
		window.button("ButtonOne").click();
		//onStep((Button1,Press,Up)) & isNextActionActive(Press,Up)
		window.button("Up").requireEnabled();
		window.button("Up").requireVisible();
		//Perform next interaction
		window.button("Up").click();
		//onStep((Up,Press,Button1)) & isNextActionActive(Press,Button1)
		window.button("ButtonOne").requireEnabled();
		window.button("ButtonOne").requireVisible();
		//Perform next interaction
		window.button("ButtonOne").click();
		//onStep((Button1,Press,Run)) & isNextActionActive(Press,Run)
		window.button("Run").requireEnabled();
		window.button("Run").requireVisible();
		//Perform next interaction
		window.button("Run").click();
		//onStep((Run,Observe,Display)) & isNextActionActive(Observe,Display)
		window.label("Display").requireVisible();
		//onStep((Display,Observe,RunLight)) & isNextActionActive(Observe,RunLight)
		window.radioButton("RunLight").requireVisible();
		
	}
	
	/**
	 * --------------------------
	 * Assumption Tests
	 * --------------------------
	 */
	@Test
	public void startAssumptionsTest(){
		//beforeStep((Initialise,Press,OnOff)) & bolusDoseDefaultIs(0)
		assertEquals(0,frame.getBolusDoseDefault());
		//beforeStep((Initialise,Press,OnOff)) & valuesIs([1,10,100,1000])
		Assert.assertArrayEquals(new int[]{1,10,100,1000},frame.getValues());
		//beforeStep((Initialise,Press,OnOff)) & concentrationMaxIs(0)
		assertEquals(0,frame.getConcentrationMax());
		//beforeStep((Initialise,Press,OnOff)) & RateIs(CONTINUE)
		assertEquals("CONTINUE", frame.getEndRate());
		//beforeStep((Initialise,Press,OnOff)) & StateIs(1)
		assertEquals(1, frame.getStateValue());
		//beforeStep((Initialise,Press,OnOff)) & pumpingPressureIs(0)
		assertEquals(0, frame.getPumpingPressure());
		//beforeStep((Initialise,Press,OnOff)) & batteryPercentIs(11)
		assertEquals(11,frame.getBatteryPercent());
		//beforeStep((Initialise,Press,OnOff)) & bolusVolumeIs(0)
		assertEquals(0, frame.getBolusVolume());
		//beforeStep((Initialise,Press,OnOff)) & VTBIBagSizeSelectedIs(500)
		assertEquals(500, frame.getVTBIBagSizeSelected());
		//beforeStep((Initialise,Press,OnOff)) & bolusRateDefaultIs(0)
		assertEquals(0,frame.getBolusRateDefault());
		//beforeStep((Initialise,Press,OnOff)) & profilesActiveIs({CriticalCare,MedicalWard,Pediatrics,SurgicalWard,TrainingADULT,TrainingPEDIATRICS})
		Assert.assertArrayEquals(new String[]{"CriticalCare","MedicalWard","Pediatrics","SurgicalWard","TrainingADULT","TrainingPEDIATRICS"}, 
				frame.getProfilesActive().toArray());
		//beforeStep((Initialise,Press,OnOff)) & bolusRateMaxIs(1200)
		assertEquals(1200, frame.getBolusRateMax());
		//beforeStep((Initialise,Press,OnOff)) & bolusCategoryIs(HandsOnOnly)
		assertEquals("HandsOnOnly",frame.getBolusCategory());
		//beforeStep((Initialise,Press,OnOff)) & infusingIs(No)
		assertEquals("No", frame.getInfusing());
		//beforeStep((Initialise,Press,OnOff)) & weightDefaultIs(1)
		assertEquals(1, frame.getWeightDefault());
		//beforeStep((Initialise,Press,OnOff)) & weightIs(1)
		assertEquals(1, frame.getWeight());
		//beforeStep((Initialise,Press,OnOff)) & bolusIs(0)
		assertEquals(0, frame.getBolus());
		//beforeStep((Initialise,Press,OnOff)) & weightSoftMaxIs(150)
		assertEquals(150, frame.getWeightSoftMax());
		//beforeStep((Initialise,Press,OnOff)) & VTBIClearRateIs(True)
		assertEquals(true, frame.getVTBIClearRate());
		//beforeStep((Initialise,Press,OnOff)) & primeRateIs(0)
		assertEquals(0, frame.getPrimeRate());
		//beforeStep((Initialise,Press,OnOff)) & timeIs(0)
		assertEquals(0, frame.getTime());
		//beforeStep((Initialise,Press,OnOff)) & rateIs(0)
		assertEquals(0, frame.getRate());
		//beforeStep((Initialise,Press,OnOff)) & doseRateDefaultIs(0)
		assertEquals(0, frame.getDoseRateDefault());
		//beforeStep((Initialise,Press,OnOff)) & drugOverrideModeIs(Smart)
		assertEquals("Smart",frame.getDrugOverrideMode());
		//beforeStep((Initialise,Press,OnOff)) & concentrationIs(0)
		assertEquals(0, frame.getConcentration());
		//beforeStep((Initialise,Press,OnOff)) & alarmLimitIs(5)
		assertEquals(5, frame.getAlarmLimit());
		//beforeStep((Initialise,Press,OnOff)) & VTBIBagSizeIs(0)
		assertEquals(0, frame.getVTBIBagSize());
		//beforeStep((Initialise,Press,OnOff)) & profileSelectedIs(CriticalCare)
		assertEquals("CriticalCare", frame.getProfileSelected());
		//beforeStep((Initialise,Press,OnOff)) & optionIs(DosingSummary)
		assertEquals("DosingSummary",frame.getOptions());
		//beforeStep((Initialise,Press,OnOff)) & doseRateSoftMinIs(0)
		assertEquals(0, frame.getDoseRateSoftMin());
		//beforeStep((Initialise,Press,OnOff)) & doseRateHardMaxIs(0)
		assertEquals(0, frame.getDoseRateHardMax());
		//beforeStep((Initialise,Press,OnOff)) & weightSoftMinIs(1)
		assertEquals(1, frame.getWeightSoftMin());
		//beforeStep((Initialise,Press,OnOff)) & drugIs(Adrenaline)
		assertEquals("Adrenaline",frame.getDrug());
		//beforeStep((Initialise,Press,OnOff)) & alarmIs(Stop)
		assertEquals("Stop", frame.getAlarm());
		//beforeStep((Initialise,Press,OnOff)) & countdownIs(5)
		assertEquals(5, frame.getCountdown());
		//beforeStep((Initialise,Press,OnOff)) & powerSavingCountIs(10)
		assertEquals(10, frame.getPowerSavingCount());
		//beforeStep((Initialise,Press,OnOff)) & autoNightModeIs(True)
		assertEquals(true, frame.getAutoNightMode());
		//beforeStep((Initialise,Press,OnOff)) & bolusVolumeMaxIs(5)
		assertEquals(5, frame.getBolusVolumeMax());
		//beforeStep((Initialise,Press,OnOff)) & volumeIs(0)
		assertEquals(0, frame.getVolume());
		//beforeStep((Initialise,Press,OnOff)) & standbyModeIs(True)
		assertEquals(true, frame.getStandbyMode());
		//beforeStep((Initialise,Press,OnOff)) & pressureMaxIs(8)
		assertEquals(8, frame.getPressureMax());
		//beforeStep((Initialise,Press,OnOff)) & concentrationMinIs(0)
		assertEquals(0, frame.getConcentrationMin());
		//beforeStep((Initialise,Press,OnOff)) & eventLogIs(True)
		assertEquals(true, frame.isEventLog());
		//beforeStep((Initialise,Press,OnOff)) & drugCategorySelectedIs(mlh)
		assertEquals("mlh", frame.getDrugCategorySelected());
		//beforeStep((Initialise,Press,OnOff)) & drugSelectedIs(Adrenaline)
		assertEquals("Adrenaline",frame.getDrugSelected());
		//beforeStep((Initialise,Press,OnOff)) & drugCategoryIs(mlh)
		assertEquals("mlh", frame.getDrugCategory());
		//beforeStep((Initialise,Press,OnOff)) & profileIs(CriticalCare)
		assertEquals("CriticalCare", frame.getProfile());
		//beforeStep((Initialise,Press,OnOff)) & doseRateSoftMaxIs(0)
		assertEquals(0, frame.getDoseRateSoftMax());
		//beforeStep((Initialise,Press,OnOff)) & battStatusIs(Charge)
		assertEquals("Charge", frame.getBattStatus());
		//beforeStep((Initialise,Press,OnOff)) & profileFilteringIs(True)
		assertEquals(true, frame.isProfileFiltering());
		//beforeStep((Initialise,Press,OnOff)) & rateTitrationIs(True)
		assertEquals(true, frame.isRateTitration());
		//beforeStep((Initialise,Press,OnOff)) & audioVolumeAdjustableIs(True)
		assertEquals(true, frame.isAudioVolumeAdjustable());
		//beforeStep((Initialise,Press,OnOff)) & primaryVTBIMaxIs(9999)
		assertEquals(9999, frame.getPrimaryVTBIMax());
		//beforeStep((Initialise,Press,OnOff)) & volumeInfusedIs(0)
		assertEquals(0, frame.getVolumeInfused());
		//beforeStep((Initialise,Press,OnOff)) & alarmVolumeIs(Medium)
		assertEquals("Medium", frame.getAlarmVolume());
		//beforeStep((Initialise,Press,OnOff)) & infusionRateMaxIs(1200)
		assertEquals(1200, frame.getInfusionRateMax());
		//beforeStep((Initialise,Press,OnOff)) & secondaryInfusionIs(False)
		assertEquals(false, frame.isSecondaryInfusion());
		//beforeStep((Initialise,Press,OnOff)) & VTBIIs(0)
		assertEquals(0, frame.getVTBI());
		//beforeStep((Initialise,Press,OnOff)) & alarmMaxIs(8)
		assertEquals(8, frame.getAlarmMax());
		//beforeStep((Initialise,Press,OnOff)) & pressureDisplayIs(True)
		assertEquals(true, frame.isPressureDisplay());
		//beforeStep((Initialise,Press,OnOff)) & autoSaveIs(True)
		assertEquals(true, frame.isAutoSave());
		//beforeStep((Initialise,Press,OnOff)) & alarmVolumeSelectedIs(Medium)
		assertEquals("Medium", frame.getAlarmVolumeSelected());
		//beforeStep((Initialise,Press,OnOff)) & stateIs(Off)
		assertEquals("Off", frame.getMode());
	}
	
	public void executeSetUpStart(){
		JButtonFixture OnOff = window.button("OnOff");
		JButtonFixture Button1 = window.button("ButtonOne");
		JButtonFixture Button3 = window.button("Button3");
		JButtonFixture Down = window.button("Down");
		JButtonFixture Button2 = window.button("Button2");
		JButtonFixture Up = window.button("Up");
		JButtonFixture Run = window.button("Run");
		
		OnOff.click();
		Button1.click();
		Button3.click();
		Down.click();
		Down.click();
		Button1.click();
		Button1.click();
		Down.click();
		Button1.click();
		Down.click();
		Down.click();
		Down.click();
		Button1.click();
		Button2.click();
		Button2.click();
		Button2.click();
		Up.click();
		Button1.click();
		Button1.click();
		Up.click();
		Button1.click();
		Run.click();
	}
	
	@Test
	public void endAssumptionsTest(){
		executeSetUpStart();
		
		//afterStep((Display,Observe,RunLight)) & bolusDoseDefaultIs(0)
		assertEquals(0,frame.getBolusDoseDefault());
		//afterStep((Display,Observe,RunLight)) & valuesIs([1,10,100,1000])
		Assert.assertArrayEquals(new int[]{1,10,100,1000},frame.getValues());
		//afterStep((Display,Observe,RunLight)) & concentrationMaxIs(0)
		assertEquals(0,frame.getConcentrationMax());
		//afterStep((Display,Observe,RunLight)) & RateIs(Stop)
		System.out.println(frame.getEndRate());
		assertEquals("Stop", frame.getEndRate());
		//afterStep((Display,Observe,RunLight)) & StateIs(1)
		assertEquals(1, frame.getStateValue());
		//afterStep((Display,Observe,RunLight)) & pumpingPressureIs(0)
		assertEquals(0, frame.getPumpingPressure());
		//afterStep((Display,Observe,RunLight)) & batteryPercentIs(11)
		assertEquals(11,frame.getBatteryPercent());
		//afterStep((Display,Observe,RunLight)) & bolusVolumeIs(0)
		assertEquals(0, frame.getBolusVolume());
		//afterStep((Display,Observe,RunLight)) & VTBIBagSizeSelectedIs(1000)
		assertEquals(1000, frame.getVTBIBagSizeSelected());
		//afterStep((Display,Observe,RunLight)) & bolusRateDefaultIs(0)
		assertEquals(0,frame.getBolusRateDefault());
		//afterStep((Display,Observe,RunLight)) & profilesActiveIs({CriticalCare,MedicalWard,Pediatrics,SurgicalWard,TrainingADULT,TrainingPEDIATRICS})
		Assert.assertArrayEquals(new String[]{"CriticalCare","MedicalWard","Pediatrics","SurgicalWard","TrainingADULT","TrainingPEDIATRICS"}, 
				frame.getProfilesActive().toArray());
		//afterStep((Display,Observe,RunLight)) & bolusRateMaxIs(1200)
		assertEquals(1200, frame.getBolusRateMax());
		//afterStep((Display,Observe,RunLight)) & bolusCategoryIs(Disabled)
		assertEquals("Disabled",frame.getBolusCategory());
		//afterStep((Display,Observe,RunLight)) & infusingIs(Yes)
		assertEquals("Yes", frame.getInfusing());
		//afterStep((Display,Observe,RunLight)) & weightDefaultIs(1)
		assertEquals(1, frame.getWeightDefault());
		//afterStep((Display,Observe,RunLight)) & weightIs(1)
		assertEquals(1, frame.getWeight());
		//afterStep((Display,Observe,RunLight)) & bolusIs(0)
		assertEquals(0, frame.getBolus());
		//afterStep((Display,Observe,RunLight)) & weightSoftMaxIs(150)
		assertEquals(150, frame.getWeightSoftMax());
		//afterStep((Display,Observe,RunLight)) & VTBIClearRateIs(True)
		assertEquals(true, frame.getVTBIClearRate());
		//afterStep((Display,Observe,RunLight)) & primeRateIs(0)
		assertEquals(0, frame.getPrimeRate());
		//afterStep((Display,Observe,RunLight)) & timeIs(0)
		assertEquals(0, frame.getTime());
		//afterStep((Display,Observe,RunLight)) & rateIs(60)
		assertEquals(60, frame.getRate());
		//afterStep((Display,Observe,RunLight)) & doseRateDefaultIs(0)
		assertEquals(0, frame.getDoseRateDefault());
		//afterStep((Display,Observe,RunLight)) & drugOverrideModeIs(Smart)
		assertEquals("Smart",frame.getDrugOverrideMode());
		//afterStep((Display,Observe,RunLight)) & concentrationIs(0)
		assertEquals(0, frame.getConcentration());
		//afterStep((Display,Observe,RunLight)) & alarmLimitIs(5)
		assertEquals(5, frame.getAlarmLimit());
		//afterStep((Display,Observe,RunLight)) & VTBIBagSizeIs(1000)
		assertEquals(1000, frame.getVTBIBagSize());
		//afterStep((Display,Observe,RunLight)) & profileSelectedIs(Pediatrics)
		assertEquals("Pediatrics", frame.getProfileSelected());
		//afterStep((Display,Observe,RunLight)) & optionIs(DosingSummary)
		assertEquals("DosingSummary",frame.getOptions());
		//afterStep((Display,Observe,RunLight)) & doseRateSoftMinIs(1)
		assertEquals(1, frame.getDoseRateSoftMin());
		//afterStep((Display,Observe,RunLight)) & doseRateHardMaxIs(100)
		assertEquals(100, frame.getDoseRateHardMax());
		//afterStep((Display,Observe,RunLight)) & weightSoftMinIs(1)
		assertEquals(1, frame.getWeightSoftMin());
		//afterStep((Display,Observe,RunLight)) & drugIs(Dobutamine)
		assertEquals("Dobutamine",frame.getDrug());
		//afterStep((Display,Observe,RunLight)) & alarmIs(Stop)
		assertEquals("Stop", frame.getAlarm());
		//afterStep((Display,Observe,RunLight)) & countdownIs(5)
		assertEquals(5, frame.getCountdown());
		//afterStep((Display,Observe,RunLight)) & powerSavingCountIs(10)
		assertEquals(10, frame.getPowerSavingCount());
		//afterStep((Display,Observe,RunLight)) & autoNightModeIs(True)
		assertEquals(true, frame.getAutoNightMode());
		//afterStep((Display,Observe,RunLight)) & bolusVolumeMaxIs(5)
		assertEquals(5, frame.getBolusVolumeMax());
		//afterStep((Display,Observe,RunLight)) & volumeIs(0)
		assertEquals(0, frame.getVolume());
		//afterStep((Display,Observe,RunLight)) & standbyModeIs(True)
		assertEquals(true, frame.getStandbyMode());
		//afterStep((Display,Observe,RunLight)) & pressureMaxIs(8)
		assertEquals(8, frame.getPressureMax());
		//afterStep((Display,Observe,RunLight)) & concentrationMinIs(0)
		assertEquals(0, frame.getConcentrationMin());
		//afterStep((Display,Observe,RunLight)) & eventLogIs(True)
		assertEquals(true, frame.isEventLog());
		//afterStep((Display,Observe,RunLight)) & drugCategorySelectedIs(ABCDE)
		assertEquals("ABCDE", frame.getDrugCategorySelected());
		//afterStep((Display,Observe,RunLight)) & drugSelectedIs(Dobutamine)
		assertEquals("Dobutamine",frame.getDrugSelected());
		//afterStep((Display,Observe,RunLight)) & drugCategoryIs(ABCDE)
		assertEquals("ABCDE", frame.getDrugCategory());
		//afterStep((Display,Observe,RunLight)) & profileIs(Pediatrics)
		assertEquals("Pediatrics", frame.getProfile());
		//afterStep((Display,Observe,RunLight)) & doseRateSoftMaxIs(61)
		assertEquals(61, frame.getDoseRateSoftMax());
		//afterStep((Display,Observe,RunLight)) & battStatusIs(Charge)
		assertEquals("Charge", frame.getBattStatus());
		//afterStep((Display,Observe,RunLight)) & profileFilteringIs(True)
		assertEquals(true, frame.isProfileFiltering());
		//afterStep((Display,Observe,RunLight)) & rateTitrationIs(True)
		assertEquals(true, frame.isRateTitration());
		//afterStep((Display,Observe,RunLight)) & audioVolumeAdjustableIs(True)
		assertEquals(true, frame.isAudioVolumeAdjustable());
		//afterStep((Display,Observe,RunLight)) & primaryVTBIMaxIs(9999)
		assertEquals(9999, frame.getPrimaryVTBIMax());
		//afterStep((Display,Observe,RunLight)) & volumeInfusedIs(0)
		assertEquals(0, frame.getVolumeInfused());
		//afterStep((Display,Observe,RunLight)) & alarmVolumeIs(Medium)
		assertEquals("Medium", frame.getAlarmVolume());
		//afterStep((Display,Observe,RunLight)) & infusionRateMaxIs(1200)
		assertEquals(1200, frame.getInfusionRateMax());
		//afterStep((Display,Observe,RunLight)) & secondaryInfusionIs(False)
		assertEquals(false, frame.isSecondaryInfusion());
		//afterStep((Display,Observe,RunLight)) & VTBIIs(1000)
		assertEquals(1000, frame.getVTBI());
		//afterStep((Display,Observe,RunLight)) & alarmMaxIs(8)
		assertEquals(8, frame.getAlarmMax());
		//afterStep((Display,Observe,RunLight)) & pressureDisplayIs(True)
		assertEquals(true, frame.isPressureDisplay());
		//afterStep((Display,Observe,RunLight)) & autoSaveIs(True)
		assertEquals(true, frame.isAutoSave());
		//afterStep((Display,Observe,RunLight)) & alarmVolumeSelectedIs(Medium)
		assertEquals("Medium", frame.getAlarmVolumeSelected());
		//afterStep((Display,Observe,RunLight)) & stateIs(RateInfusing)
		assertEquals("RateInfusing", frame.getMode());
		
	}
	
	/**
	 * --------------------------
	 * Mapping Tests
	 * --------------------------
	 */
	@Test
	public void mappingTests(){
		
	}
	
	/**
	 * --------------------------
	 * Boundary Tests
	 * --------------------------
	 */
	//onSequence((Initialise,Press,OnOff),
	//(OnOff,Observe,Alarm),
	//(Alarm,Observe,AlarmLight),
	//(AlarmLight,Observe,AlarmLight),
	//(AlarmLight,Observe,Display),
	//(Display,Press,Button1),
	//(Button,Press,Button3),
	//(Button3,Press,Down),
	//(Down,Press,Down),
	//(Down,Press,Button1),
	//(Button1,Press,Button1),
	//(Button1,Press,Down),
	//(Down,Press,Button1),
	//(Button1,Press,Down),
	//(Down,Press,Down),
	//(Down,Press,Down),
	//(Down,Press,Button1))
	public void RateSubSequence(){
		JButtonFixture OnOff = window.button("OnOff");
		JButtonFixture Button1 = window.button("ButtonOne");
		JButtonFixture Button3 = window.button("Button3");
		JButtonFixture Down = window.button("Down");
		JButtonFixture Button2 = window.button("Button2");
		JButtonFixture Up = window.button("Up");
		JButtonFixture Run = window.button("Run");
		
		OnOff.click();
		Button1.click();
		Button3.click();
		Down.click();
		Down.click();
		Button1.click();
		Button1.click();
		Down.click();
		Button1.click();
		Down.click();
		Down.click();
		Down.click();
		Button1.click();
	}
	
	@Test
	public void boundaryTestRate(){
		RateSubSequence();
		//& (doseRateSoftMin<=Rate<=doseRateHardMax)
		assertThat(frame.getDoseRateSoftMax() <= frame.getRate());
		assertThat(frame.getRate() <= frame.getDoseRateHardMax());
		//& (0 <= doseRateSoftMin <= doseRateSoftMax)
		assertThat(0 <= frame.getDoseRateSoftMin());
		assertThat(frame.getDoseRateSoftMin() <= frame.getDoseRateSoftMax());
		//& (doseRateSoftMin <= doseRateSoftMax <= doseRateHardMax)
		assertThat(frame.getDoseRateSoftMin() <= frame.getDoseRateSoftMax());
		assertThat(frame.getDoseRateSoftMax() <= frame.getDoseRateHardMax());
		//& (doseRateSoftMax <= doseRateHardMax <= infusionRateMax)
		assertThat(frame.getDoseRateSoftMax() <= frame.getDoseRateHardMax());
		assertThat(frame.getDoseRateHardMax() <= frame.getInfusionRateMax());
	}
	
	//onSequence((Initialise,Press,OnOff),
	//(OnOff,Observe,Alarm),
	//(Alarm,Observe,AlarmLight),
	//(AlarmLight,Observe,AlarmLight),
	//(AlarmLight,Observe,Display),
	//(Display,Press,Button1),
	//(Button,Press,Button3),
	//(Button3,Press,Down),
	//(Down,Press,Down),
	//(Down,Press,Button1),
	//(Button1,Press,Button1),
	//(Button1,Press,Down),
	//(Down,Press,Button1),
	//(Button1,Press,Down),
	//(Down,Press,Down),
	//(Down,Press,Down),
	//(Down,Press,Button1)),
	//(Button,Press,Button2),
	//(Button2,Press,Button2),
	//(Button2,Press,Button2),
	//(Button2,Press,Up),
	//(Up,Press,Button1),
	//(Button1,Press,Button1),
	//(Button1,Press,Up),
	//(Up,Press,Button1))
	public void VTBISubSequence(){
		JButtonFixture OnOff = window.button("OnOff");
		JButtonFixture Button1 = window.button("ButtonOne");
		JButtonFixture Button3 = window.button("Button3");
		JButtonFixture Down = window.button("Down");
		JButtonFixture Button2 = window.button("Button2");
		JButtonFixture Up = window.button("Up");
		JButtonFixture Run = window.button("Run");
		
		OnOff.click();
		Button1.click();
		Button3.click();
		Down.click();
		Down.click();
		Button1.click();
		Button1.click();
		Down.click();
		Button1.click();
		Down.click();
		Down.click();
		Down.click();
		Button1.click();
		Button2.click();
		Button2.click();
		Button2.click();
		Up.click();
		Button1.click();
		Button1.click();
		Up.click();
		Button1.click();
	}
	
@Test
public void boundaryTestVTBI(){
	VTBISubSequence();
	//& (0 <= VTBI <= primaryVTBIMax)
	assertThat(0 <= frame.getVTBI());
	assertThat(frame.getVTBI() <= frame.getPrimaryVTBIMax());
	//& (0 <= VTBIBagSize <= primaryVTBIMax)
	assertThat(0 <= frame.getVTBIBagSize());
	assertThat(frame.getVTBIBagSize() <= frame.getPrimaryVTBIMax());
	//& (0 <= VTBIBagSizeSelected <= primaryVTBIMax)
	assertThat(0 <= frame.getVTBIBagSizeSelected());
	assertThat(frame.getVTBIBagSizeSelected() <= frame.getPrimaryVTBIMax());
}

	@After
	public void tearDown() {
		window.cleanUp();
	}
}
