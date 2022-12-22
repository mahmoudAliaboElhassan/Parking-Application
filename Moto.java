 class Moto extends Transport {
    public Moto(int wid, int id) {
        super(wid, id);
    }
    public int getWid() {
        return wid;
    }

    public int getId() {
        return id;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public void setId(int id) {
        this.id = id;
    }

 
    @Override
    public void calc(double hour){
        System.out.println("the  cost of your parking is "+hour*5 +" L.E");
   }
}