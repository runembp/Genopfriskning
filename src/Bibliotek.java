import java.util.ArrayList;

public class Bibliotek {
    ArrayList<Bog> boeger;

    public Bibliotek() {
        boeger = new ArrayList<>();
        boeger.add(new Bog("8132974891273", "Hitchhikers Guide To The Galaxy", 1992));
        boeger.add(new Bog("8934597834759", "The Mist", 2010));
        boeger.add(new Bog("3784324325794", "IT", 1985));
    }

    public boolean searchLibrary(Bog searchedBook) {
        for (Bog bog : boeger) {
            if (searchedBook.getIsbnNumber().equals(bog.getIsbnNumber())) {
                return true;
            }
        }
        return false;
    }


    public boolean doesContain(Bog bogSearch) {
        for (Bog bogIn : boeger) {
            if (bogSearch.getIsbnNumber().equals(bogIn.getIsbnNumber()))
                System.out.println("Found!");
            return true;
        }
        return false;
    }
}
