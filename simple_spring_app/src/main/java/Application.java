import com.krishna.service.CustomerService;
import com.krishna.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImpl();
		
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
