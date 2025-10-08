public class Q5
{
    public static void main(String[] args)
    {
        if(args.length != 1) return;

		int N;
        String triangle;

		N = Integer.parseInt(args[0]);
		triangle = "";

		for(int i = N; i > 0; i--)
		{
			for(int j = 1 ;j <= i; j++)
				triangle += ' ' + Integer.toString(j);
			triangle += '\n';
		}

		System.out.println(triangle);
        
    }
}
