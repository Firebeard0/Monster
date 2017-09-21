package monster.controller;
import monster.model.MonsterParts;
import monster.view.MonsterDisplayy;

import java.util.Scanner;
public class MonsterController
{
	private MonsterDisplayy popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplayy();
	}
	
	public void start()
	{
		MonsterParts basic = new MonsterParts();
		System.out.println(basic);
		popup.displayText(basic.toString());
		MonsterParts fred = new MonsterParts("Silly Isaac Monster", 8 ,5 , 6, true);
		System.out.println(fred);
		System.out.println("Im hungry, Im going to eat one of Isaacs arms");
		fred.setArmCount(fred.getArmCount() - 1);
		System.out.println(fred);
		
		interactWithMonster(fred);
		}
	private void interactWithMonster(MonsterParts currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
		System.out.println("How many arms are you interested in eating?, I have " + currentMonster.getArmCount());
		int armEat = myScanner.nextInt();
		currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
		if(armEat == 0)
		{
			System.out.println("Not hungry? too bad....");
		}
		else if (armEat < 0)
		{
			System.out.println("Math is hard for you, you can't eat arms I dont have...");
		}
		else
		{
			
			System.out.println("Ok, now I have this many arms " + currentMonster.getArmCount());
		}
		System.out.println("How many tentacles are you interested in eating?, I have " + currentMonster.getTentacleAmount());
		double tentacleEat = myScanner.nextDouble();
		currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - tentacleEat);
		if(tentacleEat == 0)
		{
			System.out.println("Not hungry? too bad....");
		}
		else if (tentacleEat < 0)
		{
			System.out.println("Math is hard for you, you can't eat tentacles I dont have...");
		}
		else
		{
			
			System.out.println("Ok, now I have this many arms " + currentMonster.getTentacleAmount());
		}
		
		popup.displayText("Hi there,  are you ready to play?");
		myScanner.close(); 
	}
}
