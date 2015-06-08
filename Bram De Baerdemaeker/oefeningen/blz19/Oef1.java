import java.lang.*;

	public class Oef1 {
		public static void  main (String args[])
		{
			tafels();
		}
		private static void tafels()
		{
			int tafel1[] = {0,1,2,3,4,5,6,7,8,9};
			int i;

			for (i=0;i<tafel1.length;i++)
			{
				int a;
				for (a=0; a<10;a++)
				{
					int b = i*a;
					System.out.println(i + " x " + a + " = " + b);
				}
				
			}
		}

	}