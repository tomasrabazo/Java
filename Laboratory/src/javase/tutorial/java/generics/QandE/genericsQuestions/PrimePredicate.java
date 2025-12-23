package javase.tutorial.java.generics.QandE.genericsQuestions;

public class PrimePredicate implements UnaryPredicate<Integer> {

	@Override
	public boolean test(Integer obj) {
		// TODO Auto-generated method stub
		for (int i=2;i<obj;i++)
			if (obj%i==0)
				return false;
		
		if (obj==1) return false;
		else
		return true;
	}

}
