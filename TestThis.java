public class TestThis {
	public static void main(String[] args) {
		Mod porsche = new Mod();
		porsche.setModel("Porsche");
		porsche.getModel();
	}
}

class Mod {
	String model;
	
	public String getModel() {
		System.out.println(model);
		return model;
	}
	
	public void setModel(String model) {
		 this.model = model;
	}
}