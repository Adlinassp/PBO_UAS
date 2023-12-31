package pkg2109106021_adlina.safa.sephia.putri;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mahasiswa extends javax.swing.JFrame {
    
    DefaultTableModel model;
    Connection con;
    Statement stat;
    ResultSet res;
    String sql;


    public mahasiswa() {
        initComponents();
        model = new DefaultTableModel ( );
        //digunakan untuk memberi heading / judul pada kolom di tabel buku
        tableMahasiswa.setModel(model); // 
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Jurusan");
        model.addColumn("Fakultas");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Email");

        getData();
        kosong();
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJK = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNIM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cbFakultas = new javax.swing.JComboBox<>();
        cbJurusan = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rdbtnLakilaki = new javax.swing.JRadioButton();
        rdbtnPerempuan = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(240, 10));

        jPanel1.setBackground(new java.awt.Color(96, 108, 93));

        jPanel2.setBackground(new java.awt.Color(255, 244, 244));
        jPanel2.setForeground(new java.awt.Color(172, 69, 83));

        txtNIM.setBackground(new java.awt.Color(247, 230, 196));
        txtNIM.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        txtNIM.setForeground(new java.awt.Color(172, 69, 83));
        txtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIMActionPerformed(evt);
            }
        });

        txtNama.setBackground(new java.awt.Color(247, 230, 196));
        txtNama.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        txtNama.setForeground(new java.awt.Color(172, 69, 83));

        cbFakultas.setBackground(new java.awt.Color(247, 230, 196));
        cbFakultas.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        cbFakultas.setForeground(new java.awt.Color(172, 69, 83));
        cbFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEKNIK", "ILMU SOSIAL DAN POLITIK ", "HUKUM", "KEDOKTERAN", "KESEHATAN MASYARAKAT" }));
        cbFakultas.setBorder(null);

        cbJurusan.setBackground(new java.awt.Color(247, 230, 196));
        cbJurusan.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        cbJurusan.setForeground(new java.awt.Color(172, 69, 83));
        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEKNIK KIMIA", "TEKNIK ELEKTRO", "INFORMATIKA", "SOSIATRI", "HUBUNGAN INTERNASIONAL", "PSIKOLOGI", "KESEHATAN MASYARAKAT", "HUKUM", "KEDOKTERAN  GIGI", "KEDOKTERAN", "FARMASI", " ", " " }));
        cbJurusan.setBorder(null);

        txtEmail.setBackground(new java.awt.Color(247, 230, 196));
        txtEmail.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(172, 69, 83));

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(172, 69, 83));
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(172, 69, 83));
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(172, 69, 83));
        jLabel4.setText("Jenis Kelamin");

        jPanel3.setBackground(new java.awt.Color(247, 230, 196));

        rdbtnLakilaki.setBackground(new java.awt.Color(247, 230, 196));
        btnJK.add(rdbtnLakilaki);
        rdbtnLakilaki.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        rdbtnLakilaki.setForeground(new java.awt.Color(172, 69, 83));
        rdbtnLakilaki.setText("Laki-Laki");
        rdbtnLakilaki.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        rdbtnPerempuan.setBackground(new java.awt.Color(247, 230, 196));
        btnJK.add(rdbtnPerempuan);
        rdbtnPerempuan.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        rdbtnPerempuan.setForeground(new java.awt.Color(172, 69, 83));
        rdbtnPerempuan.setText("Perempuan");
        rdbtnPerempuan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnLakilaki)
                    .addComponent(rdbtnPerempuan))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rdbtnLakilaki)
                .addGap(18, 18, 18)
                .addComponent(rdbtnPerempuan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(241, 195, 118));

        btnAdd.setBackground(new java.awt.Color(247, 230, 196));
        btnAdd.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(172, 69, 83));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(247, 230, 196));
        btnUpdate.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(172, 69, 83));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.setPreferredSize(new java.awt.Dimension(23, 16));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(247, 230, 196));
        btnDelete.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(172, 69, 83));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(247, 230, 196));
        btnClear.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(172, 69, 83));
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(247, 230, 196));
        btnBack.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(172, 69, 83));
        btnBack.setText("Menu");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabel6.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(172, 69, 83));
        jLabel6.setText("Email");

        jLabel8.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(172, 69, 83));
        jLabel8.setText("Fakultas");

        jLabel9.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(172, 69, 83));
        jLabel9.setText("Jurusan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFakultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(92, 92, 92)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableMahasiswa.setBackground(new java.awt.Color(247, 230, 196));
        tableMahasiswa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableMahasiswa.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        tableMahasiswa.setForeground(new java.awt.Color(185, 115, 115));
        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMahasiswa.setGridColor(new java.awt.Color(241, 195, 118));
        tableMahasiswa.setSelectionBackground(new java.awt.Color(172, 69, 83));
        tableMahasiswa.setSelectionForeground(new java.awt.Color(247, 230, 196));
        tableMahasiswa.setShowGrid(true);
        tableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMahasiswa);

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 195, 118));
        jLabel1.setText("Formulir pendaftaran ");

        jLabel5.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 195, 118));
        jLabel5.setText("Member Study Club Mahasiswa Kampus ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tak berjudul120_20230608235212.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void kosong(){
        txtNama.setText(null);
        txtNIM.setText(null);
        cbJurusan.setSelectedItem(null);
        cbFakultas.setSelectedItem(null);  
        txtEmail.setText(null);
        btnJK.clearSelection();
        rdbtnLakilaki.setSelected(false);
        rdbtnPerempuan.setSelected(false);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String jk = null;
        if (rdbtnLakilaki.isSelected()){
            jk="Laki-Laki";
        }
        else if (rdbtnPerempuan.isSelected()){
            jk="Perempuan";
        }
        
        try {
            sql = "INSERT INTO mahasiswa VALUES ('"+txtNIM.getText()+"','"+txtNama.getText()+"','"+cbJurusan.getSelectedItem()+"','"+cbFakultas.getSelectedItem()+"','"+jk+"','"+txtEmail.getText()+"')";
            stat.executeUpdate(sql);
            con=DriverManager.getConnection("jdbc:mysql://localhost/dbsistempbo", "root", "");
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            getData();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String jk = null;
        if (rdbtnLakilaki.isSelected()){
            jk="Laki-Laki";
        }
        else if (rdbtnPerempuan.isSelected()){
            jk="Perempuan";
        }
        try {
            sql ="UPDATE mahasiswa SET NIM = '"+txtNIM.getText()+"', Nama_Lengkap = '"+txtNama.getText()+"', Jurusan = '"+cbJurusan.getSelectedItem()+"', Fakultas = '"+cbFakultas.getSelectedItem()+"',Jenis_Kelamin= '"+jk+"',Email= '"+txtEmail.getText()+"' WHERE NIM = '"+txtNIM.getText()+"'";
            con=DriverManager.getConnection("jdbc:mysql://localhost/dbsistempbo", "root", "");
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        getData();
        kosong();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIMActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMahasiswaMouseClicked
        // TODO add your handling code here:

        // menampilkan data kedalam form pengisian:
        String nim =tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 0).toString();
        txtNIM.setText(nim);
        String nama = tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(),1).toString();
        txtNama.setText(nama);
        String jurusan = tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 2).toString();
        cbJurusan.setSelectedItem(jurusan);
        String fakultas = tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 3).toString();
        cbFakultas.setSelectedItem(fakultas);
     
        
     String jenisKelamin = tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 4).toString();   // ini di ganti pake field dari table misal rs.getString('jenis_kelamin') 
     if (jenisKelamin.equals("Laki-Laki")) {
          rdbtnLakilaki.setSelected(true);
          rdbtnPerempuan.setSelected(false);
     } else if (jenisKelamin.equals("Perempuan")) {
         rdbtnLakilaki.setSelected(false);
          rdbtnPerempuan.setSelected(true);
     }
        
        
        String email = tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 5).toString();
        txtEmail.setText(email);
    }//GEN-LAST:event_tableMahasiswaMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            sql ="delete from mahasiswa where nim='"+txtNIM.getText()+"'";
            con=DriverManager.getConnection("jdbc:mysql://localhost/dbsistempbo", "root", "");
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        getData();
        kosong();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed
 public void getData( ){
    
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );

     try{
           //membuat statemen untuk memanggil data table tabel_buku 
           con=DriverManager.getConnection("jdbc:mysql://localhost/dbsistempbo", "root", "");
           stat = con.createStatement();
           sql   = "Select * from mahasiswa";
           res   = stat.executeQuery(sql);
           

           //pengecekan terhadap data tabel_buku
           while(res.next ()){
                Object[] obj = new Object[6];
                obj[0] = res.getString("NIM");
                obj[1] = res.getString("Nama_Lengkap");
                obj[2] = res.getString("jurusan");
                obj[3] = res.getString("Fakultas");
                obj[4] = res.getString("Jenis_Kelamin");
                obj[5] = res.getString("Email");
                model.addRow(obj);
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
}
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
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnJK;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbFakultas;
    private javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbtnLakilaki;
    private javax.swing.JRadioButton rdbtnPerempuan;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
