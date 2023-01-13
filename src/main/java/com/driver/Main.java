package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
       int ansValue = p.Product(15,25);
       int secondAnsValue = p.Product(10,20,30);
       double thirdAnsValue = p.Product(5.5,8.5);
    }
}
class Product{
    public int Product(int x,int y){
        int ans = x*y;
        return ans;
    }
    public int Product(int x, int y,int z){
        int secondAns = x*y*z;
        return secondAns;
    }
    public double Product(double x,double y){
        double thirdAns = x*y;
        return thirdAns;
    }
}