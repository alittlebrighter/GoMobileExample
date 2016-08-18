package io.alittlebrighter.gomobileexample;

import go.testsdk.Testsdk;

/**
 * Created by adam on 8/18/16.
 *
 * implements an interface defined inside the Go library
 */
public class MyResult implements Testsdk.Result {

    public String Compute(int one, int two) {
        return "addition - " + (one + two);
    }
}
