package monster.model;

public class MonsterParts
{
	//Declaration section of data members
	private int name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	
	public monsterParts()
	{
		//initializes everything to 0, false or null.
		
		
	}
	
	public MonsterParts(String name, int name, int eyes, int arms,int tentacles, boolean bloop)
	{
		this.name = name;
		this.eyeCount = eyes;
		this.armCount =  arms;
		this.tentacleAmount = tentacles;
		this.hasBloop = bloop;
		
		
	}
}
