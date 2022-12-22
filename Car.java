class Car extends Transport {
    public Car(int wid, int id) {
        super(wid, id);
    }

   public void setWid(int wid) {
        this.wid = wid;
    }

    public int getWid() {
        return wid;
    }

    public int  getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    @Override
    public void calc(double hour){
      System.out.println("the  cost of your parking is "+hour*10 +" L.E");
   }
    
}
