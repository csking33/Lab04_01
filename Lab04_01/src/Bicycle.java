
class Bicycle 
{	
	private int cadence = 0;
	private int speed = 0;
	private int gear = 0;
	private boolean lightState = false;
	private String lights;
	private int tirePressure = 25;
	
	//Create general constructor updating our light string so that it is not empty
	public Bicycle()
	{
		updateLightString();
	}
	
	public Bicycle(int cadence, int speed, int gear, boolean lightState)
	{
		this.cadence = cadence;
		this.speed = speed;
		this.gear = gear;
		this.lightState = lightState;
		
		updateLightString();
	}
	
	void changeCadence(int newValue)
	{
		cadence = newValue;
	}
	
	void changeGear(int newValue)
	{
		gear = newValue;
	}
	
	void speedUp(int increment)
	{
		speed = speed + increment;
	}
	
	void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
		
	void setTirePressure(int pressure){
		tirePressure = pressure;
	}
	
	void increaseTirePressure(){
			tirePressure++;
	}
	
	void decreaseTirePressure(){
			tirePressure--;
	}
	
	void lightsOn()
	{
		lightState = true;
		updateLightString();
	}
	
	void lightsOff()
	{
		lightState = false;
		updateLightString();
	}
	
	void checkTirePressure()
	{
		if(tirePressure < 20)
		{
			System.out.println("Put some air in the tires");
		}
		else if(tirePressure > 25)
		{
			System.out.println("Release some air from your tires");
		}
		else
		{
			System.out.println("Tire pressure is ok");
		}
	}
	
	//Update light string to either on or off depending on light state
	private void updateLightString()
	{
		if(lightState == true){
			lights =  "On";
		}else{
			lights = "Off";
		}
	}
	
	void printStates()
	{
		System.out.println(
				"cadence: " + cadence + 
				" speed: " + speed +
				" gear: " + gear +
				" lights: " + lights + " ");
	}
}
