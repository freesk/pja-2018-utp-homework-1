package mypackage;

import java.util.ArrayList;
import java.util.List;

import mypackage.IAggregable;
import mypackage.IDeeplyCloneable;

public class Container<TElement extends IAggregable<TElement, TResult> & IDeeplyCloneable<TElement>, TResult>
		implements IContainer<TElement, TResult> {

	private List<TElement> list;

	public Container() {
		list = new ArrayList<>();
	}
	
	public void add(TElement element) {
        list.add(element);
    }

	public TResult aggregateAllElements() {
		TResult foo = null;
		for (TElement e : list) 
			foo = e.aggregate(foo);
		return foo;
	}

	public TElement cloneElementAtIndex(int index) {
		return list.get(index).deepClone();
	}

	public List<TElement> elements() {
		return list;
	}

}
