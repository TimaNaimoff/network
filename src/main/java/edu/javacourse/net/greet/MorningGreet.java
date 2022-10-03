package edu.javacourse.net.greet;

import edu.javacourse.net.Greatable;

public class MorningGreet extends Greatable {

    @Override
    public String buildResponse(String userName) {
        return "Good morning, "+userName;
    }
}
