import entity.Customer;
import entity.CustomerDetails;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToOne_Test {
    public static void main(String[] args) {
        Session session = util.SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // Customer and Customer Detail relationship

        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setPhoneNum("0771234578");
        customerDetails.setAge(18);

        Customer customer = new Customer();
        customer.setName("Wimal");
        customer.setAddress("Colombo");

        customerDetails.setCustomer(customer);

        session.save(customer);
        session.save(customerDetails);

        transaction.commit();
        session.close();
    }
}
