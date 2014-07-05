
public class BicycleDemo 
{
	public static void main(String[] args)
	{
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		Bicycle bike3 = new Bicycle(15, 5, 1, true);
		
		//Invoke methods on objects
		System.out.println("Bike 1");
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.lightsOn();
		bike1.printStates();
		bike1.setTirePressure(32);
		bike1.checkTirePressure();
		System.out.println();
		
		System.out.println("Bike 2");
		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.lightsOff();
		bike2.printStates();
		bike2.checkTirePressure();
		System.out.println();
		
		System.out.println("Bike 3");
		bike3.setTirePressure(17);
		bike3.printStates();
		bike3.checkTirePressure();
		bike3.setTirePressure(24);
		bike3.lightsOff();
		bike3.changeGear(3);
		bike3.changeCadence(40);
		bike3.speedUp(30);
		bike3.printStates();
		bike3.checkTirePressure();
	}
}
