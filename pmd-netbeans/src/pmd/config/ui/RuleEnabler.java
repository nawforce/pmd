/*
 * Editor.java
 *
 * Created on 18. november 2002, 21:19
 */

package pmd.config.ui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import net.sourceforge.pmd.Rule;

/**
 *
 * @author  ole martin m�rk
 */
public class RuleEnabler extends JPanel {
	private ArrayList value = new ArrayList();
	private final PropertyEditorSupport editor;
	public RuleEnabler( PropertyEditorSupport editor ) {
		this.editor = editor;
		initComponents();
	}
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        chosenList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chooseOne = new javax.swing.JButton();
        choseAll = new javax.swing.JButton();
        removeOne = new javax.swing.JButton();
        removeAll = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        information = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        example = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBorder(new javax.swing.border.EtchedBorder());
        jScrollPane1.setPreferredSize(new java.awt.Dimension(270, 200));
        availableList.setModel(AvailableListModel.getInstance());
        availableList.setCellRenderer(new ListCell());
        availableList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                availableListValueChanged(evt);
            }
        });

        jScrollPane1.setViewportView(availableList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel5.add(jScrollPane1, gridBagConstraints);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(270, 200));
        chosenList.setModel(SelectedListModel.getSelectedListModelInstance());
        chosenList.setCellRenderer(new ListCell());
        chosenList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                chosenListValueChanged(evt);
            }
        });

        jScrollPane3.setViewportView(chosenList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel5.add(jScrollPane3, gridBagConstraints);

        jLabel3.setText("Available rules");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Chosen rules");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jLabel4, gridBagConstraints);

        chooseOne.setText(">");
        chooseOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseOneActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 0, 1);
        jPanel5.add(chooseOne, gridBagConstraints);

        choseAll.setText(">>");
        choseAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choseAllActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel5.add(choseAll, gridBagConstraints);

        removeOne.setText("<");
        removeOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOneActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel5.add(removeOne, gridBagConstraints);

        removeAll.setText("<<");
        removeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel5.add(removeAll, gridBagConstraints);

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBorder(new javax.swing.border.EtchedBorder());
        jLabel6.setText("Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jLabel6, gridBagConstraints);

        jLabel5.setText("Example");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jLabel5, gridBagConstraints);

        jScrollPane4.setPreferredSize(new java.awt.Dimension(300, 200));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(150, 150));
        jScrollPane4.setViewportView(information);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jScrollPane4, gridBagConstraints);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 200));
        example.setEditable(false);
        jScrollPane2.setViewportView(example);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jScrollPane2, gridBagConstraints);

        jPanel3.add(jPanel6);

        add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setText("Select rules that should be used");
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);

        jLabel2.setText("See http://pmd.sf.net for more information");
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);

        add(jPanel1, java.awt.BorderLayout.NORTH);

    }//GEN-END:initComponents

	private void chosenListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_chosenListValueChanged
		Rule rule =  (Rule)chosenList.getSelectedValue();
		example.setText( rule.getExample().trim());
		information.setText( rule.getDescription().trim() );
	}//GEN-LAST:event_chosenListValueChanged

	private void availableListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_availableListValueChanged
		Rule rule =  (Rule)availableList.getSelectedValue();
		example.setText( rule.getExample().trim() );
		information.setText( rule.getDescription().trim() );

	}//GEN-LAST:event_availableListValueChanged

	private void removeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllActionPerformed
		AvailableListModel.getInstance().addAll( SelectedListModel.getSelectedListModelInstance().getData() );
		SelectedListModel.getSelectedListModelInstance().removeAll();
		editor.firePropertyChange();

	}//GEN-LAST:event_removeAllActionPerformed

	private void removeOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOneActionPerformed
		Object object[] = chosenList.getSelectedValues();
		if( object != null ) {
			for( int i = 0; i < object.length; i++ ) {
				SelectedListModel.getSelectedListModelInstance().remove( object[i] );
				AvailableListModel.getInstance().add( object[i] );
			}
			editor.firePropertyChange();
		}	
	}//GEN-LAST:event_removeOneActionPerformed

	private void choseAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choseAllActionPerformed
		SelectedListModel.getSelectedListModelInstance().addAll( AvailableListModel.getInstance().getData() );
		AvailableListModel.getInstance().removeAll();
		editor.firePropertyChange();
	}//GEN-LAST:event_choseAllActionPerformed

	private void chooseOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseOneActionPerformed
		Object object[] = availableList.getSelectedValues();
		if( object != null ) {
			for( int i = 0; i < object.length; i++ ) {
				AvailableListModel.getInstance().remove( object[i] );
				SelectedListModel.getSelectedListModelInstance().add( object[i] );
			}
			editor.firePropertyChange();
		}	
	}//GEN-LAST:event_chooseOneActionPerformed

	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton removeAll;
    private javax.swing.JList availableList;
    private javax.swing.JButton chooseOne;
    private javax.swing.JButton choseAll;
    private javax.swing.JTextPane example;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JEditorPane information;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton removeOne;
    private javax.swing.JList chosenList;
    // End of variables declaration//GEN-END:variables
	
}
