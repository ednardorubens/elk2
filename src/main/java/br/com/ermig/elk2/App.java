package br.com.ermig.elk2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class.getSimpleName());

    public static void main(String[] args) {
        final Random random = new Random();
        while (1 > 0) {
            random.ints(1000, 4000).forEach(gen -> {
                try {
                    Thread.sleep(gen);
                    logger.info("IP: {}, Porta: {}, URI: {}, Desempenho: {} segundos, Sucesso: {}, CPF: {}, Mensagem: {}",
                        "127.0.0.1", 9000, "/recursos", getTimeInSeconds(gen), random.nextBoolean(), "1256983" + gen,
                        "Operação realizada com sucesso"
                    );
                } catch (InterruptedException e) {}
            });
        }
    }

    private static BigDecimal getTimeInSeconds(int tempo) {
        return new BigDecimal(tempo).divide(new BigDecimal(1000), 2, RoundingMode.HALF_UP);
    }
}
