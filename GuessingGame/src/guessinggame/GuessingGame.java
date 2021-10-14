/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author AnandRajan
 */

import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class GuessingGame {
    
    private JFrame frame;
    private int intGuessed, numToGuess;
    private JTextField guessField;
    private JButton playButton, guessButton;
    private JLabel guessLabel, gameIntroLabel;
    private int prevGuess = -1000; // Low enough so any first guess will register as closer to the right value

    /**
     * @param args the command line arguments
     */
    
    public GuessingGame()   // Constructor
    {
        initialize();
        frame.setVisible(true);           
    }  
    
    
    
    
    private void initialize()       // Initalizer function to set Container up and create all field/button references
    {
        frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("Guessing Game");
        frame.getContentPane().setLayout(null);
        gameIntroLabel = new JLabel("<html> I have a number between 1 and 1000. Can you guess my number?\n" +
"Please enter your first guess. </html>");
        gameIntroLabel.setBounds(100, 50, 450, 50);
        frame.getContentPane().add(gameIntroLabel);
        
        guessField = new JTextField(10);
        guessField.setBounds(192, 186, 148, 26);
        frame.getContentPane().add(guessField);
        guessField.setColumns(10);
        
        guessButton = new JButton("Guess a Number");
        frame.add(guessButton);
        guessButton.setToolTipText("Click to guess the number you entered");
        guessButton.setBounds(352, 186, 150, 30);
        
        playButton = new JButton("Play Again");
        playButton.setToolTipText("Click to play the game again");
        playButton.setBounds(352, 186, 93, 30);
        
        guessLabel = new JLabel("Game status");

        Handler gameHandler = new Handler();        // Button click instances
        guessButton.addActionListener(gameHandler);
        playButton.addActionListener(gameHandler);
        
        Random randomNumber = new Random();
        numToGuess = randomNumber.nextInt(1000) + 1;
        System.out.println(numToGuess);
           
    }
    
    
    
    
    
    public class Handler implements ActionListener      // Handler
    {
        
        public void handlePlayButton()
        {
            guessField.setEditable(true);
            guessLabel.setVisible(false);
            gameIntroLabel.setVisible(true);
                
            playButton.setVisible(false);
            guessButton.setVisible(true);
            
            frame.getContentPane().setBackground(null);
                
            Random randomNumber = new Random();
            numToGuess = randomNumber.nextInt(1000) + 1;
            System.out.print(numToGuess);
            
            prevGuess = -1000;
        }
        
        
        public void handleRightGuess()
        {
            frame.getContentPane().setBackground(Color.green);
                        
            guessLabel.setText("You win!");
            guessLabel.setHorizontalAlignment(SwingConstants.CENTER);
            guessLabel.setBounds(192, 238, 148, 16);
            frame.getContentPane().add(guessLabel);

            playButton.setHorizontalAlignment(SwingConstants.RIGHT);
            playButton.setVerticalAlignment(SwingConstants.CENTER);

            frame.getContentPane().add(playButton);

            guessButton.setVisible(false);
            playButton.setVisible(true);

            guessField.setEditable(false);
        }
        
        public void handleLowGuess()
        {
            guessLabel.setText("Too low!");
            guessLabel.setHorizontalAlignment(SwingConstants.CENTER);
            guessLabel.setBounds(192, 238, 148, 16);
            frame.getContentPane().add(guessLabel);
        }
        
        public void handleHighGuess()
        {
            guessLabel.setText("Too high!");
            guessLabel.setHorizontalAlignment(SwingConstants.CENTER);
            guessLabel.setBounds(192, 238, 148, 16);
            frame.getContentPane().add(guessLabel);
        }
        
          
        @Override
        public void actionPerformed(ActionEvent event)
        {
            
            
            Object sourceObject = event.getSource();
            if(sourceObject == guessButton)         // If the guess button is clicked
            {
                String strGuess = guessField.getText();
                intGuessed = Integer.parseInt(strGuess);
                
                gameIntroLabel.setVisible(false);
                guessLabel.setVisible(true);
   
                
                
                if(intGuessed == numToGuess)        // Right answer
                    {
                        handleRightGuess();
                    }

                
                
                else if(intGuessed < numToGuess)        // Too low
                    {
                        if(Math.abs(numToGuess - intGuessed) > Math.abs(numToGuess - prevGuess))        // If guess is further away
                        {
                            frame.getContentPane().setBackground(Color.blue);
                        }                 
                        
                        else if(Math.abs(numToGuess - intGuessed) < Math.abs(numToGuess - prevGuess))       // If guess is closer
                        {
                            frame.getContentPane().setBackground(Color.red);
                        }
                        
                        handleLowGuess();
                    }

                
                
                else if(intGuessed > numToGuess)
                    {
                        if(Math.abs(numToGuess - intGuessed) > Math.abs(numToGuess - prevGuess))
                        {
                            frame.getContentPane().setBackground(Color.blue);
                        }                 
                        
                        else if(Math.abs(numToGuess - intGuessed) < Math.abs(numToGuess - prevGuess))
                        {
                            frame.getContentPane().setBackground(Color.red);
                        }
                        
                        handleHighGuess();
                    }
                
                prevGuess = intGuessed;
                
            }
            
            
            
            else if(sourceObject == playButton)     // If the play again button is clicked
            {
                handlePlayButton();
            }
            
            
        }
    }
    
    
    
    public static void main(String[] args) {        // Main
        // TODO code application logic here
        GuessingGame demoGame = new GuessingGame();
        demoGame.frame.setVisible(true);
    }
    
}
