package com.mycompany;

import com.mycompany.app.*;
import io.reactivex.rxjava3.core.*;
//import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 0;
//
//        LOGGER.info("Logger Name: "+LOGGER.getName());
//        LOGGER.warn("some warning");
//        LOGGER.error("severe");
//        try{
//            LOGGER.info("Attempting to do some math");
//            int result = num1 / num2;
//            LOGGER.info("Result is " + result);
//        } catch (ArithmeticException x) {
//            LOGGER.error("Unable to divide by 0.");
//        }


        GuitarObservable guitarObs = new GuitarObservable();
        Observable<Guitar> guitarObserver = guitarObs.guitarObservable();

        guitarObserver.subscribe(
                guitar -> LOGGER.info("Receiving data " + guitar.getModel()),
                error -> LOGGER.error("error "),
                () -> LOGGER.info("done")
        );

        FilmObservable filmObs = new FilmObservable();
        Observable<Film> filmObserver = filmObs.filmObservable();

        filmObserver.subscribe(
                film -> LOGGER.info("Receiving data " + film.getTitle()),

                error -> LOGGER.error("severe");
        try {
            LOGGER.info("Attempting to do some math");
            int result = num1 / num2;
            LOGGER.info("Result is " + result);
        } catch (ArithmeticException x) {
            LOGGER.error("Unable to divide by 0.");
        }

        () -> LOGGER.info("done")
        );
    }
}
