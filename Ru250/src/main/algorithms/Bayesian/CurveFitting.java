import Jama.*;  //import Java matrix computation lib

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.lang.Double;
public class CurveFitting
{
    public int M=4;
    public CurveFitting(ArrayList<Double> input)//constructor, initialize the input data within object's scope
    {
        price = input;
        size = price.size();
        dayPredict = size;
    }
    public void fi_toMatrix(int n)  //calculate fi(x)
    {
        double[][] temp = new double[M+1][1];
        for (int i=0;i<M+1;i++)
        {
            temp[i][0] = Math.pow(n, i);
        }
        fi = new Matrix(temp);
    }
    public void fiT_toMatrix()  //calculate fi(x)T
    {
        double [][] temp = new double[1][M+1];
        for(int i=0; i<=M;i++)
        {
            temp[0][i] = Math.pow(dayPredict, i);
        }
        fiT = new Matrix(temp);
    }
    public Matrix calS_inv()//calculate matrix S's inverse matrix
    {
        Matrix sum = new Matrix(M+1, 1);
        for(int i=1;i<=dayPredict-1;i++)
        {
            fi_toMatrix(i);

            sum.plusEquals(fi);
        }
        Matrix product = sum.times(fiT);
        product.timesEquals(11.1);
        double [][] alphaTemp = new double[M+1][M+1];
        for(int i=0;i<M+1;i++)
        {
            alphaTemp[i][i] = 0.005;
        }
        Matrix alpha = new Matrix(alphaTemp);
        Matrix sInv = alpha.plus(product);
        return sInv;
    }

    public Matrix getS(Matrix sInv)
    {
        return sInv.inverse();
    }//get matrix S from S inverse

    public double predict() //main driven function
    {

        fiT_toMatrix();
        Matrix S = getS(calS_inv());
        Matrix tempSum = new Matrix(M+1,1);
        for(int i=1;i<=dayPredict-1;i++)
        {
            fi_toMatrix(i);
            double tn = price.get(i-1);
            tempSum.plusEquals(fi.times(tn));
        }
        //Matrix tempProduct = S.times(tempSum);
        Matrix temProduct = fiT.times(S);
        double mX=0;

        //Matrix temp = fiT.times(tempProduct);
        Matrix temp = temProduct.times(tempSum);
        mX = 11.1* temp.get(0,0);   //mX is the final result of prediction

       // System.out.println(mX);
        return mX;
    }
    public int n;
    public int size;
    public int dayPredict;
    public Matrix fi;
    public Matrix fiT;
    public ArrayList<Double> price;
}
