package hu.progmasters.testing.demo_20_benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(value = 1,
      warmups = 2)
@Warmup(iterations = 2)
@Measurement(iterations = 5)
public class Benchmarks {

    @Benchmark
    public void init() {

    }

}
