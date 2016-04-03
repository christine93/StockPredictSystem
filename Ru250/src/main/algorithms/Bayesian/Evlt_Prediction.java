//This class is reserved for evaluation of prediction result
//Evaluation includes 'absolute mean error' and 'average relative error'

import Jama.Matrix;

import java.util.ArrayList;

public class Evlt_Prediction
{
    public Evlt_Prediction(ArrayList<Double> realPrice, ArrayList<Double> pridictPrice)
    {
        real = realPrice;
        predict =  pridictPrice;
        length = realPrice.size();
    }
    public double getAbsE()
    {
        double diffSum = 0; //sumTemp is the sum of the absolute difference of each day's real price and predict price
        for(int i = 0;i<length;i++)
        {
            diffSum += Math.abs(real.get(i) - predict.get(i));
        }
        diffSum = diffSum/length;
        return diffSum;
    }

    public double getRelative()
    {
        double diffSum = 0;
        for(int i=0;i<length;i++)
        {
            diffSum += Math.abs(real.get(i) - predict.get(i));
        }

        double realSum = 0;
        for(int i=0;i<length;i++)
        {
            realSum += real.get(i);
        }
        double relativeE = diffSum / realSum;
        return relativeE;
    }

    int length;
    private ArrayList<Double> real;
    private ArrayList<Double> predict;
}
