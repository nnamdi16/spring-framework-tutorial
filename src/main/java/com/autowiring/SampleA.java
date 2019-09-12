package com.autowiring;

public class SampleA {
    private SampleB sampleB;
    public SampleA() {
        System.out.println("A is created");
    }
    public SampleB getSampleB() {
        return sampleB;
    }

    public void setSampleB(SampleB sampleB) {
        this.sampleB = sampleB;
    }

    public void print() {
        System.out.println("Hello A");
    }

    public void display() {
        print();;
        sampleB.print();
    }
}
