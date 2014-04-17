package ist.utl.pt.bbcm.sprites;

import ist.utl.pt.bbcm.GameView;
import ist.utl.pt.bbcm.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class Wall implements Sprite {

	private Bitmap bmp;
	private int x;
	private int y;
	private boolean needsDrawing;
	

	public Wall(GameView gameView, int x, int y) {
		this.bmp = BitmapFactory.decodeResource(gameView.getResources(), R.drawable.wall);;
		this.x = x;
		this.y = y;
		this.needsDrawing = true;
	}
	
	
	public void drawToCanvas(Canvas canvas) {
		if(needsDrawing){
			canvas.drawBitmap(bmp, x, y, null);
		}
	}
	
	public void stopDrawing (){
		this.needsDrawing = false;
	}
	
	@Override
	public void startDrawing() {
		this.needsDrawing = true;
	}
	
	@Override 
	public String toString(){
		return "W";
	}


	@Override
	public boolean isWalkable() {
		return false;
	}
	
	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}
	
	@Override
	public void moveRandom() {		
	}


	@Override
	public boolean isKillable() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}
}
