/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticketOrder;

import java.sql.*;
import java.text.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class orderForm extends javax.swing.JFrame {

    /**
     * Creates new form orderForm
     */
    public orderForm() {
        initComponents();
        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbTipe = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtKuantitas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        lblKeterangan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sistem Pemesanan Tiket");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tanggal");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipe Tiket");

        jcbTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Fast Track", "Regular" }));
        jcbTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Kuantitas");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Harga per Tiket");

        txtHarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtHarga.setForeground(new java.awt.Color(0, 0, 0));
        txtHarga.setText("Rp. 0");

        btnTambah.setBackground(new java.awt.Color(153, 153, 153));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(153, 153, 153));
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(153, 153, 153));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nama", "Tanggal", "Tipe", "Kuantitas", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        lblKeterangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKeterangan.setForeground(new java.awt.Color(0, 0, 0));
        lblKeterangan.setText("Keterangan:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama)
                                    .addComponent(jcbTipe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(txtKuantitas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtKuantitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHarga))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblKeterangan))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipeActionPerformed
        String selectedTipe = jcbTipe.getSelectedItem().toString();
        ticket selectedTicket;
        
        if(selectedTipe.equalsIgnoreCase("Fast Track")){
            selectedTicket = new fastTrack("Fast Track", 500000, "Antrian yang lebih singkat, Akses Prioritas, Peluang untuk mengunjungi banyak wahana");
            lblKeterangan.setText("Benefit: "+((fastTrack)selectedTicket).getBenefit());
            txtHarga.setText("Rp. "+(int)selectedTicket.getPrice());
        } else if (selectedTipe.equalsIgnoreCase("Regular")){
            selectedTicket = new regular("Regular", 200000, 50);
            lblKeterangan.setText("Kouta: "+((regular)selectedTicket).getKouta());
            txtHarga.setText("Rp. "+(int)selectedTicket.getPrice());
        } else {
            lblKeterangan.setText("Silakan pilih tipe tiket yang ingin Anda beli.");
            txtHarga.setText("Rp. 0");
        }
    }//GEN-LAST:event_jcbTipeActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String nama = txtNama.getText().trim();
        String tanggal = txtTanggal.getText().trim();
        String tipeTiket = jcbTipe.getSelectedItem().toString();
        String kuantitasStr = txtKuantitas.getText().trim();
        
        if (nama.isEmpty() || tanggal.isEmpty() || tipeTiket.isEmpty() || kuantitasStr.isEmpty()){
            JOptionPane.showMessageDialog(this, "Mohon untuk mengisi semua kolom yang tersedia.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int kuantitas;
        try {
            kuantitas = Integer.parseInt(kuantitasStr);
            if (kuantitas <= 0){
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Silakan isi kembali kuantitas yang Anda inginkan dengan menggunakan angka.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!validateDate(tanggal)){
            JOptionPane.showMessageDialog(this, "Mohon mengisi format tanggal dengan benar menggunakan format dd-mm-yyyy agar sesuai.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int totalHarga = (int)calculatePrice(tipeTiket, kuantitas);

        String mysqlTanggal = convertToMySQLDate(tanggal);
        try (Connection conn = dbConnection.getConnection()) {
                String query = "INSERT INTO orders (custName, date, ticketType, quantity, price) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement ps = conn.prepareStatement(query)) {
                    ps.setString(1, nama);
                    ps.setString(2, mysqlTanggal);
                    ps.setString(3, tipeTiket);
                    ps.setInt(4, kuantitas);
                    ps.setDouble(5, totalHarga);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data Anda telah berhasil ditambahkan! Terima kasih.");
                    loadTableData();
                    clearForm();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Penambahan data gagal. Pesan error: " + ex.getMessage());
            }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Silakan pilih data yang ingin Anda ubah untuk melanjutkan.");
            return;
        }
        
        String nama = txtNama.getText().trim();
        String tanggal = txtTanggal.getText().trim();
        String tipeTiket = jcbTipe.getSelectedItem().toString();
        String kuantitasStr = txtKuantitas.getText().trim();
        
        if (nama.isEmpty() || tanggal.isEmpty() || tipeTiket.isEmpty() || kuantitasStr.isEmpty()){
            JOptionPane.showMessageDialog(this, "Mohon untuk mengisi semua kolom yang tersedia.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int kuantitas;
        try {
            kuantitas = Integer.parseInt(kuantitasStr);
            if (kuantitas <= 0){
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Silakan isi kembali kuantitas yang Anda inginkan dengan menggunakan angka.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!validateDate(tanggal)){
            JOptionPane.showMessageDialog(this, "Mohon mengisi format tanggal dengan benar menggunakan format dd-mm-yyyy agar sesuai.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String orderID = tblData.getValueAt(selectedRow, 0).toString();
        
        int totalHarga = (int)calculatePrice(tipeTiket, kuantitas);
        
        String mysqlTanggal = convertToMySQLDate(tanggal);
        try (Connection conn = dbConnection.getConnection()) {
                String query = "UPDATE orders SET custName = ?, date = ?, ticketType = ?, quantity = ?, price = ? WHERE id = ?";
                try (PreparedStatement ps = conn.prepareStatement(query)) {
                    ps.setString(1, nama);
                    ps.setString(2, mysqlTanggal);
                    ps.setString(3, tipeTiket);
                    ps.setInt(4, kuantitas);
                    ps.setInt(5, totalHarga);
                    ps.setString(6, orderID);
                    
                    int updatedRows = ps.executeUpdate();
                    if (updatedRows > 0){
                        JOptionPane.showMessageDialog(this, "Data Anda telah berhasil diubah! Terima kasih.");
                        loadTableData();
                        clearForm();
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal mengubah data. Silakan coba lagi.");
                    }
                    
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Pengubahan data gagal. Pesan error: " + ex.getMessage());
                
            }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Silakan pilih data yang ingin Anda hapus untuk melanjutkan.");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION){
            return;
        }
        
        String selectedID = tblData.getValueAt(selectedRow, 0).toString();
        
        try (Connection conn = dbConnection.getConnection()){
            String query = "DELETE FROM orders WHERE id = ?";
            try(PreparedStatement ps = conn.prepareStatement(query)){
                ps.setString(1, selectedID);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data telah berhasil dihapus dari sistem.");
                loadTableData();
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "Penghapusan data gagal. Pesan error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(orderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipe;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JTable tblData;
    private javax.swing.JLabel txtHarga;
    private javax.swing.JTextField txtKuantitas;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables

    private double calculatePrice(String tipeTiket, int kuantitas){
        ticket selectedTicket;
        if(tipeTiket.equalsIgnoreCase("Fast Track")){
            selectedTicket = new fastTrack("Fast Track", 500000, "Antrian yang lebih singkat, Akses Prioritas, Peluang untuk mengunjungi banyak wahana");
        } else {
            selectedTicket = new regular ("Regular", 200000, 50);
        }
        return selectedTicket.getPrice()*kuantitas;
    }
    
    private boolean validateDate(String tanggal) {
        return tanggal.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    private String convertToMySQLDate(String tanggal) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat mysqlFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            java.util.Date date = inputFormat.parse(tanggal);
            return mysqlFormat.format(date);
        } catch (ParseException e) {
            return null;
        }
    }

    private void loadTableData() {
    
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);

        String query = "SELECT * FROM orders";

        try (Connection con = dbConnection.getConnection();
         
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {

        while (rs.next()) {
            int id = rs.getInt("id");
            String nama = rs.getString("custName");
            String tanggal = rs.getString("date");
            String tipeTiket = rs.getString("ticketType");
            int kuantitas = rs.getInt("quantity");
            int harga = rs.getInt("price");

            model.addRow(new Object[]{id, nama, tanggal, tipeTiket, kuantitas, harga});
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Pemuatan data dari database gagal. Pesan error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void clearForm() {
        txtNama.setText("");
        txtTanggal.setText("");
        jcbTipe.setSelectedIndex(0);
        txtKuantitas.setText("");
        txtHarga.setText("Rp 0");
    }

}
