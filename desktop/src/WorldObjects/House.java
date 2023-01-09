package WorldObjects;

import com.badlogic.gdx.graphics.Texture;

import StaticData.StaticVariables;
public class House extends WorldObject{


	Texture houseTexture = new Texture("badlogic.jpg");
	
	
	
	public House(int yTile, int xTile) {
		this.posY = yTile*StaticVariables.tileSize;
		this.posX = xTile*StaticVariables.tileSize;

	}
}
