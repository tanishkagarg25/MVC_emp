import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View {
    // View uses Swing framework to display UI to user
    private JFrame frame;
    private JLabel headingLabel;
    private JLabel EnameLabel;
    private JLabel DepartmentLabel;
    private JLabel titleLabel;
    private JLabel EmailLabel;
    private JLabel SalaryLabel;
    private JLabel QtyLabel;
    private JLabel Empt;
    private JLabel Empt1;
    private JLabel Empt2;
    private JTextField EnameTextfield;
    private JTextField DepartmentTextfield;
    private JTextField titleTextfield;
    private JTextField EmailTextfield;
    private JTextField SalaryTextfield;
    private JTextField QtyTextfield;
    private JButton SaveButton;
    private JButton View;
    private JButton Quit;

    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        headingLabel = new JLabel("Employee Database", JLabel.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headingLabel.setForeground(Color.BLUE);
        frame.getContentPane().add(headingLabel, BorderLayout.NORTH);

        // Create UI elements
        EnameLabel = new JLabel("Employee Name :");
        DepartmentLabel = new JLabel("Department :");
        titleLabel = new JLabel("title :");
        EmailLabel = new JLabel("Email :");
        SalaryLabel = new JLabel("Salary(/month) :");
        QtyLabel = new JLabel("Experience in years :");
        Empt = new JLabel("");
        Empt1 = new JLabel("");
        Empt2 = new JLabel("");
        EnameTextfield = new JTextField();
        DepartmentTextfield = new JTextField();
        titleTextfield = new JTextField();
        EmailTextfield = new JTextField();
        SalaryTextfield = new JTextField();
        QtyTextfield = new JTextField();
        SaveButton = new JButton("Save Details");
        View = new JButton("View Details");
        Quit = new JButton("Quit!");

        EnameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        DepartmentLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        EmailLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        SalaryLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        QtyLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Empt).addComponent(Empt1).addComponent(Empt2).addComponent(EnameLabel)
                        .addComponent(DepartmentLabel).addComponent(titleLabel).addComponent(EmailLabel)
                        .addComponent(SalaryLabel).addComponent(QtyLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(EnameTextfield)
                        .addComponent(DepartmentTextfield).addComponent(titleTextfield).addComponent(EmailTextfield)
                        .addComponent(SalaryTextfield).addComponent(QtyTextfield)
                        .addComponent(View)
                        .addComponent(Quit)
                        .addComponent(SaveButton)));

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Empt)
                        )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Empt1)
                        )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Empt2)
                        )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(EnameLabel)
                        .addComponent(EnameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(DepartmentLabel)
                        .addComponent(DepartmentTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(titleLabel)
                        .addComponent(titleTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(EmailLabel)
                        .addComponent(EmailTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(SalaryLabel)
                        .addComponent(SalaryTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(QtyLabel)
                        .addComponent(QtyTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(SaveButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(View))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Quit)));

        layout.linkSize(SwingConstants.HORIZONTAL, SaveButton);
        layout.linkSize(SwingConstants.HORIZONTAL, View, Quit);
        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getEnameLabel() {
        return EnameLabel;
    }

    public void setEnameLabel(JLabel EnameLabel) {
        this.EnameLabel = EnameLabel;
    }

    public JLabel getDepartmentLabel() {
        return DepartmentLabel;
    }

    public void setDepartmentLabel(JLabel DepartmentLabel) {
        this.DepartmentLabel = DepartmentLabel;
    }

    public JLabel gettitleLabel() {
        return titleLabel;
    }

    public void settitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    public JLabel getEmailLabel() {
        return EmailLabel;
    }

    public void setEmailLabel(JLabel EmailLabel) {
        this.EmailLabel = EmailLabel;
    }

    public JLabel getSalaryLabel() {
        return SalaryLabel;
    }

    public void setSalaryLabel(JLabel SalaryLabel) {
        this.SalaryLabel = SalaryLabel;
    }

    public JLabel getQtyLabel() {
        return QtyLabel;
    }

    public void setQtyLabel(JLabel QtyLabel) {
        this.QtyLabel = QtyLabel;
    }

    public JTextField getEnameTextfield() {
        return EnameTextfield;
    }

    public void setEnameTextfield(JTextField EnameTextfield) {
        this.EnameTextfield = EnameTextfield;
    }

    public JTextField getDepartmentTextfield() {
        return DepartmentTextfield;
    }

    public void setDepartmentTextfield(JTextField DepartmentTextfield) {
        this.DepartmentTextfield = DepartmentTextfield;
    }

    public JTextField gettitleTextfield() {
        return titleTextfield;
    }

    public void settitleTextfield(JTextField titleTextfield) {
        this.titleTextfield = titleTextfield;
    }

    public JTextField getEmailTextfield() {
        return EmailTextfield;
    }

    public void setEmailTextfield(JTextField EmailTextfield) {
        this.EmailTextfield = EmailTextfield;
    }

    public JTextField getSalaryTextfield() {
        return SalaryTextfield;
    }

    public void setSalaryTextfield(JTextField SalaryTextfield) {
        this.SalaryTextfield = SalaryTextfield;
    }

    public JTextField getQtyTextfield() {
        return QtyTextfield;
    }

    public void setQtyTextfield(JTextField QtyTextfield) {
        this.QtyTextfield = QtyTextfield;
    }

    public JButton getSaveButton() {
        return SaveButton;
    }

    public void setSaveButton(JButton SaveButton) {
        this.SaveButton = SaveButton;
    }

    public JButton getView() {
        return View;
    }

    public void setView(JButton View) {
        this.View = View;
    }

    public JButton getQuit() {
        return Quit;
    }

    public void setQuit(JButton Quit) {
        this.Quit = Quit;
    }
}