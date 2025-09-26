public class InterfaceExtends implements InterfaceA, InterfaceB{
    public void walk(){
        System.out.println("Walking");
    }
    @Override
    public int time(){
        return 10;
    }
    public int area(int length, int breadth){
        return length*breadth;
    }
    // public void time(){
    //     System.out.println("Time");
    // }
    public int run(){
        return 20;
    }
}
