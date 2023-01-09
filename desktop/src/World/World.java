package World;

import Map.TileMapManager;
import WorldObjects.*;
import StaticData.StaticVariables;

public class World {
	
	private TileMapManager tileMapManager = new TileMapManager();
	
	private void start() {
		tileMapManager.buildObject(4, 4, new House(4, 4)); //adds a house to the tile map
		
		
		
	}
	
	private void update() {
		for (int i = 0; i < StaticVariables.mapHeight; i++) {
			for (int j = 0; j < StaticVariables.mapWidth; j++) {
				if(tileMapManager.tileMap[i][j] != null) {
					
				}
			}
		}
	}
}
