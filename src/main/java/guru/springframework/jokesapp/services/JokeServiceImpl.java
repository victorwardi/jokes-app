package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    private final String[] colors;

    public JokeServiceImpl() {

        this.chuckNorrisQuotes = new ChuckNorrisQuotes();

        colors = new String[]{"DarkBlue", "Red",  "DeepPink",  "Gold",  "SeaGreen",  "Grey" , "Yellow" };
    }

    @Override
    public String getJoke() {

        return this.chuckNorrisQuotes.getRandomQuote();
    }

    @Override
    public String getColorJoke() {

        return colors[new Random().nextInt(this.colors.length)];
    }


}
