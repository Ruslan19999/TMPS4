import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class BD {

	
	 public void save(Studentttttttttttttttttttttt person) {
		
		 System.out.println("Save BD: " + person.getName() + person.getSurname() + person.getAge());
	        
	    }
	 public void update( String name, String surname, int age) {
         
		 System.out.println("Update BD");

	    }
}
