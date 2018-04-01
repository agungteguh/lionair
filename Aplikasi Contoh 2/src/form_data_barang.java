import java.awt.BorderLayout;
import static java.lang.Math.floor;
import static java.lang.Math.round;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.jfree.ui.RefineryUtilities;

public class form_data_barang extends javax.swing.JFrame {
    public static String acreg="PK-LAF";
    public static int month;
    public static int year;
    private DefaultTableModel tabmode;
    //DefaultTableModel tabel = new DefaultTableModel();
    Connection con;
    Statement stmt;
    ResultSet rs;
    private void tampil_barang(){
        Object[]baris = {"No", "AIRCRAFT_REG2", "DATES", "AML_PAGE_NO", "ATA", "DESCRIPTION", "DISCREPANCIES", "RECTIFICATIONS"};
        tabmode= new DefaultTableModel(null, baris);
        tabellion.setModel(tabmode);
        String sql = "select * from pirep_data";
        Connection koneksi = new koneksi().getConnection();
        try {
            Statement stat = koneksi.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String No = hasil.getString("No");
                String AIRCRAFT_REG2 = hasil.getString("AIRCRAFT_REG");
                String DATES = hasil.getString("DATES");
                String AML_PAGE_NO = hasil.getString("AML_PAGE_NO");
                String ATA = hasil.getString("ATA");
                String DESCRIPTION = hasil.getString("DESCRIPTION");
                String DISCREPANCIES = hasil.getString("DISCREPANCIES");
                String RECTIFICATIONS = hasil.getString("RECTIFICATIONS");
         
                String[]data1 = {No, AIRCRAFT_REG2, DATES, AML_PAGE_NO, ATA, DESCRIPTION, DISCREPANCIES, RECTIFICATIONS };
                tabmode.addRow(data1);
            }
            koneksi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }

    }
     /*public form_data_barang() {
        initComponents();
        tampil_barang();
    }

    /**/
    
public form_data_barang() {
    initComponents();
}
public void koneksi(){
try{
con=DriverManager.getConnection("jdbc:mysql://localhost/databaselion","root","");
}
catch(SQLException e)
{
System.out.println(e.getMessage());
}
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        scrollPane1 = new java.awt.ScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b_Simpan1 = new javax.swing.JButton();
        c_bln1 = new javax.swing.JComboBox<>();
        c_thn1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ACreg = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        b_Simpan2 = new javax.swing.JButton();
        b_Simpan5 = new javax.swing.JButton();
        pirep = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        OSbutton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabellion = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jButton1.setText("jButton1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel3.setText("A/C Regristration");

        jLabel6.setText("Tanggal akhir");

        b_Simpan1.setText("Download PDF");
        b_Simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Simpan1ActionPerformed(evt);
            }
        });

        c_bln1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        c_bln1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_bln1ActionPerformed(evt);
            }
        });

        c_thn1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2019", "2018", "2017", "2016", "2015", "2014", "2013" }));
        c_thn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_thn1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Periode TKU 3 bulan");

        ACreg.setEditable(true);
        ACreg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PK-LAF", "PK-LAG", "PK-LAH","PK-LAI", "PK-LAJ", "PK-LAK", "PK-LAL", "PK-LAM", "PK-LAO", "PK-LAP", "PK-LAQ", "PK-LAR", "PK-LAS", "PK-LBG", "PK-LBH", "PK-LBI", "PK-LBJ", "PK-LBK", "PK-LBL", "PK-LBM", "PK-LBO", "PK-LBQ", "PK-LBR", "PK-LBS", "PK-LBT", "PK-LBU", "PK-LBV", "PK-LBW", "PK-LBY", "PK-LBZ", "PK-LDE", "PK-LDF", "PK-LDG" }));
        ACreg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ACregItemStateChanged(evt);
            }
        });
        ACreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACregActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(b_Simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ACreg, 0, 207, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_bln1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(c_thn1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACreg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(c_bln1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_thn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(b_Simpan1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TKU REPORT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        b_Simpan2.setText("Cover");
        b_Simpan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Simpan2ActionPerformed(evt);
            }
        });

        b_Simpan5.setText("top ten pirep graph");
        b_Simpan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Simpan5ActionPerformed(evt);
            }
        });

        pirep.setText("Tabel Pirep");
        pirep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pirepActionPerformed(evt);
            }
        });

        jButton3.setText("Pirep Data");

        OSbutton.setText("Operation Summary");
        OSbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b_Simpan5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pirep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(OSbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_Simpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_Simpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_Simpan5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pirep, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(OSbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabellion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "AIRCRAFT_REG2", "DATES", "AML_PAGE_NO", "ATA", "DESCRIPTION", "DISCREPANCIES", "RECTIFICATIONS"
            }
        ));
        jScrollPane4.setViewportView(tabellion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void b_Simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Simpan1ActionPerformed
        // TODO add your handling code here:
      // System.out.print(acreg+"\n");
    }//GEN-LAST:event_b_Simpan1ActionPerformed

    private void b_Simpan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Simpan5ActionPerformed
      /*  DefaultCategoryDataset piedata=new DefaultCategoryDataset();
        piedata.setValue(1, "warna", "Tires and weels");
        piedata.setValue(2, "warna", "Apu indicating System");
        piedata.setValue(8, "warna", "taxi and runway turn off lights");
        piedata.setValue(1, "warna", "exhaust Gas temperature indicating");
        piedata.setValue(4, "warna", "Flight data recorder (FDR)");
        piedata.setValue(5, "warna", "Ignition Exceter");
        piedata.setValue(4, "warna", "Flight data recorder (FDR)");
        piedata.setValue(7, "warna", "Zone Temperature Control and Indication");
        piedata.setValue(5, "warna", "Traffic Alert and Collision Avoidance System (TCAS)");

        JFreeChart chart =ChartFactory.createStackedBarChart("Judul","xxx", "yyy", piedata);
        ChartFrame frame =new ChartFrame ("framechart",chart);
        frame.setVisible(true);
        frame.setBounds(900, 200, 500, 500);*/
        // TODO add your handling code here:
        final StackedBarChart topten = new StackedBarChart("Top Ten Pirep");
        topten.pack();
        RefineryUtilities.centerFrameOnScreen(topten);
        topten.setVisible(true);
        topten.setBounds(900, 200, 500, 500);
    }//GEN-LAST:event_b_Simpan5ActionPerformed

    private void b_Simpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Simpan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_Simpan2ActionPerformed

    private void pirepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirepActionPerformed
