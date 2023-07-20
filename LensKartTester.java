class LensKartTester{

public static void main(String args[]){

LensKart len=new LensKart("Titan+", "Elastic");
//len.brandName="Titan+";
//len.type="Elastic";
len.price=700.99;
System.out.println(len.brandName +" "+ len.type +" "+ len.price);
}
}