import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class Model {
    private String Ename;
    private String Department;
    private String title;
    private String Email;
    private double Salary;
    private int Experience;

    public Model(String Ename, String Department, String title, String Email, double Salary, int Experience) {
        this.Ename = Ename;
        this.Department = Department;
        this.title = title;
        this.Email = Email;
        this.Salary = Salary;
        this.Experience = Experience;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String Ename) {
        this.Ename = Ename;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    public int actionPerformed(String Ename, String Department, String title, String Email, double Salary,
            int Experience) {
        int code = 1;
        String Name = Ename;
        String A = Department;
        String Title = title;
        String Cat = Email;
        double P = Salary;
        int qty = Experience;
        String ecc = "peace";

        if (qty <= 0) {
            code = 0;
            ecc = "Invalid experience";
            return code;
        }
        
        if (P <= 0.0) {
            code = 0;
            ecc = "Invalid Salary";
            return code;
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ps", "root",
                    "");
            System.out.println('1');
            String sqlCreate = "CREATE TABLE IF NOT EXISTS" + " emp" 
            + "  (Ename           VARCHAR(250),"
            + "   Department          VARCHAR(250),"
            + "   Title          VARCHAR(250),"
            + "   Email           VARCHAR(250),"
            + "   Salary              double  ,"
            + "   Experience     INTEGER)";
            Statement stmt = connection.createStatement();
            stmt.execute(sqlCreate);
            String query = "INSERT INTO emp(Ename, Department, Title, Email, Salary, Experience)" +  "values(?,?,?,?,?,?)";
            System.out.println('2');
            
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            System.out.println('3');
            preparedStmt.setString(1, Name);
            preparedStmt.setString(2, A);
            preparedStmt.setString(3, Title);
            preparedStmt.setString(4, Cat);
            preparedStmt.setDouble(5, P);
            preparedStmt.setInt(6, qty);
            System.out.println('4');
            if (connection.isValid(5)) {
                System.out.println("Database connection successful#################################");
            } else {
                System.out.println("Database connection failed");
            }
            int x = preparedStmt.executeUpdate();
            System.out.println(x);
            connection.close();
            
            
            if (x == 0) {
                code = 0;
                ecc = "Already exists";
                return code;
            } else {
                code = 1;
            }
        } catch (Exception exception) {
            System.out.println("Database connection failed");
            exception.printStackTrace();
        }
        System.out.println(ecc);
        return code;
    }
}