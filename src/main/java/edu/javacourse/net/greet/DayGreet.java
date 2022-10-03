package edu.javacourse.net.greet;

import edu.javacourse.net.Greatable;

public class DayGreet extends Greatable {

    @Override
    public String buildResponse(String userName) {
        return "Good day, "+userName;
    }
}
