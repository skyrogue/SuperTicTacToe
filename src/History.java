package SuperTicTacToe.src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Jonathan
 */
public class History
{
	private final List<Player> history;
	
	public static final String STORAGE_FILE = "players.txt";
	
	/**
	 * Creates a History object.
	 */
	public History ()
	{
		history = new ArrayList<>();
	}
	
	public void displayHistory(Player player)
	{
		if (player == null)
		{
			throw new IllegalArgumentException("Player argument is null");
		}
		
		//create history panel
		
	}
	
	public void loadHistory()
	{
		history.clear();
		
		try
		{
			File file = new File(STORAGE_FILE);
 
			//If file doesn't exist, then create it
			if (!file.exists()) 
			{
				file.createNewFile();
			}
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null)
			{
				Scanner parser = new Scanner(line);
				String username = parser.next();
				int wins = parser.nextInt();
				int losses = parser.nextInt();
				int ties = parser.nextInt();
				Player player = new Player(username,wins, losses,ties);
				history.add(player);
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.err.format("Exception occurred trying to read '%s'.\n", STORAGE_FILE);
			e.printStackTrace();
		}
	}
	
	public void saveHistory() throws Exception
	{
		if(history.isEmpty())
		{
			return;
		}
		
		try
		{
			File file = new File(STORAGE_FILE);
 
			// if file doesn't exist, then create it
			if (!file.exists()) 
			{
				file.createNewFile();
			}
	
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			PrintWriter bw = new PrintWriter(fw);
			for (Player player: history)
			{
				bw.print(player.getUsername());
				bw.print(" ");
				bw.print(player.getWins());
				bw.print(" ");
				bw.print(player.getLosses());
				bw.print(" ");
				bw.println(player.getTies());		
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.err.format("Exception occurred trying to write to '%s'.", STORAGE_FILE);
			e.printStackTrace();
		}
	}
	
	public Player getPlayer(String username)
	{
		for (Player player: history)
			{
				if (player.getUsername().equals(username))
				{
					return player;
				}			
			}
			return null;
	}
	
	public boolean createNewPlayer(String username)
	{
		if (this.getPlayer(username)!=null)
		{
			return false;
		}
		Player player = new Player(username);
		history.add(player);
		return true;
	}
		
}