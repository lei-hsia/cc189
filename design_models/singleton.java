

// simplest way to implement singleton:
/*
	1. declare a variable
	2. private constructor
	3. return the only instance method
	*/
public class Singleton{

	// declare variable static, one class has only one variable
	private static Singleton _instance = null;

	// constructor: private, so no others can create another instance
	private Singleton(){};

	// CANNOT change this method name
	public static Singleton getInstance(){
		if(_instance == null){
			_instance = new Singleton();
		}

		return _instance;
	}
}