tampil_barang() ;  
        
     
    }//GEN-LAST:event_pirepActionPerformed

    private void OSbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSbuttonActionPerformed
       OS() ; 
    // TODO add your handling code here:
    }//GEN-LAST:event_OSbuttonActionPerformed

    private void ACregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACregActionPerformed
       JComboBox<String> combo = (JComboBox<String>) evt.getSource();
        acreg = (String) combo.getSelectedItem();
    }//GEN-LAST:event_ACregActionPerformed

    private void ACregItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ACregItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ACregItemStateChanged

    private void c_bln1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_bln1ActionPerformed
        // TODO add your handling code here:
        JComboBox<String> combo = (JComboBox<String>) evt.getSource();
         String bulan= (String) combo.getSelectedItem();
         month=Integer.parseInt(bulan);
    }//GEN-LAST:event_c_bln1ActionPerformed

    private void c_thn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_thn1ActionPerformed
        // TODO add your handling code here:
        JComboBox<String> combo = (JComboBox<String>) evt.getSource();
         String tahun= (String) combo.getSelectedItem();
         year=Integer.parseInt(tahun);
    }//GEN-LAST:event_c_thn1ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(form_data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_data_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ACreg;
    private javax.swing.JButton OSbutton;
    private javax.swing.JButton b_Simpan1;
    private javax.swing.JButton b_Simpan2;
    private javax.swing.JButton b_Simpan5;
    private javax.swing.JComboBox<String> c_bln1;
    private javax.swing.JComboBox<String> c_thn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton pirep;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTable tabellion;
    // End of variables declaration//GEN-END:variables

   private void OS() {
     int Cok = 0,Cak = 0,Cik = 0,a=0,b=0,c=0,d=0,f=0,g=0,aa=0,bb=0,cc=0,dd=0,ff=0,gg=0,z=0,y=0,x=0;
     int asa=0,asi=0,asu=0,asa1=0,asi1=0,asu1=0;
     int pir1=0,pir2=0,pir3=0;
     int bulan_end=month,bulan_teng=0,bulan_awal=0;
     int year_teng=0,year_awal=0;
     int cek1= bulan_end-1;
     int cek2= bulan_end-2;
     String bulan_akhir = null;
     if(month !=0){
     if(cek2<=0){
     year_awal=year-1;
     bulan_awal=12+cek2;
     }
     else{
     bulan_awal=month-2;
     year_awal=year;
     }
     if(cek1<=0){
     year_teng=year-1;
     bulan_teng=12+cek1;
     }
     else{
     bulan_teng=month-1;
     year_teng=year;
     }
     }
     JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String sql = "SELECT count(DISTINCT flight_date) as jumlah FROM revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_awal+" and year(flight_date)="+year_awal+"";
        String sql1 = "SELECT count(DISTINCT flight_date) as jumlah FROM revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_teng+" and year(flight_date)="+year_teng+"";
        String sql2 = "SELECT count(DISTINCT flight_date) as jumlah FROM revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_awal+" and year(flight_date)="+year+"";
        String sql3= "SELECT SUM(flight_hours) as totaljam,SUM(flight_minutes) AS totalmenit FROM revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_end+" and year(flight_date)="+year+"";
        String sql4= "SELECT SUM(flight_hours) as totaljam,SUM(flight_minutes) AS totalmenit FROM revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_teng+" and year(flight_date)="+year_teng+"";
        String sql5= "SELECT SUM(flight_hours) as totaljam,SUM(flight_minutes) AS totalmenit FROM revenue_data where aaaa='"+acreg+"'and month(flight_date)="+bulan_awal+" and year(flight_date)="+year_awal+"";
        String sql6= "SELECT SUM(flight_hours) as totaljam,SUM(flight_minutes) AS totalmenit FROM non_revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_end+" and year(flight_date)="+year+"";
        String sql7= "SELECT SUM(flight_hours) as totaljam,SUM(flight_minutes) AS totalmenit FROM non_revenue_data where aaaa='"+acreg+"'and month(flight_date)="+bulan_teng+" and year(flight_date)="+year_teng+"";
        String sql8= "SELECT SUM(flight_hours) as totaljam,SUM(flight_minutes) AS totalmenit FROM non_revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_awal+" and year(flight_date)="+year_awal+"";
        String sql9= "SELECT SUM(cycles) as totalcycles FROM revenue_data where aaaa='"+acreg+"'and month(flight_date)="+bulan_end+" and year(flight_date)="+year+"";
        String sql10= "SELECT SUM(cycles) as totalcycles FROM revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_teng+" and year(flight_date)="+year_teng+"";
        String sql11= "SELECT SUM(cycles) as totalcycles FROM revenue_data where aaaa='"+acreg+"' and month(flight_date)="+bulan_awal+" and year(flight_date)="+year_awal+"";
        String sql12="SELECT SUM(cycles) as totalcycles FROM NON_revenue_data where aaaa='"+acreg+"'and month(flight_date)="+bulan_end+" and year(flight_date)="+year+"";
        String sql13="SELECT SUM(cycles) as totalcycles FROM NON_revenue_data where aaaa='"+acreg+"'and month(flight_date)="+bulan_teng+" and year(flight_date)="+year_teng+"";
        String sql14="SELECT SUM(cycles) as totalcycles FROM NON_revenue_data where aaaa='"+acreg+"'and month(flight_date)="+bulan_awal+" and year(flight_date)="+year_awal+"";
        String sql15="SELECT count(*) as totaldelay FROM delay_data where ac_REG='"+acreg+"'and month(date)="+bulan_end+" and year(date)="+year+"";
        String sql16="SELECT count(*) as totaldelay FROM delay_data where ac_REG='"+acreg+"' and month(date)="+bulan_teng+"  and year(date)="+year_teng+"";
        String sql17="SELECT count(*) as totaldelay FROM delay_data where ac_REG='"+acreg+"'and month(date)="+bulan_awal+"  and year(date)="+year_awal+"";
        String sql18="SELECT count(*) FROM pirep_data WHERE AIRCRAFT_REG='"+acreg+"'and month(dates)="+bulan_end+"  and year(dates)="+year+"";
        String sql19="SELECT count(*) FROM pirep_data WHERE AIRCRAFT_REG='"+acreg+"'and month(dates)="+bulan_teng+"  and year(dates)="+year_teng+"";
        String sql20="SELECT count(*) FROM pirep_data WHERE AIRCRAFT_REG='"+acreg+"'and month(dates)="+bulan_awal+"  and year(dates)="+year_awal+"";
       // System.out.print(acreg+"\n");
       //System.out.print(month+"\n");
       // System.out.print(year+"\n");
       // System.out.print(sql20+"\n");
        
        Connection koneksi = new koneksi().getConnection();
        //Connection koneksi1 = new koneksi().getConnection();
        //Connection koneksi2 = new koneksi().getConnection();
        try {
            Statement stat = koneksi.createStatement();
            Statement stat1 = koneksi.createStatement();
            Statement stat2 = koneksi.createStatement();
            Statement stat3 = koneksi.createStatement();
            Statement stat4 = koneksi.createStatement();
            Statement stat5 = koneksi.createStatement();
            Statement stat6 = koneksi.createStatement();
            Statement stat7 = koneksi.createStatement();
            Statement stat8 = koneksi.createStatement();
            Statement stat9 = koneksi.createStatement();
            Statement stat10 = koneksi.createStatement();
            Statement stat11 = koneksi.createStatement();
            Statement stat12 = koneksi.createStatement();
            Statement stat13 = koneksi.createStatement();
            Statement stat14 = koneksi.createStatement();
            Statement stat15 = koneksi.createStatement();
            Statement stat16 = koneksi.createStatement();
            Statement stat17 = koneksi.createStatement();
            Statement stat18 = koneksi.createStatement();
            Statement stat19 = koneksi.createStatement();
            Statement stat20 = koneksi.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            ResultSet hasil1 = stat1.executeQuery(sql1);
            ResultSet hasil2 = stat2.executeQuery(sql2);
            ResultSet hasil3 = stat3.executeQuery(sql3);
            ResultSet hasil4 = stat4.executeQuery(sql4);
            ResultSet hasil5 = stat5.executeQuery(sql5);
            ResultSet hasil6 = stat6.executeQuery(sql6);
            ResultSet hasil7 = stat7.executeQuery(sql7);
            ResultSet hasil8 = stat8.executeQuery(sql8);
            ResultSet hasil9 = stat9.executeQuery(sql9);
            ResultSet hasil10 = stat10.executeQuery(sql10);
            ResultSet hasil11 = stat11.executeQuery(sql11);
            ResultSet hasil12 = stat12.executeQuery(sql12);
            ResultSet hasil13 = stat13.executeQuery(sql13);
            ResultSet hasil14 = stat14.executeQuery(sql14); 
            ResultSet hasil15 = stat15.executeQuery(sql15);
            ResultSet hasil16 = stat16.executeQuery(sql16);
            ResultSet hasil17 = stat17.executeQuery(sql17); 
            ResultSet hasil18 = stat18.executeQuery(sql19);
            ResultSet hasil19 = stat19.executeQuery(sql18);
            ResultSet hasil20 = stat20.executeQuery(sql20); 
            if (hasil.next()) {
            Cok = hasil.getInt(1);
            } 
            if (hasil1.next()) {
            Cak = hasil1.getInt(1);
            } 
            if (hasil2.next()) {
            Cik = hasil2.getInt(1);
           }
            if (hasil3.next()) {
            a = hasil3.getInt(1);
            b = (int) floor(hasil3.getInt(2)/60);
           }
            if (hasil4.next()) {
            c = hasil4.getInt(1);
            d = (int) floor(hasil4.getInt(2)/60);
           }
            if (hasil5.next()) {
            f = hasil5.getInt(1);
            g = (int) floor(hasil5.getInt(2)/60);
           } 
            if (hasil6.next()) {
            aa = hasil6.getInt(1);
            bb = (int) floor(hasil6.getInt(2)/60);
           }
            if (hasil7.next()) {
            cc = hasil7.getInt(1);
            dd = (int) floor(hasil7.getInt(2)/60);
           }
            if (hasil8.next()) {
            ff = hasil8.getInt(1);
            gg = (int) floor(hasil8.getInt(2)/60);
           } 
            if (hasil9.next()) {
            asa = hasil9.getInt(1);
            } 
            if (hasil10.next()) {
            asi = hasil10.getInt(1);
            } 
            if (hasil11.next()) {
            asu = hasil11.getInt(1);
           }
            if (hasil12.next()) {
            asa1 = hasil12.getInt(1);
            } 
            if (hasil13.next()) {
            asi1 = hasil13.getInt(1);
            } 
            if (hasil14.next()) {
            asu1 = hasil14.getInt(1);
           }
            if (hasil15.next()) {
            z = hasil15.getInt(1);
            } 
            if (hasil16.next()) {
            y = hasil16.getInt(1);
            } 
            if (hasil17.next()) {
            x = hasil17.getInt(1);
           }
            if (hasil18.next()) {
            pir1 = hasil18.getInt(1);
            } 
            if (hasil19.next()) {
            pir2 = hasil19.getInt(1);
            } 
            if (hasil20.next()) {
            pir3 = hasil20.getInt(1);
           }
            koneksi.close();
           //System.out.print(Integer.toString(aa));
            //koneksi1.close();
            //koneksi2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
       int totrev=a+b,totrev1=c+d,totrev2=f+g;
       int totnonrev=aa+bb,totnonrev1=cc+dd,totnonrev2=ff+gg;
       double tes=round((totnonrev2+totrev2)/(double)Cok*10.0)/10.0;
       double tes1=round((totnonrev1+totrev1)/(double)Cak*10.0)/10.0;
       double tes2=round((totnonrev+totrev)/(double)Cik*10.0)/10.0;
       double tottes=round((totnonrev+totnonrev1+totnonrev2+totrev+totrev1+totrev2)/(double)(Cok+Cak+Cik)*10.0)/10.0;
       double tas=round((asu1+asu)/(double)Cok*10.0)/10.0;
       double tas1=round((asi1+asi)/(double)Cak*10.0)/10.0;
       double tas2=round((asa1+asa)/(double)Cik*10.0)/10.0;
       double tottas=round((asa+asi+asu+asa1+asi1+asu1)/(double)(Cok+Cak+Cik)*10.0)/10.0;
        Object rowData[][] = { { 1, "A/C days in service",Integer.toString(Cok) , Integer.toString(Cak), Integer.toString(Cik),Integer.toString(Cok+Cak+Cik)  },
                           { 2, "Flying Hours - Total", Integer.toString(totnonrev2+totrev2), Integer.toString(totnonrev1+totrev1), Integer.toString(totnonrev+totrev),Integer.toString(totnonrev+totnonrev1+totnonrev2+totrev+totrev1+totrev2) },
                           { 3, "Flying Hours - Revenue", Integer.toString(totrev2), Integer.toString(totrev1), Integer.toString(totrev),Integer.toString(totrev+totrev1+totrev2) },
                           { 4, "Flying Hours - Non Revenue", Integer.toString(totnonrev2), Integer.toString(totnonrev1), Integer.toString(totnonrev),Integer.toString(totnonrev+totnonrev1+totnonrev2) },
                           { 5, "Flying Hours per days",String.valueOf(round((totnonrev2+totrev2)/(double)Cok*10.0)/10.0),String.valueOf(round((totnonrev1+totrev1)/(double)Cak*10.0)/10.0), String.valueOf(round((totnonrev+totrev)/(double)Cik*10.0)/10.0),String.valueOf(round((totnonrev+totnonrev1+totnonrev2+totrev+totrev1+totrev2)/(double)(Cok+Cak+Cik)*10.0)/10.0)  },
                           { 6, "Cycle - Total", Integer.toString(asu+asu1), Integer.toString(asi+asi1), Integer.toString(asa+asa1), Integer.toString(asa+asi+asu+asa1+asi1+asu1) },
                           { 7, "Cycle - Revenue", Integer.toString(asu), Integer.toString(asi), Integer.toString(asa), Integer.toString(asa+asi+asu) },
                           { 8, "Cycle - Non Revenue", Integer.toString(asu1),Integer.toString(asi1), Integer.toString(asa1), Integer.toString(asa1+asi1+asu1) },
                           { 9, "Cycle per days", String.valueOf(round((asu1+asu)/(double)Cok*10.0)/10.0),String.valueOf(round((asi+asi1)/(double)Cak*10.0)/10.0), String.valueOf(round((asa+asa1)/(double)Cik*10.0)/10.0),String.valueOf(round((asa+asi+asu+asa1+asi1+asu1)/(double)(Cok+Cak+Cik)*10.0)/10.0)   },
                           { 10, "Flying hours per Cycle", String.valueOf(round(tes/tas*10.0)/10.0), String.valueOf(round(tes1/tas1*10.0)/10.0), String.valueOf(round(tes2/tas2*10.0)/10.0), String.valueOf(round(tottes/tottas*10.0)/10.0) },
                           { 11, "Technical Delays > 15 Min", Integer.toString(x) , Integer.toString(y), Integer.toString(z),Integer.toString(x+y+z)},
                           { 12, "Delay Rate/100 Rev. Cycle", String.valueOf(round(x/(double)asu*10000.0)/100.0) , String.valueOf(round(y/(double)asi*10000.0)/100.0), String.valueOf(round(z/(double)asa*10000.0)/100.0),String.valueOf(round((((x/(double)asu*100))+((y/(double)asi*100))+((z/(double)asa*100)))/3*100.0)/100.0)},
                           { 13, "Dispatch Reliability (%)", String.valueOf(round((100-(x/(double)asu*100))*100.0)/100.0) , String.valueOf(round((100-(y/(double)asi*100.0))*100.0)/100.0), String.valueOf(round((100-(z/(double)asa*100.0))*100.0)/100.0),String.valueOf(round((300-((x/(double)asu*100)+(y/(double)asi*100)+(z/(double)asa*100)))/3*100.0)/100.0)},
                           { 14, "Pilot reports (PIREPS)", Integer.toString(pir3) , Integer.toString(pir2), Integer.toString(pir1),Integer.toString(pir3+pir2+pir1) },
                           { 15, "Pirep Rate/1000 Flying Hours", "pirep", "pirep", "pirep", "pirep" },
    };
   
   if(bulan_end==12){
   bulan_akhir="December";
   }
   else if(bulan_end==11){
   bulan_akhir="November";
   }
   else if(bulan_end==10){
   bulan_akhir="October";
   }
     else if(bulan_end==9){
   bulan_akhir="September";
   }
    else if(bulan_end==8){
   bulan_akhir="August";
   }
     else if(bulan_end==7){
   bulan_akhir="July";
   }
     else if(bulan_end==6){
   bulan_akhir="Juny";
   }
     else if(bulan_end==5){
   bulan_akhir="May";
   }
     else if(bulan_end==4){
   bulan_akhir="April";
   }
     else if(bulan_end==3){
   bulan_akhir="March";
   }
     else if(bulan_end==2){
   bulan_akhir="February";
   }
     else if(bulan_end==1){
   bulan_akhir="January";
   }
   String bulan_mid=null;
   if(bulan_teng==12){
   bulan_mid="December";
   }
   else if(bulan_teng==11){
   bulan_mid="November";
   }
   else if(bulan_teng==10){
   bulan_mid="October";
   }
     else if(bulan_teng==9){
   bulan_mid="September";
   }
    else if(bulan_teng==8){
   bulan_mid="August";
   }
     else if(bulan_teng==7){
   bulan_mid="July";
   }
     else if(bulan_teng==6){
   bulan_mid="Juny";
   }
     else if(bulan_teng==5){
   bulan_mid="May";
   }
     else if(bulan_teng==4){
   bulan_mid="April";
   }
     else if(bulan_teng==3){
   bulan_mid="March";
   }
     else if(bulan_teng==2){
   bulan_mid="February";
   }
     else if(bulan_teng==1){
   bulan_mid="January";
   }
   String bulan_start=null;
   if(bulan_awal==12){
   bulan_start="December";
   }
   else if(bulan_awal==11){
   bulan_start="November";
   }
   else if(bulan_awal==10){
   bulan_start="October";
   }
     else if(bulan_awal==9){
   bulan_start="September";
   }
    else if(bulan_awal==8){
   bulan_start="August";
   }
     else if(bulan_awal==7){
   bulan_start="July";
   }
     else if(bulan_awal==6){
   bulan_start="Juny";
   }
     else if(bulan_awal==5){
   bulan_start="May";
   }
     else if(bulan_awal==4){
   bulan_start="April";
   }
     else if(bulan_awal==3){
   bulan_start="March";
   }
     else if(bulan_awal==2){
   bulan_start="February";
   }
     else if(bulan_awal==1){
   bulan_start="January";
   }
    Object columnNames[] = { "No", "Description", bulan_start+"-"+String.valueOf(year_awal), bulan_mid+"-"+String.valueOf(year_teng), bulan_akhir+"-"+String.valueOf(year),"total" };
    JTable table = new JTable(rowData, columnNames);

    
    
    JScrollPane scrollPane = new JScrollPane(table);
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.setSize(1000,300 );
    frame.setVisible(true);

    
  }
}