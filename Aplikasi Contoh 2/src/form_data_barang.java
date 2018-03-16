import java.awt.BorderLayout;
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
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class form_data_barang extends javax.swing.JFrame {

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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b_Simpan = new javax.swing.JButton();
        b_Simpan1 = new javax.swing.JButton();
        c_bln = new javax.swing.JComboBox<>();
        c_bln1 = new javax.swing.JComboBox<>();
        c_thn = new javax.swing.JComboBox<>();
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

        jLabel5.setText("Tanggal awal");

        jLabel6.setText("Tanggal akhir");

        b_Simpan.setText("Cari");
        b_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_SimpanActionPerformed(evt);
            }
        });

        b_Simpan1.setText("Download PDF");
        b_Simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Simpan1ActionPerformed(evt);
            }
        });

        c_bln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        c_bln1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        c_thn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2019", "2018", "2017", "2016", "2015", "2014", "2013" }));
        c_thn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_thnActionPerformed(evt);
            }
        });

        c_thn1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2019", "2018", "2017", "2016", "2015", "2014", "2013" }));

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(c_thn1, 0, 68, Short.MAX_VALUE)
                                    .addComponent(c_thn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_Simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_bln, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_bln1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ACreg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACreg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(c_bln1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_thn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Simpan)
                    .addComponent(b_Simpan1))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void b_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_SimpanActionPerformed

    }//GEN-LAST:event_b_SimpanActionPerformed

    private void b_Simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Simpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_Simpan1ActionPerformed

    private void b_Simpan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Simpan5ActionPerformed
        DefaultCategoryDataset piedata=new DefaultCategoryDataset();
        piedata.setValue(1, "lion", "Tires and weels");
        piedata.setValue(2, "lion", "Apu indicating System");
        piedata.setValue(8, "warna", "taxi and runway turn off lights");
        piedata.setValue(1, "warna", "exhaust Gas temperature indicating");
        piedata.setValue(4, "warna", "Flight data recorder (FDR)");
        piedata.setValue(5, "warna", "Ignition Exceter");
        piedata.setValue(4, "warna", "Flight data recorder (FDR)");
        piedata.setValue(7, "warna", "Zone Temperature Control and Indication");
        piedata.setValue(5, "warna", "Traffic Alert and Collision Avoidance System (TCAS)");

        JFreeChart chart =ChartFactory.createBarChart("Judul","xxx", "yyy", piedata);
        ChartFrame frame =new ChartFrame ("framechart",chart);
        frame.setVisible(true);
        frame.setBounds(900, 200, 500, 500);
        // TODO add your handling code here:
    }//GEN-LAST:event_b_Simpan5ActionPerformed

    private void b_Simpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Simpan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_Simpan2ActionPerformed

    private void c_thnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_thnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_thnActionPerformed

    private void pirepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirepActionPerformed
tampil_barang() ;  
        
     
    }//GEN-LAST:event_pirepActionPerformed

    private void OSbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSbuttonActionPerformed
       OS() ; 
    // TODO add your handling code here:
    }//GEN-LAST:event_OSbuttonActionPerformed

    private void ACregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACregActionPerformed

    private void ACregItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ACregItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ACregItemStateChanged
    
    
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
    private javax.swing.JButton b_Simpan;
    private javax.swing.JButton b_Simpan1;
    private javax.swing.JButton b_Simpan2;
    private javax.swing.JButton b_Simpan5;
    private javax.swing.JComboBox<String> c_bln;
    private javax.swing.JComboBox<String> c_bln1;
    private javax.swing.JComboBox<String> c_thn;
    private javax.swing.JComboBox<String> c_thn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
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
     int Cok = 0,Cak = 0,Cik = 0 ;  
     JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String sql = "SELECT count(DISTINCT flight_date) as jumlah FROM revenue_data where aaaa=\"PK-LAJ\" and month(flight_date)=10 and year(flight_date)=2015";
         String sql1 = "SELECT count(DISTINCT flight_date) as jumlah FROM revenue_data where aaaa=\"PK-LAJ\" and month(flight_date)=11 and year(flight_date)=2015";
         String sql2 = "SELECT count(DISTINCT flight_date) as jumlah FROM revenue_data where aaaa=\"PK-LAJ\" and month(flight_date)=12 and year(flight_date)=2015";
        Connection koneksi = new koneksi().getConnection();
        Connection koneksi1 = new koneksi().getConnection();
        Connection koneksi2 = new koneksi().getConnection();
        try {
            Statement stat = koneksi.createStatement();
            Statement stat1 = koneksi1.createStatement();
            Statement stat2 = koneksi2.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            ResultSet hasil1 = stat1.executeQuery(sql1);
            ResultSet hasil2 = stat2.executeQuery(sql2);
            while (hasil.next()) {
            Cok = hasil.getInt(1);
            } 
            while (hasil1.next()) {
           Cak = hasil1.getInt(1);
            } 
            while (hasil2.next()) {
            Cik = hasil2.getInt(1);
           } 
            koneksi.close();
            koneksi1.close();
            koneksi2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
       
        Object rowData[][] = { { 1, "A/C days in service",Integer.toString(Cok) , Integer.toString(Cak), Integer.toString(Cik),Integer.toString(Cok+Cak+Cik)  },
                           { 2, "Flying Hours - Total", "", "", "", "" },
                           { 3, "Flying Hours - Revenue", "", "", "", "" },
                           { 4, "Flying Hours - Non Revenue", "", "", "", "" },
                           { 5, "Flying Hours per days", "", "", "", "" },
                           { 7, "Cycle - Total", "", "", "", "" },
                           { 8, "Cycle - Non Revenue", "", "", "", "" },
                           { 9, "Cycle per days", "", "", "", "" },
                           { 10, "Flying hours per Cycle", "", "", "", "" },
                           { 11, "Technical Delays > 15 Min", "", "", "", "" },
                           { 12, "Delay Rate/100 Rev. Cycle", "", "", "", "" },
                           { 13, "Dispatch Reliability (%)", "", "", "", "" },
                           { 14, "Pilot reports (PIREPS)", "", "", "", "" },
                           { 15, "Pirep Rate/1000 Flying Hours", "", "", "", "" },
    };
    
    Object columnNames[] = { "No", "Description", "oktober-15", "november-15", "december-15","total" };
    JTable table = new JTable(rowData, columnNames);

    
    
    JScrollPane scrollPane = new JScrollPane(table);
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.setSize(1000,300 );
    frame.setVisible(true);

    
  }
}