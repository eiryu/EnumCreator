package com.eiryu.oss;

import java.io.IOException;

import org.junit.Test;

public class EnumCreatorTest {

	@Test
	public void test() throws IOException {
		EnumCreator.create("User", "src/test/resources/sample.tsv");
	}

}
