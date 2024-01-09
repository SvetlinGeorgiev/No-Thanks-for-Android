package eu.veldsoft.no.thanks.model.ai;

import java.util.Random;

import eu.veldsoft.no.thanks.model.Table;

/**
 * Computer opponent based on Random Search heuristic optimization.
 */
public class RandomArtificialIntelligence implements ArtificialIntelligence {
    /**
     * Pseudo-random number generator instace.
     */
    private static Random PRNG = new Random();

    /**
     * @{inheritDoc}
     */
    @Override
    public Choice decision(Table table) {
        return Choice.values()[PRNG.nextInt(Choice.values().length)];
    }
}
