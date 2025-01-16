package pattern;

public class Esempio { //classe generica per descrivere un computer
	
	protected String CPU;
	protected String RAM;
	
	protected int storage;
	protected boolean hasGPU;
	
	public static class EsempioBuilder{ //nome classe originale+builder
		protected String CPU;
		protected String RAM;
		
		protected int storage;
		protected boolean hasGPU;
		
		private Esempio(EsempioBuilder esempioBuilder) {
			this.CPU=esempioBuilder.CPU;
			this.RAM=esempioBuilder.RAM;
			this.storage=esempioBuilder.storage;
			this.hasGPU=esempioBuilder.hasGPU;
		
		}
		
		public String toString() {
			return "CPU: "+this.CPU+" RAM: "+this.RAM;
		}
		
		public EsempioBuilder(String CPU, String RAM) {
			this.CPU=CPU;
			this.RAM=RAM;
		}
		
		public EsempioBuilder setStorage(int storage) {
			this.storage=storage;
			return this;
		}
		
		public EsempioBuilder setHasGPU(boolean hasGPU) {
			this.hasGPU=hasGPU;
			return this;
		}
		
		public Esempio build() {
			//aaaaaaaaaa MA COSA VA QUIIII AAAAAAAAAAAAAAAAAAAAAAAAAAA
			
		}
	}
	
	
	
}
