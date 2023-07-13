class HotelAb{

 public static void main(String as[]) {
 String foodItems[]={"Biryani" ,"Masala Dosa", "Butter Chicken", "Paneer Tikka", "Idli", "Samosa", "Vada Pav", "Chole Bhature", "Pani Puri", "Tandoori Chicken", "Fish Curry", "Dal Makhani", "Hyderabadi Dum Biryani", "Gulab Jamun", "Rajma Chawal", "Pav Bhaji", "Chicken Tikka Masala", "Poha", "Mutton Josh", "Palak Paneer", "Kadhi Pakora", "Aloo Paratha", "Chicken Biryani", "Malai Kofta", "Lassi", "Rasgulla", "Matar Paneer", "Chaat", "Kheer", "Saag", "Roti", "Gajar Ka Halwa", "Rava Dosa", "Papdi Chaat", "Paniyaram", "Kadai Paneer", "Dhokla", "Chicken Curry", "Mysore Masala Dosa", "Raj Kachori", "Tandoori Fish", "Aloo Tikki", "Pulao", "Korma", "Jalebi", "Mango Lassi", "Chicken 65", "Gobi Manchurian", "Mutton Biryani", "Shahi Tukda"};
System.out.println("The list of food are:");
 getFoodItems(foodItems);
 
 System.out.println("Main ended");
 }

public static void getFoodItems(String foodItems[]){
	System.out.println("Inside getFoodItems");
	for(String foodItem :foodItems) {
	 System.out.println(foodItem);
	 
	 
 }
	
}



 }
