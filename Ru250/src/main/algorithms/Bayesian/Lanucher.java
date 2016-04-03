import java.util.ArrayList;

public class Lanucher {
    public static void main(String[] argv)
    {
        String name = new String("Agilent.csv");// name represent the file name in type String
        ArrayList<Double> predictValue = new ArrayList<Double>();//to store the prediction result

        DataImport dataImport = new DataImport();//instantiate
//***************************************************************************************************
//This part of program is for 10-time prediction
//***************************************************************************************************
        int day = dataImport.readCSV(name).size()-9;
       for(int k=0;k<10;k++)
       {
           ArrayList<Double> price1 = new ArrayList<>();
           for (int i = 0+k; i <=dataImport.readCSV(name).size()-10+k; i++) {
               price1.add(dataImport.readCSV(name).get(i));
           }
           CurveFitting curveFitting1 = new CurveFitting(price1);
           predictValue.add(curveFitting1.predict());   //array of prediction price of last ten days
       }

        ArrayList<Double> realPrice = new ArrayList<Double>();
        for(int i = day-1; i<=dataImport.readCSV(name).size()-1;i++)//collect real price of the last ten days
        {
            realPrice.add(dataImport.readCSV(name).get(i));
        }

        for(int i=0;i<10;i++)
        {

            System.out.println("The real price of day "+ (day + i) + " is ");
            System.out.println(realPrice.get(i));
            System.out.println("The predicted price of day "+ (day+i) + " is: ");
            System.out.println(predictValue.get(i));
            System.out.println();
        }

        Evlt_Prediction ep = new Evlt_Prediction(realPrice, predictValue);
        System.out.println("The absolute mean error is "+ ep.getAbsE());
        System.out.println("The average relative error is "+ ep.getRelative()*100 +" %");

//***************************************************************************************************
//This part of program is for 1 time preditction (for DEMO, predict the 11st)
//***************************************************************************************************
//
//        CurveFitting curveFitting = new CurveFitting(dataImport.readCSV(name));
//        double predictResult = curveFitting.predict();
//        System.out.println("The predict result is "+ predictResult);

//***************************************************************************************************
        //System.out.println(price.size());

    }
}
