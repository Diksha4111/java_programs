package exp_4_inheritance;

class Player {
	String 	playername;
	int playerage;
	
	Player(String name,int a)
	{
		playername=name;
		playerage=a;
	}
}

class Cricket_Player extends Player
{
	private String sportname;
	private int runspermatch;
	
	Cricket_Player(String name,int a,String s, int r)
	{
		super(name,a);
		sportname=s;
		runspermatch=r;
	}
	
	void show()
	{
		System.out.println("\n");
		System.out.println("*******************************");
		System.out.println("Name:"+playername);
		System.out.println("Age:"+playerage);
		System.out.println("Sport:"+sportname);
		System.out.println("Avg runs per match:"+runspermatch);
		System.out.println("*******************************");
	}
}
class Football_Player extends Player
{
	private String sportname;
	private int goalspermatch;
	
	Football_Player(String name,int a,String s, int g)
	{
		super(name,a);
		sportname=s;
		goalspermatch=g;
	}
	
	void show()
	{
		System.out.println("\n");
		System.out.println("********************************");
		System.out.println("Name:"+playername);
		System.out.println("Age:"+playerage);
		System.out.println("Sport:"+sportname);
		System.out.println("Avg goals per match:"+goalspermatch);
		System.out.println("********************************");
	}
}
class Hockey_Player extends Player
{
	private String sportname;
	private int pointspermatch;
	
	Hockey_Player(String name,int a,String s, int p)
	{
		super(name,a);
		sportname=s;
		pointspermatch=p;
	}
	
	void show()
	{
		System.out.println("\n");
		System.out.println("*********************************");
		System.out.println("Name:"+playername);
		System.out.println("Age:"+playerage);
		System.out.println("Sport:"+sportname);
		System.out.println("Avg goals per match:"+pointspermatch);
		System.out.println("*********************************");
	}
}

