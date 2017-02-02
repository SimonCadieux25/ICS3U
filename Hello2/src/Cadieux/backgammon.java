/**
 * backgammon.java
 * a game of backgammon
 * Jan 17 2017
 * @author Simon Cadieux
 */
package Projects.Culminating;

import java.util.Scanner;
import hsa_new.Console;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class backgammon {

	static Console c = new Console(20,52);
	static Console b = new Console(45,150);
	/**
	 * Displays roll
	 * @param num1
	 * @param num2
	 */
	public static void displayRoll(int num1,int num2) throws IOException{
		BufferedImage[] pics = {ImageIO.read(new File("pics/1die.jpg")),ImageIO.read(new File("pics/2die.jpg")),ImageIO.read(new File("pics/3die.jpg")),ImageIO.read(new File("pics/4die.jpg")),ImageIO.read(new File("pics/5die.jpg")),ImageIO.read(new File("pics/6die.jpg"))};


		if(num1 <= 1){
			c.drawImage(pics[0],0,100,50,50,null);	
		}
		else if(num1 <= 2){
			c.drawImage(pics[1],0,100,50,50,null);
		}
		else if(num1 <= 3){
			c.drawImage(pics[2],0,100,50,50,null);
		}
		else if(num1 <= 4){
			c.drawImage(pics[3],0,100,50,50,null);
		}
		else if(num1 <= 5){
			c.drawImage(pics[4],0,100,50,50,null);
		}
		else if(num1 <= 6){
			c.drawImage(pics[5],0,100,50,50,null);
		}

		if(num2 <= 1){
			c.drawImage(pics[0],0,150,50,50,null);	
		}
		else if(num2 <= 2){
			c.drawImage(pics[1],0,150,50,50,null);
		}
		else if(num2 <= 3){
			c.drawImage(pics[2],0,150,50,50,null);
		}
		else if(num2 <= 4){
			c.drawImage(pics[3],0,150,50,50,null);
		}
		else if(num2 <= 5){
			c.drawImage(pics[4],0,150,50,50,null);
		}
		else if(num2 <= 6){
			c.drawImage(pics[5],0,150,50,50,null);
		}


	}
	/**
	 * Draws the board with all the pieces
	 * @param white
	 * @param black
	 */
	public static void drawBoard(int[] white, int[] black) throws IOException{
		BufferedImage[] pics = {ImageIO.read(new File("pics/Backgammon board.jpg")),ImageIO.read(new File("pics/WBP.jpg")),ImageIO.read(new File("pics/BBP.jpg"))};

		b.drawImage(pics[0], 0, 40, 1232, 870, null);
		int x = 0;
		for(int i = 0; i<24;i++){
			switch(i+1){

			case 1: x = 50;
			break;
			case 2: x = 140;
			break;
			case 3: x = 233;
			break;
			case 4: x = 325;
			break;
			case 5: x = 418;
			break;
			case 6: x = 510;
			break;
			case 7: x = 665;
			break;
			case 8: x = 755;
			break;
			case 9: x = 849;
			break;
			case 10: x = 940;
			break;
			case 11: x = 1033;
			break;
			case 12: x = 1125;
			break;
			case 13: x = 1125;
			break;
			case 14: x = 1033;
			break;
			case 15: x = 940;
			break;
			case 16: x = 849;
			break;
			case 17: x = 755;
			break;
			case 18: x = 665;
			break;
			case 19: x = 510;
			break;
			case 20: x = 418;
			break;
			case 21: x = 325;
			break;
			case 22: x = 233;
			break;
			case 23: x = 140;
			break;
			case 24: x = 50;
			break;
			}

			// white pieces
			if(i<=11){
				int i2 = white[i];
				int top = 65 + (i2*50);

				for(int y = 65; y < top-1; y += 50){
					b.drawImage(pics[1], x, y, 50, 50, null);

				}
			}
			else{
				int i2 = white[i];
				int top = 830 - (i2*50);

				for(int y = 830; y > top+1; y -= 50){
					b.drawImage(pics[1], x, y, 50, 50, null);

				}
			}


			//black pieces
			if(i<=11){
				int i3 = black[i];
				int top = 65 + (i3*50);

				for(int y = 65; y < top-1; y += 50){
					b.drawImage(pics[2], x, y, 50, 50, null);
				}
			}
			else{
				int i3 = black[i];
				int top = 830 - (i3*50);

				for(int y = 830; y > top+1; y -= 50){
					b.drawImage(pics[2], x, y, 50, 50, null);

				}
			}
		}


	}
	/**
	 * Checks if black has any possible moves with die 2
	 * @param white
	 * @param black
	 * @param die2
	 */
	public static int cPMBdie2(int[] black, int[] white , int die2){
		
		for(int i = 23; i<= 0; i++){
			if(black[i] != 0){
				if(white[i+die2] == 0){
					return 0;
				}
			}
		}
		return 1;
	}
	
	/**
	 * Checks if black has any possible moves with die 1
	 * @param white
	 * @param black
	 * @param die1
	 */
	public static int cPMBdie1(int[] black, int[] white , int die1){
		
		for(int i = 23; i<= 0; i++){
			if(black[i] != 0){
				if(white[i+die1] == 0){
					return 0;
				}
			}
		}
		return 1;
	}
	
	/**
	 * Checks if white has any possible moves with die 2
	 * @param white
	 * @param black
	 * @param die2
	 */
	public static int cPMWdie2(int[] black, int[] white , int die2){
		
		for(int i = 23; i<= 0; i--){
			if(white[i] != 0){
				if(black[i-die2] == 0){
					return 0;
				}
			}
		}
		return 1;
	}
	
	/**
	 * Checks if white has any possible moves with die 1
	 * @param white
	 * @param black
	 * @param die1
	 */
	public static int cPMWdie1(int[] black, int[] white , int die1){
		
		for(int i = 23; i<= 0; i--){
			if(white[i] != 0){
				if(black[i-die1] == 0){
					return 0;
				}
			}
		}
		return 1;
	}
	
	/**
	 * Checks if black can score
	 * @param black
	 */
	public static int checkSB(int[] black){

		for(int i = 0; i<= 17; i++){
			if(black[i]!= 0){
				return 0;
			}
		}


		return 1;
	}
	/**
	 * Checks if white can score
	 * @param white
	 */
	public static int checkSW(int[] white){

		for(int i = 6; i<= 23; i++){
			if(white[i]!= 0){
				return 0;
			}
		}


		return 1;
	}
	/**
	 * Checks if black has wins
	 * @param black
	 */
	public static int checkWB(int[] black){

		for(int i = 6; i<= 0; i--){
			if(black[i]!= 0){
				return 0;
			}
		}


		return 1;
	}
	/**
	 * Checks if white has wins
	 * @param white
	 */
	public static int checkWW(int[] white){

		for(int i = 23; i<= 18; i++){
			if(white[i]!= 0){
				return 0;
			}
		}


		return 1;
	}

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner scan=new Scanner(System.in);

		int[] whitePiecePlacement = {0,0,0,0,3,0,5,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,5};
		int[] blackPiecePlacement = {5,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,5,0,3,0,0,0,0};

		int wCanScore = 0;
		int bCanScore = 0;
		int die1 = (int)(Math.random()*6)+1;
		int die2 = (int)(Math.random()*6)+1;
		int die = 0;
		int columb = 0;

		String conti = "yes";
		String read = "no";

		c.println("Welcome to Backgammon\nThis game was created by Simon Cadieux");
		Thread.sleep(5000);
		c.clear();

		while(read.equals("no")){
			c.println("How To play: \nTHIS IS A TWO PLAYER GAME\nPlayer 1 is white Player 2 is black\n1. the die rolls to determon your moves\n2. to move select which columb you want to take from 0-11 23-12\nand select which die you want to use 1-2\nthe ojective of the 1st player is to move all thier pieces into the top left quarter then move them off the board\nthe objective of the 2nd player is to move all thier pieces into the bottom left then move them off the board\nenjoy :)\nplease enter yes or no if you understood the rules and want to continue to the game: ");
			read = c.readLine();
			Thread.sleep(2000);
			c.clear();
		}

		while(conti.equals("yes")){
			drawBoard(whitePiecePlacement, blackPiecePlacement);
			if(checkSW(whitePiecePlacement) == 0){
				die1 = (int)(Math.random()*6)+1;
				die2 = (int)(Math.random()*6)+1;
				displayRoll(die1 , die2);
				c.println("Player 1 turn");
				if(cPMWdie1(blackPiecePlacement, whitePiecePlacement, die1) == 1){
				c.print("enter the columb you wish to take from: ");
				columb = c.readInt();
				while(whitePiecePlacement[columb] == 0){
					c.clear();
					displayRoll(die1 , die2);
					c.println("There are no pieces in this columb please choose another\n0-11 top, 23-12 bottom: ");
					columb = c.readInt();
					c.clear();
					displayRoll(die1 , die2);
				}
				c.print("enter wich die you wish to use: ");
				die = c.readInt();
				whitePiecePlacement[columb] = whitePiecePlacement[columb] - 1;

				if(die <= 1){
					columb = columb - die1;
				}
				else{
					columb = columb - die2;
				}
				whitePiecePlacement[columb] = whitePiecePlacement[columb] + 1;
				}
				else{
					c.println("You cant move with die 1");
				}
				drawBoard(whitePiecePlacement, blackPiecePlacement);
				displayRoll(die1 , die2);
				if(cPMWdie2(blackPiecePlacement, whitePiecePlacement, die2) == 1){
				c.print("enter the columb you wish to take from: ");
				columb = c.readInt();
				while(whitePiecePlacement[columb] == 0){
					c.clear();
					displayRoll(die1 , die2);
					c.println("There are no pieces in this columb please choose another\n0-11 top, 23-12 bottom: ");
					columb = c.readInt();
					c.clear();
					displayRoll(die1 , die2);
				}
				whitePiecePlacement[columb] = whitePiecePlacement[columb] - 1;
				if(die <= 1){
					columb = columb - die2;
				}
				else{
					columb = columb - die1;
				}
				whitePiecePlacement[columb] = whitePiecePlacement[columb] + 1;
				}
				else{
					c.println("You cant move with die 2");
				}
				b.clear();
				c.clear();
				drawBoard(whitePiecePlacement, blackPiecePlacement);
			}
			
			else{
				if(checkWW(whitePiecePlacement) == 0){
					c.clear();
					die1 = (int)(Math.random()*6)+1;
					die2 = (int)(Math.random()*6)+1;
					displayRoll(die1 , die2);
					Thread.sleep(1000);

					if(die1 == 1&&whitePiecePlacement[18]==0){
						die1 = die1 + 1;
					}

					if(die1 == 2&&whitePiecePlacement[19]==0){
						die1 = die1 + 1;
					}

					if(die1 == 3&&whitePiecePlacement[20]==0){
						die1 = die1 + 1;
					}

					if(die1 == 4&&whitePiecePlacement[21]==0){
						die1 = die1 + 1;
					}

					if(die1 == 5&&whitePiecePlacement[22]==0){
						die1 = die1 + 1;
					}

					if(die2 == 1&&whitePiecePlacement[18]==0){
						die2 = die2 + 1;
					}

					if(die2 == 2&&whitePiecePlacement[19]==0){
						die2 = die2 + 1;
					}

					if(die2 == 3&&whitePiecePlacement[20]==0){
						die2 = die2 + 1;
					}

					if(die2 == 4&&whitePiecePlacement[21]==0){
						die2 = die2 + 1;
					}

					if(die2 == 5&&whitePiecePlacement[22]==0){
						die2 = die2 + 1;
					}

					switch(die1){
					case 1: whitePiecePlacement[18] = whitePiecePlacement[18] - 1;
					break;
					case 2: whitePiecePlacement[19] = whitePiecePlacement[19] - 1;
					break;
					case 3: whitePiecePlacement[20] = whitePiecePlacement[20] - 1;
					break;
					case 4: whitePiecePlacement[21] = whitePiecePlacement[21] - 1;
					break;
					case 5: whitePiecePlacement[22] = whitePiecePlacement[22] - 1;
					break;
					case 6: whitePiecePlacement[23] = whitePiecePlacement[23] - 1;
					break;
					}
					Thread.sleep(500);

					switch(die2){
					case 1: whitePiecePlacement[18] = whitePiecePlacement[18] - 1;
					break;
					case 2: whitePiecePlacement[19] = whitePiecePlacement[19] - 1;
					break;
					case 3: whitePiecePlacement[20] = whitePiecePlacement[20] - 1;
					break;
					case 4: whitePiecePlacement[21] = whitePiecePlacement[21] - 1;
					break;
					case 5: whitePiecePlacement[22] = whitePiecePlacement[22] - 1;
					break;
					case 6: whitePiecePlacement[23] = whitePiecePlacement[23] - 1;
					break;
					}
					Thread.sleep(500);

				}
				else{
					c.print("Player 1 won do you wish to play agian? ");
					conti = c.readLine();
					c.readLine();
				}
			}

			if(conti.equals("yes")){

				if(checkSB(blackPiecePlacement) == 0){
					die1 = (int)(Math.random()*6)+1;
					die2 = (int)(Math.random()*6)+1;
					displayRoll(die1 , die2);
					c.println("Player 2 turn");
					if(cPMBdie1(blackPiecePlacement, whitePiecePlacement, die1) == 1){
					c.print("enter the columb you wish to take from: ");
					columb = c.readInt();
					while(blackPiecePlacement[columb] == 0){
						c.clear();
						displayRoll(die1 , die2);
						c.println("There are no pieces in this columb please choose another\n0-11 top, 23-12 bottom: ");
						columb = c.readInt();
						c.clear();
						displayRoll(die1 , die2);
					}
					c.print("enter wich die you wish to use: ");
					die = c.readInt();
					blackPiecePlacement[columb] = blackPiecePlacement[columb] - 1;

					if(die <= 1){
						columb = columb + die1;
					}
					else{
						columb = columb + die2;
					}
					blackPiecePlacement[columb] = blackPiecePlacement[columb] + 1;
					}
					else{
						c.println("You cant move with die 1");
					}
					drawBoard(whitePiecePlacement, blackPiecePlacement);

					if(cPMBdie2(blackPiecePlacement, whitePiecePlacement, die2) == 1){
					c.print("enter the columb you wish to take from: ");
					columb = c.readInt();
					while(blackPiecePlacement[columb] == 0){
						c.clear();
						displayRoll(die1 , die2);
						c.println("There are no pieces in this columb please choose another\n0-11 top, 23-12 bottom: ");
						columb = c.readInt();
						c.clear();
						displayRoll(die1 , die2);
					}
					blackPiecePlacement[columb] = blackPiecePlacement[columb] - 1;
					if(die <= 1){
						columb = columb + die2;
					}
					else{
						columb = columb + die1;
					}
					blackPiecePlacement[columb] = blackPiecePlacement[columb] + 1;
					}
					else{
						c.println("You cant move with die 2");
					}
					drawBoard(whitePiecePlacement, blackPiecePlacement);
					b.clear();
					c.clear();
				}
				else{
					if(checkWB(blackPiecePlacement) == 0){
						c.clear();
						die1 = (int)(Math.random()*6)+1;
						die2 = (int)(Math.random()*6)+1;
						displayRoll(die1 , die2);
						Thread.sleep(1000);

						if(die1 == 1&&blackPiecePlacement[18]==0){
							die1 = die1 + 1;
						}

						if(die1 == 2&&blackPiecePlacement[19]==0){
							die1 = die1 + 1;
						}

						if(die1 == 3&&blackPiecePlacement[20]==0){
							die1 = die1 + 1;
						}

						if(die1 == 4&&blackPiecePlacement[21]==0){
							die1 = die1 + 1;
						}

						if(die1 == 5&&blackPiecePlacement[22]==0){
							die1 = die1 + 1;
						}

						if(die2 == 1&&blackPiecePlacement[18]==0){
							die2 = die2 + 1;
						}

						if(die2 == 2&&blackPiecePlacement[19]==0){
							die2 = die2 + 1;
						}

						if(die2 == 3&&blackPiecePlacement[20]==0){
							die2 = die2 + 1;
						}

						if(die2 == 4&&blackPiecePlacement[21]==0){
							die2 = die2 + 1;
						}

						if(die2 == 5&&blackPiecePlacement[22]==0){
							die2 = die2 + 1;
						}

						switch(die1){
						case 1: blackPiecePlacement[18] = blackPiecePlacement[18] - 1;
						break;
						case 2: blackPiecePlacement[19] = blackPiecePlacement[19] - 1;
						break;
						case 3: blackPiecePlacement[20] = blackPiecePlacement[20] - 1;
						break;
						case 4: blackPiecePlacement[21] = blackPiecePlacement[21] - 1;
						break;
						case 5: blackPiecePlacement[22] = blackPiecePlacement[22] - 1;
						break;
						case 6: blackPiecePlacement[23] = blackPiecePlacement[23] - 1;
						break;
						}
						Thread.sleep(500);

						switch(die2){
						case 1: blackPiecePlacement[18] = blackPiecePlacement[18] - 1;
						break;
						case 2: blackPiecePlacement[19] = blackPiecePlacement[19] - 1;
						break;
						case 3: blackPiecePlacement[20] = blackPiecePlacement[20] - 1;
						break;
						case 4: blackPiecePlacement[21] = blackPiecePlacement[21] - 1;
						break;
						case 5: blackPiecePlacement[22] = blackPiecePlacement[22] - 1;
						break;
						case 6: blackPiecePlacement[23] = blackPiecePlacement[23] - 1;
						break;
						}
						Thread.sleep(500);

					}
					else{
						c.print("Player 2 won do you wish to play agian? ");
						conti = c.readLine();
						c.readLine();
					}
				}

			}
		}
	}

}
