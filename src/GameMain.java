import java.util.Scanner;

import com.dugs.service.Game;

public class GameMain {
		
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
	
		//System.out.println("Enter board Size N*N. N: ");
		int boardSize=s.nextInt();
		
		//System.out.println("Enter Number of Snakes");
		int totalSnakes = s.nextInt();
		int snake[][] = new int[totalSnakes][2];
		
		for(int x=1; x<=totalSnakes; x++) {
			//System.out.print("Enter Start and End Point for Snake "+x+" : ");
			int startPoint = s.nextInt();
			int endPoint = s.nextInt();

//			System.out.println(points);
//			int startPoint = Integer.parseInt(points.substring(0,points.indexOf(' ')));
//			int endPoint = Integer.parseInt(points.substring(points.indexOf(' ')+1, points.length()));
			//points.split(' ');
			snake[x-1][0] = startPoint;
			snake[x-1][1] = endPoint;
		}
		
		//System.out.println("Enter Number of Ladders");
		int totalLadders = s.nextInt();
		int ladder[][] = new int[totalLadders][2];
		
		for(int x=1; x<=totalLadders; x++) {
			//System.out.println("Enter Start and End Point for Ladder "+x+" : ");
			int startPoint = s.nextInt();
			int endPoint = s.nextInt();
			//String points = s.nextLine();
			//System.out.println(points);
			//int startPoint = Integer.parseInt(points.substring(0,points.indexOf(' ')));
			//int endPoint = Integer.parseInt(points.substring(points.indexOf(' ')+1));
			ladder[x-1][0] = startPoint;
			ladder[x-1][1] = endPoint;
		}
		
		//System.out.println("Enter no of Dice");
		int diceCount = s.nextInt();
		
		//System.out.println("Enter no of Players");
		int playerCount = s.nextInt();
		
		String players[] = new String[playerCount];
		for(int x=1; x<=playerCount;x++)
		{
			//System.out.println("Enter name for player "+x+" :");
			players[x-1] = s.next();
		}
		
		Game game = new Game(boardSize, diceCount, snake, ladder, players);
		
		String winner = game.start();
		System.out.println(winner+" won the game.!! ");
	}
}
