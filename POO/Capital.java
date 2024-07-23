package POO;

import java.util.Objects;

public class Capital extends City{

    private String building;

    public Capital(){
        super();
        building = "None";
    }

    public Capital(String nameCity, String nameCountry, int numberPeople, String building){
        super(nameCity, nameCountry, numberPeople);
        this.building = building;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String toString() {
        String messString = super.toString() + " is the capital and have as popular building " + building;
        return messString;
    }

    public int hashCode() {
        int hash = super.hashCode();
        return Objects.hash(hash, building);
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (getClass() != obj.getClass())
        return false;

        Capital other = (Capital) obj;

        boolean sup = super.equals(obj) && Objects.equals(other.getBuilding(), this.getBuilding());
        return sup;
    }
}
