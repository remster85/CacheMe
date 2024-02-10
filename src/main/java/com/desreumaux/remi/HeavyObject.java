package com.desreumaux.remi;

import java.util.Arrays;

public class HeavyObject {

    private byte[] data;

    public HeavyObject() {
        // Create a byte array with 1 MB size
        this.data = new byte[1024 * 1024 * 1]; // 1 MB
        Arrays.fill(data, (byte) 1); // Fill the array with some sample data (e.g., all bytes set to 1)
    }

    // Additional methods or functionality can be added here

    public byte[] getData() {
        return data;
    }
}
