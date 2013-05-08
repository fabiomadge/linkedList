public class Main
{
	public static void main(String[] s) throws Exception{
		List l = new List();
		l.add('s');
		l.add(3);
		l.add(2);
		l.add(1);
		System.out.println(l.head());
		System.out.println(l.init());
		System.out.println(l.init().length());
		System.out.println(l);
		l.append(5);
		System.out.println(l);
		List snd = new List();
		snd.add(9);
		snd.add(7);
		snd.add(new Node(null, "hallo"));
		System.out.println(snd);
		l.linkf(snd);
		System.out.println(l);
		System.out.println(snd);
		System.out.println(((Node)l.head()).getDatum());
	}
}