/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnandRajan
 */

import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

public class RoomSchedulerFrame extends javax.swing.JFrame {

    /**
     * Creates new form RoomSchedulerFrame
     */
    public RoomSchedulerFrame() {
        initComponents();
        rebuildFacultyComboBoxes();
        rebuildDateComboBoxes();
        waitlistStatusTextArea.setVisible(false);
        reservationStatusTextArea.setVisible(false);

    }
    
    public void rebuildFacultyComboBoxes()
    {
        reserveFacultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getFacultyList().toArray()));        
    }
    
    public void rebuildDateComboBoxes()
    {
        reserveDateComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray()));        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appLabel = new javax.swing.JLabel();
        collegeLabel = new javax.swing.JLabel();
        commandPane = new javax.swing.JTabbedPane();
        addFacultyPanel = new javax.swing.JPanel();
        facultyNameLabel = new javax.swing.JLabel();
        addFacultyTextField = new javax.swing.JTextField();
        addFacultyButton = new javax.swing.JButton();
        addFacultyStatusLabel = new javax.swing.JLabel();
        reserveRoomPanel = new javax.swing.JPanel();
        facultyChooseLabel = new javax.swing.JLabel();
        dateChooseLabel = new javax.swing.JLabel();
        seatsRequiredLabel = new javax.swing.JLabel();
        reserveFacultyComboBox = new javax.swing.JComboBox<>();
        reserveDateComboBox = new javax.swing.JComboBox<>();
        reserveSeatsTextField = new javax.swing.JTextField();
        reserveSubmitButton = new javax.swing.JButton();
        reserveStatusLabel = new javax.swing.JLabel();
        reservationStatusPanel = new javax.swing.JPanel();
        reserveDateLabel = new javax.swing.JLabel();
        dateReservedStatusField = new javax.swing.JTextField();
        reserveStatusButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservationStatusTextArea = new javax.swing.JTextArea();
        waitlistStatusPanel = new javax.swing.JPanel();
        waitlistByDateBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        waitlistStatusTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        appLabel.setForeground(new java.awt.Color(138, 3, 3));
        appLabel.setText("Room Scheduler");

        collegeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        collegeLabel.setForeground(new java.awt.Color(120, 103, 243));
        collegeLabel.setText("Tiny College");

        facultyNameLabel.setText("Faculty Name:");
        facultyNameLabel.setPreferredSize(new java.awt.Dimension(77, 14));

        addFacultyTextField.setSize(new java.awt.Dimension(204, 18));
        addFacultyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyTextFieldActionPerformed(evt);
            }
        });

        addFacultyButton.setText("Submit");
        addFacultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyButtonActionPerformed(evt);
            }
        });

        addFacultyStatusLabel.setMaximumSize(new java.awt.Dimension(12, 14));
        addFacultyStatusLabel.setMinimumSize(new java.awt.Dimension(12, 14));
        addFacultyStatusLabel.setPreferredSize(new java.awt.Dimension(12, 14));

        javax.swing.GroupLayout addFacultyPanelLayout = new javax.swing.GroupLayout(addFacultyPanel);
        addFacultyPanel.setLayout(addFacultyPanelLayout);
        addFacultyPanelLayout.setHorizontalGroup(
            addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFacultyPanelLayout.createSequentialGroup()
                .addGroup(addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addFacultyPanelLayout.createSequentialGroup()
                        .addGroup(addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addFacultyPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(facultyNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addFacultyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addFacultyPanelLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(addFacultyButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(addFacultyStatusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        addFacultyPanelLayout.setVerticalGroup(
            addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFacultyPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFacultyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addFacultyButton)
                .addGap(18, 18, 18)
                .addComponent(addFacultyStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );

        commandPane.addTab("Add Faculty", addFacultyPanel);

        facultyChooseLabel.setText("Faculty: ");

        dateChooseLabel.setText("Date: ");

        seatsRequiredLabel.setText("Seats Required: ");

        reserveFacultyComboBox.setSize(new java.awt.Dimension(31, 23));

        reserveDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveDateComboBoxActionPerformed(evt);
            }
        });

        reserveSeatsTextField.setSize(new java.awt.Dimension(34, 18));

        reserveSubmitButton.setText("Submit");
        reserveSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reserveRoomPanelLayout = new javax.swing.GroupLayout(reserveRoomPanel);
        reserveRoomPanel.setLayout(reserveRoomPanelLayout);
        reserveRoomPanelLayout.setHorizontalGroup(
            reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reserveRoomPanelLayout.createSequentialGroup()
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reserveRoomPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facultyChooseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatsRequiredLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reserveSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reserveDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reserveFacultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(reserveRoomPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(reserveSubmitButton))
                    .addGroup(reserveRoomPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reserveStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        reserveRoomPanelLayout.setVerticalGroup(
            reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reserveRoomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facultyChooseLabel)
                    .addComponent(reserveFacultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooseLabel)
                    .addComponent(reserveDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatsRequiredLabel)
                    .addComponent(reserveSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(reserveSubmitButton)
                .addGap(18, 18, 18)
                .addComponent(reserveStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
        );

        commandPane.addTab("Reserve Room", reserveRoomPanel);

        reserveDateLabel.setText("Reservation Date: ");

        dateReservedStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateReservedStatusFieldActionPerformed(evt);
            }
        });

        reserveStatusButton.setText("Submit");
        reserveStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveStatusButtonActionPerformed(evt);
            }
        });

        reservationStatusTextArea.setEditable(false);
        reservationStatusTextArea.setColumns(20);
        reservationStatusTextArea.setRows(5);
        reservationStatusTextArea.setBorder(null);
        reservationStatusTextArea.setMinimumSize(new java.awt.Dimension(300, 150));
        jScrollPane2.setViewportView(reservationStatusTextArea);

        javax.swing.GroupLayout reservationStatusPanelLayout = new javax.swing.GroupLayout(reservationStatusPanel);
        reservationStatusPanel.setLayout(reservationStatusPanelLayout);
        reservationStatusPanelLayout.setHorizontalGroup(
            reservationStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reserveDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reservationStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reserveStatusButton)
                    .addComponent(dateReservedStatusField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        reservationStatusPanelLayout.setVerticalGroup(
            reservationStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reservationStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveDateLabel)
                    .addComponent(dateReservedStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reserveStatusButton)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        commandPane.addTab("Reservation Status", reservationStatusPanel);

        waitlistByDateBtn.setText("Update Waitlist Status");
        waitlistByDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitlistByDateBtnActionPerformed(evt);
            }
        });

        waitlistStatusTextArea.setEditable(false);
        waitlistStatusTextArea.setColumns(20);
        waitlistStatusTextArea.setRows(5);
        waitlistStatusTextArea.setBorder(null);
        waitlistStatusTextArea.setMinimumSize(new java.awt.Dimension(300, 150));
        jScrollPane3.setViewportView(waitlistStatusTextArea);

        javax.swing.GroupLayout waitlistStatusPanelLayout = new javax.swing.GroupLayout(waitlistStatusPanel);
        waitlistStatusPanel.setLayout(waitlistStatusPanelLayout);
        waitlistStatusPanelLayout.setHorizontalGroup(
            waitlistStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waitlistStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(waitlistStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addComponent(waitlistByDateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        waitlistStatusPanelLayout.setVerticalGroup(
            waitlistStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waitlistStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(waitlistByDateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        commandPane.addTab("Waitlist Status", waitlistStatusPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(commandPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(appLabel)
                        .addGap(182, 182, 182)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(collegeLabel)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collegeLabel)
                .addGap(33, 33, 33)
                .addComponent(commandPane)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        commandPane.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Irrelevant functions (for some reason, Netbeans prevents from deleting)
    private void addFacultyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addFacultyTextFieldActionPerformed

    private void dateReservedStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateReservedStatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateReservedStatusFieldActionPerformed

    private void reserveDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveDateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reserveDateComboBoxActionPerformed

    
    // Addition of new faculty
    private void addFacultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultyButtonActionPerformed
        // TODO add your handling code here:
        // Add the faculty to the faculty table.
        String name = addFacultyTextField.getText();
        Faculty.addFaculty(name);
        addFacultyStatusLabel.setText(name+" has been added to the Faculty.");
        addFacultyTextField.setText("");
        
        // rebuild the reservation faculty combo box.
        rebuildFacultyComboBoxes();
    }//GEN-LAST:event_addFacultyButtonActionPerformed

    
    // Reservation Submission
    private void reserveSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveSubmitButtonActionPerformed
        // TODO add your handling code here:
        String facultyName = (String)reserveFacultyComboBox.getSelectedItem();
        Date dateChosen = (Date)reserveDateComboBox.getSelectedItem();
        String seatsCount = (String)reserveSeatsTextField.getText();
        
        if (reserveFacultyComboBox.getSelectedItem() == null || reserveFacultyComboBox.getSelectedItem().equals("")){
            reserveStatusLabel.setText("There is an argument error");
            throw new IllegalArgumentException("You must pick a faculty name before making a reservation");
        }
        if (reserveDateComboBox.getSelectedItem().toString() == null || reserveDateComboBox.getSelectedItem().toString().equals("")){
            reserveStatusLabel.setText("There is an argument error");            
            throw new IllegalArgumentException("You must pick a date before making a reservation");
        }
        if (Integer.parseInt(seatsCount) <= 0 || seatsCount == null){
            reserveStatusLabel.setText("There is an argument error");
            throw new IllegalArgumentException("The number of required seats cannot be non-positive");
        }
        
        
        else{
            
            int seatsNeeded = Integer.parseInt(seatsCount);
            RoomEntry roomForFaculty = getRoom(seatsNeeded, dateChosen, RoomQueries.getRoomsList());
            
            Timestamp currTime = new Timestamp(System.currentTimeMillis());

            
            if (roomForFaculty.seats == 0){ // No rooms left, must be waitlisted
                WaitlistQueries.addWaitlistEntry(facultyName, dateChosen, seatsNeeded, currTime);
                reserveStatusLabel.setText("No rooms are available. " + facultyName + " has been placed on the waitlist.");
            }
            else{ // There are rooms available, so can be reserved
                
                ReservationQueries.addReservationEntry(facultyName, roomForFaculty.name, dateChosen, seatsNeeded, currTime);
                reserveStatusLabel.setText(facultyName+" has reserved room "+roomForFaculty.name);
                reserveSeatsTextField.setText("");
            }
        }        
        
    }//GEN-LAST:event_reserveSubmitButtonActionPerformed

    
    // Reservation Status
    private void reserveStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveStatusButtonActionPerformed
        reservationStatusTextArea.setVisible(true);
        reservationStatusTextArea.setText("");
        String dateEntered = (String)dateReservedStatusField.getText();
        
        ArrayList<ReservationEntry> reservationsList = new ArrayList<ReservationEntry>();
        reservationsList = ReservationQueries.getReservationsByDate();
        
        for (ReservationEntry entry : reservationsList) {
            if (entry.date.toString().compareTo(dateEntered) == 0){
                System.out.println(entry.faculty);
                reservationStatusTextArea.setText(reservationStatusTextArea.getText() + entry.faculty + " reserved " + entry.room + "\n");
            }
        }
    }//GEN-LAST:event_reserveStatusButtonActionPerformed

    
    // Waitlist Status
    private void waitlistByDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitlistByDateBtnActionPerformed
        waitlistStatusTextArea.setVisible(true);
        waitlistStatusTextArea.setText("");
        
        ArrayList<WaitlistEntry> waitlist = new ArrayList<WaitlistEntry>();
        waitlist = WaitlistQueries.getWaitlistByDate();
        sortWaitlist(waitlist);
        
        for (WaitlistEntry entry: waitlist){
            waitlistStatusTextArea.setText(waitlistStatusTextArea.getText() + entry.faculty + " " + entry.date + " " + + entry.seats + "\n");
        }
        
    }//GEN-LAST:event_waitlistByDateBtnActionPerformed
 
    
    
    // Sort the waitlist by date, then timestamp
    public static void sortWaitlist(ArrayList<WaitlistEntry> entries)
    {
        
        for (int i = 0; i < entries.size(); i++)
            for (int j = 0; j < entries.size() - 1; j++)
            {
                // Same date
                if (entries.get(j).date.toString().equals(entries.get(j + 1).date.toString()))
                {
                    // Now compare timestamp (left > right) then swap to put lower one on the left
                    if (entries.get(j).timestamp.after(entries.get(j + 1).timestamp))
                        java.util.Collections.swap(entries, j, j + 1);
                }
            }
        
    }
    
    
    // Checks which room should be allotted according to minimum size
    public static RoomEntry getRoom(int minSeats, Date dateOfReservation, ArrayList<RoomEntry> entries)
    {
        // System.out.println("Date: " + dateOfReservation.toString());
        
        // Get all current reservations
        ArrayList<ReservationEntry> reservations = ReservationQueries.getReservationsByDate();
        
        for (int i = 0; i < entries.size(); i++)
            for (int j = 0; j < entries.size() - 1; j++)
            {
                if (entries.get(j).seats > entries.get(j + 1).seats)
                {
                    java.util.Collections.swap(entries, j, j + 1);
                }
            }
        
        for (int i = 0; i < entries.size(); i++)
            if (entries.get(i).seats >= minSeats && !roomReserved(entries.get(i), reservations, dateOfReservation))
                return entries.get(i);
        
        // Didn't work cause all rooms are taken
        
        // Now indicate this person needs to be put on waitlist    
        return new RoomEntry("None", 0);
    }
    
    // Checks if a room is already reserved
    public static boolean roomReserved(RoomEntry room, ArrayList<ReservationEntry> reservations, Date dateOfReservation)
    {
        for (int i = 0 ; i < reservations.size(); i++)
            if (reservations.get(i).room.equals(room.name))
            {
                // System.out.println("Found room, date: " + reservations.get(i).date.toString());
                
                if (reservations.get(i).date.toString().equals(dateOfReservation.toString()))
                    return true;
                else
                    return false;
            }
        
        return false;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomSchedulerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFacultyButton;
    private javax.swing.JPanel addFacultyPanel;
    private javax.swing.JLabel addFacultyStatusLabel;
    private javax.swing.JTextField addFacultyTextField;
    private javax.swing.JLabel appLabel;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JTabbedPane commandPane;
    private javax.swing.JLabel dateChooseLabel;
    private javax.swing.JTextField dateReservedStatusField;
    private javax.swing.JLabel facultyChooseLabel;
    private javax.swing.JLabel facultyNameLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel reservationStatusPanel;
    private javax.swing.JTextArea reservationStatusTextArea;
    private javax.swing.JComboBox<String> reserveDateComboBox;
    private javax.swing.JLabel reserveDateLabel;
    private javax.swing.JComboBox<String> reserveFacultyComboBox;
    private javax.swing.JPanel reserveRoomPanel;
    private javax.swing.JTextField reserveSeatsTextField;
    private javax.swing.JButton reserveStatusButton;
    private javax.swing.JLabel reserveStatusLabel;
    private javax.swing.JButton reserveSubmitButton;
    private javax.swing.JLabel seatsRequiredLabel;
    private javax.swing.JButton waitlistByDateBtn;
    private javax.swing.JPanel waitlistStatusPanel;
    private javax.swing.JTextArea waitlistStatusTextArea;
    // End of variables declaration//GEN-END:variables
}
