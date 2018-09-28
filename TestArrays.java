class TestArrays{
	public static void main (String[] args){
		int [] index = new int [4];
		int x=0;
		while(x<4)
		{
		index[x]= x;
		x=x+1;
		}
		String [] islands = new String [4];
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";

		int y=0;
		int ref;
		while(y<4){
			ref = index[y];
			System.out.print("Island = ");
			System.out.print(index [y] +"  ");
			System.out . println(islands [ref] + ".");
			y=y+1;
			}
}
}