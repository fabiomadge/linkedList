class List{
	private Node head;

	public List(){
		head = null;
	}

	public List(Node n){
		head = n;
	}

	public void add(Object o){
		Node nHead = new Node(head, o);
		head = nHead;
	}

	public void append(Object o){
		if(head == null) this.add(o);
		else head.append(new Node(null, o));
	}

	public String toString(){
		String s = "(";
		Node next = head;
		while(next != null){
			if(next.next() == null) s = s + next.toString();
			else                  s = s + (next.toString() + ", ");
			next = next.next();
		}
		return (s + ")");
	}

	public List reverse(){
		List l = new List();
		Node next = head;
		while(next !=  null){
			l.add(next);
			next = next.next();
		}
		return l;
	}

	public Object head(){
		return head.getDatum();
	}

	public List tail(){
		if(this.length() < 2) return new List();
		else return new List(head.next());
	}

	public Object last(){
		Node next = head;
		while(next != null){
			if(next.next() == null) return next.getDatum();
			next = next.next();
		}
		return null;
	}

	public List init(){
		return this.reverse().tail().reverse();
	}

	public Boolean nil(){
		if(head == null) return true;
		else return false;
	}

	public int length(){
		Node next = head;
		int i = 0;
		while(next != null){
			i++;
			next = next.next();
		}
		return i;
	}
}