public class App {
    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        Model m = new Model("", "", "", "", 0, 0);
        View v = new View("Employee Database MVC - PES1UG20CS459");
        Controller c = new Controller(m, v);
        c.initController();
    }
}