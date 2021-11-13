package it.unibo.oop.lab.nesting2;
import java.util.*;

import it.unibo.oop.lab.nesting2.Acceptor.EndNotAcceptedException;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;

	public OneListAcceptable(final List<T> list) {
		this.list = list;
	}

	public Acceptor<T> acceptor() throws EndNotAcceptedException {
		final Iterator<T> it = list.iterator();
		return new Acceptor<T>() {

			public void accept(T newElement) throws ElementNotAcceptedException {
				try {
					if(newElement.equals(it.next())) {
						return;
					}
				} catch (Exception e) {
					System.out.println("No more elements");
				}
				throw new Acceptor.ElementNotAcceptedException(newElement);
			}

			public void end() throws EndNotAcceptedException {
				try {
					if(!it.hasNext()) {
						return;
					}
				} catch(Exception e) {
					System.out.println("End of list reached");
				}
				throw new EndNotAcceptedException();
			}
			
		};
	}

}
