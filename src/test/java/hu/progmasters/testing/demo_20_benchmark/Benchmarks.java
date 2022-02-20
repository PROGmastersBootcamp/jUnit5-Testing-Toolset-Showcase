package hu.progmasters.testing.demo_20_benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@Warmup(iterations = 2)
@Measurement(iterations = 5)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
public class Benchmarks {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(Benchmarks.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Setup
    public void setup() {
        // Do some initialization stuff
    }

    @Benchmark
    public double pow1024() {
        return Math.pow(3, 1024);
    }

    @Benchmark
    public double pow1025() {
        return Math.pow(3, 1025);
    }

    @Benchmark
    public double pow1026() {
        return Math.pow(3, 1026);
    }

}
