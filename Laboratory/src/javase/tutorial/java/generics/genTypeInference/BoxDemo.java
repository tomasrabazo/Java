package javase.tutorial.java.generics.genTypeInference;


/*
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
*/
public class BoxDemo {

	public static <U> void addBox(U u, java.util.List<Box<U>> boxes){
		
		Box<U> box = new Box<>();
		box.set(u);
		boxes.add(box);
	}
	
	public static <U> void outputBoxes(java.util.List<Box<U>> boxes){
		
		int counter = 0;
		for (Box<U> box: boxes){
			U boxContents = box.get();
			System.out.println("Box #" + counter + " contains [" + boxContents.toString() + "]");
			counter++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<Box<Integer>> listIntegerBox = new java.util.ArrayList<Box<Integer>>();
		BoxDemo.<Integer>addBox(Integer.valueOf(10), listIntegerBox);
		BoxDemo.addBox(Integer.valueOf(20), listIntegerBox);
		BoxDemo.addBox(Integer.valueOf(30), listIntegerBox);
		
		BoxDemo.outputBoxes(listIntegerBox);
	}

}
