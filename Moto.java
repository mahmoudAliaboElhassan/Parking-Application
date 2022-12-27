 class Moto extends Transport {
    public Moto(int id) {
        super(id);
        width=2;
    }
    public int getWid() {
        return width;
    }

    public int getId() {
        return id;
    }

    public void setWid(int wid) {
        this.width = wid;
    }

    public void setId(int id) {
        this.id = id;
    }

 
    @Override
   public int calc(){
      return 5;
   } 
}