/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
public class Paint {
    
    private String paintName;
    private int paintLitre;
    private double totalPrice;
    private int meterCovered;
    private int roomSize;

    public Paint(String paintName, int paintLitre, double totalPrice, int meterCovered, int roomSize) {
        this.paintName = paintName;
        this.paintLitre = paintLitre;
        this.totalPrice = totalPrice;
        this.meterCovered = meterCovered;
        this.roomSize = roomSize;
    }

    public String getPaintName() {
        return paintName;
    }

    public void setPaintName(String paintName) {
        this.paintName = paintName;
    }

    public int getPaintLitre() {
        return paintLitre;
    }

    public void setPaintLitre(int paintLitre) {
        this.paintLitre = paintLitre;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getMeterCovered() {
        return meterCovered;
    }

    public void setMeterCovered(int meterCovered) {
        this.meterCovered = meterCovered;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    @Override
    public String toString() {
        return "paintName = " + paintName + ", paintLitre = " + paintLitre + ", totalPrice = " + totalPrice + ", meterCovered = " + meterCovered + ", roomSize = " + roomSize + "";
    }
    
    
    
}
