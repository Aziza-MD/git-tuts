package com.capg.demo.util;

public class Thing {
	  private int a;
	  
	  public Thing(int x) {
	    a = x;
	  }
	  
	  public int geta() {
	    return a;
	  }
	  public static void main(String[] args) {
	  Thing f = new Thing(3);
	  Thing g = new Thing(5);
	  Thing h = f;
	  Thing j = h;
}
}
