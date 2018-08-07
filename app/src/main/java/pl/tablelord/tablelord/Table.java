package pl.tablelord.tablelord;

public class Table {
    private int tableNo;
    private int seatsNo;
    private int roomNo;
    private boolean isFree;


    public Table (int roomNo, int tableNo, int seatsNo, Boolean isFree){
        this.seatsNo=seatsNo;
        this.roomNo=roomNo;
        this.tableNo=tableNo;
        this.isFree =isFree;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(int seatsNo) {
        this.seatsNo = seatsNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
