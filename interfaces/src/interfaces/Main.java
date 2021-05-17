package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new FileLogger(),new SmsLogger(),new DatabaseLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer israfil=new Customer(1,"Ýsrafil","Hallac");
		customerManager.add(israfil);
		

	}

}
