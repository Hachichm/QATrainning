package Library;

public class Customer extends Person{

    int memeberID;

    public Customer(String name, int age) {
        super(name, age);
        this.memeberID = memeberID;
    }

    public int getMemeberID() {
        return memeberID;
    }

    public void setMemeberID(int memeberID) {
        this.memeberID = memeberID;
    }
}
