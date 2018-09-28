 class Friends{
	String Name;
	String Backlog;
	String Subject_name;
}

 class FriendsTestDrive{
	public static void main(String [] args){
		
		Friends myfriends[] =	new Friends[3];
		int y=0;
		while(y<3){

		myfriends[y]=new Friends();	
		y=y+1;
		}
	//	myfriends[0]=new Friends();
	//	myfriends[1]=new Friends();
	//	myfriends[2]=new Friends();
		myfriends[0].Name = "Kunal.";
		myfriends[0].Backlog = "0.";
		myfriends[0].Subject_name  = " No back. ";
		myfriends[1].Name = "Nitish.";
		myfriends[1].Backlog = "2 .";
		myfriends[1].Subject_name = " C++ , Profeshional .";
		myfriends[2].Name = "Akash.";
		myfriends[2].Backlog = "4.";
		myfriends[2].Subject_name = " C++ , Financial accounts, Professional , Web desing .";
		int x=0;
		while(x<4)
		{
			System.out.println("Name is "+myfriends[x].Name);
			System.out.println("Backlog "+myfriends[x].Backlog);
			System.out.println("Backlog subjects "+myfriends[x].Subject_name);
			System.out.println("\n");
			x=x+1;
		}


	}
}