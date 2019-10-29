package app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import app.model.Statement;
import app.model.Turnover;
import app.repositories.StatementRepository;
import app.repositories.TurnoverRepository;
import app.services.FileService;
import app.services.StatementService;
import app.services.TurnoverService;

@Controller
public class WebController {

	private String fileName="file/Pohyby_na_uctu-1.gpc";
	private String charStream;
	private List<Statement> statement;
	private List<Turnover> turnover;
	@Autowired
	private FileService fileService;
	@Autowired
	private StatementService statementService;
	@Autowired
	private TurnoverService turnoverService;
	@Autowired
	private TurnoverRepository turnoverRepository;
	@Autowired
	private StatementRepository statementRepository;
	
	@RequestMapping("/")
	public String index(Model model) throws IOException {
		model.addAttribute("filename",fileName);
		return "index";
	}
	@RequestMapping("/output")
	public String output(Model model) throws Exception {
		//Read the content o the file
		charStream = fileService.readFile(fileName);
		//Create and Statement object
		statement = statementService.createStatmentObject(charStream);
		//Create Turnover object
		turnover = turnoverService.createTurnoverObject(charStream);
		//Save turnover info to MongoDb
		turnoverRepository.saveAll(turnover);
		//Save statement info to MongoDb
		statementRepository.saveAll(statement);
		
		System.out.println("Saved to DB");
		
		model.addAttribute("statement",statement);
		model.addAttribute("turnover",turnover);
		return "output";
	}
}
