package edu.javacourse.net.greet;

import edu.javacourse.net.Greatable;

public class EveningGreet extends Greatable {

    @Override
    public String buildResponse(String userName) {
        return "Good evening, "+userName;
    }
}
