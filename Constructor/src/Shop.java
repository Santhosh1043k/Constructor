public class Shop {
    private int money;

    //in this line we use the private class and declare that pri class as integer
    public Shop(int initialMoney){
        money  = initialMoney;
    }
    public void ithaVachuko(int money){
        this.money += money;

    }
    public int evaloKoduthe(){
        return money;
    }
}
