package Library;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class LibraryTest {

    Library library = new Library();
    Item item;
    Person customer;

    @Before
    public void setUp(){
        item = new Book("blah", "Mr", "first", "Mahmoud", 2220, true, "Thriller", "English");
        customer = new Customer("MO", 23);

        library.items.add(item);
        library.personArrayList.add(customer);
    }

    @Test
    public void checkOutItem() throws Exception {
        library.checkOutItem(item);
        assertEquals(true, library.items.get(0).isOut);
    }

    @Test
    public void addItem() throws Exception {
        library.addItem(item);
        assertEquals(2, library.items.size());
    }

    @Test
    public void removeItem() throws Exception {
        library.removeItem(item);
        assertEquals(1, library.items.size());
    }

    @Test
    public void updateItem() throws Exception {
        library.updateItem(item);
        assertEquals("first",library.items.get(0).getItemType() );
    }

    @Test
    public void registerPerson() throws Exception {
        library.registerPerson();
        assertEquals(1, library.personArrayList.size());
    }

    @Test
    public void deletePerson() throws Exception {
        library.removePerson();
        assertEquals(1, library.personArrayList.size());
    }

    @Test
    public void updatePerson() throws Exception {
        library.updatePerson(customer);
        assertEquals("Student", ((Customer)library.personArrayList.get(0)).getMemeberID());
    }

}