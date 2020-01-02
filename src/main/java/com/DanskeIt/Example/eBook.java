package com.DanskeIt.Example;

public class eBook extends Book{
private float sizeInMB;

public void setSizeInMB(int sizeInMB) {
	this.sizeInMB = sizeInMB;
}

@Override
public String toString() {
	
	return "eBook [sizeInMB=" + sizeInMB + "," + super.toString() + "]";

}


}
