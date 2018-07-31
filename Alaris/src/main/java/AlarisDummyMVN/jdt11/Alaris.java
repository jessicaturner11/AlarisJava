package AlarisDummyMVN.jdt11;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.Timer;

public class Alaris extends JFrame {

	public JButton ButtonOne;
	public JButton Button1RateOnHold;
	public JButton Button1RateInfusing;
	public JButton Button1Dosing;
	public JButton Button1SelectDrugCategory;
	public JButton Button1VTBITime;
	public JButton Button1AdjustAlarmVolume;
	public JButton Button1EventLog;
	public JButton Button1PumpDetails;
	public JButton Button1ProfileFilter;
	public JButton Button1Standby;
	public JButton Button1Add;
	public JButton Button1Remove;
	public JButton Button2;
	public JButton Button2RateOnHold;
	public JButton Button2RateInfusing;
	public JButton Button3;
	public JButton Button3RateOnHold;
	public JButton Button3RateInfusing;
	public JButton	Button3ClearSetup;
	public JButton Button3ConfirmProfile;
	public JButton Button3SelectDrugCategory;
	public JButton Button3SelectDrug;
	public JButton Button3ConfirmRate;
	public JButton Button3VTBITime;
	public JButton Button3Profile;
	public JButton DoubleUp;
	public JButton DoubleUpChange;
	public JButton DoubleUpTitrate;
	public JButton Up;
	public JButton UpTitrate;
	public JButton Down;
	public JButton DownTitrate;
	public JButton DoubleDown;
	public JButton DoubleDownChange;
	public JButton DoubleDownTitrate;
	public JButton Run;
	public JButton RunRateInfusing;
	public JButton RunTitrateDoseNotPermitted;
	public JButton RunSetNotFitted;
	public JButton RunSetVTBI;
	public JButton Hold;
	public JButton Prime;
	public JButton Mute;
	public JButton Options;
	public JButton OptionsRateOnHold;
	public JButton OptionsRateInfusing;
	public JButton Level;
	public JButton LevelRateOnHold;
	public JButton LevelRateInfusing;
	public JButton OnOff;
	public JRadioButton AlarmLight;
	public JRadioButton Alarm;
	public Timer Timer;
	public Timer TimerRateOnHold;
	public Timer TimerRateInfusing;
	public JRadioButton Door;
	public JRadioButton RunLight;
	public JRadioButton OnHoldLight;
	public JRadioButton PlugLight;
	public JRadioButton BatteryLight;
	public JLabel Display;
	
	private String alarm;
	private int alarmLimit;
	private String alarmVolumeSelected;
	private String profile;
	private String profileSelected;
	private ArrayList<String> profilesActive;
	private String drugCategory;
	private String drugCategorySelected;
	private String drug;
	private String drugSelected;
	private int rate;
	private String endRate;
	private int doseRateSoftMin;
	private int doseRateSoftMax;
	private int doseRateHardMax;
	private int doseRateDefault;
	private int volume;
	private int VTBI;
	private int VTBIBagSize;
	private int VTBIBagSizeSelected;
	private int time;
	private String battStatus;
	private int bolus;
	private int bolusVolume;
	private String infusing;
	private int countdown; 
	private int powerSavingCount;
	private String options;
	private int State;
	
	private int alarmMax;
	private String alarmVolume;
	private boolean audioVolumeAdjustable;
	private boolean profileFiltering;
	private String drugOverrideMode;
	private int infusionRateMax;
	private boolean rateTitration;
	private int volumeInfused;
	private int concentration;
	private int concentrationMin;
	private int concentrationMax;
	private boolean VTBIClearRate;
	private int primaryVTBIMax;
	private int batteryPercent;
	private int pumpingPressure;
	private boolean pressureDisplay;
	private int pressureMax;
	private String bolusCategory;
	private int bolusRateMax;
	private int bolusVolumeMax;
	private int bolusDoseDefault;
	private int bolusRateDefault;
	private int weight;
	private int weightDefault;
	private int weightSoftMin;
	private int weightSoftMax;
	private boolean autoNightMode;
	private boolean autoSave;
	private boolean eventLog;
	private boolean standbyMode;
	private int primeRate;
	private boolean secondaryInfusion;
	private int [] values;
	
