package Library;

import java.util.ArrayList;

public class Library {

    ArrayList <Item> items = new ArrayList <Item>();
    ArrayList<Person> personArrayList = new ArrayList<Person>();

    public void addItem(Item item){
        items.add(item);
    }

    public boolean checkOutItem(Item item)
    {
        boolean isCheckedOut=false;
        for (int i=0; i<items.size(); i++) {
            if (item.isOut) {
                isCheckedOut = true;
            }
            else{isCheckedOut = false;}
        }
        return isCheckedOut;
    }

    public boolean removeItem(Item item) {
        boolean isRemoved = false;
        for (int i=0; i<items.size(); i++){
            if (item.equals(items.get(i).ID)){
                items.remove(i);
                isRemoved=true;
                break;
            }
        }
        return isRemoved;
    }

    public void updateItem(Item item)
    {

    }
    public void registerPerson(){


    }

    public void removePerson(){



    }
    public void updatePerson(Person customer){

    }

}
