
//package gettingstarted;

//import com.phidget22.*;
import doodlepad.*;


public class DoodlePadQuiz {
	public static void main(String[] args) {
		String font = "Times New Roman";
		boolean start = true;
		boolean q1 = true;
		
        //Rectangle r1 = new Rectangle(50, 60, 70, 40);
        Text t = new Text("Welcome to AP CS Triva of Death", 100, 100, 25, 1, font);
        Text t1 = new Text("Ready to Start? Press the Green Button to Start", 100, 125, 25, 1, font);
        if (start){
			showQ("Question 1: ", "In the base case, a recursive method calls itself.");
		
	}
    }
    public void showQ(String s, String q){
		t.setText(s);
		t1.setFontStyle(0);
		t1.setText(q);
	}
}
