class Movie{

	int rating;
	String moviename;
	//String movieratings;
	void show()
	{
		System.out.println("Name of the movie is " + moviename );
		System.out.println("Rating of the movie " + moviename + "is " +rating + "\n");
	//	System.out.println("") 
	}
}

class MovieTestDrive{
	public static void main(String [] args){
	Movie a = new Movie();
	a.rating= 40;
	a.moviename = "Zero";
	a.show(); 
	Movie b =new Movie();
	a.rating= 30;
	a.moviename = "Jab harry met sejal";
	a.show(); 

}
}