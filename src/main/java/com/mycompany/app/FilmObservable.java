package com.mycompany.app;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class FilmObservable {

    public Observable<Film> filmObservable() {
        List<Film> films = Arrays.asList(
                new Film("Back to the Future", "Sci-Fi", 1985),
                new Film("Edward Scissorhands", "Drama/Fantasy", 1990),
                new Film("Interview with a Vampire", "Drama/Horror", 1994),
                new Film("Donnie Darko", "Drama/Sci-Fi", 2001)
        );

        return Observable.create( emitter -> {
            for(Film film: films){
                if (!emitter.isDisposed()) {
                    emitter.onNext(film);
                } else {
                    break;
                }
            }
            emitter.onComplete();
        });
    }
}
