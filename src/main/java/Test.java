public class Test {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HotelHouseBuilder();
        HouseDesigner designer = new HouseDesigner();
        designer.build(houseBuilder);

        House house = houseBuilder.getHouse();
        System.out.println(house.getFloor());
        System.out.println(house.getDoor());
        System.out.println(house.getWindow());
    }
}
