import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.tree.DefaultMutableTreeNode;


public class DailyTask extends JFrame implements ActionListener{

    String data[][] = {};
    JButton add;
    JTextField txtfield;
    JButton delete;
    JButton editBtn;
    JButton devBtn;
    String user = "User";
    JLabel ptext2;
    JLabel name;
    JProgressBar bar = new JProgressBar();
    int totwork = 0, totdone = 0;

    String col[] = {"TASKS"};
    JTable table = new JTable(data,col);
    DefaultTableModel tableModel = new DefaultTableModel(data, col) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DailyTask(){
        System.out.println((byte)'c');

        this.setSize(800, 700);

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Daily Task");
        this.setLayout(null);
        ImageIcon img = new ImageIcon("logo.png");
        this.setIconImage(img.getImage());

        bar.setValue(0);
        bar.setStringPainted(true);

        JPanel leftCol = new JPanel();
        JLabel logo = new JLabel("Daily Tasks");
        leftCol.setBounds(0,0, 300, 660);
        leftCol.setLayout(new BorderLayout(5,10));
        leftCol.setBackground(Color.WHITE);
        logo.setFont(new Font("Snap ITC", Font.BOLD, 25));


        logo.setOpaque(true);
        logo.setForeground(Color.white);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
        leftCol.add(logo, BorderLayout.NORTH);

        JPanel leftCenter = new JPanel();
        leftCenter.setLayout(new GridLayout(3,1, 20, 20));
        name = new JLabel("Hello, " + user + " !");
        name.setFont(new Font("Tahoma", Font.PLAIN, 20));
        name.setForeground(Color.white);

        leftCenter.add(name);
        leftCenter.setBackground(new Color(0xFFFFFF));
        JPanel progressPanel = new JPanel(new GridLayout(3,1,5,5));
        JLabel ptext = new JLabel("<html><h2>Your progress</h2></html>");
        ptext2 = new JLabel("<html>Total tasks for today : " + totwork + "<br/>Total tasks have done : " + totdone + "</html>");
        ptext2.setFont(new Font("Tahoma", Font.PLAIN, 14));

        ptext.setForeground(Color.white);
        ptext2.setForeground(Color.white);


        progressPanel.add(ptext);
        progressPanel.add(bar);
        progressPanel.add(ptext2);

        leftCol.setBackground(new Color(0x000033));
        logo.setBackground(new Color(0x000033));
        leftCenter.setBackground(new Color(0x000033));

        progressPanel.setBackground(new Color(0x000033));


        leftCenter.add(progressPanel);
        leftCol.add(leftCenter, BorderLayout.CENTER);

        JPanel leftBtn = new JPanel();
        leftBtn.setLayout(new GridLayout(1, 2));
        leftBtn.setBackground(new Color(255, 255, 255));
        //leftBtn.setSize(new Dimension(100, 100));

        editBtn = new JButton("Edit Profile");
        editBtn.addActionListener(this);
        editBtn.setFocusable(false);
        editBtn.setBackground(new Color(0x000033));
        editBtn.setForeground(Color.white);

        leftBtn.add(editBtn);

        devBtn = new JButton("Developer");
        devBtn.addActionListener(this);
        devBtn.setFocusable(false);
        devBtn.setBackground(new Color(0x000033));
        devBtn.setForeground(Color.white);
        leftBtn.add(devBtn);

        leftCol.add(leftBtn, BorderLayout.SOUTH);

        this.add(leftCol);


        // Right Column
        JPanel rightCol = new JPanel();
        rightCol.setBackground(Color.WHITE);
        rightCol.setBounds(301, 0, 500, 660);
        JPanel panel = new JPanel();

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setModel(tableModel);
        table.getColumnModel().getColumn(0).setPreferredWidth(450);
        table.setRowHeight(40);
        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(0x000033));
        header.setForeground(Color.white);
        header.setFont(new Font("Tahoma", Font.BOLD, 20));
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(470, 600));
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        table.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(pane);


        rightCol.add(pane);

        JPanel rightBottom = new JPanel();
        rightBottom.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        txtfield = new JTextField();
        txtfield.setPreferredSize(new Dimension(250, 40));

        add = new JButton("Add");
        add.setFocusable(false);
        add.addActionListener(this);
        add.setBackground(new Color(0x000033));
        add.setForeground(Color.white);

        delete = new JButton("Delete");
        delete.setFocusable(false);
        delete.addActionListener(this);
        delete.setBackground(new Color(0x000033));
        delete.setForeground(Color.white);

        rightCol.add(txtfield);
        rightCol.add(add);
        rightCol.add(delete);

        this.add(rightCol);
        this.getContentPane().setBackground(new Color(0, 0, 0));

        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add) {
            if(txtfield.getText().trim().length() > 0) {
                tableModel.addRow(new Object[] {txtfield.getText()});
                txtfield.setText("");
                totwork++;
                int y = totdone*100/Math.max(totwork, 1);
                bar.setValue(y);
                ptext2.setText("<html>Total tasks for today : " + totwork + "<br/>Total tasks have done : " + totdone + "</html>");
            } else {
                txtfield.setText("");
                JOptionPane.showMessageDialog(null, "The task field is empty.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == delete) {
            if(table.getSelectedRow() != -1) {
                int chk = JOptionPane.showConfirmDialog(null, "Are you want to delete the task \"" + table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()) + "\" ?");
                if(chk==0) {
                    tableModel.removeRow(table.getSelectedRow());
                    totdone++;
                    bar.setValue(totdone*100/totwork);
                    ptext2.setText("<html>Total tasks for today : " + totwork + "<br/>Total tasks have done : " + totdone + "</html>");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select the task first.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == editBtn) {
            user = JOptionPane.showInputDialog("Name");
            if(user != null && user.trim().length() > 0)
                name.setText("Hello, " + user + "!");
        }
        if(e.getSource() == devBtn) {
            JOptionPane.showMessageDialog(null, "Mohammad Borhan Uddin (ASH2101008M)\nShahadat Hossain (ASH2101034M)", "Developed by", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}