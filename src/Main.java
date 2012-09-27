public class Main
{
	public static void main(String[] s) throws Exception{
		List l = new List();
		l.add('s');
		l.add(3);
		l.add(2);
		l.add(1);
		System.out.println(l.init());
		System.out.println(l.init().length());
		System.out.println(l);
		l.append(5);
		System.out.println(l);
	}
}