package com.torryharris.model;

public class CarsTyre {
    private String tyreName;
    private int tyreSize;

    public CarsTyre(String tyreName, int tyreSize) {
        this.tyreName = tyreName;
        this.tyreSize = tyreSize;
    }

    public String getTyreName() {
        return tyreName;
    }

    public int getTyreSize() {
        return tyreSize;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }

    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }
}
