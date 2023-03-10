
package DoodlePadQuiz;

import com.phidget22.*;
import doodlepad.*;


public class DoodlePadQuiz {
	public static String font = "Times New Roman";
	public static Text t;
	public static Text t1;
	public static int counter = 0;
	public static Text t2 = new Text(" ", 100, 75, 25, 0, font);


	public static void main(String[] args) {
		boolean start = true;
		boolean q1 = true;
		
        //Rectangle r1 = new Rectangle(50, 60, 70, 40);
        t = new Text("Welcome to AP CS Triva of Death", 100, 100, 25, 1, font);
        t1 = new Text("Ready to Start? Press the Green Button to Start", 100, 125, 25, 1, font);
        if (start){
			t.setText("");
			t1.setText("");
			showQ("Question 1: ", "In the base case, a recursive method calls itself.");
			sleep();
			showQ("Question 2: ", "Generally, merge sort is faster than selective sort");
			sleep();
			showQ("Question 3: ", "Merge sort is faster than selection sort");
			sleep();
			showQ("Question 4: ", "The following method returns n!");
			Image im = new Image("Image.png", 100, 175, 310, 88);
			
		
	}
    }
    public static void showQ(String s, String q){
		t2.setText("Total Correct: " + counter);
		t.setText(s);
		t1.setText(q);
	}
	public static void sleep(){
		try { Thread.sleep(500); }
		catch(Exception e){ }
		}
		
}
