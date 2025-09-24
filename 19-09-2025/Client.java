public class Client {
    public static void main(String[] args){
        // PolymorphismParent p = new PolymorphismParent();
        // p.name = "Naveen";
        // p.login();
        // p.getName();

        // PolymorphismChild c = new PolymorphismChild();
        // c.psp = 9.5f;
        // c.login();
        // c.getPsp();

        PolymorphismParent c1 = new PolymorphismChild();
        c1.name = "Naveen";
        // c1.psp = 9.5f; // Not allowed
        // c1.login(c1.name); // not allowed
        int x = c1.login(300);
        System.out.println("X: "+x);
        c1.login(c1.age); // allowed
        c1.getName(); // 
        // c1.getpsp(); // Not allowed
    }
}
