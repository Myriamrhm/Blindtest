package model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import model.model.user.IRepositoryAdmin;
import model.model.user.IRepositoryJoueur;
import model.model.user.Joueur;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlindTesttApplicationTests {
	
	@Autowired
	IRepositoryAdmin admin;
	
	@Autowired
	IRepositoryJoueur joueur;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void creerJoueur() {
		Joueur myriam = new Joueur("pseudo", "mail", "password", score);
	}

}

