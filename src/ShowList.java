import java.util.NoSuchElementException;

public class ShowList {

	// b)
	private ShowNode head;		// probably not the right type
	// c)
	private int size;

	// d) default constructor
	public ShowList() {
		head = null;
	}

	// e) copy constructor
	public ShowList(ShowList obj) {
		this.head = obj.head;
		this.size = obj.size;
	}

	// f) addToStart method
	public void addToStart(TVShow obj) {
		head = new ShowNode(obj, head);
	}

	// g) insertAtIndex method
	public void insertAtIndex(TVShow obj, int i) {
		if (i < 0 || i > (size - 1)) {
			throw new NoSuchElementException("There is no such index"); 		// a reviser
		}
		else if (i == 0) {
			ShowNode newNode = new ShowNode(obj, null);
			newNode.pointer = head;
			head = newNode;
			size++;
		}
		else {
			ShowNode newNode = new ShowNode(obj, null);
			ShowNode previous = head;
			int count = 0;
			while (count < i - 1) {
				previous = previous.pointer;
				count++;
			}
			ShowNode current = previous.pointer;
			newNode.pointer = current;
			previous.pointer = newNode;
			size++;
		}	
	}
	
	// h) deleteFromIndex method
	public void deleteFromIndex(int i) {
		if (i < 0 || i > (size - 1)) {
			throw new NoSuchElementException("There is no such index"); 		// a reviser
		}
		else if(i == 0) {
			deleteFromStart();
		}
		else {
			ShowNode previous = head;
			int count = 0;
			while (count < (i - 1)) {
				previous = previous.pointer;
				count++;
			}
			ShowNode current = previous.pointer;
			previous.pointer = current.pointer;
			current.pointer = null;
			size--;
		}
	}
	
	// i) deleteFromStart method
	public void deleteFromStart() {		// what are the special cases here????
		ShowNode temp = head;
		head = head.pointer;
		temp.pointer = null;
		size--;
	}
	
	// j) replaceAtIndex method
	public void replaceAtIndex(TVShow obj, int i) {
		
	}






	// a) Inner class
	public class ShowNode implements Cloneable {

		// i. private attributes
		private TVShow aShow;
		private ShowNode pointer;		// recheck

		// ii. default constructor
		public ShowNode() {
			this.aShow = null;
			this.pointer = null;
		}

		// iii. parameterized constructor
		public ShowNode(TVShow a, ShowNode b) {
			this.aShow = a;
			this.pointer = b;
		}

		// iv. copy constructor
		public ShowNode(ShowNode obj) {
			this.aShow = obj.aShow;
			this.pointer = obj.pointer;
		}

		// v. clone method


		// vi. accessor and mutator methods
		public TVShow getaShow() {
			return aShow;
		}

		public void setaShow(TVShow aShow) {
			this.aShow = aShow;
		}

		public ShowNode getPointer() {
			return pointer;
		}

		public void setPointer(ShowNode pointer) {
			this.pointer = pointer;
		}

	}





}
