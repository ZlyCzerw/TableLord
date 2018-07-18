package pl.tablelord.tablelord;

public class Table {
    private int tableNo;
    private int places;
    private int roomNo;
    private int status;


    public Table (int roomNo, int tableNo,int places, int status){
        this.places=places;
        this.roomNo=roomNo;
        this.tableNo=tableNo;
        this.status=status;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
