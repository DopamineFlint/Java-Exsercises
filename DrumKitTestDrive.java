class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.snare = true;
		d.playSnare();
		d.playTopHat();
		
		if (d.snare == true) {
			d.playSnare();
		}
	}
}

class DrumKit {
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare() {
		System.out.println("Boom boom boom");
	}
	
	void playTopHat() {
		System.out.println("Ding ding ding");
	}
}