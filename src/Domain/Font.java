package Domain;

public class Font {
	
	private int fontSize;
	private int factor;
	
	public Font(int fS,int f) {
		this.factor=f;
		this.fontSize=fS;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public int getFactor() {
		return factor;
	}

	public void setFactor(int factor) {
		this.factor = factor;
	}
}
