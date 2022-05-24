
public class Main {

	public static void main(String[] args) {

		Car car = new BMW();
		
		System.out.println("Название: " + car.getName() + "Цена: " + car.getPrice());
		
		car = new Audi();
		System.out.println("Название: " + car.getName() + "Цена: " + car.getPrice());


	}

}
