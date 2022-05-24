import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		Studentttttttttttttttttttttt student= new Studentttttttttttttttttttttt();
		BD bd = new BD();
		
		System.out.println("Name");
		student.setName(scanner.nextLine());
		System.out.println("Surname");
		student.setSurname(scanner.nextLine());
		System.out.println("Age");
		student.setAge(scanner.nextInt());
		

		bd.save(student);
		bd.update(student.getName(), student.getSurname(), student.getAge());
	}

}
