import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithTextFields extends Applet {
	public void init() {
		Label label1 = new Label("First text field: ");
		
		textField1 = new TextField("Hello");

		add(label1);
		add(textField1);
	}
	TextField textField1, textField2;
}