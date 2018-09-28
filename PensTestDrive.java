class Pens{
	String pen_name;
	int price;
	
}
class PensTestDrive{
	public static void main (String [] args){
		Pens [] pens =  new Pens [4];
		int x=0;
		while(x<3){
			pens[x]=new Pens();
			x=x+1;
		}
		pens[0].pen_name="Pilot v7";
		pens[0].price = 50;
		pens[1].pen_name="Pilot v5";
		pens[1].price = 60;
		pens[2].pen_name="Parker matt black";
		pens[2].price = 280;
		int y=0;
		while(y<3){
			System.out.println(pens[y].pen_name);
			System.out.println(pens[y].price);
			y=y+1;
		}
	}
}