
public class DiceArrayMain
{
	public static void main(String[] args)
	{
		DiceArray jane = new DiceArray();
		DiceArray mae = new DiceArray();
		
		int rollOne = jane.roll();
		int rollTwo = mae.roll();
		int totalRoll = rollOne + rollTwo;
		
		int count[] = new int[11];
		
		for(int i = 0; i<= 1000; i++)
		{
			rollOne = jane.roll();
			rollTwo = mae.roll();
			totalRoll = rollOne + rollTwo;
			
			if(totalRoll == 2)
			{
				count[0] += 1;
			}
			else if(totalRoll == 3)
			{
				count[1] += 1;
			}
			else if(totalRoll == 4)
			{
				count[2] += 1;
			}
			else if(totalRoll == 5)
			{
				count[3] += 1;
			}
			else if(totalRoll == 6)
			{
				count[4] += 1;
			}
			else if(totalRoll == 7)
			{
				count[5] += 1;
			}
			else if(totalRoll == 8)
			{
				count[6] += 1;
			}
			else if(totalRoll == 9)
			{
				count[7] += 1;
			}
			else if(totalRoll == 10)
			{
				count[8] += 1;
			}
			else if(totalRoll == 11)
			{
				count[9] += 1;
			}
			else if(totalRoll == 12)
			{
				count[10] += 1;
			}
		
		}
		
		System.out.println("Number of 2's rolled: " + count[0]);
		System.out.println("Number of 3's rolled: " + count[1]);
		System.out.println("Number of 4's rolled: " + count[2]);
		System.out.println("Number of 5's rolled: " + count[3]);
		System.out.println("Number of 6's rolled: " + count[4]);
		System.out.println("Number of 7's rolled: " + count[5]);
		System.out.println("Number of 8's rolled: " + count[6]);
		System.out.println("Number of 9's rolled: " + count[7]);
		System.out.println("Number of 10's rolled: " + count[8]);
		System.out.println("Number of 11's rolled: " + count[9]);
		System.out.println("Number of 12's rolled: " + count[10]);
	}
}
