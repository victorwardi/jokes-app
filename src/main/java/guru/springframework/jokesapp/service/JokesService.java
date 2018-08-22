package guru.springframework.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesService {


    ChuckNorrisQuotes chuckNorrisQuotes;


    public String getJoke(){

        return chuckNorrisQuotes.getRandomQuote();
    }
}
