
package javaapplication1;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

/**
*
* @author Viri
*/


public class DGUI extends JFrame
{
	
	// GUI
	JTextArea  contactoTextArea   = new JTextArea ();
	
	JLabel     n       = new JLabel     ("Nombre: ");
	JTextField nTextField       = new JTextField (10);
	
	JLabel     d         = new JLabel     ("Direccion: ");
	JTextField dirTextField     = new JTextField (10);
	
	JLabel     t         = new JLabel     ("Telefono: ");
	JTextField telTextField     = new JTextField (10);
	
	JLabel     c         = new JLabel     ("Celular: ");
	JTextField celTextField     = new JTextField (10);
	
	
	JButton    addButton         = new JButton ("Añadir");
	JButton    deleteButton      = new JButton ("Eliminar");
	JButton    editButton        = new JButton ("Buscar");
	JButton    displayAllButton  = new JButton ("Mostrar");
	JButton    exitButton        = new JButton ("Salir");
	
	
	//clase
	private LinkedList<Metodos> ContactoLinkedList = new LinkedList<Metodos> ();
	private int editIndex;
	
	
	public DGUI ()
	{
		
		JPanel flow1Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
		JPanel flow2Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
		JPanel gridPanel  = new JPanel (new GridLayout (2, 1));
		
		contactoTextArea.setEditable (false);
		
		flow1Panel.add (n);
		flow1Panel.add (nTextField);
		flow1Panel.add (d);
		flow1Panel.add (dirTextField);
		flow1Panel.add (t);
		flow1Panel.add (telTextField);
		flow1Panel.add (c);
		flow1Panel.add (celTextField);
		
		
		flow2Panel.add (addButton);
		flow2Panel.add (editButton);
		flow2Panel.add (deleteButton);
		flow2Panel.add (displayAllButton);
		flow2Panel.add (exitButton);
		
		gridPanel.add (flow1Panel);
		gridPanel.add (flow2Panel);
		
		
		add (contactoTextArea, BorderLayout.CENTER);
		add (gridPanel,       BorderLayout.SOUTH);
		
		
		addButton.addActionListener        (event -> addContacto ());
		displayAllButton.addActionListener (event -> displayAll ());
		editButton.addActionListener       (event -> editContacto ());
		exitButton.addActionListener       (event -> exitApplication ());
		deleteButton.addActionListener     (event -> deleteContacto ());
		
		
		setTitle ("Directorio");
	}
	
	private boolean isContactonInLinkedList (String nStr)
	{
		boolean inList = false;
		
		for (Metodos dir1 : ContactoLinkedList)
		{
			if (dir1.getn ().compareToIgnoreCase (nStr) == 0)
			{
				inList = true;
			}
		}
		
		return inList;
	}
	
	private void addContacto ()
	{
		if (isContactonInLinkedList (nTextField.getText()) == true)
		{
			JOptionPane.showMessageDialog (DGUI.this,
										   "Error: Contacto ya ingresado anteriormente");
		}
		else
		{
			try
			{
				Metodos dir1 = new Metodos (dirTextField.getText(),  nTextField.getText(), telTextField.getText(),
											celTextField.getText());
				
				ContactoLinkedList.add (dir1);
				
				dirTextField.setText("");
				nTextField.setText("");
				telTextField.setText("");
				celTextField.setText("");
			}
			catch (Dexception error)
			{
				JOptionPane.showMessageDialog (DGUI.this, error.toString ());
				// myLabel.setText (error.toString ());
				
				
			}
			
		}
	}
	
	private void deleteContacto ()
	{
		if (ContactoLinkedList.size() == 0)
		{
			JOptionPane.showMessageDialog (DGUI.this,
										   "Error: no hay datos");
		}
		else if (isContactonInLinkedList (nTextField.getText()) == false)
		{
			JOptionPane.showMessageDialog (DGUI.this,
										   "Error: no se encuentra");
		}
		else
		{
			for (int s = 0; s < ContactoLinkedList.size(); s++)
			{
				String currn = ContactoLinkedList.get (s).getn ();
				
				if (currn.compareToIgnoreCase (nTextField.getText()) == 0)
				{
					ContactoLinkedList.remove (s);
				}
			}
			
			
			
			dirTextField.setText("");
			nTextField.setText("");
			telTextField.setText("");
			celTextField.setText("");
		}
	}
	
	private void editContacto ()
	{
		if (ContactoLinkedList.size() == 0)
		{
			JOptionPane.showMessageDialog (DGUI.this,
										   "Error: no hay datos");
		}
		else if (isContactonInLinkedList (nTextField.getText()) == false)
		{
			JOptionPane.showMessageDialog (DGUI.this,
										   "Error: no se encuentra");
		}
		else
		{
			for (int s = 0; s < ContactoLinkedList.size(); s++)
			{
				String currn = ContactoLinkedList.get (s).getn ();
				
				if (currn.compareToIgnoreCase (nTextField.getText()) == 0)
				{
					JOptionPane.showMessageDialog (DGUI.this,
												   
												   "Registro existente");
				}
			}
			
		}}
	
	
	
	private void displayAll ()
	{
		contactoTextArea.setText ("");
		
		for (Metodos dir1 : ContactoLinkedList)
		{
			contactoTextArea.append (dir1 + "\n");
		}
	}
	
	private void exitApplication ()
	{
		System.exit (0); 
	}
	
} 