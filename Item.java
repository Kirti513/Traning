public abstract class Item{
	
	private int idNo;
	private String title;
	private int noOfCopies;
	
	public Item(int idNo,String title,int noOfCopies) {
		this.idNo=idNo;
		this.title=title;
		this.noOfCopies=noOfCopies;
	}

	public void setIdNo(int idNo) {
		this.idNo=idNo;
	}
	public void setTitle(String title) {
		this.title =title;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies=noOfCopies;
	}
	public int getIdNo() {
		return idNo;
	}
	public String getTitle() {
		return title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public String.toString(){
		return idNo+" "+title+" "+noOfCopies;
	}
	public void print() {
		System.out.println("Id is:"+idNo);
		System.out.println("Title is:"+title);
		System.out.println("No of Copies are:"+noOfCopies);
	}
	
}





