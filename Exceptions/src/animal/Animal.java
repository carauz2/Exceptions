package animal;

public interface Animal { 

	default String getName() {
		return "This animal is unknown!";
	};
	
}