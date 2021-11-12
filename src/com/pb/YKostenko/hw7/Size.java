package com.pb.YKostenko.hw7;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public enum Size {
    XXS("XXS"),
    XS("XS"),
    S("S"),
    M("M"),
    L("L");

    private String size;
    Size (String size){
        this.size = size;
    }

     Size (String description, int euroSize ){

    }

    public String getSize() {
        return size;
    }

    public String getDescription(){
        switch (size) {
            case "XXS":
                return "Детский размер";
            case "XS":
                return "Очень маленький размер";
            case "S":
                return "Маленький размер";
            case "M":
                return "Средний размер";
            case "L":
                return "Большой размер";
        }
        return "размер не найден";
    }
    public int getEuroSize(){
        switch (size) {
            case "XXS":
                return 32;
            case "XS":
                return 34;
            case "S":
                return 36;
            case "M":
                return 38;
            case "L":
                return 40;
        }
        return 0;
    }

}
