package Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {

	public void listiteration() {
		List<Integer> inside = new LinkedList<Integer>();
		List<List<Integer>> mainList = new LinkedList<List<Integer>>();

		inside.add(2);
		mainList.add(new LinkedList(inside));
		inside.clear();
		inside.add(3);
		inside.add(4);
		mainList.add(new LinkedList(inside));
		inside.clear();
		inside.add(6);
		inside.add(5);
		inside.add(7);
		mainList.add(new LinkedList(inside));
		inside.clear();
		inside.add(4);
		inside.add(1);
		inside.add(8);
		inside.add(3);
		mainList.add(new LinkedList(inside));
		inside.clear();
		System.out.println(mainList.size());
		System.out.println(mainList.get(0).get(0));
		Iterator<List<Integer>> itr1 = mainList.iterator();
		while (itr1.hasNext()) {
			int i=0;//System.out.println(itr1.next());
			Iterator<Integer> itr2 = itr1.next().iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next()+" "+i);
				++i;
			}
		}

	}

	public static void main(String[] args) {
		ListIterator itr = new ListIterator();
		itr.listiteration();

	}

}
