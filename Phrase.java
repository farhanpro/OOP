class Phrase{
    public static void main (String args[]);
    {
	String [] a={"27/6" ,"multiTier","30,000"};
	String [] b={"empowered","sticky","Value added"};
        	String [] c={"process" ,"tipping-point","space"};
	int onelength= a.length;
	int twolength= b.length;
	int threelength=c.length;

	int rand1=(int) (Math.random()*onelength);
	int rand2=(int)  (Math.random()*twolength);
	int rand3=(int) (Math.random()*threelength);
	String phrase= a[rand1]+" "+b[rand2]+" "+c[rand3];
	System.out.println("What we need is a " + phrase);
    }
}
