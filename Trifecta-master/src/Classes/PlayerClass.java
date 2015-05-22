package Classes;
import java.util.Map;
//Test

public class PlayerClass {
	//90-150 Base Health
	public int maximumHealth;
	
	//name = scan.next etc...
	public String name;
	
	//0-5 Base Defense
	public int def;
	
	//0-10 Base Speed
	public int speed;
	
	//3-16 Dex
	public int dex;
	
	//3-16 str
	public static int str;
	
	//Map<SkillName, Skill Object>
	private Map<String,Skill> skills;
}
