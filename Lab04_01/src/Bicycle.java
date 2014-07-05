
class Bicycle 
{	
	private int cadence = 0;
	private int speed = 0;
	private int gear = 0;
	private boolean lightState = false;
	private String lights;
	private int tirePressure = 25;
	
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
		while(tirePressure < 25){
			tirePressure++;
		}
	}
	
	void decreaseTirePressure(){
		while(tirePressure > 25){
			tirePressure--;
		}
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
			System.out.println("Put some air in your tires");
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
		System.out.print(
				"cadence: " + cadence + 
				" speed: " + speed +
				" gear: " + gear +
				" lights: " + lights);
		checkTirePressure();
	}
}
