package seleniumworkspace;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardActions {

	public static void main(String[] args) throws Exception {

		Runtime.getRuntime().exec("notepad");
		Thread.sleep(2000);

		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_WINDOWS);           
		key.keyPress(KeyEvent.VK_UP);
		key.keyRelease(KeyEvent.VK_WINDOWS);
		key.keyPress(KeyEvent.VK_SHIFT);
		key.keyPress(KeyEvent.VK_P);
		key.keyRelease(KeyEvent.VK_SHIFT);
		key.keyPress(KeyEvent.VK_A);
		key.keyPress(KeyEvent.VK_R);
		key.keyPress(KeyEvent.VK_T);
		key.keyPress(KeyEvent.VK_H);
		key.keyPress(KeyEvent.VK_I);
		key.keyPress(KeyEvent.VK_B);
		key.keyPress(KeyEvent.VK_H);
		key.keyPress(KeyEvent.VK_A);
		key.keyPress(KeyEvent.VK_N);

		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_ALT);
		key.keyPress(KeyEvent.VK_F4);
		key.keyRelease(KeyEvent.VK_ALT);
		key.keyPress(KeyEvent.VK_RIGHT);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);

	}

}
