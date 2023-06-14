
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package javaapplication1;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
*
* @author viri
*/
public class NewJFrame extends javax.swing.JFrame {
	
	/**
	* Creates new form NewJFrame
	*/
	public NewJFrame() {
		initComponents();
	}
	
	
	@SuppressWarnings("unchecked")
		// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
		private void initComponents() {
			
			jFrame1 = new javax.swing.JFrame();
			jScrollPane1 = new javax.swing.JScrollPane();
			studentTextArea = new javax.swing.JTextArea();
			n = new javax.swing.JLabel();
			nTextField = new javax.swing.JTextField();
			d = new javax.swing.JLabel();
			dirTextField = new javax.swing.JTextField();
			addButton = new javax.swing.JButton();
			t = new javax.swing.JLabel();
			c = new javax.swing.JLabel();
			telTextField = new javax.swing.JTextField();
			celTextField = new javax.swing.JTextField();
			
			javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
			jFrame1.getContentPane().setLayout(jFrame1Layout);
			jFrame1Layout.setHorizontalGroup(
											 jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
											 .addGap(0, 400, Short.MAX_VALUE)
											 );
			jFrame1Layout.setVerticalGroup(
										   jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										   .addGap(0, 300, Short.MAX_VALUE)
										   );
			
			setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
			
			studentTextArea.setColumns(20);
			studentTextArea.setRows(5);
			jScrollPane1.setViewportView(studentTextArea);
			
			n.setText("Nombre:");
			
			nTextField.setText("nTextField");
			
			d.setText("Direccion:");
			
			dirTextField.setText("nameTextField");
			dirTextField.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					dirTextFieldActionPerformed(evt);
				}
			});
			
			addButton.setText("Add");
			addButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					addButtonActionPerformed(evt);
				}
			});
			
			t.setText("Telefono: ");
			
			c.setText("Celular: ");
			
			t.TextField.setText("telTextField");
                        
			telTextField.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					telTextFieldActionPerformed(evt);
				}
			});
			
			celTextField.setText("celTextField");
			celTextField.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					celTextFieldActionPerformed(evt);
				}
			});
			
			javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
			getContentPane().setLayout(layout);
			layout.setHorizontalGroup(
									  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									  .addGroup(layout.createSequentialGroup()
												.addContainerGap()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
																	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																			  .addGroup(layout.createSequentialGroup()
																						.addComponent(c)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
																						.addComponent(celTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
																			  .addGroup(layout.createSequentialGroup()
																						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																								  .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
																								  .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
																								  .addComponent(n))
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																								  .addComponent(telTextField)
																								  .addComponent(dirTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
																								  .addComponent(nTextField))))
																	.addGap(31, 31, 31)
																	.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
																	.addGap(50, 50, 50))
														  .addGroup(layout.createSequentialGroup()
																	.addComponent(addButton)
																	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
									  );
			layout.setVerticalGroup(
									layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(layout.createSequentialGroup()
											  .addContainerGap()
											  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
											  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
											  .addComponent(addButton)
											  .addGap(40, 40, 40))
									.addGroup(layout.createSequentialGroup()
											  .addGap(34, 34, 34)
											  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
											  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
											  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(d)
														.addComponent(dirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
											  .addGap(18, 18, 18)
											  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(celTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
											  .addGap(18, 18, 18)
											  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(n)
														.addComponent(nTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
											  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									);
			
			pack();
		}// </editor-fold>                        

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTextArea = new javax.swing.JTextArea();
        n = new javax.swing.JLabel();
        nTextField = new javax.swing.JTextField();
        d = new javax.swing.JLabel();
        dirTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        t = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        telTextField = new javax.swing.JTextField();
        celTextField = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 102));

        studentTextArea.setBackground(new java.awt.Color(204, 255, 204));
        studentTextArea.setColumns(20);
        studentTextArea.setRows(5);
        jScrollPane1.setViewportView(studentTextArea);

        n.setText("Nombre:");

        nTextField.setText("nTextField");

        d.setText("Direccion:");

        dirTextField.setText("nameTextField");
        dirTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirTextFieldActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(153, 255, 153));
        addButton.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        addButton.setText("Añadir");
        addButton.setAutoscrolls(true);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        t.setText("Telefono: ");

        c.setText("Celular: ");

        telTextField.setText("telTextField");
        telTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telTextFieldActionPerformed(evt);
            }
        });

        celTextField.setText("celTextField");
        celTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(celTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telTextField)
                                    .addComponent(dirTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(nTextField))))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d)
                    .addComponent(dirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n)
                    .addComponent(nTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addButton.getAccessibleContext().setAccessibleName("Añadir");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
         addContacto();
    }//GEN-LAST:event_addButtonActionPerformed

    private void telTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telTextFieldActionPerformed

    private void celTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celTextFieldActionPerformed

    private void dirTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirTextFieldActionPerformed

   	
		/**
		* @param args the command line arguments
		*/
		public static void main(String args[]) {
			/* Set the Nimbus look and feel */
			//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
			/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
			* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
			*/
			try {
				for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
			} catch (ClassNotFoundException ex) {
				java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			} catch (InstantiationException ex) {
				java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			} catch (IllegalAccessException ex) {
				java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			} catch (javax.swing.UnsupportedLookAndFeelException ex) {
				java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			}
			//</editor-fold>
			
			/* Create and display the form */
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new NewJFrame().setVisible(true);
				}
			});
		}
		
		private boolean isContactonInLinkedList (String nStr)
		{
			boolean inList = false;
			
			for (Metodos stud : ContactoLinkedList)
			{
				if (stud.getn ().compareToIgnoreCase (nStr) == 0)
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
				JOptionPane.showMessageDialog (NewJFrame.this,
											   "Error: Ya se encuentra .");
			}
			else
			{
				try
				{
					Metodos stud = new Metodos (dirTextField.getText(),nTextField.getText(), telTextField.getText(),
														  celTextField.getText());
					
					ContactoLinkedList.add (stud);
					
					displayAll ();
					
					dirTextField.setText("");
					nTextField.setText("");
					
					
				}
				catch (Dexception error)
				{
					JOptionPane.showMessageDialog (NewJFrame.this, error.toString ());
					// myLabel.setText (error.toString ());
					
					
				}
				
			}
		}
		
		private void deletecontacto ()
		{
			if (ContactoLinkedList.size() == 0)
			{
				JOptionPane.showMessageDialog (NewJFrame.this,
											   "Error: No hay contactos.");
			}
			else if (isContactonInLinkedList (nTextField.getText()) == false)
			{
				JOptionPane.showMessageDialog (NewJFrame.this,
											   "Error: No fue encontrado");
			}
			else
			{
				for (int s = 0; s < ContactoLinkedList.size(); s++)
				{
					String currn = ContactoLinkedList.get (s).getn();
					
					if (currn.compareToIgnoreCase (nTextField.getText()) == 0)
					{
						ContactoLinkedList.remove (s);
					}
				}
				
				displayAll ();
				
				dirTextField.setText("");
				nTextField.setText("");
			}
		}
		
		private void editcontacto ()
		{
			if (ContactoLinkedList.size() == 0)
			{
				JOptionPane.showMessageDialog (NewJFrame.this,
											   "Error: No hay datos");
			}
			else if (isContactonInLinkedList (nTextField.getText()) == false)
			{
				JOptionPane.showMessageDialog (NewJFrame.this,
											   "Error: No encontrado");
			}
			else
			{
				editIndex = -1;
				
				for (int s = 0; s < ContactoLinkedList.size(); s++)
				{
					String currn= ContactoLinkedList.get (s).getn ();
					
					if (currn.compareToIgnoreCase (nTextField.getText()) == 0)
					{
						editIndex = s;
						s = ContactoLinkedList.size(); // Exit Loop
					}
				}
				
				// index cannot be less than 0, because we checked if the Stud Id was in
				// the linked list before we looped above.
				if (editIndex >= 0)
				{
					
					
					dirTextField.setText (ContactoLinkedList.get (editIndex).getdir () );
					
				}
				
				
			}
			
		}
		
		
		
		
		private void displayAll ()
		{
			studentTextArea.setText ("");
			
			for (Metodos stud : ContactoLinkedList)
			{
				studentTextArea.append (stud + "\n");
			}
		}
		
		private void exitApplication ()
		{
			System.exit (0); // All is OK.
		}
		
		// Class Instance Data:
		private LinkedList<Metodos> ContactoLinkedList = new LinkedList<Metodos> ();
		private int editIndex;
		
		
		// Variables declaration - do not modify                     
		private javax.swing.JButton addButton;
		private javax.swing.JLabel c;
		private javax.swing.JLabel d;
		private javax.swing.JTextField nTextField;
		private javax.swing.JScrollPane jScrollPane1;
		private javax.swing.JLabel n;
		private javax.swing.JTextField dirTextField;
		private javax.swing.JTextField celTextFiel;
		private javax.swing.JTextField telTextFiel;
		private javax.swing.JTextArea studentTextArea;
		private javax.swing.JLabel t;
    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel c;
    private javax.swing.JTextField celTextField;
    private javax.swing.JLabel d;
    private javax.swing.JTextField dirTextField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel n;
    private javax.swing.JTextField nTextField;
    private javax.swing.JTextArea studentTextArea;
    private javax.swing.JLabel t;
    private javax.swing.JTextField telTextField;
    // End of variables declaration//GEN-END:variables
*/
}
