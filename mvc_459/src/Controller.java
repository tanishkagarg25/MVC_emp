import javax.swing.JOptionPane;
public class Controller {
    private Model model;
    private View view;
    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
    }
    public void initView() {
        view.getEnameTextfield().setText(model.getEname());
        view.getDepartmentTextfield().setText(model.getDepartment());
        view.gettitleTextfield().setText(model.gettitle());
        view.getEmailTextfield().setText(model.getEmail());
        view.getSalaryTextfield().setText(String.valueOf(model.getSalary()));
        view.getQtyTextfield().setText(String.valueOf(model.getExperience()));
    }
    public void initController() {
        view.getSaveButton().addActionListener(e -> saveName());
        view.getView().addActionListener(e -> sayView());
        view.getQuit().addActionListener(e -> sayQuit());
    }
    private void saveName() {
        model.setEname(view.getEnameTextfield().getText());
        model.setDepartment(view.getDepartmentTextfield().getText());
        model.settitle(view.gettitleTextfield().getText());
        model.setEmail(view.getEmailTextfield().getText());
        model.setSalary(Double.valueOf(view.getSalaryTextfield().getText()));
        model.setExperience(Integer.valueOf(view.getQtyTextfield().getText()));
        int code = model.actionPerformed(view.getEnameTextfield().getText(),
                view.getDepartmentTextfield().getText(),
                view.gettitleTextfield().getText(), view.getEmailTextfield().getText(),
                Double.valueOf(view.getSalaryTextfield().getText()),
                Integer.valueOf(view.getQtyTextfield().getText()));

        // int code = 1;
        if (code == 1) {
            JOptionPane.showMessageDialog(null,
                    "Succesfully saved details",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Registration Unsuccessful",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void sayView() {
        JOptionPane.showMessageDialog(null,
                "Employee Name : " + model.getEname() + "\nDepartment : " + model.getDepartment()
                        + "\ntitle : " + model.gettitle()
                        + "\nEmail : " + model.getEmail()
                        + "\nSalary : " + String.valueOf(model.getSalary())
                        + "\nExperience in years : " + String.valueOf(model.getExperience()),
                "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void sayQuit() {
        System.exit(0);
    }
}