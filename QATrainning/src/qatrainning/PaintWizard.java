/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PaintWizard {
    
 


    
private List <Paint> storage = new ArrayList<Paint>();

    public List<Paint> getStorage() {
        return storage;
    }

    public void setStorage(List<Paint> storage) {
        this.storage = storage;
    }

//    public void displayPaint()
//    {
//        for (Paint p : storage)
//        {
//            System.out.println(p);
//        }
//    }

//    public void pricePerLitre(int paintLitre, int totalPrice) 
//    {
//        for (Paint p : storage)
//        {
//            double pplitre =0;
//            while (!storage.isEmpty())
//            {
//                pplitre = 
//            }
//        }
//    }
    
    public int noOfPaintNeeded(int roomSize, int paintLitre, int meterCovered)
    {
        
        int totalMeterCovered =0;
        int numberOfCans =1;
        totalMeterCovered = paintLitre * meterCovered;
        
                
        while (totalMeterCovered < roomSize)
            
            {
                totalMeterCovered = totalMeterCovered + (paintLitre * meterCovered);
                numberOfCans++;
            }
            System.out.println(numberOfCans);
            
        return numberOfCans;
                
    }
    
    public void cheapestBrand(int roomSize, int paintLitre)
    {
            double total = 0;
            int totalMeters =0;
            
            for (Paint p: storage)
            {
                 totalMeters = paintLitre * roomSize;
            }
            
    }
    
    
    
    public static void main (String[] args)
    {
 
        PaintWizard wizard = new PaintWizard();
        
        
            Paint paint1 = new Paint("CheapoMax", 20, 19.99, 10,500);
            Paint paint2 = new Paint("Averagejoes", 15, 17.99, 11, 500);
            Paint paint3 = new Paint("DuluxourousPaints", 10, 25.00, 20, 500);
        
            wizard.getStorage().add(paint1);
            wizard.getStorage().add(paint2);
            wizard.getStorage().add(paint3);
            
            wizard.noOfPaintNeeded(paint1.getRoomSize(),paint1.getPaintLitre(),paint1.getMeterCovered());
            wizard.noOfPaintNeeded(paint2.getRoomSize(),paint2.getPaintLitre(),paint2.getMeterCovered());
            wizard.noOfPaintNeeded(paint3.getRoomSize(),paint3.getPaintLitre(),paint3.getMeterCovered());
                }
    
    
    
}


