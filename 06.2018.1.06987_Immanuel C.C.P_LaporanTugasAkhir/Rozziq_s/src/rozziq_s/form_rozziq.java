/*
 * source Kode bahasa java Gui 
 */
package rozziq_s;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;

public class form_rozziq extends javax.swing.JFrame {
    int a=0; // deklarasi variabel
    int b=0;
    simpan input=new simpan(); 
    Connection tes;
    
    public form_rozziq() {
      initComponents();
      tblsimpan.setModel(input.getTabel());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtjurusan = new javax.swing.JTextField();
        txttgl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsimpan = new javax.swing.JTable();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 153, 255));
        label1.setText("NPM");

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 153, 255));
        label2.setText("NAMA");

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 153, 255));
        label3.setText("TGL LAHIR");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 153, 255));
        label4.setText("JURUSAN");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblsimpan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblsimpan);

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 153, 255));
        label5.setText("APLIKASI DATA MAHASISWA");

        label6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 153, 255));
        label6.setText("Program Modul 5 & TA");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 204));
        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(0, 153, 255));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton3))
                                    .addComponent(txttgl)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnim)
                                        .addComponent(txtnama)
                                        .addComponent(txtjurusan, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnama)
                        .addGap(18, 18, 18)
                        .addComponent(txtjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttgl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/rozziq","root","");
            koneksi.createStatement().execute("insert into tb_rozziq values('"+txtnim.getText()+"','"+txtnama.getText()+"','"+txtjurusan.getText()+"','"+txttgl.getText()+"')");
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane,"OK Data Sudah Di Inputkan");// jika data tidak benar ,aka akan tampil pesan bahwa data anda salah
            
        }
            //deklarasi variabel dima menggunaka tipedata aray untuk memasukan data ke dalam tabel
        String[] data=new String[5];
        a = a+1;
        data[0]=String.valueOf(a);
        data[1]=txtnim.getText();// memanggil inputan nim
        data[2]=txtnama.getText();// memanggil inputan nama
        data[3]=txtjurusan.getText();//memanggi inputan jurusan
        data[4]=txttgl.getText();//memanggil inputan tgl lahir
        
        input.getTabel().addRow(data);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        input.getTabel().removeRow(tblsimpan.getSelectedRow());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String[] data=new String[5];
        a = b;
        data[0]=String.valueOf(a);
        data[1]=txtnim.getText();// memanggil inputan nim
        data[2]=txtnama.getText();// memanggil inputan nama
        data[3]=txtjurusan.getText();//memanggi inputan jurusan
        data[4]=txttgl.getText();//memanggil inputan tgl lahir
     String sql ="UPDATE mhs SET nama = '"+txtnama.getText()+"', nim = '"+txtnim.getText()+"', jurusan = '"+txtjurusan.getText()+"', Tanngal Lahir = '"+txttgl.getText()+"' WHERE nim = '"+txtnim.getText()+"'";
       input.getTabel().addRow(data);
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        
    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_rozziq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_rozziq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_rozziq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_rozziq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_rozziq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTable tblsimpan;
    private javax.swing.JTextField txtjurusan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txttgl;
    // End of variables declaration//GEN-END:variables

    
}
