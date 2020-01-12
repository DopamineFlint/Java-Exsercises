class TapeDeck {
	boolean canRecord = false;
	
	void playTape() {
		System.out.println("Tape is playing");
	}
	
	void recordTape() {
		System.out.println("Recording...");
	}
}

class TapeDeckTestDrive {
	public static void main(String[] args) {
		TapeDeck t = new TapeDeck();
		
		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true) {
			t.recordTape();
		}
	}
}