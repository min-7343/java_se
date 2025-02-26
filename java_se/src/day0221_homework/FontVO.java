package day0221_homework;

/**
 * 설정된 폰트(글씨체(String) 컨셉(int) 사이즈(int))가 저장 될 곳 
 */
public class FontVO {
	private String saveFont;
	private int designF;
	private int sizeF;
	
	public FontVO(String saveFont, int designF, int sizeF) {
		super();
		this.saveFont = saveFont;
		this.designF = designF;
		this.sizeF = sizeF;
	}//FontVO
	
	public String getSaveFont() {
		return saveFont;
	}//getSaveFont
	public void setSaveFont(String saveFont) {
		this.saveFont = saveFont;
	}//setSaveFont
	public int getDesignF() {
		return designF;
	}//getDesignF
	public void setDesignF(int designF) {
		this.designF = designF;
	}//setDesignF
	public int getSizeF() {
		return sizeF;
	}//getSizeF
	public void setSizeF(int sizeF) {
		this.sizeF = sizeF;
	}//setSizeF
	
}
