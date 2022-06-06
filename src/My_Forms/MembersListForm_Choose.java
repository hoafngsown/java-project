package My_Forms;

import My_Classes.User;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javaswingdev.form.ThanhTraCH;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class MembersListForm_Choose extends javax.swing.JFrame {

    /**
     * Creates new form MembersListForm
     */
    My_Classes.User member = new My_Classes.User();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    
    public String formType = "";

    public MembersListForm_Choose() {
        initComponents();
        this.setLocationRelativeTo(null);

        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(255, 153, 153));
        jPanel1.setBorder(panelHeaderBorder);

        //display image        
        func.displayImage(100, 100, null, "/My_Images/icons8_list_100px_1.png", jLabel_Form_Title);

        //custon the table
        func.customTable(jTable_Members_);

        //custom the headertable
        func.customTableHeader(jTable_Members_, new Color(199, 21, 133), 14);

        //border the image
        Border JlaBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Image1.setBorder(JlaBorder);

        //add a default image
        func.displayImage(237, 170, null, "/My_Images/icons8_male_user_100px.png", jLabel_Image1);

        //display the infor on table
        populateJtableWithMember("");
    }

    public MembersListForm_Choose(JTextField jTextField_CuaHang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jLabel_MemberID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Members_ = new javax.swing.JTable();
        jButton_Search = new javax.swing.JButton();
        jLabel_Image1 = new javax.swing.JLabel();
        jLabel_FullName = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jButton_SelectMember = new javax.swing.JButton();

        jLabel_Image.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(255, 153, 153));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("Members List");
        jLabel_Form_Title.setOpaque(true);

        jLabel_Close.setBackground(new java.awt.Color(255, 153, 153));
        jLabel_Close.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.setOpaque(true);
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_MemberID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MemberID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MemberID.setText("Values To Search:");

        jTable_Members_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Members_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Members_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Members_);

        jButton_Search.setBackground(new java.awt.Color(0, 153, 102));
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jLabel_Image1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image1.setOpaque(true);

        jLabel_FullName.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_FullName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_FullName.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_FullName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_FullName.setText("Full Name:");
        jLabel_FullName.setOpaque(true);

        jLabel_Phone.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_Phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Phone.setText("Phone:");
        jLabel_Phone.setOpaque(true);

        jLabel_Gender.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Gender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Gender.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_Gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Gender.setText("Gender:");
        jLabel_Gender.setOpaque(true);

        jLabel_Email.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Email.setText("Emai:");
        jLabel_Email.setOpaque(true);

        jButton_SelectMember.setBackground(new java.awt.Color(102, 69, 142));
        jButton_SelectMember.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_SelectMember.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SelectMember.setText("Select Member");
        jButton_SelectMember.setToolTipText("");
        jButton_SelectMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_MemberID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Image1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jLabel_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_FullName)
                            .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton_SelectMember, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_MemberID)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_FullName)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Phone)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Email)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Gender)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton_SelectMember, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_Search, jTextField_Search});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateJtableWithMember(String query) {

                ArrayList<My_Classes.User> memberList = member.membersList(query);

        //jtable collums
        String[] colNames = {"ID", "Họ Tên", "Email", "Số ĐT", "Quê Quán", "Giới Tính","Role"};
        //jtable row
        Object[][] rows = new Object[memberList.size()][colNames.length];
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        for (int i = 0; i < memberList.size(); i++) {
            
            rows[i][0] = memberList.get(i).getId();
            rows[i][1] = memberList.get(i).getFullname();
            rows[i][2] = memberList.get(i).getEmail();
            rows[i][3] = memberList.get(i).getPhone();
           rows[i][4] = memberList.get(i).getCountry();
            if(func.checkGender(Integer.parseInt(memberList.get(i).getGender()))) {
                   rows[i][5] = "Nam";
            }
            else {
                    rows[i][5] = "Nu~";
            }
            rows[i][6] = memberList.get(i).getRole().toUpperCase();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Members_.setModel(model);
    }


    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        //search and display the data on the table
        String value = jTextField_Search.getText();
        String query = "SELECT * FROM `user` WHERE `Role` = " + "'user'" + " AND `TenNguoiDung` LIKE '%" + value + "%' OR `TenNguoiDung` LIKE '%text%'";
        populateJtableWithMember(query);
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jTable_Members_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Members_MouseClicked
       //display the member on the table to the textfield
        //get member ID
        User selectedmMember;
        try {
            //search member by ID and print infor 
            Integer rowIndex = jTable_Members_.getSelectedRow();    //get the selected row index
            //get the member id from the jtable(the id is the first column [0] )
            Integer id = Integer.parseInt(jTable_Members_.getModel().getValueAt(rowIndex, 0).toString());

            selectedmMember = member.getMemberById(id);

            if (selectedmMember != null) {
                jLabel_FullName.setText(selectedmMember.getFullname());
                jLabel_Phone.setText(selectedmMember.getPhone());
                jLabel_Email.setText(selectedmMember.getEmail());
                jLabel_Gender.setText(selectedmMember.getGender());
                if(func.checkGender(Integer.parseInt(selectedmMember.getGender()))) {
                    jLabel_Gender.setText("Nam");
            }
            else {
                    jLabel_Gender.setText("Nu~");
            }
//                jLabel_Country.setText(selectedmMember.getCountry());
                //display image:
                byte[] image = selectedmMember.getPicture();
                //we will display the image using the imagebyte
                //so we will made the image path null
                func.displayImage(237, 170, image, "", jLabel_Image1);
            } else {
                JOptionPane.showMessageDialog(null, "No Member With This ID Found", "invalid id member", 2);
            }

        } catch (SQLException | NumberFormatException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter a valid Member ID", "invalid id member", 3);
        }
    }//GEN-LAST:event_jTable_Members_MouseClicked

    private void jButton_SelectMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectMemberActionPerformed
        //display the selected author
        //get the selected row index
        int index = jTable_Members_.getSelectedRow();

        //get values
        int id = Integer.parseInt(jTable_Members_.getValueAt(index, 0).toString());
        String firstName = jTable_Members_.getValueAt(index, 1).toString();
      

        ThanhTraCH.displayMemberData(id, firstName);
         

        this.dispose();
    }//GEN-LAST:event_jButton_SelectMemberActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_SelectMember;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_FullName;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Image1;
    private javax.swing.JLabel jLabel_MemberID;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Members_;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
