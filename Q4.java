public class Q4
{
    public static void main(String[] args)
    {
        if(args.length != 1) return;

		int N;
        String triangle;

		N = Integer.parseInt(args[0]);
		triangle = "";

		for(int i = 0;i < N; i++)
		{
			for(int j = 1;j <= i; j++)
				triangle += Integer.toString(j) + ' ';
			triangle += '\n';
		}

		System.out.println(triangle);
        
    }
}
