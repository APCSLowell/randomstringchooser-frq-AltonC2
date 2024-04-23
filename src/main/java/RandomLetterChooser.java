public class RandomLetterChooser extends RandomStringChooser
{
	
	public RandomLetterChooser(String str)
	{ 
		private String [] values;
		private int valuesRemaining;
		public RandomLetterChooser(String[] vals){
values = new String[vals.length];
			for ( int i = 0; i < values.length; i++){
values[i] = vals[i];
				valuesRemaining = values.length;
			}
		}
		/* to be implemented in part (b) */
		public String getNext()
			{
if (valuesRemaining==0)
	return  "NONE";
			int index = (int) (Math.random()*valuesRemaining)
		}
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