	private ArrayList<String> modes;
	private String mode;
	private String functions;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alaris window = new Alaris("Off");
					window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Alaris(String m) {
		initialize();
		initialiseValues();
		
		String [] ms = new String[]{"Off","ClearSetup","PowerDown","ConfirmProfile","Profile",
				"SelectDrugCategory","SelectDrug","ConfirmRate","Volume","SetNotFitted",
				"Prime","Options","PressureLevel","Attention","Dosing","VTBITime",
				"AdjustAlarmVolume","EventLog","PumpDetails","ProfileFilter","Standby",
				"SetVTBI","RateInfusing","Bolus","Titrate","TitrateDoseNotPermitted",
				"DoorOpen","VTBIBags","RateOnHold","VTBI","EndRate"};
		modes = new ArrayList<String>(Arrays.asList(ms));
		if(modes.contains(m)){
			mode = m;
		}
	}

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 700, 521);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		Thread.currentThread().setName("Alaris");
		
		ButtonOne = new JButton("ButtonOne");
		ButtonOne.setName("ButtonOne");
		ButtonOne.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				executeButton1();
			}
		});
		this.getContentPane().add(ButtonOne);
		
		JButton Button1 = new JButton("Button1");
		Button1.setName("Button1");
		Button1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1();
			}
		});
		this.getContentPane().add(Button1);
		
		Button1RateOnHold  = new JButton("Button1RateOnHold");
		Button1RateOnHold.setName("Button1RateOnHold");
		Button1RateOnHold.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1RateOnHold();
			}
		});
		this.getContentPane().add(Button1RateOnHold);
		
		Button1RateInfusing  = new JButton("Button1RateInfusing");
		Button1RateInfusing.setName("Button1RateInfusing");
		Button1RateInfusing.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				executeButton1RateInfusing();
			}
		});
		this.getContentPane().add(Button1RateInfusing);
		
		Button1Dosing  = new JButton("Button1Dosing");
		Button1Dosing.setName("Button1Dosing");
		Button1Dosing.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1Dosing();
			}
		});
		this.getContentPane().add(Button1Dosing);
		
		Button1SelectDrugCategory = new JButton("Button1SelectDrugCategory");
		Button1SelectDrugCategory.setName("Button1SelectDrugCategory");
		Button1SelectDrugCategory.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1SelectDrugCategory();
			}
		});
		this.getContentPane().add(Button1SelectDrugCategory);
		
		Button1VTBITime  = new JButton("Button1VTBITime");
		Button1.setName("Button1VTBITime");
		Button1VTBITime.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1VTBITime();
			}
		});
		this.getContentPane().add(Button1VTBITime);
		
		Button1AdjustAlarmVolume  = new JButton("Button1AdjustAlarmVolume");
		Button1AdjustAlarmVolume.setName("Button1AdjustAlarmVolume");
		Button1AdjustAlarmVolume.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1AdjustAlarmVolume();
			}
		});
		this.getContentPane().add(Button1AdjustAlarmVolume);
		
		Button1EventLog  = new JButton("Button1EventLog");
		Button1EventLog.setName("Button1EventLog");
		Button1EventLog.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1EventLog();
			}
		});
		this.getContentPane().add(Button1EventLog);
		
		Button1PumpDetails = new JButton("Button1PumpDetails");
		Button1PumpDetails.setName("Button1PumpDetails");
		Button1PumpDetails.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1PumpDetails();
			}
		});
		this.getContentPane().add(Button1PumpDetails);
		
		Button1ProfileFilter = new JButton("Button1ProfileFilter");
		Button1ProfileFilter.setName("Button1ProfileFilter");
		Button1ProfileFilter.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1ProfileFilter();
			}
		});
		this.getContentPane().add(Button1ProfileFilter);
		
		Button1Standby = new JButton("Button1Standby");
		Button1Standby.setName("Button1Standby");
		Button1Standby.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1Standby();
			}
		});
		this.getContentPane().add(Button1Standby);
		
		Button1Add = new JButton("Button1Add");
		Button1Add.setName("Button1Add");
		Button1Add.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1Add();
			}
		});
		this.getContentPane().add(Button1Add);
		
		Button1Remove = new JButton("Button1Remove");
		Button1Remove.setName("Button1Remove");
		Button1Remove.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton1Remove();
			}
		});
		this.getContentPane().add(Button1Remove);
		
		Button2 = new JButton("Button2");
		Button2.setName("Button2");
		Button2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton2();
			}
		});
		this.getContentPane().add(Button2);
		
		Button2RateOnHold = new JButton("Button2RateOnHold");
		Button2RateOnHold.setName("Button2RateOnHold");
		Button2RateOnHold.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton2RateOnHold();
			}
		});
		this.getContentPane().add(Button2RateOnHold);
		
		Button2RateInfusing = new JButton("Button2RateInfusing");
		Button2RateInfusing.setName("Button2RateInfusing");
		Button2RateInfusing.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton2RateInfusing();
			}
		});
		this.getContentPane().add(Button2RateInfusing);
		
		Button3 = new JButton("Button3");
		Button3.setName("Button3");
		Button3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3();
			}
		});
		this.getContentPane().add(Button3);
		
		Button3RateOnHold = new JButton("Button3RateOnHold");
		Button3RateOnHold.setName("Button3RateOnHold");
		Button3RateOnHold.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3RateOnHold();
			}
		});
		this.getContentPane().add(Button3RateOnHold);
		
		Button3RateInfusing = new JButton("Button3RateInfusing");
		Button3RateInfusing.setName("Button3RateInfusing");
		Button3RateInfusing.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3RateInfusing();
			}
		});
		this.getContentPane().add(Button3RateInfusing);
		
		Button3ClearSetup = new JButton("Button3ClearSetup");
		Button3ClearSetup.setName("Button3ClearSetup");
		Button3ClearSetup.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3ClearSetup();
			}
		});
		this.getContentPane().add(Button3ClearSetup);
		
		Button3ConfirmProfile = new JButton("Button3ConfirmProfile");
		Button3ConfirmProfile.setName("Button3ConfirmProfile");
		Button3ConfirmProfile.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3ConfirmProfile();
			}
		});
		this.getContentPane().add(Button3ConfirmProfile);
		
		Button3SelectDrugCategory = new JButton("Button3SelectDrugCategory");
		Button3SelectDrugCategory.setName("Button3SelectDrugCategory");
		Button3SelectDrugCategory.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3SelectDrugCategory();
			}
		});
		this.getContentPane().add(Button3SelectDrugCategory);
		
		Button3SelectDrug = new JButton("Button3SelectDrug");
		Button3SelectDrug.setName("Button3SelectDrug");
		Button3SelectDrug.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3SelectDrug();
			}
		});
		this.getContentPane().add(Button3SelectDrug);
		
		Button3ConfirmRate = new JButton("Button3ConfirmRate");
		Button3ConfirmRate.setName("Button3ConfirmRate");
		Button3ConfirmRate.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3ConfirmRate();
			}
		});
		this.getContentPane().add(Button3ConfirmRate);
		
		Button3VTBITime = new JButton("Button3VTBITime");
		Button3VTBITime.setName("Button3VTBITime");
		Button3VTBITime.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3VTBITime();
			}
		});
		this.getContentPane().add(Button3VTBITime);
		
		Button3Profile = new JButton("Button3Profile");
		Button3Profile.setName("Button3Profile");
		Button3Profile.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeButton3Profile();
			}
		});
		this.getContentPane().add(Button3Profile);
		
		DoubleUp = new JButton("DoubleUp");
		DoubleUp.setName("DoubleUp");
		DoubleUp.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDoubleUp();
			}
		});
		this.getContentPane().add(DoubleUp);
		
		DoubleUpChange = new JButton("DoubleUpChange");
		DoubleUpChange.setName("DoubleUpChange");
		DoubleUpChange.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDoubleUpChange();
			}
		});
		this.getContentPane().add(DoubleUpChange);
		
		DoubleUpTitrate = new JButton("DoubleUpTitrate");
		DoubleUpTitrate.setName("DoubleUpTitrate");
		DoubleUpTitrate.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDoubleUpTitrate();
			}
		});
		this.getContentPane().add(DoubleUpTitrate);
		
		Up  = new JButton("Up");
		Up.setName("Up");
		Up.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeUp();
			}
		});
		this.getContentPane().add(Up);
		
		UpTitrate = new JButton("UpTitrate");
		UpTitrate.setName("UpTitrate");
		UpTitrate.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeUpTitrate();
			}
		});
		this.getContentPane().add(UpTitrate);
		
		Down = new JButton("Down");
		Down.setName("Down");
		Down.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDown();
			}
		});
		this.getContentPane().add(Down);
		
		DownTitrate = new JButton("DownTitrate");
		DownTitrate.setName("DownTirate");
		DownTitrate.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDownTitrate();
			}
		});
		this.getContentPane().add(DownTitrate);
		
		DoubleDown = new JButton("DoubleDown");
		DoubleDown.setName("DoubleDown");
		DoubleDown.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDoubleDown();
			}
		});
		this.getContentPane().add(DoubleDown);
		
		DoubleDownChange = new JButton("DoubleDownChange");
		DoubleDownChange.setName("DoubleDownChange");
		DoubleDownChange.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDoubleDownChange();
			}
		});
		this.getContentPane().add(DoubleDownChange);
		
		DoubleDownTitrate = new JButton("DoubleDownTitrate");
		DoubleDownTitrate.setName("DoubleDownTitrate");
		DoubleDownTitrate.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDoubleDownTitrate();
			}
		});
		this.getContentPane().add(DoubleDownTitrate);
		
		Run = new JButton("Run");
		Run.setName("Run");
		Run.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeRun();
			}
		});
		this.getContentPane().add(Run);
		
		RunRateInfusing = new JButton("RunRateInfusing");
		RunRateInfusing.setName("RunRateInfusing");
		RunRateInfusing.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeRunRateInfusing();
			}
		});
		this.getContentPane().add(RunRateInfusing);
		
		RunTitrateDoseNotPermitted = new JButton("RunTitrateDoseNotPermitted");
		RunTitrateDoseNotPermitted.setName("RunTitrateDoseNotPermitted");
		RunTitrateDoseNotPermitted.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeRunTitrateDoseNotPermitted();
			}
		});
		this.getContentPane().add(RunTitrateDoseNotPermitted);
		
		RunSetNotFitted = new JButton("RunSetNotFitted");
		RunSetNotFitted.setName("RunSetNotFitted");
		RunSetNotFitted.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeRunSetNotFitted();
			}
		});
		this.getContentPane().add(RunSetNotFitted);
		
		RunSetVTBI = new JButton("RunSetVTBI");
		RunSetVTBI.setName("RunSetVTBI");
		RunSetVTBI.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeRunSetVTBI();
			}
		});
		this.getContentPane().add(RunSetVTBI);
		
		Hold = new JButton("Hold");
		Hold.setName("Hold");
		Hold.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeHold();
			}
		});
		this.getContentPane().add(Hold);
		
		Prime = new JButton("Prime");
		Prime.setName("Prime");
		Prime.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executePrime();
			}
		});
		this.getContentPane().add(Prime);
		
		Mute  = new JButton("Mute");
		Mute.setName("Mute");
		Mute.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeMute();
			}
		});
		this.getContentPane().add(Mute);
		
		Options = new JButton("Options");
		Options.setName("Options");
		Options.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeOptions();
			}
		});
		this.getContentPane().add(Options);
		
		OptionsRateOnHold = new JButton("OptionsRateOnHold");
		OptionsRateOnHold.setName("OptionsRateOnHold");
		OptionsRateOnHold.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeOptionsRateOnHold();
			}
		});
		this.getContentPane().add(OptionsRateOnHold);
		
		OptionsRateInfusing = new JButton("OptionsRateInfusing");
		OptionsRateInfusing.setName("OptionsRateInfusing");
		OptionsRateInfusing.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeOptionsRateInfusing();
			}
		});
		this.getContentPane().add(OptionsRateInfusing);
		
		Level = new JButton("Level");
		Level.setName("Level");
		Level.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeLevel();
			}
		});
		this.getContentPane().add(Level);
		
		LevelRateOnHold  = new JButton("LevelRateOnHold");
		LevelRateOnHold.setName("LevelRateOnHold");
		LevelRateOnHold.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeLevelRateOnHold();
			}
		});
		this.getContentPane().add(LevelRateOnHold);
		
		LevelRateInfusing  = new JButton("LevelRateInfusing");
		LevelRateInfusing.setName("LevelRateInfusing");
		LevelRateInfusing.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeLevelRateInfusing();
			}
		});
		this.getContentPane().add(LevelRateInfusing);
		
		OnOff  = new JButton("OnOff");
		OnOff.setName("OnOff");
		OnOff.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				executeOnOff();
			}
		});
		this.getContentPane().add(OnOff);
		
		AlarmLight = new JRadioButton("AlarmLight");
		AlarmLight.setName("AlarmLight");
		AlarmLight.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeAlarmLight();
			}
		});
		this.getContentPane().add(AlarmLight);
		
		Alarm  = new JRadioButton("Alarm");
		Alarm.setName("Alarm");
		Alarm.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeAlarm();
			}
		});
		this.getContentPane().add(Alarm);
		
		Timer = new Timer(0, new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeTimer();
			}
		});
		
		TimerRateOnHold = new Timer(0, new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeTimerRateOnHold();
			}
		});
		
		TimerRateInfusing = new Timer(0, new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeTimerRateInfusing();
			}
		});
		
		Door = new JRadioButton("Door");
		Door.setName("Door");
		Door.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeDoor();
			}
		});
		this.getContentPane().add(Door);
		
		RunLight = new JRadioButton("RunLight");
		RunLight.setName("RunLight");
		RunLight.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeRunLight();
			}
		});
		this.getContentPane().add(RunLight);
		
		OnHoldLight = new JRadioButton("OnHoldLight");
		OnHoldLight.setName("OnHoldLight");
		OnHoldLight.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executeOnHoldLight();
			}
		});
		this.getContentPane().add(OnHoldLight);
		
		PlugLight = new JRadioButton("PlugLight");
		PlugLight.setName("PlugLight");
		PlugLight.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				executePlugLight();
			}
		});
		this.getContentPane().add(PlugLight);
		
		BatteryLight = new JRadioButton("BatteryLight");
		BatteryLight.setName("BatteryLight");
		BatteryLight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				executeBatteryLight();
			}
		});
		this.getContentPane().add(BatteryLight);
		
		Display  = new JLabel("      ");
		Display.setName("Display");
		this.getContentPane().add(Display);
		
	}

	private void initialiseValues(){
		//Settings first
		setAlarmMax(8);
		setAlarmVolume("Medium");
		setAudioVolumeAdjustable(true);
		setProfileFiltering(true);
		setDrugOverrideMode("Smart");
		setInfusionRateMax(1200);
		setRateTitration(true);
		setVolumeInfused(0);
		setConcentration(0);
		setConcentrationMax(0);
		setConcentrationMin(0);
		setVTBIClearRate(true);
		setPrimaryVTBIMax(9999);
		setBatteryPercent(11);
		setPumpingPressure(0);
		setPressureDisplay(true);
		setPressureMax(8);
		setBolusCategory("HandsOnOnly");
		setBolusRateMax(1200);
		setBolusVolumeMax(5);
		setBolusDoseDefault(0);
		setBolusRateDefault(0);
		weightDefault = 1;
		setWeight(weightDefault);
		setWeightSoftMin(1);
		setWeightSoftMax(150);
		setAutoNightMode(true);
		setAutoSave(true);
		setEventLog(true);
		setStandbyMode(true);
		setPrimeRate(0);
		setSecondaryInfusion(false);
		setValues(new int[]{1,10,100,1000});
		
		//Alaris values
		setAlarm("Stop");
		setAlarmLimit(5);
		setAlarmVolumeSelected("Medium");
		profile = "CriticalCare";
		setProfileSelected(profile);
		profilesActive = new ArrayList<String>();
		profilesActive.add("CriticalCare");
		profilesActive.add("MedicalWard");
		profilesActive.add("Pediatrics");
		profilesActive.add("SurgicalWard");
		profilesActive.add("TrainingADULT");
		profilesActive.add("TrainingPEDIATRICS");
		drugCategory = "mlh";
		setDrugCategorySelected(drugCategory);
		drug = "Adrenaline";
		setDrugSelected(drug);
		setRate(0);
		setEndRate("CONTINUE");
		setDoseRateSoftMin(0);
		setDoseRateSoftMax(0);
		setDoseRateHardMax(0);
		setDoseRateDefault(0);
		setVolume(0);
		setVTBI(0);
		setVTBIBagSize(0);
		setVTBIBagSizeSelected(500);
		setTime(0);
		setBattStatus("Charge");
		setBolus(0); 
		setBolusVolume(0);
		setInfusing("No");
		setCountdown(5);
		setPowerSavingCount(10);
		setOptions("DosingSummary");
		State = 1;
		
	}

	private void executeTimerRateInfusing() {
		if(mode.equals("Volume")||mode.equals("PressureLevel")||mode.equals("Dosing")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateInfusing";
		}
		
	}

	private void executeTimerRateOnHold() {
		if(mode.equals("Volume")||mode.equals("Dosing")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		} else if(mode.equals("PressureLevel")){
			mode = "RateOnHold";
		}
		
	}

	private void executeTimer() {
		if(mode.equals("ClearSetup")||mode.equals("ConfirmProfile")||mode.equals("Profile")||
				mode.equals("SelectDrugCategory")||mode.equals("SelectDrug")||mode.equals("ConfirmRate")
				||mode.equals("VTBITime")){
			mode = "Attention";
		} else if(mode.equals("PowerDown")){
			functions = "CountDownToOff()";
			CountDownToOff();
		} else if(mode.equals("SetNotFitted")||mode.equals("Attention")){
			functions = "StartAlarm()";
			StartAlarm();
		} else if(mode.equals("Prime")||mode.equals("Options")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		}
		
	}

	private void executeBatteryLight() {
		// TODO Auto-generated method stub
		
	}

	private void executePlugLight() {
		// TODO Auto-generated method stub
		
	}

	private void executeOnHoldLight() {
		// TODO Auto-generated method stub
		
	}

	private void executeRunLight() {
		// TODO Auto-generated method stub
		
	}

	private void executeDoor() {
		if(mode.equals("SetNotFitted")){
			mode = "DoorOpen";
		}
		
	}

	private void executeAlarm() {
	
	}

	private void executeAlarmLight() {
		
	}

	private void executeOnOff() {
		if(mode.equals("Off")){
			functions = "SwitchOn()";
			SwitchOn();
			mode = "ClearSetup";
		} else if(mode.equals("ClearSetup")||mode.equals("ConfirmProfile")||mode.equals("Profile")
				||mode.equals("SelectDrugCategory")||mode.equals("SelectDrug")||mode.equals("ConfirmRate")
				||mode.equals("Volume")||mode.equals("SetNotFitted")||mode.equals("Prime")
				||mode.equals("Options")||mode.equals("PressureLevel")||mode.equals("Attention")
				||mode.equals("Dosing")||mode.equals("VTBITime")){
			mode = "PowerDown";
		} else if(mode.equals("PowerDown")){
			functions = "System.exit(0)";
			System.exit(0);
		} 
		
	}

	private void executeLevelRateInfusing() {
		if(mode.equals("PressureLevel")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateInfusing";
		}
		
	}

	private void executeLevelRateOnHold() {
		if(mode.equals("PressureLevel")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		}
		
	}

	private void executeLevel() {
		// TODO Auto-generated method stub
		
	}

	private void executeOptionsRateInfusing() {
		if(mode.equals("Options")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateInfusing";
		}
		
	}

	private void executeOptionsRateOnHold() {
		if(mode.equals("Options")){
			mode = "RateOnHold";
		}
		
	}

	private void executeOptions() {
		// TODO Auto-generated method stub
		
	}

	private void executeMute() {
		if(mode.equals("SetNotFitted")||mode.equals("Attention")){
			functions = "StopAlarm()";
			StopAlarm();
		}
		
	}

	private void executePrime() {
		// TODO Auto-generated method stub
		
	}

	private void executeHold() {
		if(mode.equals("Prime")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		}
		
	}

	private void executeRunSetVTBI() {
		// TODO Auto-generated method stub
		
	}

	private void executeRunSetNotFitted() {
		// TODO Auto-generated method stub
		
	}

	private void executeRunTitrateDoseNotPermitted() {
		// TODO Auto-generated method stub
		
	}

	private void executeRunRateInfusing() {
		// TODO Auto-generated method stub
		
	}

	private void executeRun() {
		// "dummy sequence" for Setup and Start 
		if(mode.equals("RateOnHold")){
			functions = "Infusing()";
			infusing();
			mode = "RateInfusing";
		}
		mode = "RateInfusing";
		profile = "Pediatrics";
		profileSelected = "Pediatrics";
		drugCategory = "ABCDE";
		drugCategorySelected = "ABCDE";
		drug = "Dobutamine";
		drugSelected = "Dobutamine";
		VTBI = 1000;
		VTBIBagSize = 1000;
		VTBIBagSizeSelected = 1000;
		endRate = "Stop";
		battStatus = "Charge";
		bolusCategory = "Disabled";
		infusing = "Yes";
		
	}

	private void infusing() {
		// TODO Auto-generated method stub
		
	}

	private void executeDoubleDownTitrate() {
		// TODO Auto-generated method stub
		
	}

	private void executeDoubleDownChange() {
		if(mode.equals("VTBITime")){
			functions = "ChangeDown()";
			ChangeDown();
		}
	}

	private void executeDoubleDown() {
		if(mode.equals("Profile")){
			functions = "BottomOfProfile()";
			BottomOfProfile();
		} else if(mode.equals("SelectDrugCategory")){
			functions = "BottomCategory()";
			BottomCategory();
		} else if(mode.equals("SelectDrug")){
			functions = "BottomOfDrugs()";
			BottomOfDrugs();
		} else if(mode.equals("Options")){
			functions = "BottomOfOptions()";
			BottomOfOptions();
		} else if(mode.equals("PressureLevel")){
			functions = "DecreaseSelection()";
			DecreaseSelection();
		} else if(mode.equals("VTBITime")){
			functions = "DecreaseTimeDouble()";
			DecreaseTimeDouble();
		}
		
	}

	private void executeDown() {
		if(mode.equals("Profile")){
			functions = "DownProfileOne()";
			DownProfileOne();
		} else if(mode.equals("SelectDrugCategory")){
			functions = "DownCategoryOne()";
			DownCategoryOne();
		} else if(mode.equals("SelectDrug")){
			functions = "DownDrugsOne()";
			DownDrugsOne();
		} else if(mode.equals("Options")){
			functions = "DownOptionsOne()";
			DownOptionsOne();
		} else if(mode.equals("PressureLevel")){
			functions = "DecreaseSelection()";
			DecreaseSelection();
		} else if(mode.equals("VTBITime")){
			functions = "DecreaseTime()";
			DecreaseTime();
		}
		
	}

	private void executeDownTitrate() {
		// TODO Auto-generated method stub
		
	}

	private void executeUpTitrate() {
		// TODO Auto-generated method stub
		
	}

	private void executeUp() {
		if(mode.equals("Profile")){
			functions = "UpProfileOne()";
			UpProfileOne();
		} else if(mode.equals("SelectDrugCategory")){
			functions = "UpCategoryOne()";
			UpCategoryOne();
		} else if(mode.equals("SelectDrug")){
			functions = "UpDrugsOne()";
			UpDrugsOne();
		} else if(mode.equals("Options")){
			functions = "UpOptionsOne()";
			UpOptionsOne();
		} else if(mode.equals("PressureLevel")){
			functions = "IncreaseSelection()";
			IncreaseSelection();
		} else if(mode.equals("VTBITime")){
			functions = "IncreaseTime()";
			IncreaseTime();
		} else if((mode.equals("VTBIBags"))){
			functions = "UpVTBIBagsOne()";
			UpVTBIBagsOne();
		} else if(mode.equals("EndRate")){
			functions = "UpEndRateOne()";
			UpEndRateOne();
		}
		
	}

	private void executeDoubleUpTitrate() {
		// TODO Auto-generated method stub
		
	}

	private void executeDoubleUpChange() {
		if(mode.equals("VTBITime")){
			functions = "ChangeUp()";
			ChangeUp();
		}
		
	}

	private void executeDoubleUp() {
		if(mode.equals("Profile")){
			functions = "TopOfProfile()";
			TopOfProfile();
		} else if(mode.equals("SelectDrugCategory")){
			functions = "TopCategory()";
			TopCategory();
		} else if(mode.equals("SelectDrug")){
			functions = "TopOfDrugs()";
			TopOfDrugs();
		} else if(mode.equals("Options")){
			functions = "TopOfOptions()";
			TopOfOptions();
		} else if(mode.equals("PressureLevel")){
			functions = "IncreaseSelection()";
			IncreaseSelection();
		} else if(mode.equals("VTBITime")){
			functions = "IncreaseTimeDouble()";
			IncreaseTimeDouble();
		}
		
	}

	private void executeButton3VTBITime() {
		if(mode.equals("Attention")){
			mode = "VTBITime";
		}
	}

	private void executeButton3ConfirmRate() {
		if(mode.equals("Attention")){
			mode = "ConfirmRate";
		}
	}

	private void executeButton3SelectDrug() {
		if(mode.equals("Attention")){
			mode = "SelectDrug";
		}
		
	}

	private void executeButton3SelectDrugCategory() {
		if(mode.equals("Attention")){
			mode = "SelectDrugCategory";
		}
		
	}

	private void executeButton3ConfirmProfile() {
		if(mode.equals("Attention")){
			mode = "ConfirmProfile";
		}
		
	}

	private void executeButton3ClearSetup() {
		if(mode.equals("Attention")){
			mode = "ClearSetup";
		}
		
	}

	private void executeButton3RateInfusing() {
		if(mode.equals("Volume")||mode.equals("Options")||mode.equals("Dosing")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateInfusing";
		}
		
	}

	private void executeButton3RateOnHold() {
		if(mode.equals("Volume")||mode.equals("Options")||mode.equals("Attention")
				||mode.equals("Dosing")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		}
		
	}
	
	protected void executeButton3Profile() {
		if(mode.equals("Attention")){
			mode = "Profile";
		}
		
	}

	private void executeButton3() {
		if(mode.equals("ClearSetup")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		} else if(mode.equals("ConfirmProfile")){
			mode = "Profile";
		} else if(mode.equals("SelectDrug")){
			mode = "SelectDrugCategory";
		} else if(mode.equals("ConfirmRate")){
			mode = "SelectDrug";
		} else if(mode.equals("SetNotFitted")||mode.equals("Prime")||mode.equals("VTBITime")
				){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		}
		
	}

	private void executeButton2RateInfusing() {
		if(mode.equals("Volume")){
			functions = "ClearVolume() ChangeReset()";
			ClearVolume();
			ChangeReset();
			mode = "RateInfusing";
		}
		
	}

	private void executeButton2RateOnHold() {
		if(mode.equals("Volume")){
			functions = "ClearVolume() ChangeReset()";
			ClearVolume();
			ChangeReset();
			mode = "RateOnHold";
		}
		
	}

	private void executeButton2() {
		if(mode.equals("Profile")){
			mode = "ViewAllOptions";
		} else if(mode.equals("ConfirmRate")){
			functions = "SetRate() ChangeReset()";
			SetRate();
			ChangeReset();
			mode = "RateOnHold";
		} else if(mode.equals("VTBITime")){
			mode = "VTBIBags";
		} else if(mode.equals("RateOnHold")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "VTBI";
		} else if(mode.equals("VTBI")){
			mode = "VTBIBags";
		}
		
	}

	private void executeButton1Remove() {
		// TODO Auto-generated method stub
		
	}

	private void executeButton1Add() {
		// TODO Auto-generated method stub
		
	}

	private void executeButton1Standby() {
		if(mode.equals("Options")){
			mode = "Standby";
		}
	}

	private void executeButton1ProfileFilter() {
		if(mode.equals("Options")){
			mode = "ProfileFilter";
		}
	}

	private void executeButton1PumpDetails() {
		if(mode.equals("Options")){
			mode = "PumpDetails";
		}
	}

	private void executeButton1EventLog() {
		if(mode.equals("Options")){
			mode = "EventLog";
		}
	}

	private void executeButton1AdjustAlarmVolume() {
		if(mode.equals("Options")){
			mode = "AdjustAlarmVolume";
		}
		
	}

	private void executeButton1VTBITime() {
		if(mode.equals("Options")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "VTBITime";
		}
		
	}

	private void executeButton1SelectDrugCategory() {
		if(mode.equals("Options")){
			mode = "SelectDrugCategory";
		}
		
	}

	private void executeButton1Dosing() {
		if(mode.equals("Options")){
			mode = "Dosing";
		}
		
	}

	private void executeButton1RateInfusing() {
		if(mode.equals("Options")||mode.equals("PressureLevel")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateInfusing";
		}
		
	}

	private void executeButton1RateOnHold() {
		if(mode.equals("Options")||mode.equals("PressureLevel")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		}
		
	}

	private void executeButton1() {
		if(mode.equals("ClearSetup")){
			functions = "ClearSetup()";
			ClearSetup();
			mode = "ConfirmProfile";
		} else if(mode.equals("ConfirmProfile")){
			functions = "SetProfile()";
			SetProfile();
			mode = "SelectDrugCategory";
		} else if(mode.equals("Profile")){
			mode = "ConfirmProfile";
		} else if(mode.equals("SelectDrugCategory")){
			functions = "SetDrugCategory()";
			SetDrugCategory();
			mode = "SelectDrug";
		} else if(mode.equals("SelectDrug")){
			functions = "SetDrug()";
			SetDrug();
			mode = "ConfirmRate";
		} else if(mode.equals("Prime")){
			mode = "SetNotFitted";
		} else if(mode.equals("VTBITime")){
			functions = "ChangeReset()";
			ChangeReset();
			mode = "RateOnHold";
		} else if(mode.equals("VTBIBags")){
			functions = "SetVTBIBags() ChangeReset()";
			SetVTBIBags();
			ChangeReset();
			mode = "VTBI";
		} else if(mode.equals("VTBI")){
			functions = "SetVTBI() ChangeReset()";
			SetVTBI();
			ChangeReset();
			mode = "EndRate";
		} else if(mode.equals("EndRate")){
			mode = "RateOnHold";
		}
		
	}
	
	private void SwitchOn(){
	}
	
	private void ClearSetup(){
	}
	
	private void ChangeReset(){
	}
	
	private void OnHold(){
	}
	
	private void Charging(){
	}
	
	private void BatteryStatus(){
	}
	
	private void CountDownToOff(){
	}
	
	private void Infusing(){
	}
	
	private void SetProfile(){
	}
	
	private void TopOfProfile(){
	}
	
	private void UpProfileOne(){
	}
	
	private void DownProfileOne(){
	}
	
	private void BottomOfProfile(){
	}
	
	private void SetDrugCategory(){
	}
	
	private void TopCategory(){
	}
	
	private void UpCategoryOne(){
	}
	
	private void DownCategoryOne(){
	}
	
	private void BottomCategory(){
	}
	
	private void SetDrug(){
	}
	
	private void TopOfDrugs(){
	}
	
	private void UpDrugsOne(){
	}
	
	private void DownDrugsOne(){
	}
	
	private void BottomOfDrugs(){
	}
	
	private void SetRate(){
		rate = 60;
		doseRateSoftMin = 1;
		doseRateSoftMax = 61;
		doseRateHardMax = 100;
	}
	
	private void ClearVolume(){
	}
	
	private void StopAlarm(){
	}
	
	private void StartAlarm(){
	}
	
	private void TopOfOptions(){
	}
	
	private void UpOptionsOne(){
	}
	
	private void DownOptionsOne(){
	}
	
	private void BottomOfOptions(){
	}
	
	private void IncreaseSelection(){
	}
	
	private void DecreaseSelection(){
	}
	
	private void IncreaseTimeDouble(){
	}
	
	private void IncreaseTime(){
	}
	
	private void DecreaseTime(){
	}
	
	private void DecreaseTimeDouble(){
	}
	
	private void ChangeUp(){
	}
	
	private void ChangeDown(){
	}
	
	private void TopVolumes(){
	}
	
	private void UpVolumesOne(){
	}
	
	private void DownVolumesOne(){
	}
	
	private void BottomVolumes(){
	}
	
	private void AddProfile(){
	}
	
	private void RemoveProfile(){
	}
	
	private void StartPowerSaving(){
	}
	
	private void IncreaseRateDouble(){
	}
	
	private void IncreaseRate(){
	}
	
	private void DecreaseRate(){
	}
	
	private void DecreaseRateDouble(){
	}
	
	private void IncreaseBolus(){
	}
	
	private void IncreaseBolusDouble(){
	}
	
	private void DecreaseBolus(){
	}
	
	private void DecreaseBolusDouble(){
	}
	
	private void SetVTBIBags(){
	}
	
	private void TopOfVTBIBags(){
	}

	private void UpVTBIBagsOne(){
	}
	
	private void DownVTBIBagsOne(){
	}
	
	private void BottomOfVTBIBags(){
	}
	
	private void SetVTBI(){
	}
	
	private void IncreaseVTBIDouble(){
	}
	
	private void IncreaseVTBI(){
	}
	
	private void DecreaseVTBI(){
	}
	
	private void DecreaseVTBIDouble(){
	}
	
	private void NoRateSet(){
	}
	
	private void TopEndRate(){
	}
	
	private void UpEndRateOne(){
	}
	
	private void DownEndRateOne(){
	}
	
	private void BottomEndRate(){
	}

	public String getProfileSelected() {
		return profileSelected;
	}

	public void setProfileSelected(String profileSelected) {
		this.profileSelected = profileSelected;
	}

	public String getAlarm() {
		return alarm;
	}

	public void setAlarm(String alarm) {
		this.alarm = alarm;
	}

	public int getAlarmLimit() {
		return alarmLimit;
	}

	public void setAlarmLimit(int alarmLimit) {
		this.alarmLimit = alarmLimit;
	}

	public String getAlarmVolumeSelected() {
		return alarmVolumeSelected;
	}

	public void setAlarmVolumeSelected(String alarmVolumeSelected) {
		this.alarmVolumeSelected = alarmVolumeSelected;
	}

	public String getDrugCategorySelected() {
		return drugCategorySelected;
	}

	public void setDrugCategorySelected(String drugCategorySelected) {
		this.drugCategorySelected = drugCategorySelected;
	}

	public String getDrugSelected() {
		return drugSelected;
	}

	public void setDrugSelected(String drugSelected) {
		this.drugSelected = drugSelected;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getEndRate() {
		return endRate;
	}

	public void setEndRate(String endRate) {
		this.endRate = endRate;
	}

	public int getDoseRateSoftMin() {
		return doseRateSoftMin;
	}

	public void setDoseRateSoftMin(int doseRateSoftMin) {
		this.doseRateSoftMin = doseRateSoftMin;
	}

	public int getDoseRateSoftMax() {
		return doseRateSoftMax;
	}

	public void setDoseRateSoftMax(int doseRateSoftMax) {
		this.doseRateSoftMax = doseRateSoftMax;
	}

	public int getDoseRateHardMax() {
		return doseRateHardMax;
	}

	public void setDoseRateHardMax(int doseRateHardMax) {
		this.doseRateHardMax = doseRateHardMax;
	}

	public int getDoseRateDefault() {
		return doseRateDefault;
	}

	public void setDoseRateDefault(int doseRateDefault) {
		this.doseRateDefault = doseRateDefault;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVTBI() {
		return VTBI;
	}

	public void setVTBI(int vTBI) {
		VTBI = vTBI;
	}

	public int getVTBIBagSize() {
		return VTBIBagSize;
	}

	public void setVTBIBagSize(int vTBIBagSize) {
		VTBIBagSize = vTBIBagSize;
	}

	public int getVTBIBagSizeSelected() {
		return VTBIBagSizeSelected;
	}

	public void setVTBIBagSizeSelected(int vTBIBagSizeSelected) {
		VTBIBagSizeSelected = vTBIBagSizeSelected;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getBattStatus() {
		return battStatus;
	}

	public void setBattStatus(String battStatus) {
		this.battStatus = battStatus;
	}

	public int getBolus() {
		return bolus;
	}

	public void setBolus(int bolus) {
		this.bolus = bolus;
	}

	public int getBolusVolume() {
		return bolusVolume;
	}

	public void setBolusVolume(int bolusVolume) {
		this.bolusVolume = bolusVolume;
	}

	public String getInfusing() {
		return infusing;
	}

	public void setInfusing(String infusing) {
		this.infusing = infusing;
	}

	public int getCountdown() {
		return countdown;
	}

	public void setCountdown(int countdown) {
		this.countdown = countdown;
	}

	public int getPowerSavingCount() {
		return powerSavingCount;
	}

	public void setPowerSavingCount(int powerSavingCount) {
		this.powerSavingCount = powerSavingCount;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public int getAlarmMax() {
		return alarmMax;
	}

	public void setAlarmMax(int alarmMax) {
		this.alarmMax = alarmMax;
	}

	public String getAlarmVolume() {
		return alarmVolume;
	}

	public void setAlarmVolume(String alarmVolume) {
		this.alarmVolume = alarmVolume;
	}

	public boolean isAudioVolumeAdjustable() {
		return audioVolumeAdjustable;
	}

	public void setAudioVolumeAdjustable(boolean audioVolumeAdjustable) {
		this.audioVolumeAdjustable = audioVolumeAdjustable;
	}

	public boolean isProfileFiltering() {
		return profileFiltering;
	}

	public void setProfileFiltering(boolean profileFiltering) {
		this.profileFiltering = profileFiltering;
	}

	public String getDrugOverrideMode() {
		return drugOverrideMode;
	}

	public void setDrugOverrideMode(String drugOverrideMode) {
		this.drugOverrideMode = drugOverrideMode;
	}

	public int getInfusionRateMax() {
		return infusionRateMax;
	}

	public void setInfusionRateMax(int infusionRateMax) {
		this.infusionRateMax = infusionRateMax;
	}

	public boolean isRateTitration() {
		return rateTitration;
	}

	public void setRateTitration(boolean rateTitration) {
		this.rateTitration = rateTitration;
	}

	public int getVolumeInfused() {
		return volumeInfused;
	}

	public void setVolumeInfused(int volumeInfused) {
		this.volumeInfused = volumeInfused;
	}

	public int getConcentration() {
		return concentration;
	}

	public void setConcentration(int concentration) {
		this.concentration = concentration;
	}

	public int getConcentrationMin() {
		return concentrationMin;
	}

	public void setConcentrationMin(int concentrationMin) {
		this.concentrationMin = concentrationMin;
	}

	public int getConcentrationMax() {
		return concentrationMax;
	}

	public void setConcentrationMax(int concentrationMax) {
		this.concentrationMax = concentrationMax;
	}

	public boolean isVTBIClearRate() {
		return VTBIClearRate;
	}

	public void setVTBIClearRate(boolean vTBIClearRate) {
		VTBIClearRate = vTBIClearRate;
	}

	public int getPrimaryVTBIMax() {
		return primaryVTBIMax;
	}

	public void setPrimaryVTBIMax(int primaryVTBIMax) {
		this.primaryVTBIMax = primaryVTBIMax;
	}

	public int getBatteryPercent() {
		return batteryPercent;
	}

	public void setBatteryPercent(int batteryPercent) {
		this.batteryPercent = batteryPercent;
	}

	public int getPumpingPressure() {
		return pumpingPressure;
	}

	public void setPumpingPressure(int pumpingPressure) {
		this.pumpingPressure = pumpingPressure;
	}

	public boolean isPressureDisplay() {
		return pressureDisplay;
	}

	public void setPressureDisplay(boolean pressureDisplay) {
		this.pressureDisplay = pressureDisplay;
	}

	public int getPressureMax() {
		return pressureMax;
	}

	public void setPressureMax(int pressureMax) {
		this.pressureMax = pressureMax;
	}

	public String getBolusCategory() {
		return bolusCategory;
	}

	public void setBolusCategory(String bolusCategory) {
		this.bolusCategory = bolusCategory;
	}

	public int getBolusRateMax() {
		return bolusRateMax;
	}

	public void setBolusRateMax(int bolusRateMax) {
		this.bolusRateMax = bolusRateMax;
	}

	public int getBolusVolumeMax() {
		return bolusVolumeMax;
	}

	public void setBolusVolumeMax(int bolusVolumeMax) {
		this.bolusVolumeMax = bolusVolumeMax;
	}

	public int getBolusDoseDefault() {
		return bolusDoseDefault;
	}

	public void setBolusDoseDefault(int bolusDoseDefault) {
		this.bolusDoseDefault = bolusDoseDefault;
	}

	public int getBolusRateDefault() {
		return bolusRateDefault;
	}

	public void setBolusRateDefault(int bolusRateDefault) {
		this.bolusRateDefault = bolusRateDefault;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeightSoftMin() {
		return weightSoftMin;
	}

	public void setWeightSoftMin(int weightSoftMin) {
		this.weightSoftMin = weightSoftMin;
	}

	public int getWeightSoftMax() {
		return weightSoftMax;
	}

	public void setWeightSoftMax(int weightSoftMax) {
		this.weightSoftMax = weightSoftMax;
	}

	public boolean isAutoNightMode() {
		return autoNightMode;
	}

	public void setAutoNightMode(boolean autoNightMode) {
		this.autoNightMode = autoNightMode;
	}

	public boolean isAutoSave() {
		return autoSave;
	}

	public void setAutoSave(boolean autoSave) {
		this.autoSave = autoSave;
	}

	public boolean isEventLog() {
		return eventLog;
	}

	public void setEventLog(boolean eventLog) {
		this.eventLog = eventLog;
	}

	public boolean getStandbyMode() {
		return standbyMode;
	}

	public void setStandbyMode(boolean standbyMode) {
		this.standbyMode = standbyMode;
	}

	public int getPrimeRate() {
		return primeRate;
	}

	public void setPrimeRate(int primeRate) {
		this.primeRate = primeRate;
	}

	public boolean isSecondaryInfusion() {
		return secondaryInfusion;
	}

	public void setSecondaryInfusion(boolean secondaryInfusion) {
		this.secondaryInfusion = secondaryInfusion;
	}

	public int [] getValues() {
		return values;
	}

	public void setValues(int [] values) {
		this.values = values;
	}

	public ArrayList<String> getProfilesActive() {
		return profilesActive;
	}
	
	public int getStateValue(){
		return State;
	}

	public int getWeightDefault() {
		return weightDefault;
	}

	public boolean getVTBIClearRate() {
		return VTBIClearRate;
	}

	public String getDrug() {
		return drug;
	}

	public boolean getAutoNightMode() {
		return autoNightMode;
	}

	public String getDrugCategory() {
		return drugCategory;
	}

	public String getProfile() {
		return profile;
	}

	public String getMode() {
		return mode;
	}

	public String getFunction() {
		return functions;
	}
}
