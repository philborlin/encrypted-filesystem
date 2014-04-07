package com.risertech.filesystem.encrypted;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EncryptedFilesystemProviderTest {
	Map<String, Object> env = new HashMap<String, Object>();
	
	@Before
	public void setup() throws IOException, URISyntaxException {
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void service() throws IOException, URISyntaxException {
		FileSystem newFileSystem2 = FileSystems.newFileSystem(new URI("encrypted:file://localhost/v1/tentant"), env);
		Assert.assertTrue(newFileSystem2 instanceof EncryptedFileSystem);
	}
}
