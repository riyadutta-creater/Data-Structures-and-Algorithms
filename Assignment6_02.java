package com.riya;

public class Assignment6_02 {
    private int a,b;
    public Assignment6_02(int n1, int n2){
        this.a = n1;
        this.b = n2;
        this.display();
    }
    public int add(){
        int sum = this.a + this.b;
        return sum;
    }
    public void display(){
        int res = this.add();
        System.out.println("Result is: "+ res);
    }
    public static void main(String[] args) {
    	Assignment6_02 ob1 = new Assignment6_02(10,20);
    	Assignment6_02 ob2 = new Assignment6_02(30,40);
 
    	Assignment6_02 ob3 = new Assignment6_02(50,60);
    	Assignment6_02 ob4 = new Assignment6_02(70,80);
    	Assignment6_02 ob5 = new Assignment6_02(90,100);
    }
}