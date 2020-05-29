/**
 * 农民工兄弟
 */
public class HotelHouseBuilder implements HouseBuilder {
    House house = new House();
    @Override
    public void buildFloor() {
        house.setFloor("造地板");
    }

    @Override
    public void buildDoor() {
        house.setDoor("造房门");
    }

    @Override
    public void buildWindow() {
        house.setWindow("造窗子");
    }

    @Override
    public House getHouse() {
        return house;
    }


}
