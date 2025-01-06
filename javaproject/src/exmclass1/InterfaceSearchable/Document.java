package exmclass1.InterfaceSearchable;

public class Document implements Searchable {

    String Electric;

    public Document(String Electric){
        this.Electric = Electric;
    }

//    void  displayInformation(){
//        System.out.println("");
//    }

    @Override
    public boolean search(String keyword) {
        return false;
    }
}
