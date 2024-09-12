package com.richard.app.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import com.richard.app.ReverseString;

@State(Scope.Benchmark)
public class LatencyMeasurer {

	private ReverseString app = new ReverseString();
	
	@Benchmark
	@Fork(value = 1, warmups = 2)
	@BenchmarkMode(Mode.AverageTime)
	public void runReverseString() {
		final String s = "1234567890abcdefghijklmnopqrstuvwxyz";
		app.reverse(s);		
	}
	
}
