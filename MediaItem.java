public abstract class MediaItem extends Item{
	 private int runtime;
	 
	 public MediaItem(int idNo,String title,int noOfCopies,int runtime) {
		 	super(idNo);
			super(title);
			super(noOfCopies);
			this.runtime = runtime;
	 }
	 public int getRuntime() {
		 return runtime;
	 }
	 public void setRuntime(int runtime) {
		 this.runtime=runtime;
	 }
}