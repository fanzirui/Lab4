package pkgPokerBLL;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;

	// Change this from ArrayList to HashMap.
	// private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	HashMap<UUID,Player> TablePlayers = new HashMap<UUID,Player>();
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public Table AddPlayerToTable(Player p) {
		// TODO: Lab #4 Add a player to the table (should be pretty easy)
		TablePlayers.put(p.PlayerID,p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		// TODO: Lab #4 Remove a player from the table
		TablePlayers.remove(p.PlayerID);
		return this;
		
	}
	
	
	
	public HashMap<UUID, Player> getTablePlayers() {
		return TablePlayers;
	}

	public void setTablePlayers(HashMap<UUID, Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}

	public Player getpalyer(int position){
		for(Player p:TablePlayers.values()){
			if(p.getiPlayerPosition()==position){
				return p;
			}
		}
		return null;
	}
}