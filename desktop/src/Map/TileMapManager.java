package Map;

import WorldObjects.WorldObject;

import StaticData.*;

/**
 * @author Barnaby
 * Creates an illusion of a tile system where worldObjects belongs to specific tiles
 */
public class TileMapManager {
	
	/**
	 * Keeps track of the placed objects on the tileMap
	 */
	public WorldObject[][] tileMap = new WorldObject[StaticVariables.mapHeight][StaticVariables.mapWidth];
	
	private void addToMap(int posX, int posY, WorldObject wObject) {
		tileMap[posY][posX] = wObject;
		
	}
	
	public void buildObject(int posX, int posY, WorldObject wObject) {
		if(tileMap[posX][posY] == null) {
			addToMap(posX, posY, wObject);
		}
	}
	
	
}
