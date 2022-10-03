package edu.javacourse.net.greet;

import edu.javacourse.net.Greatable;

public class HelloGreet extends Greatable {
    @Override
    public String buildResponse(String userName) {
        return "Hello, "+userName;
    }
}
