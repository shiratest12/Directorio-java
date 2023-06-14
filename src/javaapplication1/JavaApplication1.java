/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Viri
 */import javax.swing.*;
public class JavaApplication1 {
	
	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
		// TODO code application logic here
		
		DGUI app = new DGUI ();
		app.setVisible  (true);
		app.setSize     (500, 310);
		app.setLocation (200, 100);
		app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
	}
	
}
