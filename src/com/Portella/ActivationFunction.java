package com.Portella;

public class ActivationFunction {

    public static float sigmoid(float x) {      //sigmoid function!!
        return (float) (1 / (1+Math.exp(-x)));
    }

    public static float dSigmoid(float x) {     //derivative sigmoid function
        return x*(1-x);                         // sigmoid(x) * (1-sigmoid(x)
    }
}
