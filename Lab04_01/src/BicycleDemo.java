
public class BicycleDemo 
{
	public static void main(String[] args)
	{
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		Bicycle bike3 = new Bicycle(30, 45, 1, true);
		
		//Invoke methods on objects
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.lightsOn();
		bike1.printStates();
		bike1.checkTirePressure();
		
		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.lightsOff();
		bike2.printStates();
		
		bike3.printStates();
	}
}
