public abstract class WrittenItem extends Item{
	
	private String author;
	
	public WrittenItem(int idNo,String title,int noOfCopies,String author)
	{
		super(idNo);
		super(title);
		super(noOfCopies);
		this.author = author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
}