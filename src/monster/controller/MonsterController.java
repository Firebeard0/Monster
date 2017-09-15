package monster.controller;
import monster.model.MonsterParts;
public class MonsterController
{
	
	public void start()
	{
		MonsterParts basic = new MonsterParts();
		System.out.println(basic);
		MonsterParts fred = new MonsterParts("Silly Isaac Monster", 8 ,5 , 6.7, true);
		System.out.println(fred);
		System.out.println("Im hungry, Im going to eat one of Isaacs arms");
		fred.setArmCount(fred.getArmCount() - 1);
		System.out.println(fred);
		}
}
