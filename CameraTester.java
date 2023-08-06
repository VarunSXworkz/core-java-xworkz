package com.xworkz.cam.camera;

public class CameraTester {

    public static void main(String[] args) {
        Camera ca=new Camera();
        Lens le=new Lens();
        le.typeOfLens="Conacave Lens";
        System.out.println("The type of the lens is:" +le.typeOfLens);
    }
}
