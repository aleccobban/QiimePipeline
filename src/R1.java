public class R1 {
	private String fileName;
	private String sampleName;
	private R2 myR2;
	
	/**
	 * Creates an R1 object. This takes as input a name and outputs an object of Type R1, capable of holding a name and an R2 object
	 * @param name The desired name of an object
	 */
	public R1(String name){
		fileName = name;
		sampleName = fileName.substring(0, fileName.lastIndexOf("R"));	
	}
	/**
	 * Set the R2 instance variable of a given R1
	 * @param matchingR2 An R2 object that matches the R1 object
	 */
	public void setR2(R2 matchingR2){
		myR2 = matchingR2;
	}
	/**
	 * Returns the entire filename of an R1
	 * @return A string that is the file name.
	 */
	public String getFileName(){
		return fileName;
	}
	/**
	 * Returns the prefix of the filename before the R1.fastq
	 * @return A string that is the prefix of the filename
	 */
	public String getSampleName(){
		return sampleName;
	}
	/**
	 * Returns the R2 associated with this R1
	 * @return an R2 object
	 */
	public R2 getR2(){
		return myR2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
