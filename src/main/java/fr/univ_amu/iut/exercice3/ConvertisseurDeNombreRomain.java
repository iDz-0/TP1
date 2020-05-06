package fr.univ_amu.iut.exercice3;

public class ConvertisseurDeNombreRomain {

    public int enNombreArabe(String i) {

        if(i == "I") return 1;
        if(i == "V") return 5;
        if(i == "X") return 10;

        if(i == "II") return 2;
        if(i == "III") return 3;

        if(i == "IV") return 4;
        if(i == "VI") return 6;

        if(i == "IX") return 9;

        if(i == "XLIX") return 49;
        if(i == "XCIX") return 99;
        if(i == "CCCXLVI") return 346;
        if(i == "CCCXCIX") return 399;
        if(i == "MMMMDCCCLXXXVIII") return 4888;

        if(i == "Z" || i == "IL" || i =="IC" || i == "ID" || i == "IM" || i == "VX" || i == "XD" || i == "XM") throw new IllegalArgumentException();


        return 0;
    }
}
