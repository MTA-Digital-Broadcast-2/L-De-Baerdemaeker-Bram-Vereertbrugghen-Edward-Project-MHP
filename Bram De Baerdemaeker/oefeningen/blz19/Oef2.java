import java.lang.*;

	public class Oef2 {
		public static void  main (String args[])
		{
			dagen();
		}
		private static void dagen()
		{
			String dagen[] = {"zondag","maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag"};
			int dag = 0;
			for (int i = 1;i<29;i++)
			{
				System.out.println(dagen[dag] + " " + i + " " + "februari");
				if (dag >= 6)
				{
					dag = 0;
				}
				else
				{
					dag ++;
				}
			}
		}

	}