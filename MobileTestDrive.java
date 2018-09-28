class Mobile{
	String mobile_name;
	String mobile_name2="Redmi 6";
	String mobile_name3="Refmi y2";
}
class MobileTestDrive{
	public static void main(String [] args){
		Mobile[] mi = new Mobile[3];
		mi[0] = new Mobile();
		mi[1] = new Mobile();
		mi[2] = new Mobile();
		mi[0].mobile_name="Realme 2";
		mi[1].mobile_name="redmi y2";
		mi[2].mobile_name="redmi 6";
		int x=0;
		while(x<3)
		{
			System.out.println(mi[x].mobile_name);
			x+=1;


		}
	}
}