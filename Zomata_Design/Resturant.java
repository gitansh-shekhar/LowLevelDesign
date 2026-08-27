package Zomata_Design;

import java.util.Objects;

public class Resturant {
    private String name;
    private Menu menu;
    Resturant (String name , Menu menu){
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Resturant resturant = (Resturant) o;
        return Objects.equals(name, resturant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
