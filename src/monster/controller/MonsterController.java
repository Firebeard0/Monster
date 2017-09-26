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
		
		int count = 0;
		while(count < 10)
		{
			popup.displayText("I'm the coolest!!!");
			count += 1;
		}
		MonsterParts basic = new MonsterParts();
//		System.out.println(basic);
		popup.displayText(basic.toString());
		MonsterParts fred = new MonsterParts("Silly Isaac Monster", 8 ,5 , 6, true);
		System.out.println(fred);
		popup.displayText(fred.toString());
//		System.out.println("Im hungry, Im going to eat one of Isaacs arms");
		popup.displayText("Im hungry, Im going to eat one of Isaacs arms");
		fred.setArmCount(fred.getArmCount() - 1);
//		System.out.println(fred);
		popup.displayText(fred.toString());
		interactWithMonster(fred);
		}
	private void interactWithMonster(MonsterParts currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + "wants to know how many eyes you want to eat, please type in how many.");
		
		if(isValidInteger(response))
			
		{
			consumed = Integer.parseInt(response);
		}
		consumed = Integer.parseInt(response);
//		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		popup.displayText(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		// int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		//System.out.println(currentMonster);
		popup.displayText(currentMonster.toString());
		
//		System.out.println("How many arms are you interested in eating?, I have " + currentMonster.getArmCount());
		popup.getResponse("How many arms are you interested in eating?, I have " + currentMonster.getArmCount());
		int armEat = myScanner.nextInt();
		currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
		if(armEat == 0)
		{
			//System.out.println("Not hungry? too bad....");
			popup.displayText("Not hungry? too bad....");
		}
		else if (armEat < 0)
		{
	//		System.out.println("Math is hard for you, you can't eat arms I dont have...");
			popup.displayText("Math is hard for you, you can't eat arms I dont have...");
		}
		else
		{
			
//			System.out.println("Ok, now I have this many arms " + currentMonster.getArmCount());
			popup.displayText("Ok, now I have this many arms " + currentMonster.getArmCount());
		}
//		System.out.println("How many tentacles are you interested in eating?, I have " + currentMonster.getTentacleAmount());
		popup.getResponse("How many tentacles are you interested in eating?, I have " + currentMonster.getTentacleAmount());
		double tentacleEat = myScanner.nextDouble();
		currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - tentacleEat);
		if(tentacleEat == 0)
		{
//			System.out.println("Not hungry? too bad....");
			popup.displayText("Not hungry? too bad....");
		}
		else if (tentacleEat < 0)
		{
//			System.out.println("Math is hard for you, you can't eat tentacles I dont have...");
			popup.displayText("Math is hard for you, you can't eat tentacles I dont have...");
		}
		else
		{
			
//			System.out.println("Ok, now I have this many arms " + currentMonster.getTentacleAmount());
			popup.displayText("Ok, now I have this many arms " + currentMonster.getTentacleAmount());
		}
		
		popup.displayText("Hi there,  are you ready to play?");
		myScanner.close(); 
	}
	
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		try {
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("you need to input an int, " + sample + " is not valid");
			
		}
		return valid;
	}
	private boolean isValidDouble(String sampleD)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleD);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("you need to type a double " + sampleD + "is not a valid double"); 
		}
		return valid;
	}
	private boolean isValidBoolean(String sampleB)
	{
		boolean valid = false;
		try
		{
			Boolean.parseBoolean(sampleB);
			valid = true;
			
		}
		catch(NumberFormatException error)
		
		{
			popup.displayText("typr in a boolean value" + sampleB + "does not count.");
		}
		return valid;
	}
}
