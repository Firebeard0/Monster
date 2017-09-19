package monster.model;

public class MonsterParts
{
	//Declaration section of data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	
	public MonsterParts()
	{
		//initializes everything to 0, false or null.
		
		
	}
	
	public MonsterParts(String name, int eyes, int arms, int tentacles, boolean bloop)
	{
		this.name = name;
		this.eyeCount = eyes;
		this.armCount =  arms;
		this.tentacleAmount = tentacles;
		this.hasBloop = bloop;
		
	}
	
	public String getName()
	{
		return name;
	
	}
	public int getArmCount()
	{
		return armCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public double  getTentacleAmount()
	{
		return tentacleAmount;
		
	}
		public boolean hasBloop()
		{
			return hasBloop;
		}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
		
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
		
	}
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
		
	}
	public void setHasBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
		
	}
	
	public String toString()
	{
		String  description  = "I am a Montster, my name is " + name +  ", I have " + eyeCount + " eyes and only " ;
		description += tentacleAmount + " tentacles but I have " + armCount + " arms! " + hasBloop + " tells you if I have a bloop";
		return description;
	}
}
