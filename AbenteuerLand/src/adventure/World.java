package adventure;

public class World {
	private int time = 0;
	
	public int getTime(){
		return this.time;
	}
	
	public void setTime(boolean fight){
		if(fight==true) {
			this.time = this.time+5;
		}else {
			this.time = this.time+3600;
		}
		
	}
}
