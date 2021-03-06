package castle;

public class Room {
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }
    
    // 让room类自己有方法来说明打印自己的房间情况
    public String getExitDesc() {
//    	String ret = "";    用string来做，系统开销大，一般会有tringbuffer  
    	// 当我们如果要产生一个复杂的字符串的时候，一般会使用 StringBuffer 来产生对象
    	StringBuffer sb = new StringBuffer();
    	if ( northExit != null )
    		sb.append("north ");
    	if ( eastExit != null )
    		sb.append("east ");
    	if ( southExit != null )
    		sb.append("south ");
    	if ( westExit != null)
    		sb.append("west");
    	return sb.toString();
    }
    
    public Room getToTheExit(String direction)
    {
    	Room nextRoom = null;
    	if (direction.equals("north"))
    		nextRoom = northExit;
    	if (direction.equals("east"))
    		nextRoom = eastExit;
    	if (direction.equals("south"))
    		nextRoom = southExit;
    	if (direction.equals("west"))
    		nextRoom = westExit;
    	return nextRoom;
    }

    @Override
    public String toString()
    {
        return description;
    }
}
