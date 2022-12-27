class Truck extends Transport {
public Truck(int id)
{
    super(id);
    width=7;
}
    public void setWid(int wid) {
        this.width = wid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWid() {
        return width;
    }

    public int getId() {
        return id;
    }
    @Override
    public int calc(){
      return 15;
   }
}
