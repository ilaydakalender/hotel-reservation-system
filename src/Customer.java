public class Customer {
    private int customerId;
    private String fullName;
    private String phoneNumber;
    public Customer(int customerId, String fullName, String phoneNumber){
        this.customerId = customerId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }
    public int getCustomerId(){
        return customerId;
    }
    public String getFullName(){
        return fullName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
