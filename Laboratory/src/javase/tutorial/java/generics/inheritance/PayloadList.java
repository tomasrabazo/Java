package javase.tutorial.java.generics.inheritance;

import java.util.List;

public interface PayloadList<E, P> extends List<E> {
	
	void setPayload(int index, P val);

}
