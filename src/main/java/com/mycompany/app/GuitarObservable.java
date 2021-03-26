package com.mycompany.app;
import io.reactivex.rxjava3.core.Observable;
import java.util.Arrays;
import java.util.List;

public class GuitarObservable {

    public Observable<Guitar> guitarObservable() {
        List<Guitar> guitars = Arrays.asList(
                new Guitar("Fender", "Stratocaster", 1952, 1200),
                new Guitar("Fender", "Telecaster", 1951, 1650),
                new Guitar("Gibson", "Les Paul", 1954, 2100),
                new Guitar("Gibson", "SG standard", 1961, 1800)
        );

        return Observable.create(emitter -> {

                    for (Guitar guitar : guitars) {
                        if (!emitter.isDisposed()) {
                            emitter.onNext(guitar);
                        } else {
                            break;
                        }
                    }

                    emitter.onComplete();
        });
    }
}

