//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Image;
//import java.awt.Toolkit;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.geom.AffineTransform;
//import java.net.URL;
//
//public class Crosshair{
//	//add location attributes
//	private int x,y; //position of the bird
//	private Image img; 	
//	private AffineTransform tx;
//
//	public Crosshair() {
//		img = getImage("/imgs/Crosshair.png"); //load the image for Tree
//		this.x = y;
//		this.y =x;
//		
//		tx = AffineTransform.getTranslateInstance(x, y);
//		init(0, 0); 				//initialize the location of the image
//									//use your variables
//		tx.scale(1.6, 1.5);
//	}
//	
//		// TODO Auto-generated constructor stub
//	
//
//	public void changePicture(String newFileName) {
//		img = getImage(newFileName);
//		init(0, 0);
//	}
//	
//	public void paint(Graphics g) {
//		//these are the 2 lines of code needed draw an image on the screen
//		Graphics2D g2 = (Graphics2D) g;
//		g2.drawImage(img, tx, null);
//		
//		
//		
//		
//	}
//	//update the picture variable location
//	private void update() {
//		tx.setToTranslation(x, y);
//		tx.scale(.5, .5);
//	}
//	
//	
//	
//	
//	private void init(double a, double b) {
//		tx.setToTranslation(a, b);
//		tx.scale(.5, .5);
//	}
//
//	private Image getImage(String path) {
//		Image tempImage = null;
//		try {
//			URL imageURL = Crosshair.class.getResource(path);
//			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return tempImage;
//	}
//
//}
