package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> source;


    public static class Builder {
        private List<Integer> source;

        private Builder buildSource(List<Integer> source) {
            this.source = source;
            return this;
        }

        private EasyStream build() {
            EasyStream easyStream = new EasyStream();
            easyStream.source = source;
            return easyStream;
        }
    }

    public static EasyStream of(List<Integer> source) {
        return new Builder()
                .buildSource(source)
                .build();

    }

    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> bufferSource = new ArrayList<>();
        for (int sources : source) {
            bufferSource.add(fun.apply(sources));
        }
        return new Builder()
                .buildSource(bufferSource)
                .build();
    }

    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> bufferSource = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (fun.test(source.get(i))) {
                bufferSource.add(source.get(i));
            }
        }
        return new Builder()
                .buildSource(bufferSource)
                .build();
    }

    public List<Integer> collect() {
        return source;
    }
}

