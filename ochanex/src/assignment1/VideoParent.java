package assignment1;

public class VideoParent {
	protected String title;
	protected String barcodenum;
	protected String director;
	protected String openyear;
	protected boolean isRental;
	public void Video() {
		this.isRental = false;
	}
	public boolean isRental() {
		return this.isRental;
	}
}
