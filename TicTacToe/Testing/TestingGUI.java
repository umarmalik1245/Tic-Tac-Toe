import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class TestingGUI extends JFrame{
	
	//This is the testing game GUI code it has been altered specifically to test this is NOT the final game
	private Container mainPane; //Creating Main Screen's Container
	public static String player1; //Creating Player 1
	public static String player2; //Creating Player 2
	public String cPlayer; //Creating Variable for Current Player 
	private JMenuItem newPlayers; //Creating Menu Item for Players
	private JMenuItem newGame; //Creating Menu Item for Players
	private JMenuItem quitGame; //Creating Menu Item for Players
	public JButton[][] gameBoard = new JButton[3][3]; //Creating Game Buttons That Run Most the Game
	private static int turnCounter = 1; //Creating Turn Counter
	private static int score1; //Creating Score for Player 1
	private static int score2; //Creating Score for Player 2
	private JMenuBar Mbar; //Creating Menu Bar
	private JMenu mainMenu; //Creating Menu 
	private static boolean ifWinner; //Creating Boolean Checker for Winner
	
	
	public TestingGUI() 
	{
		
		MBInitialize(); //Creating Method
		setTitle("Tic Tac Toe By Umar Malik :)"); //Setting Game Title
		mainPane = getContentPane(); //Setting Up Main Screen
		mainPane.setLayout(new GridLayout(3,3));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(800,800);
		setLocationRelativeTo(null);
		boardInitialize(); //Creating Board Method
		ifWinner = false; //Setting ifWinner to False
		cPlayer= "X"; //Defaulting Current Player to X
		ImageIcon ICON = new ImageIcon("src/images/iconimage.png"); //Setting Icon for Game
		setIconImage(ICON.getImage()); 
		Players(player1, player2); //Initializing Players Method
		
	}
	
	private void MBInitialize()
	{
		
		Mbar = new JMenuBar(); //Creating the Menu Bar With the Menu Bar Items
		newGame = new JMenuItem("New Game");
		newPlayers = new JMenuItem("New Game With New Players");
		quitGame = new JMenuItem("Quit Game");
		mainMenu = new JMenu("Game");
		
		newGame.addActionListener(new ActionListener() //Creating Item for New game
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				boardReset(); //Calling Board Reset Method
				
			}
			
		});
		
		newPlayers.addActionListener(new ActionListener() //Creating Item for New Players
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				boardReset(); //Calling Board Reset Method
				Players(player1, player2); //Calling Players Method
				
			}
			
		});
		
		setJMenuBar(Mbar); //Creating and Adding Menu Bar
		mainMenu.add(newGame);
		mainMenu.add(newPlayers);
		mainMenu.add(quitGame);
		Mbar.add(mainMenu);
		
		quitGame.addActionListener(new ActionListener() //Creating Item for Quit Game
		{

			public void actionPerformed(ActionEvent e) 
			{
				
				System.exit(0);
				
			}
			
		});			
}
	
	public static String Players(String player1, String player2)
	{
		
		//player1=JOptionPane.showInputDialog(null, "Enter First Player's Name:"); Commented out for testing purposes
		//player2=JOptionPane.showInputDialog(null, "Enter Second Player's Name:");
		if (player1==null || player2==null || player1.equals(player2))
		{
			
			//JOptionPane.showMessageDialog(null, "Please Try Entering Names Again!");
			//Players();
			return "fail";
		}
		
		//JOptionPane.showMessageDialog(null, player1 + " Is The X Tile, " + player2 + " Is The O Tile\n" + "\nJust Some Simple Rules: \n3 In A Row, Column, Or Diagonal Wins.\nFirst Game X Starts And If Replayed O Starts First.\nDraw Is Possible, In This Case X Starts First Again.\n\nEnjoy! - Umar Malik");
		score1 = 0;
		score2 = 0;
		return "pass";
	}
	
	public static int scoreCounter(String cPlayer)
	{
		
		ifWinner = true;
		if (cPlayer=="X")
		{
			
			score1++;
			return score1;
			
		}
		
		else if (cPlayer=="O")
		{
			
			score2++;
			return score2;
			
		}
		return 0;
		
	}
	
	private void boardReset() //Reseting board for when new game 
	{
		
		ifWinner = false;
		for(int i=0; i < 3; i++) // Nested for loop for the 3x3 game board
		{
			
			for(int j=0; j<3; j++)
			{
				
				gameBoard[i][j].setText("");
				
			}
			
		}
		
	}
	
	private void boardInitialize() //Making the board
	{
		
			for(int i = 0; i < 3; i++)//nested for loop for the game board
			{
				
				for(int j = 0; j < 3; j++)
				{
					
					JButton button = new JButton();//setting buttons for game board
					gameBoard[i][j] = button;
					button.setFont(new Font(Font.MONOSPACED,Font.BOLD,300));
					button.setBackground(Color.WHITE);
					button.addActionListener(new ActionListener() //action listener for input on game board
					{
						
						public void actionPerformed(ActionEvent e)
						{
							
							if (((JButton)e.getSource()).getText().equals("") && ifWinner == false) //getting input of player and checking if there is a winner or not
							{
								
								button.setText(cPlayer);
								ifWinner();
								turnCounter++;
								toggleP(cPlayer);
			
							}
							
						}
						
					});
					
					button.addMouseListener(new java.awt.event.MouseAdapter()  // Mouse listeners for colour change effect of hovering over button
					{
						
						public void mouseEntered(java.awt.event.MouseEvent evt)
						{
							
							button.setBackground(Color.GRAY);

						}
						
						public void mouseExited(java.awt.event.MouseEvent evt)
						{
							
							button.setBackground(Color.WHITE);
							
						}
						
					});
					
					mainPane.add(button);
					
				}
			}
	}
	
	public static String toggleP(String cPlayer)
	{
		
		if(cPlayer==("X"))
		{
			
			cPlayer = "O";
			return cPlayer;
			
		}
		
		else
		{
			
			cPlayer = "X";
			return cPlayer;
			
		}
		
	}
	
	public static String winningPlayer(String cPlayer)
	{
		
		ifWinner = true;
		if (cPlayer=="X")
		{
			
			scoreCounter(cPlayer);
			//JOptionPane.showMessageDialog(null, player1 + " has won! :)\n" + "Current Score:\n" + player1 + ": " + score1 + "\n" + player2 + ": " + score2);
			turnCounter=0;
			return player1;
			
		}
		
		else if (cPlayer=="O")
		{
			
			scoreCounter(cPlayer);
			//JOptionPane.showMessageDialog(null, player2 + " has won! :)\n" + "Current Score:\n" + player1 + ": " + score1 + "\n" + player2 + ": " + score2);
			turnCounter=0;
			return player2;
			
		}
		return "";
		
	}
	
	private void ifWinner() //Checking for winner
	{
		
			JButton ZZ = gameBoard[0][0];//Naming the buttons for each value on the board so code is cleaner
			JButton OZ = gameBoard[1][0];//Naming the buttons for each value on the board so code is cleaner
			JButton TZ = gameBoard[2][0];//Naming the buttons for each value on the board so code is cleaner
			
			JButton ZO = gameBoard[0][1];//Naming the buttons for each value on the board so code is cleaner
			JButton OO = gameBoard[1][1];//Naming the buttons for each value on the board so code is cleaner
			JButton TO = gameBoard[2][1];//Naming the buttons for each value on the board so code is cleaner
			
			JButton ZT = gameBoard[0][2];//Naming the buttons for each value on the board so code is cleaner
			JButton OT = gameBoard[1][2];//Naming the buttons for each value on the board so code is cleaner
			JButton TT = gameBoard[2][2];//Naming the buttons for each value on the board so code is cleaner
		
			
			if(ZZ.getText().equals(cPlayer) && ZO.getText().equals(cPlayer) && ZT.getText().equals(cPlayer)) //Checking which possible player has one
			{
				
				ifWinner = true;//setting to true
				winningPlayer(cPlayer);//Calling winning player method
				
			}
			
			else if(OZ.getText().equals(cPlayer) && OO.getText().equals(cPlayer) && OT.getText().equals(cPlayer))//Checking which possible player has one
			{
				
				ifWinner = true;//setting to true
				winningPlayer(cPlayer);//Calling winning player method
				
			}
			
			else if(TZ.getText().equals(cPlayer) && TO.getText().equals(cPlayer) && TT.getText().equals(cPlayer))//Checking which possible player has one
			{
				
				ifWinner = true;//setting to true
				winningPlayer(cPlayer);//Calling winning player method
				
			}
			
			else if(ZT.getText().equals(cPlayer) && OO.getText().equals(cPlayer) && TZ.getText().equals(cPlayer))//Checking which possible player has one
			{
				
				ifWinner = true;//setting to true
				winningPlayer(cPlayer);//Calling winning player method
				
			}
			
			else if(ZZ.getText().equals(cPlayer) && OO.getText().equals(cPlayer) && TT.getText().equals(cPlayer))//Checking which possible player has one
			{
				
				ifWinner = true;//setting to true
				winningPlayer(cPlayer);//Calling winning player method
				
			}
			
			else if(ZZ.getText().equals(cPlayer) && OZ.getText().equals(cPlayer) && TZ.getText().equals(cPlayer))//Checking which possible player has one
			{
				
				
				ifWinner = true;//setting to true
				winningPlayer(cPlayer);//Calling winning player method
				
			}
			
			else if(ZO.getText().equals(cPlayer) && OO.getText().equals(cPlayer) && TO.getText().equals(cPlayer))//Checking which possible player has one
			{
				
				ifWinner = true;//setting to true
				winningPlayer(cPlayer);//Calling winning player method
				
			}
	
			else if(ZT.getText().equals(cPlayer) && OT.getText().equals(cPlayer) && TT.getText().equals(cPlayer))//Checking which possible player has one
			{
				
				ifWinner = true;//setting to true
				winningPlayer(cPlayer);//Calling winning player method
				
			}
			
			else if(turnCounter>=9)//Checking which possible player has one or if draw
			{
				
				turnCounter=0;//reseting turn counter
				JOptionPane.showMessageDialog(null, "No Winner, It Was A Draw :(");//output dialog message
				ifWinner = true;//setting to true
				
			}
			
	}
	
}
