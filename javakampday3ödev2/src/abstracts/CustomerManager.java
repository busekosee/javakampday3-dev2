package abstracts;

public class CustomerManager {
    public Basedatabasemanager basedatabasemanager;
    public void getcustomers() {
    	basedatabasemanager.getdata();
    }
}
