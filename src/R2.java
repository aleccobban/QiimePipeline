
public class R2 {
	private String fileName;
	private String sampleName;
	
	/**
	 * Creates an R2 object with the name input. Input name should be the filename that the user wants associated with this instance Acts as a constructor.
	 * @param name String that should be a file name.
	 */
	public R2(String name){
		fileName = name;
		sampleName = fileName.substring(0, fileName.lastIndexOf("R"));
	}
	/**
	 * Return the fileName instance variable
	 * @return String that should hold the filename
	 */
	public String getFileName(){
		return fileName;
	}
	/**
	 * Return the sampleName instance variable
	 * @return String that will be the same as the fileName without the extension
	 */
	public String getSampleName(){
		return sampleName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
