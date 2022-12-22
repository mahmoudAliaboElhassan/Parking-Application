class Truck extends Transport {
    public Truck(int wid, int id) {
        super(wid, id);
    }
    public void setWid(int wid) {
        this.wid = wid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWid() {
        return wid;
    }

    public int getId() {
        return id;
    }
    @Override
    public void calc(double hour){
       System.out.println("the  cost of your parking is "+hour*15 +" L.E");
   }
}
