package controllers;

import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;


@Singleton
public class PerfectedController {

    public Result index() {
        return Results.html();
    }

    public Result product() {
        return Results.html();
    }
}
