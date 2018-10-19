public class Conditionals 
{
	public static void main(String[] args)
	{
		//change these so it resolves as true
		String a = "Wow";
		System.out.println(a);
        String b = "Wow";
        System.out.println(b);
        String c = "No";
        System.out.println(c);
        String d = c;
        System.out.println(d);

        boolean b1 = a == b;
        //System.out.println(b1);
        boolean b2 = b.equals(b + "!");
        System.out.println(b2);
        boolean b3 = !c.equals(a);
        //System.out.println(b3);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
        else
        {
        	System.out.println("Failure");
        }
    }
}