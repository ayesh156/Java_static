class B {

	static{
		System.out.println("B block 1");
	}
}

class A extends B {

	static{
		System.out.println("A block 1");
	}

	static{
		System.out.println("A block 2");
	}

	public static void main(String[] args){

		System.out.println("main");

	}

	static{
		System.out.println("A block 3");
	}

}