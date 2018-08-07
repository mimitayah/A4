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
			throw new NoSuchElementException(); 		// a reviser
			System.exit(0);
		}
		else {
			// to continue
		}
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
