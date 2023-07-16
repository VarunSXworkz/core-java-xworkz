class RocketsTester{


public static void main(String args[]){


Rockets rock=new Rockets();
rock.rocketName="Atlas V";
rock.type="LaunchSystem";
rock.isHeavy=false;
rock.price=40000.21;
System.out.println("The first Rockets is:");
System.out.println(rock.rocketName +" "+rock.type +" "+rock.isHeavy +" "+rock.price);

Rockets rock1=new Rockets();
rock1.rocketName="Falcon Heavy";
rock1.type="CargoCarry";
rock1.isHeavy=true;
rock1.price=200000.00;
System.out.println("The second Rockets is:");
System.out.println(rock1.rocketName +" "+rock1.type +" "+rock1.isHeavy +" "+rock1.price);

Rockets rock2=new Rockets();
rock2.rocketName="Saturn V";
rock2.type="LiquidFuel";
rock2.isHeavy=false;
rock2.price=21000.50;
System.out.println("The third Rockets is:");
System.out.println(rock2.rocketName +" "+rock2.type +" "+rock2.isHeavy +" "+rock2.price);

Rockets rock3=new Rockets();
rock3.rocketName="Pegasus";
rock3.type="OrbitalSciences";
rock3.isHeavy=false;
rock3.price=4400000.22;
System.out.println("The fourth Rockets is:");
System.out.println(rock3.rocketName +" "+rock3.type +" "+rock3.isHeavy +" "+rock3.price);

Rockets rock4=new Rockets();
rock4.rocketName="Minotaur 1";
rock4.type="MediumLiftLaunch";
rock4.isHeavy=false;
rock4.price=500000.90;
System.out.println("The fifth Rockets is:");
System.out.println(rock4.rocketName +" "+rock4.type +" "+rock4.isHeavy +" "+rock4.price);

Rockets rock5=new Rockets();
rock5.rocketName="Falcon 9";
rock5.type="CrewEarthOrbit";
rock5.isHeavy=true;
rock5.price=1300000.75;
System.out.println("The sixth Rockets is:");
System.out.println(rock5.rocketName +" "+rock5.type +" "+rock5.isHeavy +" "+rock5.price);

Rockets rock6=new Rockets();
rock6.rocketName="Minotaur IV";
rock6.type="ActiveExpendable";
rock6.isHeavy=false;
rock6.price=4100000.45;
System.out.println("The seventh Rockets is:");
System.out.println(rock6.rocketName +" "+rock6.type +" "+rock6.isHeavy +" "+rock6.price);

Rockets rock7=new Rockets();
rock7.rocketName="Delta IV Heavy";
rock7.type="HighCapacity";
rock7.isHeavy=true;
rock7.price=700000.99;
System.out.println("The eighth Rockets is:");
System.out.println(rock7.rocketName +" "+rock7.type +" "+rock7.isHeavy +" "+rock7.price);

Rockets rock8=new Rockets();
rock8.rocketName="Minotaur II";
rock8.type="MinetunamMissile";
rock8.isHeavy=false;
rock8.price=5900000.20;
System.out.println("The ninth Rockets is:");
System.out.println(rock8.rocketName +" "+rock8.type +" "+rock8.isHeavy +" "+rock8.price);

Rockets rock9=new Rockets();
rock9.rocketName="Vulcan Centaur";
rock9.type="OrbitalLauncher";
rock9.isHeavy=false;
rock9.price=1200000.40;
System.out.println("The tenth Rockets is:");
System.out.println(rock9.rocketName +" "+rock9.type +" "+rock9.isHeavy +" "+rock9.price);
}
}