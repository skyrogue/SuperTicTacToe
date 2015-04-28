
import javax.swing.JOptionPane;

/**
 *
 * @author Eloy
 */
public class Multiplayer extends UIPanel {
	private static final long serialVersionUID = 1L;

    /**
     * Creates new form Multiplayer
     */
    public Multiplayer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        firstPlayer = new javax.swing.ButtonGroup();
        p1RadioButton = new javax.swing.JRadioButton();
        p2RadioButton = new javax.swing.JRadioButton();
        p1NameLabel = new javax.swing.JLabel();
        p2NameTxtField = new javax.swing.JTextField();
        p1GuestCheckBox = new javax.swing.JCheckBox();
        p2NameLabel = new javax.swing.JLabel();
        p1NameTxtField = new javax.swing.JTextField();
        p2GuestCheckBox = new javax.swing.JCheckBox();
        firstPlayerLabel = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();

        firstPlayer.add(p1RadioButton);
        p1RadioButton.setSelected(true);
        p1RadioButton.setText("Player 1");
        p1RadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                p1RadioButtonActionPerformed(evt);
            }
        });

        firstPlayer.add(p2RadioButton);
        p2RadioButton.setText("Player 2");

        p1NameLabel.setText("Player 1 username:");

        p2NameTxtField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                p2NameTxtFieldActionPerformed(evt);
            }
        });

        p1GuestCheckBox.setText("Guest");
        p1GuestCheckBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                p1GuestCheckBoxActionPerformed(evt);
            }
        });

        p2NameLabel.setText("Player 2 username:");

        p1NameTxtField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                p1NameTxtFieldActionPerformed(evt);
            }
        });

        p2GuestCheckBox.setText("Guest");
        p2GuestCheckBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                p2GuestCheckBoxActionPerformed(evt);
            }
        });

        firstPlayerLabel.setText("First player:");

        playButton.setText("Play Game");
        playButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                playButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1NameLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(firstPlayerLabel)
                        .addComponent(p2NameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p2NameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p1NameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1GuestCheckBox)
                            .addComponent(p2GuestCheckBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p1RadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2RadioButton)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(playButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1GuestCheckBox)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1NameLabel)
                            .addComponent(p1NameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p2NameLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(p2NameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(p2GuestCheckBox)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(p2RadioButton)
                                .addComponent(p1RadioButton))
                            .addComponent(firstPlayerLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1RadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1RadioButtonActionPerformed

    private void p2NameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2NameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2NameTxtFieldActionPerformed

    private void p1GuestCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1GuestCheckBoxActionPerformed
        // TODO add your handling code here:
        p1NameTxtField.setEditable(!p1NameTxtField.isEditable());
        if(!p1NameTxtField.isEditable())
        { p1NameTxtField.setText(Game.GUEST_NAME);} //reference later
        else
        {p1NameTxtField.setText("");}
    }//GEN-LAST:event_p1GuestCheckBoxActionPerformed

    private void p1NameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1NameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1NameTxtFieldActionPerformed

    private void p2GuestCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2GuestCheckBoxActionPerformed
        // TODO add your handling code here:
        p2NameTxtField.setEditable(!p2NameTxtField.isEditable());
        if(!p2NameTxtField.isEditable())
        {p2NameTxtField.setText(Game.GUEST_NAME);}//reference later
        else
        {p2NameTxtField.setText("");}

    }//GEN-LAST:event_p2GuestCheckBoxActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_playButtonActionPerformed
    {//GEN-HEADEREND:event_playButtonActionPerformed
        String p1 = this.p1NameTxtField.getText().trim();
		String p2 = this.p2NameTxtField.getText().trim();
		if(p1.length() <= 0)
		{
			JOptionPane.showMessageDialog(this, "Empty player one username value."
				, "Invalid", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(p2.length() <= 0)
		{
			JOptionPane.showMessageDialog(this, "Empty player two username value."
				, "Invalid", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(p1.equals(Game.AI_NAME) || (!this.p1GuestCheckBox.isSelected() && p1.equals(Game.GUEST_NAME)))
		{
			JOptionPane.showMessageDialog(this, "Invalid username one due to reserved name."
				, "Invalid", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(p2.equals(Game.AI_NAME) || (!this.p2GuestCheckBox.isSelected() && p2.equals(Game.GUEST_NAME)))
		{
			JOptionPane.showMessageDialog(this, "Invalid username two due to reserved name."
				, "Invalid", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(!this.p1GuestCheckBox.isSelected() && p1.equals(p2))
		{
			JOptionPane.showMessageDialog(this, "Same username entered for both players."
				, "Invalid", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(!this.p1GuestCheckBox.isSelected())
		{
			if(UIWindow.getHistoryInstance().getPlayer(p1) == null)
			{
				JOptionPane.showMessageDialog(this, "Username One does not exist."
				, "Invalid", JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
		
		if(!this.p2GuestCheckBox.isSelected())
		{
			if(UIWindow.getHistoryInstance().getPlayer(p2) == null)
			{
				JOptionPane.showMessageDialog(this, "Username Two does not exist."
				, "Invalid", JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
		
		UIWindow.getInstance().setCurrentPanel(new GridPanel(p1, p2, this.p1RadioButton.isSelected()));
    }//GEN-LAST:event_playButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup firstPlayer;
    private javax.swing.JLabel firstPlayerLabel;
    private javax.swing.JCheckBox p1GuestCheckBox;
    private javax.swing.JLabel p1NameLabel;
    private javax.swing.JTextField p1NameTxtField;
    private javax.swing.JRadioButton p1RadioButton;
    private javax.swing.JCheckBox p2GuestCheckBox;
    private javax.swing.JLabel p2NameLabel;
    private javax.swing.JTextField p2NameTxtField;
    private javax.swing.JRadioButton p2RadioButton;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}