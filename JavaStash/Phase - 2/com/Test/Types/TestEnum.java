//TestJava
package com.Test.Types;

enum PlayerToken{
    P1("Player 1"),
    P2("Player 2");

    private String player;
    public String getPlayer(){
        return this.player;
    }
    PlayerToken(String player){
        this.player = player;
    }
}



public class TestEnum{
	private String instanceVariable;
   	private static String staticVariable;
	int testFactor;

	static void  testFunction(){
		System.out.println(new TestEnum().instanceVariable);
		System.out.println(/*instanceVariable*/);
	}

	protected PlayerToken switchPlayer(PlayerToken player){
		if(player.getPlayer().equals( PlayerToken.P1.getPlayer() ))
			player = PlayerToken.P2;
		else player = PlayerToken.P1;
		return player;
	}

	public static void main(String[] A) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		PlayerToken player = PlayerToken.P1;// = PlayerToken("P1");
		System.out.println(player.getPlayer());
		player = new TestEnum().switchPlayer(player);
		System.out.println(player.getPlayer());
		System.out.println(staticVariable);

		//System.out.println(player.getPlayer());
	}
}