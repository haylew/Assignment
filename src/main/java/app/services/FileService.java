package app.services;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.springframework.stereotype.Service;

import app.controller.WebController;

@Service
public class FileService {

	public String readFile(String fileName) throws UnsupportedEncodingException, IOException {
		ClassLoader classLoader = new WebController().getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		// Is file exist
		System.out.println("File Found : " + file.exists());
		//Read File Content
        String content = new String(Files.readAllBytes(file.toPath()),StandardCharsets.UTF_8);
		return content;		
	}
}
