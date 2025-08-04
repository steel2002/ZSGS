class  Vehicle {
	String id;
	 String brandName;
	 double price;
	 static int count;

 Vehicle(String id,String brandName,double price){
		this.id =id;
		this.brandName=brandName;
		this.price=price;
		count++;
	}
	
}


class VehicleMain {
    public static void main(String[]args){
	Vehicle v =new Vehicle("1001","BMW",2000000.00);
    Vehicle v1 =new Vehicle("103","MG",2000000.00);
   
	 System.out.println("The number of vehicles: " +Vehicle.count);
	}


}
