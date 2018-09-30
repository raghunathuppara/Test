public class Call_Enum
{
	public static void main(String[] args)
	{
		Enum_First season=Enum_First.fall;
		System.out.println("season is "+season);
		
		for(Enum_First c:Enum_First.values())
		{
			System.out.println(c);
		}
	}

}