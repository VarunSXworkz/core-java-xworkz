class RocketsTester{


public static void main(String args[]){


Rockets rock=new Rockets("Atlas V", "LaunchSystem", false, 40000.21);
System.out.println("The first Rockets is:");
System.out.println(rock.rocketName +" "+rock.type +" "+rock.isHeavy +" "+rock.price);

Rockets rock1=new Rockets("Falcon Heavy", "CargoCarry", true, 200000.00);
System.out.println("The second Rockets is:");
System.out.println(rock1.rocketName +" "+rock1.type +" "+rock1.isHeavy +" "+rock1.price);

Rockets rock2=new Rockets("Saturn V", "LiquidFuel", false, 21000.50);
System.out.println("The third Rockets is:");
System.out.println(rock2.rocketName +" "+rock2.type +" "+rock2.isHeavy +" "+rock2.price);

Rockets rock3=new Rockets("Pegasus", "OrbitalSciences", false, 4400000.22);
System.out.println("The fourth Rockets is:");
System.out.println(rock3.rocketName +" "+rock3.type +" "+rock3.isHeavy +" "+rock3.price);

Rockets rock4=new Rockets("Minotaur 1", "MediumLiftLaunch", false, 500000.90);
System.out.println("The fifth Rockets is:");
System.out.println(rock4.rocketName +" "+rock4.type +" "+rock4.isHeavy +" "+rock4.price);

Rockets rock5=new Rockets("Falcon 9", "CrewEarthOrbit", true, 1300000.75);
System.out.println("The sixth Rockets is:");
System.out.println(rock5.rocketName +" "+rock5.type +" "+rock5.isHeavy +" "+rock5.price);

Rockets rock6=new Rockets("Minotaur IV", "ActiveExpendable", false, 4100000.45);
System.out.println("The seventh Rockets is:");
System.out.println(rock6.rocketName +" "+rock6.type +" "+rock6.isHeavy +" "+rock6.price);

Rockets rock7=new Rockets("Delta IV Heavy", "HighCapacity", true, 700000.99);
System.out.println("The eighth Rockets is:");
System.out.println(rock7.rocketName +" "+rock7.type +" "+rock7.isHeavy +" "+rock7.price);

Rockets rock8=new Rockets("Minotaur II", "MinetunamMissile", false, 5900000.20);
System.out.println("The ninth Rockets is:");
System.out.println(rock8.rocketName +" "+rock8.type +" "+rock8.isHeavy +" "+rock8.price);

Rockets rock9=new Rockets("Vulcan Centaur", "OrbitalLauncher", false, 1200000.40);
System.out.println("The tenth Rockets is:");
System.out.println(rock9.rocketName +" "+rock9.type +" "+rock9.isHeavy +" "+rock9.price);
}
}