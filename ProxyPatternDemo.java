/*ProxyPattern
-----------------------------------------
represents functionality of another class
structural pattern
Some common proxies are the access proxy, facades, remote proxies, and virtual proxies
In this example ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.
*/
interface Image{
	void display();
}

class RealImage implements Image{

	private String fname;
	
	public RealImage(String fname){
		this.fname = fname;
		loadFromDisk(fname);
	}
	
	@Override
	public void display(){
		System.out.println("Display File "+ fname);
	}
	
	private void loadFromDisk(String fname){
		System.out.println("Loading "+fname);
	}
}

class ProxyImage implements Image{
	private RealImage rimage;
	private String fname;
	
	public ProxyImage(String fname){
		this.fname = fname;
	}
	
	@Override
	public void display(){
		if(rimage == null){ rimage = new RealImage(fname); }
		rimage.display();
	}
}

class ProxyPatternDemo{
	public static void main(String args[]){
		Image img = new ProxyImage("apple.png");
		
		//image loaded from disk
		img.display();
		
		//next time image not loaded from disk
		img.display();
		
	}
}

/*Output
---------------------------------
Loading apple.png
Display File apple.png
Display File apple.png
*/