package com.panpanzeng15.java.week1;

/**
 * @ClassName Rational
 * @Description TODO
 * @Author 南风有你
 * @Date 2020/10/9
 **/
public class Rational {
    int numerator;
    int denominator;
    Rational(){
    }
    Rational(int a, int b){
        if(a ==0){
            numerator = 0;
            denominator =1;
        }
        else{
            setNumeratorAndDenominator(a,b);
        }
    }
    void setNumeratorAndDenominator(int a, int b){
        int c = f(Math.abs(a),Math.abs(b)) ;
        numerator = a/c;
        denominator = b/c;
        if(numerator <0&&denominator <0){
            numerator = -numerator;
            denominator = -denominator;
        }
    }
    int getNumerator(){
        return numerator;
    }
    int getDenominator(){
        return denominator;
    }
    int f(int a, int b){
        if(a < b){
            int c = a;
            a = b;
            b = c;
        }
        int r =a % b;
        while(r!=0){
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    Rational add(Rational r){
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator * b + denominator * a;
        int newDenominator =denominator *b;
        Rational result = new Rational(newNumerator,newDenominator);
        return result;
    }
    Rational sub(Rational r){
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator * b - denominator * a;
        int newDenominator =denominator *b;
        Rational result = new Rational(newNumerator,newDenominator);
        return result;
    }
    Rational muti(Rational r){
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator * a;
        int newDenominator =denominator *b;
        Rational result = new Rational(newNumerator,newDenominator);
        return result;
    }
    Rational div(Rational r){
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator * b;
        int newDenominator =denominator * a;
        Rational result = new Rational(newNumerator,newDenominator);
        return result;
    }



}
