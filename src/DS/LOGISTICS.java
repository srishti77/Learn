package DS;

public class LOGISTICS {

	/*
	 * 
	 * Functionality:
	 * 
	 * 1. take an order- deliver to destn
	 * 2. Order consist of item and prices
	 * 3. Register User
	 * 4. track order
	 * 5. Order delivered by truck or bike. Only one item at a time
	 * 
	 *  User
	 * 	name
	 * 	address
	 * 	Id
	 * 	email
	 * 
	 * Login
	 * 
	 * Register
	 * 
	 * UserManagement
	 * 	addUser()
	 * 	removeUser()
	 * 	updateUser()
	 * 
	 * VehicleManagement
	 * 	addVehicle
	 * 	removeVehicle
	 * 	updateVehicle
	
	----------------------------
	 * 
	 * Order: 
	 * 
	 * 	static makeOder(List<Items>)
	 * 		return new Order(items)
	 *
	 * 	getSizeOfItem()
	 * 
	 * Price: 
	 * 	Double calculatePrice(Order order){
	 * 	}
	 * 	
	 * 		
	 * Item:
	 * 	String name
	 * 	Double price
	 * 	Boolean isSleceted
	 * 
	 * 	Item(String name, Double price)
	 * 
	 *Vehicle
	 *	item
	 *	destination
	 *	User
	 *	List<Vehicle> availableVehicle()
	 *
	 *Bike extends Vehicle{
	 * private static final MAXCAPACITY = 3
	 *}
	 *
	 *Truck extends Vehicle {
	 *private static final MAXCAPACITY = 10
	 *}
	 *
	 *AllocationVehicle: 
	 *	List<Vehicle> availableVehicle()
	 *	List<Bike> bikeList // total number: 5
	 *	List<Truck> truckList // total number: 10
	 *	
	 *Vehicle assignVehicle(int orderSize){
	 *
	 *}
	 *
	 *Deliver
	 *	Deliver(address, invoice, order)
	 *
	 *Invoice:
	 *	OrderDetails
	 *	PriceDetails
	 *
	 *	generateInvoice(Order orderDetails , Price priceDetails)
	 *
	 *
	 *LogisticSystem 
	 *
	 *	User user;
	 *	List<Item> items;
	 *	Order order;
	 *LogisticSystem(	User user, 	List<Item> items)..{
	 *..
	 *
	 *order = Order.makeOrder(items);
	 *price = Price.calculatePrice(order)
	 *
	 *
	 *}
	 *
	 *
	 *
	 *
	 *
	 *
	 *	
	 *
	
	 */
}
