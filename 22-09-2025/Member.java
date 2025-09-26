public abstract class Member extends User{
    protected int borrowedBooksCount;
    protected int borrowedBooksLimit;
    public Member(){
        super(); // Call parent constructor
    }
    public Member(String name, String contactInfo){
        super(name,contactInfo);
    }
    @Override
    public boolean canBorrowBooks() {
        if(borrowedBooksCount >= borrowedBooksLimit) {
            return false;
        }
        return true;
    }
}
