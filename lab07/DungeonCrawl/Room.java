//Problem 2: Dungeon Crawl
public class Room{
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room(String name, String description) {
        this.name=name;//room name
        this.description=description;//room description
    }
    public void setExits(Room n, Room e, Room s, Room w){
        north=n;
        east=e;
        south=s;
        west=w;
    }


    public String getExits(){
        String result ="";
        if(north!=null) result+="[N]orth: "+north.name+"\n";
        if(east!=null) result+="[E]ast: "+east.name+"\n";
        if(west!=null) result+="[W]est: "+west.name+"\n";
        if(south!=null) result+="[S]outh: "+south.name+"\n";
        return result;
    }
    public String toString() {
        return "["+name+"]\n"+description+"\n"+getExits();
    }

    public String getName() {
        return name;
    }
    public Room getNorth() {
        return north;
    }
    public Room getEast() {
        return east;
    }
    public Room getSouth() {
        return south;
    }
    public Room getWest() {
        return west;
    }



}