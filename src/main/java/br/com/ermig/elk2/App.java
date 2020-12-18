package br.com.ermig.elk2;

import java.math.BigDecimal;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class.getSimpleName());

    public static void main(String[] args) {
        final Random random = new Random();
        while (1 > 0) {
            random.ints(1000, 4000).forEach(tempo -> {
                try {
                    Thread.sleep(tempo);
                    logger.info("IP: {}, Porta {}, URL: {}, Desempenho (hora fim - hora início): {} segundos, Sucesso: {}, CPF: {}",
                            "127.0.0.1", 9000, "/recursos", new BigDecimal(tempo / 1000).setScale(2), random.nextBoolean(), "1256983" + tempo);
                } catch (InterruptedException e) {}
            });
        }
    }
}
