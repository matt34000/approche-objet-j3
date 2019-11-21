package fr.diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) {
		
		try {
		
		System.out.println(Operation.diviser(4, 7));
		}
		catch (DivException e) { 			
			System.out.println(e.getMessage());
		}

		
		try {
			
		System.out.println(Operation.diviser(4, 0));
		}
		catch (DivException e) { 			
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(Operation.diviserRuntime(4, 0));
		
		
	}

}
