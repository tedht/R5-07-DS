public class Q3
{
    public static void main(String[] args)
    {
        if(args.length != 1) return;

		int N;
        String suite;

		N = Integer.parseInt(args[0]);
		suite = "";

		for(int i = 1;i <= N; i++)
			suite += Integer.toString(i) + ' ';

		System.out.println(suite);
        
    }
}