class Car extends Transport {
    public Car( int id) {
        super(id);
        width=5;
    }

   public void setWid(int wid) {
        this.width = wid;
    }

    public int getWid() {
        return width;
    }

    public int  getId() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    @Override
   public int calc(){
      return 10;
   }
    
}
