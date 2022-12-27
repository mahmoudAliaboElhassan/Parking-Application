
class Bus extends Transport{
    public Bus( int id) {
        super(id);
        width=10;
       
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
    

   public int calc(){
      return 15;
   }
}
