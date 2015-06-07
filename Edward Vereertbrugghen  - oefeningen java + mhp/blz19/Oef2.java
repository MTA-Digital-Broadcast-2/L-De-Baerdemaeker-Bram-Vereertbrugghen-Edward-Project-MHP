import java.lang.*;

public class Oef2 {
public static void main (String args [])
    {
	uitvoeren();
}
private static void uitvoeren()
{
   String dagen[] = {"zondag","maandag","dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag"};
    int dag = 0;
    for(int i = 1; i < 29; i++)
    {
        
        System.out.println(dagen[dag] + " " + i + " Februari");
        if (dag >= 6){
            dag = 0;
        }
        else
        {dag++;}
    }
} 
}
