package entity;

import javax.persistence.*;

@Entity
public class CustomerDetails {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int bookID;
    private String phoneNum;
    private int age;

    @OneToOne
    private Customer customer;

    public CustomerDetails() {
    }

    public CustomerDetails(int bookID, String phoneNum, int age) {
        this.bookID = bookID;
        this.phoneNum = phoneNum;
        this.age = age;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "bookID=" + bookID +
                ", phoneNum='" + phoneNum + '\'' +
                ", age=" + age +
                '}';
    }
}
