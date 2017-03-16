
// Robot API for complex input handling
// Konugur Yargolek


import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Write {

	public void output(char[] in) throws Exception
	{
		Robot robot = new Robot();
		
		int loops = in.length;
		int currentChar = 0;
		
		long startTime = System.currentTimeMillis();
		
		// Numbers
		
		while(true) {
			
		if (in[currentChar] == '0') {
			
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_0);
			
		}
		if (in[currentChar] == '1') {
			
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			
		}
		if(in[currentChar] == '2') {
			
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			
		}
		if (in[currentChar] == '3') {
			
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
			
		}
		if (in[currentChar] == '4') {
			
			robot.keyPress(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_4);
			
		}
		if (in[currentChar] == '5') {
			
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
			
		}
		if(in[currentChar] == '6') {
			
			robot.keyPress(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_6);
			
		}
		if (in[currentChar] == '7') {
			
			robot.keyPress(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_7);
			
		}
		if (in[currentChar] == '8') {
			
			robot.keyPress(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_8);
			
		}
		if (in[currentChar] == '9') {
			
			robot.keyPress(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_9);
			
		}
		
		// Alphabet lowercase
		
		if(in[currentChar] == 'a') {
			
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			
		}
		if (in[currentChar] == 'b') {
			
			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
			
		}
		if (in[currentChar] == 'c') {
			
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			
		}
		if(in[currentChar] == 'd') {
			
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			
		}
		if (in[currentChar] == 'e') {
			
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			
		}
		if (in[currentChar] == 'f') {
			
			robot.keyPress(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F);
			
		}
		if (in[currentChar] == 'g') {
			
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_G);
			
		}
		if(in[currentChar] == 'h') {
			
			robot.keyPress(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_H);
			
		}
		if (in[currentChar] == 'i') {
			
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			
		}
		if (in[currentChar] == 'j') {
			
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_J);
			
		}
		if (in[currentChar] == 'k') {
			
			robot.keyPress(KeyEvent.VK_K);
			robot.keyRelease(KeyEvent.VK_K);
			
		}
		if (in[currentChar] == 'l') {
			
			robot.keyPress(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_L);
			
		}
		if(in[currentChar] == 'm') {
			
			robot.keyPress(KeyEvent.VK_M);
			robot.keyRelease(KeyEvent.VK_M);
			
		}
		if (in[currentChar] == 'n') {
			
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			
		}
		if (in[currentChar] == 'o') {
			
			robot.keyPress(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_O);
			
		}
		if (in[currentChar] == 'p') {
			
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_P);
			
		}
		if (in[currentChar] == 'q') {
				
			robot.keyPress(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_Q);
				
		}
		if (in[currentChar] == 'r') {
				
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			
		}
		if (in[currentChar] == 's') {
			
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			
		}
		if(in[currentChar] == 't') {
			
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
			
		}
		if (in[currentChar] == 'u') {
			
			robot.keyPress(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_U);
			
		}
		if (in[currentChar] == 'v') {
			
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			
		}
		if (in[currentChar] == 'w') {
			
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			
		}
		if (in[currentChar] == 'x') {
			
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_X);
			
		}
		if (in[currentChar] == 'y') {
			
			robot.keyPress(KeyEvent.VK_Y);
			robot.keyRelease(KeyEvent.VK_Y);
			
		}
		if (in[currentChar] == 'z') {
			
			robot.keyPress(KeyEvent.VK_Z);
			robot.keyRelease(KeyEvent.VK_Z);
			
		}
		
		// Alphabet uppercase
		
		if(in[currentChar] == 'A') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'B') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'C') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == 'D') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'E') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'F') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'G') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == 'H') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'I') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'J') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'K') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_K);
			robot.keyRelease(KeyEvent.VK_K);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'L') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == 'M') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_M);
			robot.keyRelease(KeyEvent.VK_M);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'N') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'O') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'P') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'Q') {
				
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_SHIFT);
				
		}
		if (in[currentChar] == 'R') {
				
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'S') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == 'T') {

			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'U') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'V') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'W') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'X') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'Y') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_Y);
			robot.keyRelease(KeyEvent.VK_Y);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if (in[currentChar] == 'Z') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_Z);
			robot.keyRelease(KeyEvent.VK_Z);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		
		// Symbols
		
		if(in[currentChar] == '`') {
			
			robot.keyPress(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
			
		}
		if(in[currentChar] == '~') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '!') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '@') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '#') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '$') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '%') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '^') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '&') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '*') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '(') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == ')') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '-') {
			
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			
		}
		if(in[currentChar] == '_') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '+') {
			
			robot.keyPress(KeyEvent.VK_PLUS);
			robot.keyRelease(KeyEvent.VK_PLUS);
			
		}
		if(in[currentChar] == '=') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_PLUS);
			robot.keyRelease(KeyEvent.VK_PLUS);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '[') {
			
			robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
			
		}
		if(in[currentChar] == '{') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == ']') {
			
			robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
			
		}
		if(in[currentChar] == '}') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '\\') {
			
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_BACK_SLASH);
			
		}
		if(in[currentChar] == '|') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == ';') {
			
			robot.keyPress(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SEMICOLON);
			
		}
		if(in[currentChar] == ':') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '\'') {
			
			robot.keyPress(KeyEvent.VK_QUOTE);
			robot.keyRelease(KeyEvent.VK_QUOTE);
			
		}
		if(in[currentChar] == '"') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_QUOTE);
			robot.keyRelease(KeyEvent.VK_QUOTE);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == ',') {
			
			robot.keyPress(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_COMMA);
			
		}
		if(in[currentChar] == '<') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '.') {
			
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_PERIOD);
			
		}
		if(in[currentChar] == '>') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == '/') {
			
			robot.keyPress(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SLASH);

		}
		if(in[currentChar] == '>') {
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			
		}
		if(in[currentChar] == ' ') {
		
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			
		}
		
		currentChar++;
		loops--;
		
		if(loops < 1) {
			break;
		}
		
		}
		
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		
		
		System.out.println("Time elapsed: " + timeElapsed + "ms");
	}
	
	public void enter() throws Exception {
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void escape() throws Exception {
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
	}
	public void backspace() throws Exception {
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
	}
	
}
