package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle =  JOptionPane.showInputDialog("Tear one off and scratch my head what was red is black instead.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals ("a match"))   {
	String yes =  JOptionPane.showInputDialog("you are da rizzler."); 
	score +=1;
}


		// 5. Otherwise, say "wrong" and tell them the answer
 else {
		String no =  JOptionPane.showInputDialog("you are not da rizzler."); }
	
	
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
String riddle2 =  JOptionPane.showInputDialog("what has a head and tail and no body.");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle2.equals ("a coin"))   {
String yes =  JOptionPane.showInputDialog("you are da rizzler."); 
score +=1;
}


// 5. Otherwise, say "wrong" and tell them the answer
else {
String no =  JOptionPane.showInputDialog("you are not da rizzler."); }

String riddle3 =  JOptionPane.showInputDialog("what does a fish say when it runs into a wall.");
//4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle3.equals ("damn"))   {
String yes =  JOptionPane.showInputDialog("you are da rizzler."); 
score +=1;
}


//5. Otherwise, say "wrong" and tell them the answer
else {
String no =  JOptionPane.showInputDialog("you are not da rizzler."); }
String hi =  JOptionPane.showInputDialog("your score is,"+score+"."); }
}

