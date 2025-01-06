package exmclass1.InterfaceSearchable;

public class Webpage implements Searchable{
    String url;

    public Webpage(String url){
        this.url = url;
    }

    @Override
    public boolean search(String keyword) {
        return false;
    }
}
