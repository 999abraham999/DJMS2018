/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custumer;

/**
 *
 * @author Usuario
 */
public class CustumerManagementJifrm extends javax.swing.JInternalFrame {

    /**
     * Creates new form CustumerManagementJifrm
     */
    public CustumerManagementJifrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNameCustumer = new javax.swing.JTextField();
        jbtnSearchCustumer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableCustumer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jlNameCustumer = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlEmailCustumer = new javax.swing.JLabel();
        jbtnEditCustomer = new javax.swing.JButton();
        JbtnDeleteCustumer = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("CLIENTES");
        setVisible(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("ADMINISTRAR CLIENTES");

        jLabel5.setText("Nombre C:");

        jtxtNameCustumer.setName("jtxtFindCodeAndName"); // NOI18N

        jbtnSearchCustumer.setText("Buscar");
        jbtnSearchCustumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchCustumerActionPerformed(evt);
            }
        });

        jtableCustumer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtableCustumer.setName(""); // NOI18N
        jtableCustumer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableCustumerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableCustumer);

        jLabel1.setText("Nombre del Cliente:");

        jlNameCustumer.setText("??");

        jLabel4.setText("Email del Cliente:");

        jlEmailCustumer.setText("??");

        jbtnEditCustomer.setText("Editar Cliente");

        JbtnDeleteCustumer.setText("Eliminar Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jlNameCustumer)
                                    .addComponent(jLabel4)
                                    .addComponent(jlEmailCustumer)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(17, 17, 17)
                                    .addComponent(jtxtNameCustumer)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbtnSearchCustumer))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(JbtnDeleteCustumer)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel8)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNameCustumer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSearchCustumer)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNameCustumer)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEmailCustumer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEditCustomer)
                    .addComponent(JbtnDeleteCustumer))
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSearchCustumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchCustumerActionPerformed
     /*   name = jtxtNameCustumer.getText();
        if (cbActive.getSelectedItem().toString() == "Activo") {
            active = "1";
        }else if (cbActive.getSelectedItem().toString() == "Inactivo") {
            active = "0";
        }
        findProducts();*/
    }//GEN-LAST:event_jbtnSearchCustumerActionPerformed

    private void jtableCustumerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableCustumerMouseClicked
    /*    JTable sorce = (JTable)evt.getSource();
        int row = sorce.rowAtPoint(evt.getPoint());
        int colum = sorce.columnAtPoint(evt.getPoint());
        String codeSelect = sorce.getModel().getValueAt(row, 0)+ "";
        String nameSelect = sorce.getModel().getValueAt(row, 1)+ "";
        jlNameCustumer.setText(codeSelect);
        jlEmailCustumer.setText(nameSelect);*/
    }//GEN-LAST:event_jtableCustumerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnDeleteCustumer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEditCustomer;
    private javax.swing.JButton jbtnSearchCustumer;
    private javax.swing.JLabel jlEmailCustumer;
    private javax.swing.JLabel jlNameCustumer;
    private javax.swing.JTable jtableCustumer;
    private javax.swing.JTextField jtxtNameCustumer;
    // End of variables declaration//GEN-END:variables
}
