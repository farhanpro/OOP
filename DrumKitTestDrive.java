class DrumKit{
	
	boolean TopHat=true;
	boolean snare =true;

	void playTopHat(){

		System.out.println("ding ding da-ding");
	}
	void Playsnare(){
		System.out.println("bang bang ba-bang");
	}
}

class DrumKitTestDrive{
	public static void main (String args[]){
		
		DrumKit d = new DrumKit();

		
		d.Playsnare();
		d.playTopHat();
		
		d.snare =false;
		if(d.snare == true){
			d.Playsnare();

		}

	}
}