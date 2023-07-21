class BATSMAN 
{
    void bat() 
	{
        System.out.println("I am Batsman");
    }
}

class BOWLER extends BATSMAN
{
    void bowl() 
	{
        System.out.println("I am Bowler");
    }
}

class ALLROUNDER extends BOWLER
{
    void both() 
	{
        System.out.println("I am Batsman and Bowler");
    }
}

class inheritence_5 
{
    public static void main(String[] args) 
	{
        ALLROUNDER player = new ALLROUNDER();
        player.bat();
        player.bowl();
        player.both();
    }
}
